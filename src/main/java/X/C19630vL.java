package X;

/* renamed from: X.0vL  reason: invalid class name and case insensitive filesystem */
public final class C19630vL {
    public final C07040Vr A00;
    public final C07040Vr A01;

    public C19630vL(C07040Vr r7, C07040Vr r8) {
        double d = r7.A00;
        double d2 = r8.A00;
        if (d <= d2) {
            this.A01 = r7;
            this.A00 = r8;
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("Southern latitude (");
        A0S.append(d);
        A0S.append(") exceeds Northern latitude (");
        A0S.append(d2);
        A0S.append(").");
        throw new IllegalArgumentException(A0S.toString());
    }

    public static double A00(double d, double d2) {
        double d3 = d - d2;
        int i = 0;
        if (d3 < 0.0d) {
            i = 360;
        }
        return d3 + ((double) i);
    }

    public C07040Vr A01() {
        double d;
        C07040Vr r3 = this.A01;
        double d2 = r3.A00;
        C07040Vr r2 = this.A00;
        double d3 = (d2 + r2.A00) / 2.0d;
        double d4 = r3.A01;
        double d5 = r2.A01;
        int i = (d4 > d5 ? 1 : (d4 == d5 ? 0 : -1));
        double d6 = d4 + d5;
        if (i <= 0) {
            d = d6 / 2.0d;
        } else {
            double d7 = 360.0d;
            double d8 = (d6 + 360.0d) / 2.0d;
            if (d8 <= 180.0d) {
                d7 = 0.0d;
            }
            d = d8 - d7;
        }
        return new C07040Vr(d3, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19630vL)) {
            return false;
        }
        C19630vL r4 = (C19630vL) obj;
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() + ((this.A00.hashCode() + 527) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LatLngBounds");
        sb.append("{northeast=");
        sb.append(this.A00);
        sb.append(", southwest=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }
}
