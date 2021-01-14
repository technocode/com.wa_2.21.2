package X;

/* renamed from: X.3df  reason: invalid class name and case insensitive filesystem */
public final class C75893df extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75893df A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public int A01;
    public long A02;
    public String A03 = "";

    static {
        C75893df r0 = new C75893df();
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
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A03);
        }
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A04(2, this.A01);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A05(3, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0F(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0I(3, this.A02);
        }
        this.unknownFields.A02(r4);
    }
}
