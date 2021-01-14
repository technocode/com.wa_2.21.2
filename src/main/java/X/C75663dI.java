package X;

/* renamed from: X.3dI  reason: invalid class name and case insensitive filesystem */
public final class C75663dI extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75663dI A0D;
    public static volatile AbstractC37151nd A0E;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass071 A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;
    public AnonymousClass071 A07;
    public C75423cu A08;
    public String A09;
    public String A0A = "";
    public String A0B = "";
    public boolean A0C;

    static {
        C75663dI r0 = new C75663dI();
        A0D = r0;
        r0.A0C();
    }

    public C75663dI() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A05 = r0;
        this.A06 = r0;
        this.A04 = r0;
        this.A09 = "";
        this.A07 = r0;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A0B);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A0A);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A05);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A06(4, this.A02);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A04(5, this.A01);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A00(6);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A07(7, this.A06);
        }
        if ((i3 & 128) == 128) {
            i2 += AbstractC11750gu.A07(8, this.A04);
        }
        if ((i3 & 256) == 256) {
            i2 += AbstractC11750gu.A09(9, this.A09);
        }
        int i4 = this.A00;
        if ((i4 & 512) == 512) {
            i2 += AbstractC11750gu.A05(10, this.A03);
        }
        if ((i4 & 1024) == 1024) {
            C75423cu r0 = this.A08;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(17, r0);
        }
        if ((this.A00 & 2048) == 2048) {
            i2 += AbstractC11750gu.A07(18, this.A07);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A0B);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A0A);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0J(3, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0H(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0F(5, this.A01);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0M(6, this.A0C);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0J(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0J(8, this.A04);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0L(9, this.A09);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0I(10, this.A03);
        }
        if ((this.A00 & 1024) == 1024) {
            C75423cu r0 = this.A08;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r5.A0K(17, r0);
        }
        if ((this.A00 & 2048) == 2048) {
            r5.A0J(18, this.A07);
        }
        this.unknownFields.A02(r5);
    }
}
