package X;

/* renamed from: X.0OG  reason: invalid class name */
public final class AnonymousClass0OG extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0OG A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01 = 0;
    public C75423cu A02;
    public AnonymousClass0OH A03;
    public Object A04;

    static {
        AnonymousClass0OG r0 = new AnonymousClass0OG();
        A05 = r0;
        r0.A0C();
    }

    public C76543ei A0I() {
        if (this.A01 == 1) {
            return (C76543ei) this.A04;
        }
        return C76543ei.A06;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.A01 == 1) {
            i2 = 0 + AbstractC11750gu.A08(1, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 2) {
            i2 += AbstractC11750gu.A08(2, (AnonymousClass079) this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C75423cu r0 = this.A02;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass0OH r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass0OH.A07;
            }
            i2 += AbstractC11750gu.A08(4, r02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if (this.A01 == 1) {
            r4.A0K(1, (AnonymousClass079) this.A04);
        }
        if (this.A01 == 2) {
            r4.A0K(2, (AnonymousClass079) this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C75423cu r0 = this.A02;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r4.A0K(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            AnonymousClass0OH r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass0OH.A07;
            }
            r4.A0K(4, r02);
        }
        this.unknownFields.A02(r4);
    }
}
