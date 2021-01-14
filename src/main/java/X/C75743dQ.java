package X;

/* renamed from: X.3dQ  reason: invalid class name and case insensitive filesystem */
public final class C75743dQ extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75743dQ A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public C75423cu A01;
    public String A02 = "";
    public String A03 = "";

    static {
        C75743dQ r0 = new C75743dQ();
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
            i2 = 0 + AbstractC11750gu.A09(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            C75423cu r0 = this.A01;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(3, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0L(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0L(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            C75423cu r0 = this.A01;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r3.A0K(3, r0);
        }
        this.unknownFields.A02(r3);
    }
}
