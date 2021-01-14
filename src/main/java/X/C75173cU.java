package X;

/* renamed from: X.3cU  reason: invalid class name and case insensitive filesystem */
public final class C75173cU extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75173cU A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;

    static {
        C75173cU r0 = new C75173cU();
        A03 = r0;
        r0.A0C();
    }

    public C75173cU() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A01 = r0;
        this.A02 = r0;
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0J(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0J(2, this.A02);
        }
        this.unknownFields.A02(r3);
    }
}
