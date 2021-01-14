package X;

/* renamed from: X.3eL  reason: invalid class name and case insensitive filesystem */
public final class C76313eL extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76313eL A0D;
    public static volatile AbstractC37151nd A0E;
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public AnonymousClass071 A06 = AnonymousClass071.A01;
    public C75423cu A07;
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public boolean A0C;

    static {
        C76313eL r0 = new C76313eL();
        A0D = r0;
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
            i5 += AbstractC11750gu.A09(3, this.A0A);
        }
        if ((this.A04 & 8) == 8) {
            i5 += AbstractC11750gu.A09(4, this.A08);
        }
        if ((this.A04 & 16) == 16) {
            i5 += AbstractC11750gu.A09(5, this.A0B);
        }
        int i9 = this.A04;
        if ((i9 & 32) == 32) {
            i5 += AbstractC11750gu.A00(6);
        }
        if ((i9 & 64) == 64) {
            i5 += AbstractC11750gu.A04(7, this.A03);
        }
        if ((i9 & 128) == 128) {
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
        if ((i9 & 256) == 256) {
            i5 += AbstractC11750gu.A04(9, this.A05);
        }
        if ((i9 & 512) == 512) {
            i5 += AbstractC11750gu.A09(11, this.A09);
        }
        int i10 = this.A04;
        if ((i10 & 1024) == 1024) {
            i5 += AbstractC11750gu.A07(16, this.A06);
        }
        if ((i10 & 2048) == 2048) {
            C75423cu r0 = this.A07;
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
    public void ARP(AbstractC11750gu r5) {
        if ((this.A04 & 1) == 1) {
            r5.A0G(1, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A04 & 2) == 2) {
            r5.A0G(2, Double.doubleToRawLongBits(this.A01));
        }
        if ((this.A04 & 4) == 4) {
            r5.A0L(3, this.A0A);
        }
        if ((this.A04 & 8) == 8) {
            r5.A0L(4, this.A08);
        }
        if ((this.A04 & 16) == 16) {
            r5.A0L(5, this.A0B);
        }
        if ((this.A04 & 32) == 32) {
            r5.A0M(6, this.A0C);
        }
        if ((this.A04 & 64) == 64) {
            r5.A0F(7, this.A03);
        }
        if ((this.A04 & 128) == 128) {
            r5.A0D(8, Float.floatToRawIntBits(this.A02));
        }
        if ((this.A04 & 256) == 256) {
            r5.A0F(9, this.A05);
        }
        if ((this.A04 & 512) == 512) {
            r5.A0L(11, this.A09);
        }
        if ((this.A04 & 1024) == 1024) {
            r5.A0J(16, this.A06);
        }
        if ((this.A04 & 2048) == 2048) {
            C75423cu r0 = this.A07;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r5.A0K(17, r0);
        }
        this.unknownFields.A02(r5);
    }
}
