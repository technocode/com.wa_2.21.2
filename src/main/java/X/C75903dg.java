package X;

/* renamed from: X.3dg  reason: invalid class name and case insensitive filesystem */
public final class C75903dg extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75903dg A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public AbstractC04120Jd A01 = C05030Mw.A01;
    public C02840Dr A02;
    public String A03 = "";
    public String A04 = "";

    static {
        C75903dg r0 = new C75903dg();
        A05 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A03) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            C02840Dr r0 = this.A02;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            i += AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            i += AbstractC11750gu.A09(3, this.A04);
        }
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            i += AbstractC11750gu.A08(4, (AnonymousClass076) this.A01.get(i3));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            C02840Dr r0 = this.A02;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            r4.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(3, this.A04);
        }
        for (int i = 0; i < this.A01.size(); i++) {
            r4.A0K(4, (AnonymousClass076) this.A01.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
