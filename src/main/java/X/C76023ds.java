package X;

/* renamed from: X.3ds  reason: invalid class name and case insensitive filesystem */
public final class C76023ds extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76023ds A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public long A01;
    public String A02 = "";

    static {
        C76023ds r0 = new C76023ds();
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
            i2 = 0 + AbstractC11750gu.A09(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A05(2, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0I(2, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
