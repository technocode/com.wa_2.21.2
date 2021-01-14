package X;

/* renamed from: X.3cw  reason: invalid class name and case insensitive filesystem */
public final class C75443cw extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75443cw A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public long A01;
    public long A02;
    public AnonymousClass071 A03;
    public AnonymousClass071 A04;

    static {
        C75443cw r0 = new C75443cw();
        A05 = r0;
        r0.A0C();
    }

    public C75443cw() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A04 = r0;
        this.A03 = r0;
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A04);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A06(2, this.A02);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(8, this.A03);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A06(9, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0J(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0H(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0J(8, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0H(9, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
