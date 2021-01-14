package X;

/* renamed from: X.0Cg  reason: invalid class name and case insensitive filesystem */
public class C02500Cg {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04 = -1;
    public int A05 = 0;
    public boolean A06;

    public C02500Cg(int i, int i2, int i3, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A06 = z;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("container: ");
        A0S.append(this.A01);
        A0S.append(", video: ");
        A0S.append(this.A02);
        A0S.append(", audio: ");
        A0S.append(this.A00);
        A0S.append(", problems: ");
        A0S.append(this.A06);
        return A0S.toString();
    }
}
