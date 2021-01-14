package X;

/* renamed from: X.3eS  reason: invalid class name and case insensitive filesystem */
public final class C76383eS extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76383eS A0B;
    public static volatile AbstractC37151nd A0C;
    public int A00;
    public int A01;
    public long A02;
    public C76143e4 A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";

    static {
        C76383eS r0 = new C76383eS();
        A0B = r0;
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
            C76143e4 r0 = this.A03;
            if (r0 == null) {
                r0 = C76143e4.A0N;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            i2 += AbstractC11750gu.A09(5, this.A04);
        }
        int i3 = this.A00;
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A05(6, this.A02);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A09(7, this.A08);
        }
        if ((this.A00 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A0A);
        }
        int i4 = this.A00;
        if ((i4 & 256) == 256) {
            i2 += AbstractC11750gu.A04(9, this.A01);
        }
        if ((i4 & 512) == 512) {
            i2 += AbstractC11750gu.A09(11, this.A06);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            C76143e4 r0 = this.A03;
            if (r0 == null) {
                r0 = C76143e4.A0N;
            }
            r5.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0L(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0L(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0L(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0I(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0L(7, this.A08);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0L(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0F(9, this.A01);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0L(11, this.A06);
        }
        this.unknownFields.A02(r5);
    }
}
