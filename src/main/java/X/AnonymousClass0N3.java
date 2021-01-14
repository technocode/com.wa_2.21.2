package X;

/* renamed from: X.0N3  reason: invalid class name */
public final class AnonymousClass0N3 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0N3 A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public boolean A04;

    static {
        AnonymousClass0N3 r0 = new AnonymousClass0N3();
        A05 = r0;
        r0.A0C();
    }

    public static void A08(AnonymousClass0N3 r1, String str) {
        if (str != null) {
            r1.A00 |= 4;
            r1.A01 = str;
            return;
        }
        throw null;
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
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A00(2);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0M(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0L(4, this.A02);
        }
        this.unknownFields.A02(r4);
    }
}
