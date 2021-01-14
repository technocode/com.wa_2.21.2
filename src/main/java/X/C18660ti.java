package X;

/* renamed from: X.0ti  reason: invalid class name and case insensitive filesystem */
public class C18660ti {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public C18660ti(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A00 = f4;
    }

    public C18660ti(C18660ti r2) {
        this.A01 = r2.A01;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[");
        A0S.append(this.A01);
        A0S.append(" ");
        A0S.append(this.A02);
        A0S.append(" ");
        A0S.append(this.A03);
        A0S.append(" ");
        A0S.append(this.A00);
        A0S.append("]");
        return A0S.toString();
    }
}
