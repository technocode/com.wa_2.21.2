package X;

import java.util.Arrays;

/* renamed from: X.17e  reason: invalid class name and case insensitive filesystem */
public final class C237017e {
    public final int A00;
    public final AnonymousClass16z A01;
    public final boolean A02 = false;

    public C237017e(AnonymousClass16z r5, AbstractC236416x r6) {
        this.A01 = r5;
        this.A00 = Arrays.hashCode(new Object[]{r5, null});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C237017e)) {
            return false;
        }
        C237017e r5 = (C237017e) obj;
        if (!this.A02 && !r5.A02 && AnonymousClass05S.A0H(this.A01, r5.A01)) {
            Object obj2 = null;
            if (0 == 0 || (0 != 0 && obj2.equals(null))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }
}
