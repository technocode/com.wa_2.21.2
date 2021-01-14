package X;

import java.util.Random;

/* renamed from: X.00Z  reason: invalid class name */
public class AnonymousClass00Z {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Random A03 = new Random();
    public final boolean A04;

    public AnonymousClass00Z(int i, int i2, int i3, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = z;
    }

    public boolean A00() {
        if (this.A03.nextInt(this.A00) != 0) {
            return false;
        }
        return true;
    }

    public boolean A01(Object obj) {
        if (obj == null) {
            return A00();
        }
        if (obj.hashCode() % this.A00 != 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass00Z.class != obj.getClass()) {
            return false;
        }
        AnonymousClass00Z r5 = (AnonymousClass00Z) obj;
        if (this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A04 == r5.A04) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A00) * 31) + this.A02) * 31) + (this.A04 ? 1 : 0);
    }
}
