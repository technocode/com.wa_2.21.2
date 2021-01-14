package X;

/* renamed from: X.3ef  reason: invalid class name and case insensitive filesystem */
public final class C76513ef extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76513ef A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public C75423cu A02;
    public String A03 = "";
    public String A04 = "";

    static {
        C76513ef r0 = new C76513ef();
        A05 = r0;
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
            i2 = 0 + AbstractC11750gu.A09(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            C75423cu r0 = this.A02;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            i2 += AbstractC11750gu.A04(4, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            C75423cu r0 = this.A02;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r4.A0K(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0F(4, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
