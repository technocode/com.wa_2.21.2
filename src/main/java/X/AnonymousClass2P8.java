package X;

/* renamed from: X.2P8  reason: invalid class name */
public class AnonymousClass2P8 {
    public int A00 = -1;
    public long A01;
    public AbstractC48882Od A02;
    public final int A03;
    public final AbstractC48892Oe A04;

    public AnonymousClass2P8(AbstractC48892Oe r2, int i) {
        this.A04 = r2;
        this.A03 = i;
    }

    public boolean A00() {
        int i = this.A00;
        AbstractC48892Oe r1 = this.A04;
        if (i >= r1.getCount() - 1) {
            return false;
        }
        int i2 = this.A00 + 1;
        this.A00 = i2;
        AbstractC48882Od A7I = r1.A7I(i2);
        this.A02 = A7I;
        this.A01 = A7I.A5y();
        return true;
    }
}
