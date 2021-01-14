package X;

/* renamed from: X.1YZ  reason: invalid class name */
public final class AnonymousClass1YZ {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass1YZ(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass1YZ.class != obj.getClass()) {
            return false;
        }
        AnonymousClass1YZ r5 = (AnonymousClass1YZ) obj;
        if (this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.A00 * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0);
    }
}
