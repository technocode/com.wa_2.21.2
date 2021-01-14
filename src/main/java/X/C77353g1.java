package X;

import java.io.IOException;

/* renamed from: X.3g1  reason: invalid class name and case insensitive filesystem */
public final class C77353g1 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77353g1 A09;
    public static volatile AbstractC37151nd A0A;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;
    public AnonymousClass071 A03;
    public AnonymousClass071 A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;
    public AnonymousClass071 A07;
    public AnonymousClass071 A08;

    static {
        C77353g1 r0 = new C77353g1();
        A09 = r0;
        r0.A0C();
    }

    public C77353g1() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A05 = r0;
        this.A04 = r0;
        this.A03 = r0;
        this.A06 = r0;
        this.A08 = r0;
        this.A07 = r0;
        this.A01 = r0;
        this.A02 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r16, Object obj, Object obj2) {
        boolean z = false;
        switch (r16.ordinal()) {
            case 0:
                return A09;
            case 1:
                AbstractC05000Mr r5 = (AbstractC05000Mr) obj;
                C77353g1 r4 = (C77353g1) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                AnonymousClass071 r2 = this.A05;
                boolean z3 = false;
                if ((r4.A00 & 1) == 1) {
                    z3 = true;
                }
                this.A05 = r5.AR6(z2, r2, z3, r4.A05);
                boolean z4 = false;
                if ((this.A00 & 2) == 2) {
                    z4 = true;
                }
                AnonymousClass071 r22 = this.A04;
                boolean z5 = false;
                if ((r4.A00 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r5.AR6(z4, r22, z5, r4.A04);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                AnonymousClass071 r23 = this.A03;
                boolean z7 = false;
                if ((r4.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r5.AR6(z6, r23, z7, r4.A03);
                boolean z8 = false;
                if ((this.A00 & 8) == 8) {
                    z8 = true;
                }
                AnonymousClass071 r24 = this.A06;
                boolean z9 = false;
                if ((r4.A00 & 8) == 8) {
                    z9 = true;
                }
                this.A06 = r5.AR6(z8, r24, z9, r4.A06);
                boolean z10 = false;
                if ((this.A00 & 16) == 16) {
                    z10 = true;
                }
                AnonymousClass071 r25 = this.A08;
                boolean z11 = false;
                if ((r4.A00 & 16) == 16) {
                    z11 = true;
                }
                this.A08 = r5.AR6(z10, r25, z11, r4.A08);
                boolean z12 = false;
                if ((this.A00 & 32) == 32) {
                    z12 = true;
                }
                AnonymousClass071 r26 = this.A07;
                boolean z13 = false;
                if ((r4.A00 & 32) == 32) {
                    z13 = true;
                }
                this.A07 = r5.AR6(z12, r26, z13, r4.A07);
                boolean z14 = false;
                if ((this.A00 & 64) == 64) {
                    z14 = true;
                }
                AnonymousClass071 r27 = this.A01;
                boolean z15 = false;
                if ((r4.A00 & 64) == 64) {
                    z15 = true;
                }
                this.A01 = r5.AR6(z14, r27, z15, r4.A01);
                boolean z16 = false;
                if ((this.A00 & 128) == 128) {
                    z16 = true;
                }
                AnonymousClass071 r1 = this.A02;
                if ((r4.A00 & 128) == 128) {
                    z = true;
                }
                this.A02 = r5.AR6(z16, r1, z, r4.A02);
                if (r5 == C04980Mp.A00) {
                    this.A00 |= r4.A00;
                }
                return this;
            case 2:
                C05010Mt r52 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r52.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                this.A00 |= 1;
                                this.A05 = r52.A08();
                            } else if (A032 == 18) {
                                this.A00 |= 2;
                                this.A04 = r52.A08();
                            } else if (A032 == 26) {
                                this.A00 |= 4;
                                this.A03 = r52.A08();
                            } else if (A032 == 34) {
                                this.A00 |= 8;
                                this.A06 = r52.A08();
                            } else if (A032 == 42) {
                                this.A00 |= 16;
                                this.A08 = r52.A08();
                            } else if (A032 == 50) {
                                this.A00 |= 32;
                                this.A07 = r52.A08();
                            } else if (A032 == 58) {
                                this.A00 |= 64;
                                this.A01 = r52.A08();
                            } else if (A032 == 66) {
                                this.A00 |= 128;
                                this.A02 = r52.A08();
                            } else if (!A0G(A032, r52)) {
                            }
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
                return null;
            case 4:
                return new C77353g1();
            case 5:
                return new C77343g0();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C77353g1.class) {
                        if (A0A == null) {
                            A0A = new AnonymousClass275(A09);
                        }
                    }
                }
                return A0A;
            default:
                throw new UnsupportedOperationException();
        }
        return A09;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A07(1, this.A05);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A04);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A03);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A07(4, this.A06);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A07(5, this.A08);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A07(6, this.A07);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A07(7, this.A01);
        }
        if ((i3 & 128) == 128) {
            i2 += AbstractC11750gu.A07(8, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0J(1, this.A05);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0J(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0J(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0J(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0J(5, this.A08);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0J(6, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0J(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0J(8, this.A02);
        }
        this.unknownFields.A02(r5);
    }
}
