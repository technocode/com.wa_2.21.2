package X;

/* renamed from: X.3dz  reason: invalid class name and case insensitive filesystem */
public final class C76093dz extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76093dz A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public int A01 = 0;
    public Object A02;
    public String A03 = "";

    static {
        C76093dz r0 = new C76093dz();
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
            i2 = 0 + AbstractC11750gu.A09(1, this.A03);
        }
        if (this.A01 == 2) {
            i2 += AbstractC11750gu.A08(2, (AnonymousClass079) this.A02);
        }
        if (this.A01 == 3) {
            i2 += AbstractC11750gu.A08(3, (AnonymousClass079) this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0L(1, this.A03);
        }
        if (this.A01 == 2) {
            r3.A0K(2, (AnonymousClass079) this.A02);
        }
        if (this.A01 == 3) {
            r3.A0K(3, (AnonymousClass079) this.A02);
        }
        this.unknownFields.A02(r3);
    }
}
