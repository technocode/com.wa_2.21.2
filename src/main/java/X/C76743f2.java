package X;

/* renamed from: X.3f2  reason: invalid class name and case insensitive filesystem */
public final class C76743f2 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76743f2 A04;
    public static volatile AbstractC37151nd A05;
    public byte A00 = -1;
    public int A01;
    public long A02;
    public AnonymousClass0Ms A03;

    static {
        C76743f2 r0 = new C76743f2();
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
        if ((this.A01 & 1) == 1) {
            AnonymousClass0Ms r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass0Ms.A0T;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A01 & 2) == 2) {
            i2 += AbstractC11750gu.A06(2, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A01 & 1) == 1) {
            AnonymousClass0Ms r0 = this.A03;
            if (r0 == null) {
                r0 = AnonymousClass0Ms.A0T;
            }
            r4.A0K(1, r0);
        }
        if ((this.A01 & 2) == 2) {
            r4.A0H(2, this.A02);
        }
        this.unknownFields.A02(r4);
    }
}
