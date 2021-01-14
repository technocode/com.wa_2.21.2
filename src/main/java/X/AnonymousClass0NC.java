package X;

/* renamed from: X.0NC  reason: invalid class name */
public final class AnonymousClass0NC extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0NC A02;
    public static volatile AbstractC37151nd A03;
    public int A00;
    public AnonymousClass071 A01 = AnonymousClass071.A01;

    static {
        AnonymousClass0NC r0 = new AnonymousClass0NC();
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A01);
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
        this.unknownFields.A02(r3);
    }
}
