package X;

/* renamed from: X.2TP  reason: invalid class name */
public class AnonymousClass2TP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public AnonymousClass2TP(int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i3;
    }

    public AnonymousClass2TP(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("{maxKb=");
        A0S.append(this.A02);
        A0S.append(", quality=");
        A0S.append(this.A03);
        A0S.append(", maxEdge=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
