package X;

/* renamed from: X.3do  reason: invalid class name and case insensitive filesystem */
public final class C75983do extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75983do A08;
    public static volatile AbstractC37151nd A09;
    public int A00;
    public long A01;
    public AnonymousClass071 A02 = AnonymousClass071.A01;
    public C75423cu A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";

    static {
        C75983do r0 = new C75983do();
        A08 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A05);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A07);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A05(3, this.A01);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A06);
        }
        int i4 = this.A00;
        if ((i4 & 16) == 16) {
            i2 += AbstractC11750gu.A07(5, this.A02);
        }
        if ((i4 & 32) == 32) {
            i2 += AbstractC11750gu.A09(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            C75423cu r0 = this.A03;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(7, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A05);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0I(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0L(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0J(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0L(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            C75423cu r0 = this.A03;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r5.A0K(7, r0);
        }
        this.unknownFields.A02(r5);
    }
}
