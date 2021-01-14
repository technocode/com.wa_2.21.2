package X;

/* renamed from: X.3eQ  reason: invalid class name and case insensitive filesystem */
public final class C76363eQ extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76363eQ A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public C76143e4 A01;
    public String A02 = "";
    public String A03 = "";

    static {
        C76363eQ r0 = new C76363eQ();
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
            C76143e4 r0 = this.A01;
            if (r0 == null) {
                r0 = C76143e4.A0N;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            C76143e4 r0 = this.A01;
            if (r0 == null) {
                r0 = C76143e4.A0N;
            }
            r3.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0L(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            r3.A0L(3, this.A02);
        }
        this.unknownFields.A02(r3);
    }
}
