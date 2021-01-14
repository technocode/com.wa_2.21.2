package X;

import java.io.IOException;

/* renamed from: X.3dv  reason: invalid class name and case insensitive filesystem */
public final class C76053dv extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76053dv A08;
    public static volatile AbstractC37151nd A09;
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03 = 1;
    public int A04;
    public int A05;
    public int A06;
    public int A07;

    static {
        C76053dv r0 = new C76053dv();
        A08 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r18, Object obj, Object obj2) {
        AnonymousClass3JP r0;
        boolean z = false;
        switch (r18.ordinal()) {
            case 0:
                return A08;
            case 1:
                AbstractC05000Mr r5 = (AbstractC05000Mr) obj;
                C76053dv r9 = (C76053dv) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A03;
                int i3 = r9.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A03 = r5.AR9(z2, i2, z3, r9.A03);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                int i4 = this.A07;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A07 = r5.AR9(z4, i4, z5, r9.A07);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                int i5 = this.A06;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A06 = r5.AR9(z6, i5, z7, r9.A06);
                boolean z8 = false;
                if ((i & 8) == 8) {
                    z8 = true;
                }
                int i6 = this.A02;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A02 = r5.AR9(z8, i6, z9, r9.A02);
                boolean z10 = false;
                if ((i & 16) == 16) {
                    z10 = true;
                }
                int i7 = this.A04;
                boolean z11 = false;
                if ((i3 & 16) == 16) {
                    z11 = true;
                }
                this.A04 = r5.AR9(z10, i7, z11, r9.A04);
                boolean z12 = false;
                if ((i & 32) == 32) {
                    z12 = true;
                }
                int i8 = this.A05;
                boolean z13 = false;
                if ((i3 & 32) == 32) {
                    z13 = true;
                }
                this.A05 = r5.AR9(z12, i8, z13, r9.A05);
                boolean z14 = false;
                if ((i & 64) == 64) {
                    z14 = true;
                }
                int i9 = this.A01;
                if ((i3 & 64) == 64) {
                    z = true;
                }
                this.A01 = r5.AR9(z14, i9, z, r9.A01);
                if (r5 == C04980Mp.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C05010Mt r52 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r52.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                int A022 = r52.A02();
                                if (AnonymousClass3JQ.A00(A022) == null) {
                                    super.A0D(1, A022);
                                } else {
                                    this.A00 |= 1;
                                    this.A03 = A022;
                                }
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A07 = r52.A02();
                            } else if (A032 == 24) {
                                this.A00 |= 4;
                                this.A06 = r52.A02();
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A02 = r52.A02();
                            } else if (A032 == 40) {
                                this.A00 |= 16;
                                this.A04 = r52.A02();
                            } else if (A032 == 48) {
                                this.A00 |= 32;
                                this.A05 = r52.A02();
                            } else if (A032 == 56) {
                                int A023 = r52.A02();
                                if (A023 == 1) {
                                    r0 = AnonymousClass3JP.GREGORIAN;
                                } else if (A023 != 2) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JP.SOLAR_HIJRI;
                                }
                                if (r0 == null) {
                                    super.A0D(7, A023);
                                } else {
                                    this.A00 |= 64;
                                    this.A01 = A023;
                                }
                            } else if (!A0G(A032, r52)) {
                            }
                        }
                        z = true;
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
                return new C76053dv();
            case 5:
                return new C76043du();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C76053dv.class) {
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
            i2 = 0 + AbstractC11750gu.A02(1, this.A03);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A04(2, this.A07);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A04(3, this.A06);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A04(4, this.A02);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A04(5, this.A04);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A04(6, this.A05);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A02(7, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0E(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0F(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0F(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0F(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            r4.A0F(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            r4.A0F(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            r4.A0E(7, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
