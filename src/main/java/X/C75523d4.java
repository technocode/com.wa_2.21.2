package X;

/* renamed from: X.3d4  reason: invalid class name and case insensitive filesystem */
public final class C75523d4 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75523d4 A04;
    public static volatile AbstractC37151nd A05;
    public double A00;
    public double A01;
    public int A02;
    public String A03 = "";

    static {
        C75523d4 r0 = new C75523d4();
        A04 = r0;
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
            int i6 = (1 << 3) | 0;
            if ((i6 & -128) == 0) {
                i2 = 1;
            } else {
                i2 = (i6 & -16384) == 0 ? 2 : (-2097152 & i6) == 0 ? 3 : (i6 & -268435456) == 0 ? 4 : 5;
            }
            i4 = 0 + i2 + 8;
        }
        if ((i5 & 2) == 2) {
            int i7 = (2 << 3) | 0;
            if ((i7 & -128) == 0) {
                i = 1;
            } else {
                i = (i7 & -16384) == 0 ? 2 : (-2097152 & i7) == 0 ? 3 : (i7 & -268435456) == 0 ? 4 : 5;
            }
            i4 += i + 8;
        }
        if ((i5 & 4) == 4) {
            i4 += AbstractC11750gu.A09(3, this.A03);
        }
        int A002 = this.unknownFields.A00() + i4;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A02 & 1) == 1) {
            r4.A0G(1, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A02 & 2) == 2) {
            r4.A0G(2, Double.doubleToRawLongBits(this.A01));
        }
        if ((this.A02 & 4) == 4) {
            r4.A0L(3, this.A03);
        }
        this.unknownFields.A02(r4);
    }
}
