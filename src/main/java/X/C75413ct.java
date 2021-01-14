package X;

import java.io.IOException;

/* renamed from: X.3ct  reason: invalid class name and case insensitive filesystem */
public final class C75413ct extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75413ct A0A;
    public static volatile AbstractC37151nd A0B;
    public int A00;
    public int A01;
    public AnonymousClass071 A02 = AnonymousClass071.A01;
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";

    static {
        C75413ct r0 = new C75413ct();
        A0A = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r21, Object obj, Object obj2) {
        AnonymousClass3JI r0;
        switch (r21.ordinal()) {
            case 0:
                return A0A;
            case 1:
                AbstractC05000Mr r5 = (AbstractC05000Mr) obj;
                C75413ct r9 = (C75413ct) obj2;
                int i = this.A00;
                boolean z = false;
                if ((i & 1) == 1) {
                    z = true;
                }
                String str = this.A09;
                int i2 = r9.A00;
                boolean z2 = false;
                if ((i2 & 1) == 1) {
                    z2 = true;
                }
                this.A09 = r5.ARH(z, str, z2, r9.A09);
                boolean z3 = false;
                if ((i & 2) == 2) {
                    z3 = true;
                }
                String str2 = this.A03;
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                this.A03 = r5.ARH(z3, str2, z4, r9.A03);
                boolean z5 = false;
                if ((i & 4) == 4) {
                    z5 = true;
                }
                int i3 = this.A01;
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                this.A01 = r5.AR9(z5, i3, z6, r9.A01);
                boolean z7 = false;
                if ((i & 8) == 8) {
                    z7 = true;
                }
                String str3 = this.A08;
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                this.A08 = r5.ARH(z7, str3, z8, r9.A08);
                boolean z9 = false;
                if ((i & 16) == 16) {
                    z9 = true;
                }
                String str4 = this.A04;
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                this.A04 = r5.ARH(z9, str4, z10, r9.A04);
                boolean z11 = false;
                if ((i & 32) == 32) {
                    z11 = true;
                }
                AnonymousClass071 r2 = this.A02;
                boolean z12 = false;
                if ((i2 & 32) == 32) {
                    z12 = true;
                }
                this.A02 = r5.AR6(z11, r2, z12, r9.A02);
                int i4 = this.A00;
                boolean z13 = false;
                if ((i4 & 64) == 64) {
                    z13 = true;
                }
                String str5 = this.A06;
                int i5 = r9.A00;
                boolean z14 = false;
                if ((i5 & 64) == 64) {
                    z14 = true;
                }
                this.A06 = r5.ARH(z13, str5, z14, r9.A06);
                boolean z15 = false;
                if ((i4 & 128) == 128) {
                    z15 = true;
                }
                String str6 = this.A05;
                boolean z16 = false;
                if ((i5 & 128) == 128) {
                    z16 = true;
                }
                this.A05 = r5.ARH(z15, str6, z16, r9.A05);
                boolean z17 = false;
                if ((i4 & 256) == 256) {
                    z17 = true;
                }
                String str7 = this.A07;
                boolean z18 = false;
                if ((i5 & 256) == 256) {
                    z18 = true;
                }
                this.A07 = r5.ARH(z17, str7, z18, r9.A07);
                if (r5 == C04980Mp.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C05010Mt r52 = (C05010Mt) obj;
                boolean z19 = false;
                while (!z19) {
                    try {
                        int A032 = r52.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A2 = r52.A0A();
                                this.A00 |= 1;
                                this.A09 = A0A2;
                            } else if (A032 == 18) {
                                String A0A3 = r52.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A3;
                            } else if (A032 == 24) {
                                int A022 = r52.A02();
                                if (A022 == 0) {
                                    r0 = AnonymousClass3JI.NONE;
                                } else if (A022 == 1) {
                                    r0 = AnonymousClass3JI.IMAGE;
                                } else if (A022 != 2) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JI.VIDEO;
                                }
                                if (r0 == null) {
                                    super.A0D(3, A022);
                                } else {
                                    this.A00 |= 4;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 34) {
                                String A0A4 = r52.A0A();
                                this.A00 |= 8;
                                this.A08 = A0A4;
                            } else if (A032 == 42) {
                                String A0A5 = r52.A0A();
                                this.A00 |= 16;
                                this.A04 = A0A5;
                            } else if (A032 == 50) {
                                this.A00 |= 32;
                                this.A02 = r52.A08();
                            } else if (A032 == 58) {
                                String A0A6 = r52.A0A();
                                this.A00 |= 64;
                                this.A06 = A0A6;
                            } else if (A032 == 66) {
                                String A0A7 = r52.A0A();
                                this.A00 |= 128;
                                this.A05 = A0A7;
                            } else if (A032 == 74) {
                                String A0A8 = r52.A0A();
                                this.A00 |= 256;
                                this.A07 = A0A8;
                            } else if (!A0G(A032, r52)) {
                            }
                        }
                        z19 = true;
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
                return new C75413ct();
            case 5:
                return new C75403cs();
            case 6:
                break;
            case 7:
                if (A0B == null) {
                    synchronized (C75413ct.class) {
                        if (A0B == null) {
                            A0B = new AnonymousClass275(A0A);
                        }
                    }
                }
                return A0B;
            default:
                throw new UnsupportedOperationException();
        }
        return A0A;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A03);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A02(3, this.A01);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            i2 += AbstractC11750gu.A09(5, this.A04);
        }
        int i4 = this.A00;
        if ((i4 & 32) == 32) {
            i2 += AbstractC11750gu.A07(6, this.A02);
        }
        if ((i4 & 64) == 64) {
            i2 += AbstractC11750gu.A09(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A05);
        }
        if ((this.A00 & 256) == 256) {
            i2 += AbstractC11750gu.A09(9, this.A07);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0E(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0L(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0L(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0J(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0L(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0L(8, this.A05);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0L(9, this.A07);
        }
        this.unknownFields.A02(r5);
    }
}
