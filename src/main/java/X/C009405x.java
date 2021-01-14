package X;

/* renamed from: X.05x  reason: invalid class name and case insensitive filesystem */
public class C009405x implements AnonymousClass05n {
    public static C009405x A02 = new C009405x(0, 0);
    public Integer A00;
    public Integer A01;

    public C009405x() {
    }

    public C009405x(int i, int i2) {
        this.A01 = 0;
        this.A00 = 0;
    }

    public Integer A00(AnonymousClass05r r2) {
        return r2.A02 ? this.A00 : this.A01;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C009405x)) {
            return false;
        }
        C009405x r4 = (C009405x) obj;
        if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.intValue() + (this.A01.intValue() * 31);
    }
}
