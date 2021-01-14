package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0mi  reason: invalid class name and case insensitive filesystem */
public class C14690mi {
    public static volatile AbstractC14680mh A00;

    public static Intent A00(Context context, C14670mg r3) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26 || (intent = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).createShortcutResultIntent(r3.A00())) == null) {
            intent = new Intent();
        }
        r3.A01(intent);
        return intent;
    }

    public static AbstractC14680mh A01(Context context) {
        if (A00 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    A00 = (AbstractC14680mh) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C14690mi.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (A00 == null) {
                A00 = new C30021ab();
            }
        }
        return A00;
    }

    public static List A02(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                C14670mg r1 = new C14660mf(context, shortcutInfo).A00;
                if (!TextUtils.isEmpty(r1.A05)) {
                    Intent[] intentArr = r1.A0B;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    arrayList.add(r1);
                } else {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
            }
            return arrayList;
        }
        try {
            return A01(context).A04();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static void A03(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        A01(context).A01();
    }

    public static void A04(Context context, C14670mg r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(r3.A00(), null);
        } else if (A07(context)) {
            Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            r3.A01(intent);
            context.sendBroadcast(intent);
        }
    }

    public static void A05(Context context, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C14670mg) it.next()).A00());
            }
            if (!((ShortcutManager) context.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList)) {
                return;
            }
        }
        A01(context).A02(list);
    }

    public static void A06(Context context, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        A01(context).A03(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(android.content.Context r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0013
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r5.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            boolean r0 = r0.isRequestPinShortcutSupported()
            return r0
        L_0x0013:
            java.lang.String r4 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r0 = X.C004302a.A01(r5, r4)
            r3 = 0
            if (r0 == 0) goto L_0x001d
            return r3
        L_0x001d:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            java.lang.String r1 = "com.android.launcher.action.INSTALL_SHORTCUT"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            java.util.List r0 = r2.queryBroadcastReceivers(r0, r3)
            java.util.Iterator r2 = r0.iterator()
        L_0x0030:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r2.next()
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.permission
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x004c
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0030
        L_0x004c:
            r0 = 1
            return r0
        L_0x004e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14690mi.A07(android.content.Context):boolean");
    }
}
