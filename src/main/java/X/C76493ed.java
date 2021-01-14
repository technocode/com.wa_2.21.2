package X;

/* renamed from: X.3ed  reason: invalid class name and case insensitive filesystem */
public final class C76493ed extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76493ed A0G;
    public static volatile AbstractC37151nd A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public AnonymousClass071 A06;
    public AnonymousClass071 A07;
    public AnonymousClass071 A08;
    public AnonymousClass071 A09;
    public AnonymousClass071 A0A;
    public C75423cu A0B;
    public String A0C;
    public String A0D;
    public String A0E = "";
    public boolean A0F;

    static {
        C76493ed r0 = new C76493ed();
        A0G = r0;
        r0.A0C();
    }

    public C76493ed() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A07 = r0;
        this.A06 = r0;
        this.A09 = r0;
        this.A0D = "";
        this.A0C = "";
        this.A08 = r0;
        this.A0A = r0;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A0E);
        }
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A07);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A06);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A07(4, this.A09);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A09(5, this.A0D);
        }
        int i4 = this.A00;
        if ((i4 & 32) == 32) {
            i2 += AbstractC11750gu.A04(6, this.A02);
        }
        if ((i4 & 64) == 64) {
            i2 += AbstractC11750gu.A04(7, this.A03);
        }
        if ((i4 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A0C);
        }
        int i5 = this.A00;
        if ((i5 & 256) == 256) {
            i2 += AbstractC11750gu.A06(9, this.A04);
        }
        if ((i5 & 512) == 512) {
            i2 += AbstractC11750gu.A05(10, this.A05);
        }
        if ((i5 & 1024) == 1024) {
            i2 += AbstractC11750gu.A04(11, this.A01);
        }
        if ((i5 & 2048) == 2048) {
            i2 += AbstractC11750gu.A07(12, this.A08);
        }
        if ((i5 & 4096) == 4096) {
            i2 += AbstractC11750gu.A00(13);
        }
        if ((i5 & 8192) == 8192) {
            i2 += AbstractC11750gu.A07(16, this.A0A);
        }
        if ((i5 & 16384) == 16384) {
            C75423cu r0 = this.A0B;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(17, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A0E);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0J(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0J(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0J(4, this.A09);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0L(5, this.A0D);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0F(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0F(7, this.A03);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0L(8, this.A0C);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0H(9, this.A04);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0I(10, this.A05);
        }
        if ((this.A00 & 1024) == 1024) {
            r5.A0F(11, this.A01);
        }
        if ((this.A00 & 2048) == 2048) {
            r5.A0J(12, this.A08);
        }
        if ((this.A00 & 4096) == 4096) {
            r5.A0M(13, this.A0F);
        }
        if ((this.A00 & 8192) == 8192) {
            r5.A0J(16, this.A0A);
        }
        if ((this.A00 & 16384) == 16384) {
            C75423cu r0 = this.A0B;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r5.A0K(17, r0);
        }
        this.unknownFields.A02(r5);
    }
}
