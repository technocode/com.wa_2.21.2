package X;

/* renamed from: X.3d8  reason: invalid class name and case insensitive filesystem */
public final class C75563d8 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75563d8 A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public long A01;
    public AnonymousClass071 A02 = AnonymousClass071.A01;
    public C75583dA A03;

    static {
        C75563d8 r0 = new C75563d8();
        A04 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A07(1, this.A02);
        }
        if ((i3 & 2) == 2) {
            C75583dA r0 = this.A03;
            if (r0 == null) {
                r0 = C75583dA.A05;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            i2 += AbstractC11750gu.A05(3, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0J(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            C75583dA r0 = this.A03;
            if (r0 == null) {
                r0 = C75583dA.A05;
            }
            r4.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0I(3, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
