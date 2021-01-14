package X;

/* renamed from: X.0Vt  reason: invalid class name and case insensitive filesystem */
public final class C07060Vt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public C07060Vt(int i, int i2, String str, int i3, int i4) {
        this.A02 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A03 = i3;
        this.A00 = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07060Vt)) {
            return false;
        }
        C07060Vt r4 = (C07060Vt) obj;
        if (this.A02 == r4.A02 && this.A01 == r4.A01 && this.A03 == r4.A03 && this.A00 == r4.A00) {
            return this.A04.equals(r4.A04);
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A04.hashCode() + (((this.A02 * 31) + this.A01) * 31)) * 31) + this.A03) * 31) + this.A00;
    }
}
