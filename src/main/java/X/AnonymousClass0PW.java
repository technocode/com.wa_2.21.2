package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.camera.LauncherCameraActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0PW  reason: invalid class name */
public class AnonymousClass0PW {
    public static final int A00 = 8;
    public static final int A01 = 20;
    public static final int A02 = 72;
    public static final int A03 = 108;
    public static final String A04 = "com.whatsapp.sharing.category.SHARE_TARGET_DEFAULT";
    public static final Set A05 = new C27191On();

    public static int A00(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            return 8;
        }
        if (i >= 25) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        }
        return 0;
    }

    public static int A01(C14670mg r0, C14670mg r1) {
        return r1.A00 - r0.A00;
    }

    public static Bitmap A02(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(0.0f, 0.0f, 108.0f, 108.0f);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColor(-1);
        canvas.drawRect(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, ((float) (canvas.getWidth() - bitmap.getWidth())) / 2.0f, ((float) (canvas.getHeight() - bitmap.getHeight())) / 2.0f, paint);
        return createBitmap;
    }

    public static C14610mZ A03(Context context, C007003k r3, AnonymousClass01A r4, C014308b r5) {
        C14600mY r1 = new C14600mY();
        r1.A01 = r5.A08(r3, false);
        r1.A03 = A07(context, r3, r4);
        return new C14610mZ(r1);
    }

    public static C14670mg A04(int i, Context context, C007003k r8, AnonymousClass0HJ r9, AnonymousClass01A r10, C014308b r11, AnonymousClass0HK r12) {
        Log.i("WaShortcutsApiHelper/createShortcutForContact");
        Jid jid = r8.A09;
        if (jid != null) {
            String rawString = jid.getRawString();
            C14670mg r2 = new C14670mg();
            r2.A02 = context;
            r2.A07 = rawString;
            r2.A05 = r11.A08(r8, false);
            r2.A08 = A05;
            r2.A0A = true;
            r2.A00 = i;
            r2.A0B = new Intent[]{Conversation.A05(context, (AnonymousClass02N) r8.A02(AnonymousClass02N.class)).setAction("android.intent.action.VIEW")};
            Bitmap A022 = r12.A02(r8, 72, 0.0f, true);
            if (A022 == null) {
                A022 = AnonymousClass0HJ.A01(r9.A01.A00, r9.A03(r8), 72, 0.0f);
            }
            Bitmap A023 = A02(A022);
            if (A023 != null) {
                IconCompat iconCompat = new IconCompat(5);
                iconCompat.A06 = A023;
                r2.A03 = iconCompat;
                if (AnonymousClass1VY.A0e(r8.A09)) {
                    r2.A0C = new C14610mZ[]{A03(context, r8, r10, r11)};
                }
                if (!TextUtils.isEmpty(r2.A05)) {
                    Intent[] intentArr = r2.A0B;
                    if (intentArr != null && intentArr.length != 0) {
                        return r2;
                    }
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        throw null;
    }

    public static C14670mg A05(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14670mg r1 = (C14670mg) it.next();
            if (r1.A07.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public static synchronized String A06(Context context, C007003k r9, AnonymousClass0HJ r10, AnonymousClass01A r11, C014308b r12, AnonymousClass0HK r13) {
        synchronized (AnonymousClass0PW.class) {
            List A022 = C14690mi.A02(context);
            Jid jid = r9.A09;
            if (jid != null) {
                String str = null;
                if (A05(A022, jid.getRawString()) != null) {
                    Log.i("WaShortcutsApiHelper/publishAndGetReplacedShortcutId/shortcut already published");
                    return null;
                }
                int A002 = A00(context);
                boolean z = false;
                if (A022.size() == A002) {
                    z = true;
                }
                if (z) {
                    Log.i("WaShortcutsApiHelper/publishAndGetReplacedShortcutId/replace shortcut");
                    Collections.sort(A022, AnonymousClass1KC.A00);
                    str = ((C14670mg) A022.get(0)).A07;
                    C14690mi.A06(context, Collections.singletonList(str));
                }
                C14690mi.A05(context, Collections.singletonList(A04(Math.min(A022.size(), A002), context, r9, r10, r11, r12, r13)));
                return str;
            }
            throw null;
        }
    }

    public static String A07(Context context, C007003k r1, AnonymousClass01A r2) {
        Uri A042 = r2.A04(r1, context.getContentResolver());
        if (A042 != null) {
            return A042.toString();
        }
        return null;
    }

    public static List A08(C006903j r5, AnonymousClass01A r6, AnonymousClass0GG r7, C02120As r8, AnonymousClass01T r9, AnonymousClass0AQ r10) {
        Log.i("WaShortcutsApiHelper/getFrequentContacts");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) r8.A02(null)).iterator();
        while (it.hasNext()) {
            AnonymousClass02N r3 = (AnonymousClass02N) it.next();
            C007003k A09 = r6.A09(r3);
            if (A09 != null && !r7.A0H(UserJid.of(r3)) && !r5.A0F(r3) && !AnonymousClass1VY.A0a(r3) && !AnonymousClass1VY.A0b(r3)) {
                if (!A09.A09() || r9.A04((GroupJid) r3)) {
                    arrayList.add(A09);
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            Log.i("WaShortcutsApiHelper/getFrequentContacts/get N contacts");
            List A042 = r10.A04(20);
            boolean isEmpty2 = ((AbstractCollection) A042).isEmpty();
            arrayList2 = A042;
            if (isEmpty2) {
                Log.i("WaShortcutsApiHelper/getFrequentContacts/get contact picker list");
                r6.A04.A0S(A042, 0, false, false);
                arrayList2 = A042;
            }
        }
        return arrayList2;
    }

    public static void A09(Context context) {
        C14690mi.A03(context);
    }

    public static void A0A(Context context) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        List<ShortcutInfo> shortcuts = shortcutManager.getShortcuts(8);
        ArrayList arrayList = new ArrayList();
        for (ShortcutInfo shortcutInfo : shortcuts) {
            arrayList.add(shortcutInfo.getId());
        }
        shortcutManager.removeLongLivedShortcuts(arrayList);
    }

    public static synchronized void A0E(Context context, AnonymousClass009 r15, C006903j r16, AnonymousClass0HJ r17, AnonymousClass01A r18, C014308b r19, AnonymousClass01X r20, AnonymousClass0GG r21, AnonymousClass03S r22, C02120As r23, AnonymousClass01T r24, AnonymousClass0HK r25, AnonymousClass0AQ r26) {
        synchronized (AnonymousClass0PW.class) {
            List A08 = A08(r16, r18, r21, r23, r24, r26);
            ArrayList arrayList = new ArrayList();
            if (r22.A07()) {
                C14670mg r5 = new C14670mg();
                r5.A02 = context;
                r5.A07 = "open_camera";
                r5.A05 = r20.A06(R.string.shortcut_camera);
                r5.A03 = IconCompat.A02(context, R.drawable.ic_shortcut_camera_alt);
                r5.A0B = new Intent[]{new Intent(context, LauncherCameraActivity.class).setAction("android.intent.action.VIEW")};
                if (!TextUtils.isEmpty(r5.A05)) {
                    Intent[] intentArr = r5.A0B;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    arrayList.add(r5);
                } else {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
            }
            int A002 = A00(context);
            for (int i = 0; i < A08.size(); i++) {
                arrayList.add(A04(i, context, (C007003k) A08.get(i), r17, r18, r19, r25));
                if (A002 != arrayList.size()) {
                }
            }
            try {
                A0L(context, arrayList);
            } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
                r15.A04("WaShortcutsHelper/rebuildDynamicShortcuts", null, true);
                Log.w("WaShortcutsHelper/exception happened. ", e);
            }
        }
    }

    public static void A0F(Context context, C007003k r3) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        Jid jid = r3.A09;
        if (jid != null) {
            arrayList.add(jid.getRawString());
            if (shortcutManager != null) {
                shortcutManager.disableShortcuts(arrayList);
                return;
            }
            return;
        }
        throw null;
    }

    public static void A0H(Context context, AnonymousClass02N r4) {
        String rawString = r4.getRawString();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        for (ShortcutInfo shortcutInfo : shortcutManager.getShortcuts(8)) {
            if (shortcutInfo.getId().equals(rawString)) {
                shortcutManager.removeLongLivedShortcuts(Collections.singletonList(shortcutInfo.getId()));
                return;
            }
        }
    }

    public static synchronized void A0K(Context context, String str, C007003k r10, AnonymousClass0HJ r11, AnonymousClass01A r12, C014308b r13, AnonymousClass0HK r14) {
        synchronized (AnonymousClass0PW.class) {
            if (str != null) {
                int A002 = A00(context);
                List A022 = C14690mi.A02(context);
                int size = A022.size();
                if (size == A002) {
                    Jid jid = r10.A09;
                    if (jid != null) {
                        String rawString = jid.getRawString();
                        if (A05(A022, rawString) == null) {
                            Log.i("WaShortcutsApiHelper/restoreShortcut/shortcut not found, skip");
                            return;
                        }
                        C14690mi.A06(context, Collections.singletonList(rawString));
                    } else {
                        throw null;
                    }
                }
                AnonymousClass02N A012 = AnonymousClass02N.A01(str);
                if (A012 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("WaShortcutsApiHelper/restoreShortcut/jid not found for shortcutId: ");
                    sb.append(str);
                    Log.i(sb.toString());
                    return;
                }
                C007003k A09 = r12.A09(A012);
                if (A09 == null) {
                    Log.i("WaShortcutsApiHelper/restoreShortcut/contact not found for jid");
                    return;
                }
                C14690mi.A05(context, Collections.singletonList(A04(Math.min(size, A002), context, A09, r11, r12, r13, r14)));
            }
        }
    }

    public static void A0L(Context context, List list) {
        Log.i("WaShortcutsApiHelper/rebuild shortcut lists");
        C14690mi.A03(context);
        int A002 = A00(context);
        if (list.size() <= A002) {
            C14690mi.A05(context, list);
        } else {
            C14690mi.A05(context, list.subList(0, A002));
        }
    }
}
