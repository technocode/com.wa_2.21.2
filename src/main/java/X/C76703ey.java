package X;

import java.io.IOException;

/* renamed from: X.3ey  reason: invalid class name and case insensitive filesystem */
public final class C76703ey extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76703ey A0E;
    public static volatile AbstractC37151nd A0F;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public AbstractC04120Jd A08 = C05030Mw.A01;
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public boolean A0C;
    public boolean A0D;

    static {
        C76703ey r0 = new C76703ey();
        A0E = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r22, Object obj, Object obj2) {
        EnumC69953Je r0;
        boolean z = false;
        switch (r22.ordinal()) {
            case 0:
                byte b = this.A00;
                boolean z2 = true;
                if (b == 1) {
                    return A0E;
                }
                if (b == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if ((this.A01 & 1) != 1) {
                    z2 = false;
                }
                if (!z2) {
                    if (booleanValue) {
                        this.A00 = 0;
                    }
                    return null;
                }
                for (int i = 0; i < this.A08.size(); i++) {
                    if (!((AnonymousClass078) this.A08.get(i)).A0F()) {
                        if (booleanValue) {
                            this.A00 = 0;
                        }
                        return null;
                    }
                }
                if (booleanValue) {
                    this.A00 = 1;
                }
                return A0E;
            case 1:
                AbstractC05000Mr r6 = (AbstractC05000Mr) obj;
                C76703ey r5 = (C76703ey) obj2;
                boolean z3 = false;
                if ((this.A01 & 1) == 1) {
                    z3 = true;
                }
                String str = this.A09;
                boolean z4 = false;
                if ((r5.A01 & 1) == 1) {
                    z4 = true;
                }
                this.A09 = r6.ARH(z3, str, z4, r5.A09);
                this.A08 = r6.ARB(this.A08, r5.A08);
                int i2 = this.A01;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                String str2 = this.A0A;
                int i3 = r5.A01;
                boolean z6 = false;
                if ((i3 & 2) == 2) {
                    z6 = true;
                }
                this.A0A = r6.ARH(z5, str2, z6, r5.A0A);
                boolean z7 = false;
                if ((i2 & 4) == 4) {
                    z7 = true;
                }
                String str3 = this.A0B;
                boolean z8 = false;
                if ((i3 & 4) == 4) {
                    z8 = true;
                }
                this.A0B = r6.ARH(z7, str3, z8, r5.A0B);
                boolean z9 = false;
                if ((i2 & 8) == 8) {
                    z9 = true;
                }
                long j = this.A07;
                boolean z10 = false;
                if ((i3 & 8) == 8) {
                    z10 = true;
                }
                this.A07 = r6.ARC(z9, j, z10, r5.A07);
                boolean z11 = false;
                if ((i2 & 16) == 16) {
                    z11 = true;
                }
                int i4 = this.A04;
                boolean z12 = false;
                if ((i3 & 16) == 16) {
                    z12 = true;
                }
                this.A04 = r6.AR9(z11, i4, z12, r5.A04);
                boolean z13 = false;
                if ((i2 & 32) == 32) {
                    z13 = true;
                }
                boolean z14 = this.A0D;
                boolean z15 = false;
                if ((i3 & 32) == 32) {
                    z15 = true;
                }
                this.A0D = r6.AR5(z13, z14, z15, r5.A0D);
                boolean z16 = false;
                if ((i2 & 64) == 64) {
                    z16 = true;
                }
                boolean z17 = this.A0C;
                boolean z18 = false;
                if ((i3 & 64) == 64) {
                    z18 = true;
                }
                this.A0C = r6.AR5(z16, z17, z18, r5.A0C);
                boolean z19 = false;
                if ((i2 & 128) == 128) {
                    z19 = true;
                }
                int i5 = this.A03;
                boolean z20 = false;
                if ((i3 & 128) == 128) {
                    z20 = true;
                }
                this.A03 = r6.AR9(z19, i5, z20, r5.A03);
                boolean z21 = false;
                if ((i2 & 256) == 256) {
                    z21 = true;
                }
                long j2 = this.A06;
                boolean z22 = false;
                if ((i3 & 256) == 256) {
                    z22 = true;
                }
                this.A06 = r6.ARC(z21, j2, z22, r5.A06);
                boolean z23 = false;
                if ((i2 & 512) == 512) {
                    z23 = true;
                }
                int i6 = this.A02;
                boolean z24 = false;
                if ((i3 & 512) == 512) {
                    z24 = true;
                }
                this.A02 = r6.AR9(z23, i6, z24, r5.A02);
                boolean z25 = false;
                if ((i2 & 1024) == 1024) {
                    z25 = true;
                }
                long j3 = this.A05;
                boolean z26 = false;
                if ((i3 & 1024) == 1024) {
                    z26 = true;
                }
                this.A05 = r6.ARC(z25, j3, z26, r5.A05);
                if (r6 == C04980Mp.A00) {
                    this.A01 = i2 | i3;
                }
                return this;
            case 2:
                C05010Mt r62 = (C05010Mt) obj;
                AnonymousClass1FL r52 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r62.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r62.A0A();
                                this.A01 |= 1;
                                this.A09 = A0A2;
                                continue;
                            case 18:
                                AbstractC04120Jd r1 = this.A08;
                                if (!((AbstractC05040Mx) r1).A00) {
                                    r1 = AnonymousClass078.A04(r1);
                                    this.A08 = r1;
                                }
                                r1.add(r62.A09(C76743f2.A04.A0A(), r52));
                                continue;
                            case 26:
                                String A0A3 = r62.A0A();
                                this.A01 |= 2;
                                this.A0A = A0A3;
                                continue;
                            case 34:
                                String A0A4 = r62.A0A();
                                this.A01 |= 4;
                                this.A0B = A0A4;
                                continue;
                            case 40:
                                this.A01 |= 8;
                                this.A07 = r62.A06();
                                continue;
                            case 48:
                                this.A01 |= 16;
                                this.A04 = r62.A02();
                                continue;
                            case 56:
                                this.A01 |= 32;
                                this.A0D = r62.A0H();
                                continue;
                            case 64:
                                this.A01 |= 64;
                                this.A0C = r62.A0H();
                                continue;
                            case AnonymousClass0PW.A02:
                                this.A01 |= 128;
                                this.A03 = r62.A02();
                                continue;
                            case 80:
                                this.A01 |= 256;
                                this.A06 = r62.A06();
                                continue;
                            case 88:
                                int A022 = r62.A02();
                                if (A022 == 0) {
                                    r0 = EnumC69953Je.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY;
                                } else if (A022 != 1) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC69953Je.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY;
                                }
                                if (r0 == null) {
                                    super.A0D(11, A022);
                                    continue;
                                } else {
                                    this.A01 |= 512;
                                    this.A02 = A022;
                                }
                            case 96:
                                this.A01 |= 1024;
                                this.A05 = r62.A06();
                                continue;
                            default:
                                if (A0G(A032, r62)) {
                                    continue;
                                }
                                break;
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r12 = new C04190Jk(e2.getMessage());
                        r12.unfinishedMessage = this;
                        throw new RuntimeException(r12);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A08).A00 = false;
                return null;
            case 4:
                return new C76703ey();
            case 5:
                return new C76693ex();
            case 6:
                break;
            case 7:
                if (A0F == null) {
                    synchronized (C76703ey.class) {
                        if (A0F == null) {
                            A0F = new AnonymousClass275(A0E);
                        }
                    }
                }
                return A0F;
            default:
                throw new UnsupportedOperationException();
        }
        return A0E;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A01 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A09) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A08.size(); i3++) {
            i += AbstractC11750gu.A08(2, (AnonymousClass076) this.A08.get(i3));
        }
        if ((this.A01 & 2) == 2) {
            i += AbstractC11750gu.A09(3, this.A0A);
        }
        if ((this.A01 & 4) == 4) {
            i += AbstractC11750gu.A09(4, this.A0B);
        }
        int i4 = this.A01;
        if ((i4 & 8) == 8) {
            i += AbstractC11750gu.A06(5, this.A07);
        }
        if ((i4 & 16) == 16) {
            i += AbstractC11750gu.A04(6, this.A04);
        }
        if ((i4 & 32) == 32) {
            i += AbstractC11750gu.A00(7);
        }
        if ((i4 & 64) == 64) {
            i += AbstractC11750gu.A00(8);
        }
        if ((i4 & 128) == 128) {
            i += AbstractC11750gu.A04(9, this.A03);
        }
        if ((i4 & 256) == 256) {
            i += AbstractC11750gu.A05(10, this.A06);
        }
        if ((i4 & 512) == 512) {
            i += AbstractC11750gu.A02(11, this.A02);
        }
        if ((i4 & 1024) == 1024) {
            i += AbstractC11750gu.A06(12, this.A05);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A01 & 1) == 1) {
            r5.A0L(1, this.A09);
        }
        for (int i = 0; i < this.A08.size(); i++) {
            r5.A0K(2, (AnonymousClass076) this.A08.get(i));
        }
        if ((this.A01 & 2) == 2) {
            r5.A0L(3, this.A0A);
        }
        if ((this.A01 & 4) == 4) {
            r5.A0L(4, this.A0B);
        }
        if ((this.A01 & 8) == 8) {
            r5.A0H(5, this.A07);
        }
        if ((this.A01 & 16) == 16) {
            r5.A0F(6, this.A04);
        }
        if ((this.A01 & 32) == 32) {
            r5.A0M(7, this.A0D);
        }
        if ((this.A01 & 64) == 64) {
            r5.A0M(8, this.A0C);
        }
        if ((this.A01 & 128) == 128) {
            r5.A0F(9, this.A03);
        }
        if ((this.A01 & 256) == 256) {
            r5.A0I(10, this.A06);
        }
        if ((this.A01 & 512) == 512) {
            r5.A0E(11, this.A02);
        }
        if ((this.A01 & 1024) == 1024) {
            r5.A0H(12, this.A05);
        }
        this.unknownFields.A02(r5);
    }
}
