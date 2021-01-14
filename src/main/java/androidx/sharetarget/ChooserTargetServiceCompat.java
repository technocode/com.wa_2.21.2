package androidx.sharetarget;

import X.AnonymousClass008;
import X.C14670mg;
import X.C16910qe;
import X.C16920qg;
import X.C16930qh;
import X.C16940qi;
import X.C16980qm;
import X.CallableC16950qj;
import X.CallableC16960qk;
import X.CallableC16970ql;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ChooserTargetServiceCompat extends ChooserTargetService {
    @Override // android.service.chooser.ChooserTargetService
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Bitmap bitmap;
        int identifier;
        Context applicationContext = getApplicationContext();
        if (C16940qi.A00 == null) {
            synchronized (C16940qi.A01) {
                if (C16940qi.A00 == null) {
                    ArrayList arrayList = new ArrayList();
                    Intent intent = new Intent("android.intent.action.MAIN");
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setPackage(applicationContext.getPackageName());
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(intent, 128);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList arrayList2 = new ArrayList();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    StringBuilder A0S = AnonymousClass008.A0S("Failed to open android.app.shortcuts meta-data resource of ");
                                    A0S.append(activityInfo.name);
                                    throw new IllegalArgumentException(A0S.toString());
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        } else if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = C16940qi.A00(loadXmlMetaData, "targetClass");
                                            ArrayList arrayList3 = new ArrayList();
                                            ArrayList arrayList4 = new ArrayList();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 == 1) {
                                                    break;
                                                } else if (next2 != 2) {
                                                    if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                        break;
                                                    }
                                                } else {
                                                    String name = loadXmlMetaData.getName();
                                                    char c = 65535;
                                                    int hashCode = name.hashCode();
                                                    if (hashCode != 3076010) {
                                                        if (hashCode == 50511102 && name.equals("category")) {
                                                            c = 1;
                                                        }
                                                    } else if (name.equals("data")) {
                                                        c = 0;
                                                    }
                                                    if (c == 0) {
                                                        C16940qi.A00(loadXmlMetaData, "scheme");
                                                        C16940qi.A00(loadXmlMetaData, "host");
                                                        C16940qi.A00(loadXmlMetaData, "port");
                                                        C16940qi.A00(loadXmlMetaData, "path");
                                                        C16940qi.A00(loadXmlMetaData, "pathPattern");
                                                        C16940qi.A00(loadXmlMetaData, "pathPrefix");
                                                        arrayList3.add(new C16920qg(C16940qi.A00(loadXmlMetaData, "mimeType")));
                                                    } else if (c == 1) {
                                                        arrayList4.add(C16940qi.A00(loadXmlMetaData, "name"));
                                                    }
                                                }
                                            }
                                            C16930qh r0 = (arrayList3.isEmpty() || A00 == null || arrayList4.isEmpty()) ? null : new C16930qh((C16920qg[]) arrayList3.toArray(new C16920qg[arrayList3.size()]), A00, (String[]) arrayList4.toArray(new String[arrayList4.size()]));
                                            if (r0 != null) {
                                                arrayList2.add(r0);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                arrayList.addAll(arrayList2);
                            }
                        }
                    }
                    C16940qi.A00 = arrayList;
                }
            }
        }
        ArrayList arrayList5 = C16940qi.A00;
        ArrayList arrayList6 = new ArrayList();
        Iterator it = arrayList5.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            C16930qh r4 = (C16930qh) it.next();
            if (r4.A00.equals(componentName.getClassName())) {
                C16920qg[] r2 = r4.A01;
                int length = r2.length;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (intentFilter.hasDataType(r2[i].A00)) {
                        arrayList6.add(r4);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (arrayList6.isEmpty()) {
            return Collections.emptyList();
        }
        if (ShortcutInfoCompatSaverImpl.A08 == null) {
            synchronized (ShortcutInfoCompatSaverImpl.A07) {
                if (ShortcutInfoCompatSaverImpl.A08 == null) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ShortcutInfoCompatSaverImpl.A08 = new ShortcutInfoCompatSaverImpl(applicationContext, new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()));
                }
            }
        }
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.A08;
        try {
            ExecutorService executorService = shortcutInfoCompatSaverImpl.A05;
            List<C14670mg> list = (List) executorService.submit(new CallableC16950qj(shortcutInfoCompatSaverImpl)).get();
            if (list == null || list.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList7 = new ArrayList();
            for (C14670mg r9 : list) {
                Iterator it2 = arrayList6.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C16930qh r8 = (C16930qh) it2.next();
                    if (r9.A08.containsAll(Arrays.asList(r8.A02))) {
                        arrayList7.add(new C16910qe(r9, new ComponentName(applicationContext.getPackageName(), r8.A00)));
                        break;
                    }
                }
            }
            if (arrayList7.isEmpty()) {
                return new ArrayList();
            }
            Collections.sort(arrayList7);
            ArrayList arrayList8 = new ArrayList();
            int i2 = ((C16910qe) arrayList7.get(0)).A01.A00;
            Iterator it3 = arrayList7.iterator();
            float f = 1.0f;
            while (it3.hasNext()) {
                C16910qe r7 = (C16910qe) it3.next();
                C14670mg r82 = r7.A01;
                Icon icon = null;
                try {
                    C16980qm r22 = (C16980qm) executorService.submit(new CallableC16960qk(shortcutInfoCompatSaverImpl, r82.A07)).get();
                    iconCompat = null;
                    if (r22 != null) {
                        String str = r22.A02;
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                identifier = shortcutInfoCompatSaverImpl.A00.getResources().getIdentifier(str, null, null);
                            } catch (Exception unused) {
                            }
                            if (identifier != 0) {
                                iconCompat = IconCompat.A02(shortcutInfoCompatSaverImpl.A00, identifier);
                            }
                        }
                        if (!TextUtils.isEmpty(r22.A01) && (bitmap = (Bitmap) shortcutInfoCompatSaverImpl.A06.submit(new CallableC16970ql(r22)).get()) != null) {
                            if (bitmap != null) {
                                iconCompat = new IconCompat(1);
                                iconCompat.A06 = bitmap;
                            } else {
                                throw new IllegalArgumentException("Bitmap must not be null.");
                            }
                        }
                    }
                } catch (Exception e2) {
                    Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                    iconCompat = null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("android.intent.extra.shortcut.ID", r82.A07);
                int i3 = r82.A00;
                if (i2 != i3) {
                    f -= 0.01f;
                    i2 = i3;
                }
                CharSequence charSequence = r82.A05;
                if (iconCompat != null) {
                    icon = iconCompat.A07();
                }
                arrayList8.add(new ChooserTarget(charSequence, icon, f, r7.A00, bundle2));
            }
            return arrayList8;
        } catch (Exception e3) {
            Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
            return Collections.emptyList();
        }
    }
}
