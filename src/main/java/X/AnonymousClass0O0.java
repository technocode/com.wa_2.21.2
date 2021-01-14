package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.0O0  reason: invalid class name */
public class AnonymousClass0O0 {
    public static final SparseIntArray A03;
    public static final AnonymousClass05W A04 = new AnonymousClass05W(1);
    public static final Object A05 = new Object();
    public static volatile boolean A06;
    public final AnonymousClass0UA A00;
    public final AbstractC06580Tx A01;
    public final Locale A02;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(45);
        A03 = sparseIntArray;
        sparseIntArray.put(2, 5);
        sparseIntArray.put(3, 5);
        sparseIntArray.put(4, 5);
        sparseIntArray.put(242, 240);
        sparseIntArray.put(237, 239);
        sparseIntArray.put(243, 241);
        sparseIntArray.put(238, 241);
        sparseIntArray.put(240, 235);
        sparseIntArray.put(239, 233);
        sparseIntArray.put(241, 236);
        sparseIntArray.put(197, 183);
        sparseIntArray.put(195, 181);
        sparseIntArray.put(199, 185);
        sparseIntArray.put(200, 186);
        sparseIntArray.put(198, 184);
        sparseIntArray.put(194, 180);
        sparseIntArray.put(196, 182);
        sparseIntArray.put(204, 190);
        sparseIntArray.put(202, 188);
        sparseIntArray.put(206, 192);
        sparseIntArray.put(207, 193);
        sparseIntArray.put(205, 191);
        sparseIntArray.put(201, 187);
        sparseIntArray.put(203, 189);
        sparseIntArray.put(260, 248);
        sparseIntArray.put(259, 247);
        sparseIntArray.put(263, 251);
        sparseIntArray.put(256, 244);
        sparseIntArray.put(264, 252);
        sparseIntArray.put(262, 250);
        sparseIntArray.put(261, 249);
        sparseIntArray.put(257, 245);
        sparseIntArray.put(267, 255);
        sparseIntArray.put(266, 254);
        sparseIntArray.put(265, 253);
        sparseIntArray.put(258, 246);
        sparseIntArray.put(292, 293);
        sparseIntArray.put(284, 285);
        sparseIntArray.put(290, 291);
        sparseIntArray.put(273, 274);
        sparseIntArray.put(276, 278);
        sparseIntArray.put(281, 283);
        sparseIntArray.put(287, 288);
        sparseIntArray.put(277, 278);
        sparseIntArray.put(282, 283);
    }

    public AnonymousClass0O0(Context context, Resources resources, Locale locale) {
        AnonymousClass0UA r1;
        AnonymousClass0UB r0;
        AnonymousClass34X r02;
        int[] iArr;
        if (AbstractC002201f.A06(locale) == null || (r1 = A00(context, resources, locale)) == null || ((r0 = r1.A01) == null ? (r02 = r1.A00) == null || (iArr = r02.A03) == null || iArr.length == 0 : r0.A02.size() == 0)) {
            locale = Locale.US;
            r1 = A00(context, resources, locale);
        }
        this.A00 = r1;
        this.A01 = AbstractC06580Tx.A00(locale);
        this.A02 = locale;
    }

    public static AnonymousClass0UA A00(Context context, Resources resources, Locale locale) {
        String A052 = AbstractC002201f.A05(locale);
        Object obj = A05;
        synchronized (obj) {
            AnonymousClass05W r2 = A04;
            int A022 = r2.A02(A052);
            if (A022 >= 0) {
                return (AnonymousClass0UA) r2.A02[(A022 << 1) + 1];
            }
            C04700Lk.A05 = A06;
            AnonymousClass0UA A002 = C04700Lk.A00(context, resources, "cldr_strings", locale, true);
            synchronized (obj) {
                r2.put(A052, A002);
            }
            return A002;
        }
    }

    public static String A01(Context context, Locale locale, int i) {
        Resources resources = context.getResources();
        AnonymousClass0UA A002 = A00(context, resources, locale);
        if (A002 != null || (A002 = A00(context, resources, Locale.US)) != null) {
            return A02(A002, i);
        }
        Log.e("CldrResources/getString: CLDR data not loaded");
        return "";
    }

    public static String A02(AnonymousClass0UA r3, int i) {
        String A012 = r3.A01(i, A06);
        if (A012 != null) {
            return A012;
        }
        int i2 = A03.get(i, -1);
        if (i2 != -1) {
            return A02(r3, i2);
        }
        Log.e(String.format(Locale.US, "CldrResources/getString error: could not find CLDR string for id=%d", Integer.valueOf(i)));
        return "";
    }

    public String A03(int i, Object obj) {
        AnonymousClass0UA r2 = this.A00;
        if (r2 == null) {
            Log.e("translations/getQuantityString: CLDR data not loaded");
            return "";
        }
        String A002 = r2.A00(i, obj, this.A01, A06);
        if (A002 != null) {
            return A002;
        }
        int i2 = A03.get(i, -1);
        if (i2 != -1) {
            return A03(i2, obj);
        }
        Log.e(String.format(Locale.US, "CldrResources/getQuantityString error: could not find CLDR string for id=%d", Integer.valueOf(i)));
        return "";
    }
}
