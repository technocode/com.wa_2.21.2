package X;

/* renamed from: X.3cW  reason: invalid class name and case insensitive filesystem */
public final class C75193cW extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75193cW A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;

    static {
        C75193cW r0 = new C75193cW();
        A03 = r0;
        r0.A0C();
    }

    public C75193cW() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A02 = r0;
        this.A01 = r0;
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A02);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0J(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0J(2, this.A01);
        }
        this.unknownFields.A02(r3);
    }
}
