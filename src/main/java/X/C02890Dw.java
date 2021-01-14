package X;

/* renamed from: X.0Dw  reason: invalid class name and case insensitive filesystem */
public final class C02890Dw extends AnonymousClass078 implements AnonymousClass077 {
    public static final C02890Dw A0B;
    public static volatile AbstractC37151nd A0C;
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public AnonymousClass071 A08 = AnonymousClass071.A01;
    public C75423cu A09;
    public String A0A = "";

    static {
        C02890Dw r0 = new C02890Dw();
        A0B = r0;
        r0.A0C();
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2;
        int i3;
        int i4 = ((AnonymousClass078) this).A00;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        int i6 = this.A04;
        if ((i6 & 1) == 1) {
            int i7 = (1 << 3) | 0;
            if ((i7 & -128) == 0) {
                i3 = 1;
            } else {
                i3 = (i7 & -16384) == 0 ? 2 : (-2097152 & i7) == 0 ? 3 : (i7 & -268435456) == 0 ? 4 : 5;
            }
            i5 = 0 + i3 + 8;
        }
        if ((i6 & 2) == 2) {
            int i8 = (2 << 3) | 0;
            if ((i8 & -128) == 0) {
                i2 = 1;
            } else {
                i2 = (i8 & -16384) == 0 ? 2 : (-2097152 & i8) == 0 ? 3 : (i8 & -268435456) == 0 ? 4 : 5;
            }
            i5 += i2 + 8;
        }
        if ((i6 & 4) == 4) {
            i5 += AbstractC11750gu.A04(3, this.A03);
        }
        if ((i6 & 8) == 8) {
            if (!true || !true) {
                i = 1;
            } else if (!true || !true) {
                i = 2;
            } else if (!true || !true) {
                i = 3;
            } else {
                i = 5;
                if (!true || !true) {
                    i = 4;
                }
            }
            i5 += i + 4;
        }
        if ((i6 & 16) == 16) {
            i5 += AbstractC11750gu.A04(5, this.A05);
        }
        if ((i6 & 32) == 32) {
            i5 += AbstractC11750gu.A09(6, this.A0A);
        }
        int i9 = this.A04;
        if ((i9 & 64) == 64) {
            i5 += AbstractC11750gu.A05(7, this.A07);
        }
        if ((i9 & 128) == 128) {
            i5 += AbstractC11750gu.A04(8, this.A06);
        }
        if ((i9 & 256) == 256) {
            i5 += AbstractC11750gu.A07(16, this.A08);
        }
        if ((i9 & 512) == 512) {
            C75423cu r0 = this.A09;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i5 += AbstractC11750gu.A08(17, r0);
        }
        int A002 = this.unknownFields.A00() + i5;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r6) {
        if ((this.A04 & 1) == 1) {
            r6.A0G(1, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A04 & 2) == 2) {
            r6.A0G(2, Double.doubleToRawLongBits(this.A01));
        }
        if ((this.A04 & 4) == 4) {
            r6.A0F(3, this.A03);
        }
        if ((this.A04 & 8) == 8) {
            r6.A0D(4, Float.floatToRawIntBits(this.A02));
        }
        if ((this.A04 & 16) == 16) {
            r6.A0F(5, this.A05);
        }
        if ((this.A04 & 32) == 32) {
            r6.A0L(6, this.A0A);
        }
        if ((this.A04 & 64) == 64) {
            r6.A0I(7, this.A07);
        }
        if ((this.A04 & 128) == 128) {
            r6.A0F(8, this.A06);
        }
        if ((this.A04 & 256) == 256) {
            r6.A0J(16, this.A08);
        }
        if ((this.A04 & 512) == 512) {
            C75423cu r0 = this.A09;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r6.A0K(17, r0);
        }
        this.unknownFields.A02(r6);
    }
}
