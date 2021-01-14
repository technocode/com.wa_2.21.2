package X;

import java.util.Arrays;

/* renamed from: X.17I  reason: invalid class name */
public final class AnonymousClass17I {
    public final C34671iy A00;
    public final C237017e A01;

    public AnonymousClass17I(C237017e r1, C34671iy r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof AnonymousClass17I)) {
            AnonymousClass17I r4 = (AnonymousClass17I) obj;
            if (!AnonymousClass05S.A0H(this.A01, r4.A01) || !AnonymousClass05S.A0H(this.A00, r4.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("key", this.A01);
        r2.A00("feature", this.A00);
        return r2.toString();
    }
}
