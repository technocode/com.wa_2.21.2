package X;

import android.text.TextUtils;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.25d  reason: invalid class name */
public class AnonymousClass25d extends AbstractC232314x {
    public static final int[] A03 = new int[0];
    public C231914t A00;
    public final AbstractC232014u A01;
    public final AtomicReference A02 = new AtomicReference(C231614q.A0K);

    public static boolean A01(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public AnonymousClass25d(AbstractC232014u r3) {
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r1 == r0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(X.AnonymousClass148 r12, int r13, int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25d.A00(X.148, int, int, boolean):java.util.List");
    }

    public static boolean A02(AnonymousClass126 r3, int i, C231314n r5) {
        if (!A01(i, false) || r3.A05 != r5.A00 || r3.A0C != r5.A01) {
            return false;
        }
        String str = r5.A02;
        if (str == null || TextUtils.equals(str, r3.A0P)) {
            return true;
        }
        return false;
    }

    public static boolean A03(AnonymousClass126 r1, String str) {
        if (str != null) {
            String str2 = r1.A0O;
            if (str2 == null) {
                str2 = null;
            } else {
                try {
                    str2 = new Locale(str2).getISO3Language();
                } catch (MissingResourceException unused) {
                    if (str2 != null) {
                        str2 = str2.toLowerCase(Locale.US);
                    }
                }
            }
            return TextUtils.equals(str, str2);
        }
    }

    public static boolean A04(AnonymousClass126 r4, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!A01(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !AnonymousClass0W2.A08(r4.A0P, str)) {
            return false;
        }
        int i7 = r4.A0F;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = r4.A08;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f = r4.A01;
        if (f != -1.0f && f > ((float) i5)) {
            return false;
        }
        int i9 = r4.A04;
        if (i9 == -1 || i9 <= i6) {
            return true;
        }
        return false;
    }
}
