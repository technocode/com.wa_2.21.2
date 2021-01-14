package X;

/* renamed from: X.3eZ  reason: invalid class name and case insensitive filesystem */
public final class C76453eZ extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76453eZ A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public C02840Dr A01;
    public AnonymousClass0N3 A02;

    static {
        C76453eZ r0 = new C76453eZ();
        A03 = r0;
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
            C02840Dr r0 = this.A01;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            i2 = 0 + AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass0N3 r02 = this.A02;
            if (r02 == null) {
                r02 = AnonymousClass0N3.A05;
            }
            i2 += AbstractC11750gu.A08(3, r02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            C02840Dr r0 = this.A01;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            r4.A0K(2, r0);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass0N3 r02 = this.A02;
            if (r02 == null) {
                r02 = AnonymousClass0N3.A05;
            }
            r4.A0K(3, r02);
        }
        this.unknownFields.A02(r4);
    }
}
