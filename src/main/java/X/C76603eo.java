package X;

/* renamed from: X.3eo  reason: invalid class name and case insensitive filesystem */
public final class C76603eo extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76603eo A05;
    public static volatile AbstractC37151nd A06;
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;

    static {
        C76603eo r0 = new C76603eo();
        A05 = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2;
        int i3 = ((AnonymousClass078) this).A00;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        int i5 = this.A02;
        if ((i5 & 1) == 1) {
            i4 = 0 + AbstractC11750gu.A03(1, this.A03);
        }
        if ((i5 & 2) == 2) {
            i4 += AbstractC11750gu.A03(2, this.A04);
        }
        if ((i5 & 4) == 4) {
            int i6 = (3 << 3) | 0;
            if ((i6 & -128) == 0) {
                i2 = 1;
            } else {
                i2 = (i6 & -16384) == 0 ? 2 : (-2097152 & i6) == 0 ? 3 : (i6 & -268435456) == 0 ? 4 : 5;
            }
            i4 += i2 + 8;
        }
        if ((i5 & 8) == 8) {
            int i7 = (4 << 3) | 0;
            if ((i7 & -128) == 0) {
                i = 1;
            } else {
                i = (i7 & -16384) == 0 ? 2 : (-2097152 & i7) == 0 ? 3 : (i7 & -268435456) == 0 ? 4 : 5;
            }
            i4 += i + 8;
        }
        int A002 = this.unknownFields.A00() + i4;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A02 & 1) == 1) {
            r5.A0E(1, this.A03);
        }
        if ((this.A02 & 2) == 2) {
            r5.A0E(2, this.A04);
        }
        if ((this.A02 & 4) == 4) {
            r5.A0G(3, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A02 & 8) == 8) {
            r5.A0G(4, Double.doubleToRawLongBits(this.A01));
        }
        this.unknownFields.A02(r5);
    }
}
