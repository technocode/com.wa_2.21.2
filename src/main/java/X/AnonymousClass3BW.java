package X;

import java.io.IOException;

/* renamed from: X.3BW  reason: invalid class name */
public final class AnonymousClass3BW extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass3BW A08;
    public static volatile AbstractC37151nd A09;
    public int A00;
    public int A01;
    public AnonymousClass071 A02;
    public AnonymousClass071 A03;
    public AnonymousClass071 A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;
    public AnonymousClass071 A07;

    static {
        AnonymousClass3BW r0 = new AnonymousClass3BW();
        A08 = r0;
        r0.A0C();
    }

    public AnonymousClass3BW() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A03 = r0;
        this.A02 = r0;
        this.A07 = r0;
        this.A06 = r0;
        this.A05 = r0;
        this.A04 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r18, Object obj, Object obj2) {
        boolean z = false;
        switch (r18.ordinal()) {
            case 0:
                return A08;
            case 1:
                AbstractC05000Mr r5 = (AbstractC05000Mr) obj;
                AnonymousClass3BW r4 = (AnonymousClass3BW) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A01;
                int i3 = r4.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r5.AR9(z2, i2, z3, r4.A01);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                AnonymousClass071 r2 = this.A03;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r5.AR6(z4, r2, z5, r4.A03);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                AnonymousClass071 r22 = this.A02;
                boolean z7 = false;
                if ((r4.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A02 = r5.AR6(z6, r22, z7, r4.A02);
                boolean z8 = false;
                if ((this.A00 & 8) == 8) {
                    z8 = true;
                }
                AnonymousClass071 r23 = this.A07;
                boolean z9 = false;
                if ((r4.A00 & 8) == 8) {
                    z9 = true;
                }
                this.A07 = r5.AR6(z8, r23, z9, r4.A07);
                boolean z10 = false;
                if ((this.A00 & 16) == 16) {
                    z10 = true;
                }
                AnonymousClass071 r24 = this.A06;
                boolean z11 = false;
                if ((r4.A00 & 16) == 16) {
                    z11 = true;
                }
                this.A06 = r5.AR6(z10, r24, z11, r4.A06);
                boolean z12 = false;
                if ((this.A00 & 32) == 32) {
                    z12 = true;
                }
                AnonymousClass071 r25 = this.A05;
                boolean z13 = false;
                if ((r4.A00 & 32) == 32) {
                    z13 = true;
                }
                this.A05 = r5.AR6(z12, r25, z13, r4.A05);
                boolean z14 = false;
                if ((this.A00 & 64) == 64) {
                    z14 = true;
                }
                AnonymousClass071 r1 = this.A04;
                if ((r4.A00 & 64) == 64) {
                    z = true;
                }
                this.A04 = r5.AR6(z14, r1, z, r4.A04);
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
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r52.A02();
                            } else if (A032 == 18) {
                                this.A00 |= 2;
                                this.A03 = r52.A08();
                            } else if (A032 == 26) {
                                this.A00 |= 4;
                                this.A02 = r52.A08();
                            } else if (A032 == 34) {
                                this.A00 |= 8;
                                this.A07 = r52.A08();
                            } else if (A032 == 42) {
                                this.A00 |= 16;
                                this.A06 = r52.A08();
                            } else if (A032 == 58) {
                                this.A00 |= 32;
                                this.A05 = r52.A08();
                            } else if (A032 == 66) {
                                this.A00 |= 64;
                                this.A04 = r52.A08();
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
                return new AnonymousClass3BW();
            case 5:
                return new C68003Bi(null);
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (AnonymousClass3BW.class) {
                        if (A09 == null) {
                            A09 = new AnonymousClass275(A08);
                        }
                    }
                }
                return A09;
            default:
                throw new UnsupportedOperationException();
        }
        return A08;
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
            i2 = 0 + AbstractC11750gu.A04(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A03);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A02);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A07(4, this.A07);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A07(5, this.A06);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A07(7, this.A05);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A07(8, this.A04);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0F(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0J(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0J(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0J(4, this.A07);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0J(5, this.A06);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0J(7, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0J(8, this.A04);
        }
        this.unknownFields.A02(r5);
    }
}
