package X;

/* renamed from: X.0vK  reason: invalid class name and case insensitive filesystem */
public final class C19620vK {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public boolean A04 = false;

    public void A00(C07040Vr r10) {
        if (!this.A04) {
            double d = r10.A00;
            this.A02 = d;
            this.A01 = d;
            double d2 = r10.A01;
            this.A00 = d2;
            this.A03 = d2;
            this.A04 = true;
        }
        double d3 = r10.A00;
        if (d3 > this.A01) {
            this.A01 = d3;
        } else if (d3 < this.A02) {
            this.A02 = d3;
        }
        double d4 = this.A00;
        double d5 = this.A03;
        double A002 = C19630vL.A00(d4, d5);
        double d6 = r10.A01;
        double A003 = C19630vL.A00(d6, d5);
        double A004 = C19630vL.A00(d4, d6);
        if (Double.compare(A003, A002) <= 0 && Double.compare(A004, A002) <= 0) {
            return;
        }
        if (A003 <= A004) {
            this.A00 = d6;
        } else {
            this.A03 = d6;
        }
    }
}
