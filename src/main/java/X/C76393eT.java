package X;

/* renamed from: X.3eT  reason: invalid class name and case insensitive filesystem */
public final class C76393eT extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76393eT A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public C75423cu A01;
    public C76363eQ A02;
    public C76383eS A03;
    public String A04 = "";

    static {
        C76393eT r0 = new C76393eT();
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
            C76383eS r0 = this.A03;
            if (r0 == null) {
                r0 = C76383eS.A0B;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C76363eQ r02 = this.A02;
            if (r02 == null) {
                r02 = C76363eQ.A04;
            }
            i2 += AbstractC11750gu.A08(4, r02);
        }
        if ((this.A00 & 8) == 8) {
            C75423cu r03 = this.A01;
            if (r03 == null) {
                r03 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(17, r03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            C76383eS r0 = this.A03;
            if (r0 == null) {
                r0 = C76383eS.A0B;
            }
            r3.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0L(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C76363eQ r02 = this.A02;
            if (r02 == null) {
                r02 = C76363eQ.A04;
            }
            r3.A0K(4, r02);
        }
        if ((this.A00 & 8) == 8) {
            C75423cu r03 = this.A01;
            if (r03 == null) {
                r03 = C75423cu.A0H;
            }
            r3.A0K(17, r03);
        }
        this.unknownFields.A02(r3);
    }
}
