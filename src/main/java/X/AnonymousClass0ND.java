package X;

/* renamed from: X.0ND  reason: invalid class name */
public final class AnonymousClass0ND extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0ND A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public AnonymousClass0NI A01;
    public AnonymousClass0NH A02;
    public AnonymousClass0NC A03;

    static {
        AnonymousClass0ND r0 = new AnonymousClass0ND();
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
            AnonymousClass0NH r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass0NH.A02;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass0NC r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass0NC.A02;
            }
            i2 += AbstractC11750gu.A08(2, r02);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass0NI r03 = this.A01;
            if (r03 == null) {
                r03 = AnonymousClass0NI.A02;
            }
            i2 += AbstractC11750gu.A08(3, r03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass0NH r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass0NH.A02;
            }
            r3.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass0NC r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass0NC.A02;
            }
            r3.A0K(2, r02);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass0NI r03 = this.A01;
            if (r03 == null) {
                r03 = AnonymousClass0NI.A02;
            }
            r3.A0K(3, r03);
        }
        this.unknownFields.A02(r3);
    }
}
