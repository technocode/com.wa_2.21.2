package X;

/* renamed from: X.3ev  reason: invalid class name and case insensitive filesystem */
public final class C76673ev extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76673ev A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public C76103e0 A01;
    public C76103e0 A02;

    static {
        C76673ev r0 = new C76673ev();
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
            C76103e0 r0 = this.A01;
            if (r0 == null) {
                r0 = C76103e0.A0A;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            C76103e0 r02 = this.A02;
            if (r02 == null) {
                r02 = C76103e0.A0A;
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
            C76103e0 r0 = this.A01;
            if (r0 == null) {
                r0 = C76103e0.A0A;
            }
            r3.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            C76103e0 r02 = this.A02;
            if (r02 == null) {
                r02 = C76103e0.A0A;
            }
            r3.A0K(2, r02);
        }
        this.unknownFields.A02(r3);
    }
}
