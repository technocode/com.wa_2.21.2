package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.0Lk  reason: invalid class name and case insensitive filesystem */
public class C04700Lk {
    public static final int A02 = 1;
    public static final SparseArray A03 = new SparseArray();
    public static final String[] A04 = {"app_strings_"};
    public static volatile boolean A05;
    public final AbstractC06580Tx A00;
    public final AnonymousClass0UA[] A01 = new AnonymousClass0UA[1];

    public C04700Lk(Context context, Resources resources, Locale locale, AbstractC06580Tx r9) {
        if (!AbstractC002201f.A0A(locale)) {
            this.A01[0] = A00(context, resources, AnonymousClass008.A0O(new StringBuilder(), A04[0], AbstractC002201f.A06(locale)), locale, false);
        }
        this.A00 = r9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012e, code lost:
        if (r0 == false) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0153  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0UA A00(android.content.Context r15, android.content.res.Resources r16, java.lang.String r17, java.util.Locale r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04700Lk.A00(android.content.Context, android.content.res.Resources, java.lang.String, java.util.Locale, boolean):X.0UA");
    }

    public static void A01(int[] iArr) {
        Log.d(String.format(Locale.US, "translations/registerStringPackIds module=%d", 0));
        int length = iArr.length;
        for (int i = 0; i < length; i += 2) {
            A03.put(iArr[i], new C04710Ll(iArr[i + 1]));
        }
    }

    public final String A02(int i, boolean z, Object obj) {
        AnonymousClass0UA r3;
        C04710Ll r4 = (C04710Ll) A03.get(i);
        if (r4 == null || (r3 = this.A01[0]) == null) {
            return null;
        }
        int i2 = r4.A00;
        if (z) {
            return r3.A00(i2, obj, this.A00, A05);
        }
        return r3.A01(i2, A05);
    }
}
