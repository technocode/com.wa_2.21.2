package X;

/* renamed from: X.3d6  reason: invalid class name and case insensitive filesystem */
public final class C75543d6 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75543d6 A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public C75563d8 A01;
    public C75603dC A02;

    static {
        C75543d6 r0 = new C75543d6();
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
            C75603dC r0 = this.A02;
            if (r0 == null) {
                r0 = C75603dC.A02;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            C75563d8 r02 = this.A01;
            if (r02 == null) {
                r02 = C75563d8.A04;
            }
            i2 += AbstractC11750gu.A08(2, r02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            C75603dC r0 = this.A02;
            if (r0 == null) {
                r0 = C75603dC.A02;
            }
            r3.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            C75563d8 r02 = this.A01;
            if (r02 == null) {
                r02 = C75563d8.A04;
            }
            r3.A0K(2, r02);
        }
        this.unknownFields.A02(r3);
    }
}
