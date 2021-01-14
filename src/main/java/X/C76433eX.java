package X;

/* renamed from: X.3eX  reason: invalid class name and case insensitive filesystem */
public final class C76433eX extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76433eX A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public long A01;
    public long A02;
    public C02840Dr A03;
    public String A04 = "";
    public String A05 = "";

    static {
        C76433eX r0 = new C76433eX();
        A06 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 2) == 2) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A04);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A06(2, this.A01);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A09(3, this.A05);
        }
        if ((this.A00 & 1) == 1) {
            C02840Dr r0 = this.A03;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            i2 += AbstractC11750gu.A08(4, r0);
        }
        if ((this.A00 & 16) == 16) {
            i2 += AbstractC11750gu.A05(5, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r6) {
        if ((this.A00 & 2) == 2) {
            r6.A0L(1, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r6.A0H(2, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r6.A0L(3, this.A05);
        }
        if ((this.A00 & 1) == 1) {
            C02840Dr r0 = this.A03;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            r6.A0K(4, r0);
        }
        if ((this.A00 & 16) == 16) {
            r6.A0I(5, this.A02);
        }
        this.unknownFields.A02(r6);
    }
}
