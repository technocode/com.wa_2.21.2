package X;

/* renamed from: X.0Je  reason: invalid class name and case insensitive filesystem */
public final class C04130Je extends AnonymousClass078 implements AnonymousClass077 {
    public static final C04130Je A08;
    public static volatile AbstractC37151nd A09;
    public int A00;
    public int A01 = 0;
    public int A02;
    public AbstractC04120Jd A03 = C05030Mw.A01;
    public Object A04;
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";

    static {
        C04130Je r0 = new C04130Je();
        A08 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if (this.A01 == 1) {
            i = AbstractC11750gu.A08(1, (AnonymousClass079) this.A04) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 1) == 1) {
            i += AbstractC11750gu.A09(2, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A04(3, this.A02);
        }
        for (int i3 = 0; i3 < this.A03.size(); i3++) {
            i += AbstractC11750gu.A08(4, (AnonymousClass076) this.A03.get(i3));
        }
        if ((this.A00 & 4) == 4) {
            i += AbstractC11750gu.A09(5, this.A05);
        }
        if (this.A01 == 6) {
            i += AbstractC11750gu.A08(6, (AnonymousClass079) this.A04);
        }
        if ((this.A00 & 32) == 32) {
            i += AbstractC11750gu.A09(7, this.A06);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if (this.A01 == 1) {
            r4.A0K(1, (AnonymousClass079) this.A04);
        }
        if ((this.A00 & 1) == 1) {
            r4.A0L(2, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0F(3, this.A02);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            r4.A0K(4, (AnonymousClass076) this.A03.get(i));
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(5, this.A05);
        }
        if (this.A01 == 6) {
            r4.A0K(6, (AnonymousClass079) this.A04);
        }
        if ((this.A00 & 32) == 32) {
            r4.A0L(7, this.A06);
        }
        this.unknownFields.A02(r4);
    }
}
