package X;

/* renamed from: X.3e6  reason: invalid class name and case insensitive filesystem */
public final class C76163e6 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76163e6 A02;
    public static volatile AbstractC37151nd A03;
    public int A00;
    public boolean A01;

    static {
        C76163e6 r0 = new C76163e6();
        A02 = r0;
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
            i2 = 0 + AbstractC11750gu.A00(1);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0M(1, this.A01);
        }
        this.unknownFields.A02(r3);
    }
}