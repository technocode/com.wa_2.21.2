package X;

import java.io.IOException;

/* renamed from: X.3e8  reason: invalid class name and case insensitive filesystem */
public final class C76183e8 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76183e8 A0B;
    public static volatile AbstractC37151nd A0C;
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass071 A03;
    public AnonymousClass071 A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;
    public String A07;
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";

    static {
        C76183e8 r0 = new C76183e8();
        A0B = r0;
        r0.A0C();
    }

    public C76183e8() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A06 = r0;
        this.A04 = r0;
        this.A03 = r0;
        this.A07 = "";
        this.A05 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r24, Object obj, Object obj2) {
        AnonymousClass3JT r0;
        switch (r24.ordinal()) {
            case 0:
                return A0B;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                C76183e8 r10 = (C76183e8) obj2;
                int i = this.A01;
                boolean z = false;
                if ((i & 1) == 1) {
                    z = true;
                }
                String str = this.A09;
                int i2 = r10.A01;
                boolean z2 = false;
                if ((i2 & 1) == 1) {
                    z2 = true;
                }
                this.A09 = r8.ARH(z, str, z2, r10.A09);
                boolean z3 = false;
                if ((i & 2) == 2) {
                    z3 = true;
                }
                String str2 = this.A0A;
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                this.A0A = r8.ARH(z3, str2, z4, r10.A0A);
                boolean z5 = false;
                if ((i & 4) == 4) {
                    z5 = true;
                }
                int i3 = this.A00;
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                this.A00 = r8.AR9(z5, i3, z6, r10.A00);
                boolean z7 = false;
                if ((i & 8) == 8) {
                    z7 = true;
                }
                String str3 = this.A08;
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                this.A08 = r8.ARH(z7, str3, z8, r10.A08);
                boolean z9 = false;
                if ((i & 16) == 16) {
                    z9 = true;
                }
                AnonymousClass071 r3 = this.A06;
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                this.A06 = r8.AR6(z9, r3, z10, r10.A06);
                int i4 = this.A01;
                boolean z11 = false;
                if ((i4 & 32) == 32) {
                    z11 = true;
                }
                long j = this.A02;
                int i5 = r10.A01;
                boolean z12 = false;
                if ((i5 & 32) == 32) {
                    z12 = true;
                }
                this.A02 = r8.ARC(z11, j, z12, r10.A02);
                boolean z13 = false;
                if ((i4 & 64) == 64) {
                    z13 = true;
                }
                AnonymousClass071 r32 = this.A04;
                boolean z14 = false;
                if ((i5 & 64) == 64) {
                    z14 = true;
                }
                this.A04 = r8.AR6(z13, r32, z14, r10.A04);
                boolean z15 = false;
                if ((this.A01 & 128) == 128) {
                    z15 = true;
                }
                AnonymousClass071 r2 = this.A03;
                boolean z16 = false;
                if ((r10.A01 & 128) == 128) {
                    z16 = true;
                }
                this.A03 = r8.AR6(z15, r2, z16, r10.A03);
                int i6 = this.A01;
                boolean z17 = false;
                if ((i6 & 256) == 256) {
                    z17 = true;
                }
                String str4 = this.A07;
                int i7 = r10.A01;
                boolean z18 = false;
                if ((i7 & 256) == 256) {
                    z18 = true;
                }
                this.A07 = r8.ARH(z17, str4, z18, r10.A07);
                boolean z19 = false;
                if ((i6 & 512) == 512) {
                    z19 = true;
                }
                AnonymousClass071 r22 = this.A05;
                boolean z20 = false;
                if ((i7 & 512) == 512) {
                    z20 = true;
                }
                this.A05 = r8.AR6(z19, r22, z20, r10.A05);
                if (r8 == C04980Mp.A00) {
                    this.A01 |= r10.A01;
                }
                return this;
            case 2:
                C05010Mt r82 = (C05010Mt) obj;
                boolean z21 = false;
                while (!z21) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r82.A0A();
                                this.A01 |= 1;
                                this.A09 = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r82.A0A();
                                this.A01 |= 2;
                                this.A0A = A0A3;
                                continue;
                            case 24:
                                int A022 = r82.A02();
                                if (A022 == 0) {
                                    r0 = AnonymousClass3JT.IMAGE;
                                } else if (A022 != 1) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JT.PDF;
                                }
                                if (r0 == null) {
                                    super.A0D(3, A022);
                                    continue;
                                } else {
                                    this.A01 |= 4;
                                    this.A00 = A022;
                                }
                            case 34:
                                String A0A4 = r82.A0A();
                                this.A01 |= 8;
                                this.A08 = A0A4;
                                continue;
                            case 42:
                                this.A01 |= 16;
                                this.A06 = r82.A08();
                                continue;
                            case 48:
                                this.A01 |= 32;
                                this.A02 = r82.A06();
                                continue;
                            case 58:
                                this.A01 |= 64;
                                this.A04 = r82.A08();
                                continue;
                            case 66:
                                this.A01 |= 128;
                                this.A03 = r82.A08();
                                continue;
                            case 74:
                                String A0A5 = r82.A0A();
                                this.A01 |= 256;
                                this.A07 = A0A5;
                                continue;
                            case 82:
                                this.A01 |= 512;
                                this.A05 = r82.A08();
                                continue;
                            default:
                                if (A0G(A032, r82)) {
                                    continue;
                                }
                                break;
                        }
                        z21 = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r1 = new C04190Jk(e2.getMessage());
                        r1.unfinishedMessage = this;
                        throw new RuntimeException(r1);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C76183e8();
            case 5:
                return new C76173e7();
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C76183e8.class) {
                        if (A0C == null) {
                            A0C = new AnonymousClass275(A0B);
                        }
                    }
                }
                return A0C;
            default:
                throw new UnsupportedOperationException();
        }
        return A0B;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A01 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A09);
        }
        if ((this.A01 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A0A);
        }
        int i3 = this.A01;
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A02(3, this.A00);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A08);
        }
        int i4 = this.A01;
        if ((i4 & 16) == 16) {
            i2 += AbstractC11750gu.A07(5, this.A06);
        }
        if ((i4 & 32) == 32) {
            i2 += AbstractC11750gu.A05(6, this.A02);
        }
        if ((i4 & 64) == 64) {
            i2 += AbstractC11750gu.A07(7, this.A04);
        }
        if ((i4 & 128) == 128) {
            i2 += AbstractC11750gu.A07(8, this.A03);
        }
        if ((i4 & 256) == 256) {
            i2 += AbstractC11750gu.A09(9, this.A07);
        }
        if ((this.A01 & 512) == 512) {
            i2 += AbstractC11750gu.A07(10, this.A05);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A01 & 1) == 1) {
            r5.A0L(1, this.A09);
        }
        if ((this.A01 & 2) == 2) {
            r5.A0L(2, this.A0A);
        }
        if ((this.A01 & 4) == 4) {
            r5.A0E(3, this.A00);
        }
        if ((this.A01 & 8) == 8) {
            r5.A0L(4, this.A08);
        }
        if ((this.A01 & 16) == 16) {
            r5.A0J(5, this.A06);
        }
        if ((this.A01 & 32) == 32) {
            r5.A0I(6, this.A02);
        }
        if ((this.A01 & 64) == 64) {
            r5.A0J(7, this.A04);
        }
        if ((this.A01 & 128) == 128) {
            r5.A0J(8, this.A03);
        }
        if ((this.A01 & 256) == 256) {
            r5.A0L(9, this.A07);
        }
        if ((this.A01 & 512) == 512) {
            r5.A0J(10, this.A05);
        }
        this.unknownFields.A02(r5);
    }
}
