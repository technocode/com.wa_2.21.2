package X;

/* renamed from: X.13r  reason: invalid class name and case insensitive filesystem */
public final class C229113r {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;

    public C229113r(Object obj) {
        this.A04 = obj;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = -1;
        this.A02 = Long.MIN_VALUE;
    }

    public C229113r(Object obj, int i, int i2, long j) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = Long.MIN_VALUE;
    }

    public C229113r(Object obj, int i, int i2, long j, long j2) {
        this.A04 = obj;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j;
        this.A02 = j2;
    }

    public C229113r(Object obj, long j, long j2) {
        this.A04 = obj;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = j;
        this.A02 = j2;
    }

    public boolean A00() {
        return this.A00 != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C229113r.class != obj.getClass()) {
            return false;
        }
        C229113r r7 = (C229113r) obj;
        if (this.A04.equals(r7.A04) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A02 == r7.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.A04.hashCode() + 527) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) this.A03)) * 31) + ((int) this.A02);
    }
}
