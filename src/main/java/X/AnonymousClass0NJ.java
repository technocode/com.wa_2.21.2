package X;

/* renamed from: X.0NJ  reason: invalid class name */
public final class AnonymousClass0NJ extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0NJ A07;
    public static volatile AbstractC37151nd A08;
    public int A00;
    public long A01;
    public AnonymousClass071 A02;
    public AnonymousClass071 A03;
    public AnonymousClass071 A04;
    public String A05 = "";
    public String A06 = "";

    static {
        AnonymousClass0NJ r0 = new AnonymousClass0NJ();
        A07 = r0;
        r0.A0C();
    }

    public AnonymousClass0NJ() {
        AnonymousClass071 r1 = AnonymousClass071.A01;
        this.A04 = r1;
        this.A03 = r1;
        this.A02 = r1;
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A04);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A06);
        }
        int i4 = this.A00;
        if ((i4 & 8) == 8) {
            i2 += AbstractC11750gu.A06(4, this.A01);
        }
        if ((i4 & 16) == 16) {
            i2 += AbstractC11750gu.A07(5, this.A03);
        }
        if ((i4 & 32) == 32) {
            i2 += AbstractC11750gu.A07(6, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0J(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0H(4, this.A01);
        }
        if ((this.A00 & 16) == 16) {
            r4.A0J(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            r4.A0J(6, this.A02);
        }
        this.unknownFields.A02(r4);
    }
}
