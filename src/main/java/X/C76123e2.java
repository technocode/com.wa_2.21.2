package X;

import java.io.IOException;

/* renamed from: X.3e2  reason: invalid class name and case insensitive filesystem */
public final class C76123e2 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76123e2 A09;
    public static volatile AbstractC37151nd A0A;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AnonymousClass071 A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;
    public String A07 = "";
    public String A08 = "";

    static {
        C76123e2 r0 = new C76123e2();
        A09 = r0;
        r0.A0C();
    }

    public C76123e2() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A05 = r0;
        this.A06 = r0;
        this.A04 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r21, Object obj, Object obj2) {
        AnonymousClass3JS r0;
        switch (r21.ordinal()) {
            case 0:
                return A09;
            case 1:
                AbstractC05000Mr r13 = (AbstractC05000Mr) obj;
                C76123e2 r9 = (C76123e2) obj2;
                boolean z = false;
                if ((this.A00 & 1) == 1) {
                    z = true;
                }
                AnonymousClass071 r10 = this.A05;
                boolean z2 = false;
                if ((r9.A00 & 1) == 1) {
                    z2 = true;
                }
                this.A05 = r13.AR6(z, r10, z2, r9.A05);
                int i = this.A00;
                boolean z3 = false;
                if ((i & 2) == 2) {
                    z3 = true;
                }
                long j = this.A03;
                int i2 = r9.A00;
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                this.A03 = r13.ARC(z3, j, z4, r9.A03);
                boolean z5 = false;
                if ((i & 4) == 4) {
                    z5 = true;
                }
                AnonymousClass071 r3 = this.A06;
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                this.A06 = r13.AR6(z5, r3, z6, r9.A06);
                boolean z7 = false;
                if ((this.A00 & 8) == 8) {
                    z7 = true;
                }
                AnonymousClass071 r32 = this.A04;
                boolean z8 = false;
                if ((r9.A00 & 8) == 8) {
                    z8 = true;
                }
                this.A04 = r13.AR6(z7, r32, z8, r9.A04);
                int i3 = this.A00;
                boolean z9 = false;
                if ((i3 & 16) == 16) {
                    z9 = true;
                }
                String str = this.A07;
                int i4 = r9.A00;
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                this.A07 = r13.ARH(z9, str, z10, r9.A07);
                boolean z11 = false;
                if ((i3 & 32) == 32) {
                    z11 = true;
                }
                int i5 = this.A02;
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                this.A02 = r13.AR9(z11, i5, z12, r9.A02);
                boolean z13 = false;
                if ((i3 & 64) == 64) {
                    z13 = true;
                }
                int i6 = this.A01;
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                this.A01 = r13.AR9(z13, i6, z14, r9.A01);
                boolean z15 = false;
                if ((i3 & 128) == 128) {
                    z15 = true;
                }
                String str2 = this.A08;
                boolean z16 = false;
                if ((i4 & 128) == 128) {
                    z16 = true;
                }
                this.A08 = r13.ARH(z15, str2, z16, r9.A08);
                if (r13 == C04980Mp.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C05010Mt r132 = (C05010Mt) obj;
                boolean z17 = false;
                while (!z17) {
                    try {
                        int A032 = r132.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                this.A00 |= 1;
                                this.A05 = r132.A08();
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A03 = r132.A06();
                            } else if (A032 == 26) {
                                this.A00 |= 4;
                                this.A06 = r132.A08();
                            } else if (A032 == 34) {
                                this.A00 |= 8;
                                this.A04 = r132.A08();
                            } else if (A032 == 42) {
                                String A0A2 = r132.A0A();
                                this.A00 |= 16;
                                this.A07 = A0A2;
                            } else if (A032 == 48) {
                                int A022 = r132.A02();
                                if (A022 == 0) {
                                    r0 = AnonymousClass3JS.INITIAL_BOOTSTRAP;
                                } else if (A022 == 1) {
                                    r0 = AnonymousClass3JS.INITIAL_STATUS_V3;
                                } else if (A022 == 2) {
                                    r0 = AnonymousClass3JS.FULL;
                                } else if (A022 == 3) {
                                    r0 = AnonymousClass3JS.RECENT;
                                } else if (A022 != 4) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JS.PUSH_NAME;
                                }
                                if (r0 == null) {
                                    super.A0D(6, A022);
                                } else {
                                    this.A00 |= 32;
                                    this.A02 = A022;
                                }
                            } else if (A032 == 56) {
                                this.A00 |= 64;
                                this.A01 = r132.A02();
                            } else if (A032 == 66) {
                                String A0A3 = r132.A0A();
                                this.A00 |= 128;
                                this.A08 = A0A3;
                            } else if (!A0G(A032, r132)) {
                            }
                        }
                        z17 = true;
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
                return new C76123e2();
            case 5:
                return new C76113e1();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C76123e2.class) {
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
            i2 += AbstractC11750gu.A06(2, this.A03);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A06);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A07(4, this.A04);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A09(5, this.A07);
        }
        int i4 = this.A00;
        if ((i4 & 32) == 32) {
            i2 += AbstractC11750gu.A02(6, this.A02);
        }
        if ((i4 & 64) == 64) {
            i2 += AbstractC11750gu.A04(7, this.A01);
        }
        if ((i4 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A08);
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
            r5.A0H(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0J(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0J(4, this.A04);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0L(5, this.A07);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0E(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0F(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0L(8, this.A08);
        }
        this.unknownFields.A02(r5);
    }
}
