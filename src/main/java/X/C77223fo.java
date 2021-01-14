package X;

import java.io.IOException;

/* renamed from: X.3fo  reason: invalid class name and case insensitive filesystem */
public final class C77223fo extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77223fo A08;
    public static volatile AbstractC37151nd A09;
    public int A00;
    public String A01 = "";
    public String A02 = "";
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public boolean A07;

    static {
        C77223fo r0 = new C77223fo();
        A08 = r0;
        r0.A0C();
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
                C77223fo r9 = (C77223fo) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A02;
                int i2 = r9.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A02 = r5.ARH(z2, str, z3, r9.A02);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A03;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r5.ARH(z4, str2, z5, r9.A03);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A04;
                boolean z7 = false;
                if ((i2 & 4) == 4) {
                    z7 = true;
                }
                this.A04 = r5.ARH(z6, str3, z7, r9.A04);
                boolean z8 = false;
                if ((i & 8) == 8) {
                    z8 = true;
                }
                String str4 = this.A06;
                boolean z9 = false;
                if ((i2 & 8) == 8) {
                    z9 = true;
                }
                this.A06 = r5.ARH(z8, str4, z9, r9.A06);
                boolean z10 = false;
                if ((i & 16) == 16) {
                    z10 = true;
                }
                String str5 = this.A01;
                boolean z11 = false;
                if ((i2 & 16) == 16) {
                    z11 = true;
                }
                this.A01 = r5.ARH(z10, str5, z11, r9.A01);
                boolean z12 = false;
                if ((i & 32) == 32) {
                    z12 = true;
                }
                String str6 = this.A05;
                boolean z13 = false;
                if ((i2 & 32) == 32) {
                    z13 = true;
                }
                this.A05 = r5.ARH(z12, str6, z13, r9.A05);
                boolean z14 = false;
                if ((i & 64) == 64) {
                    z14 = true;
                }
                boolean z15 = this.A07;
                if ((i2 & 64) == 64) {
                    z = true;
                }
                this.A07 = r5.AR5(z14, z15, z, r9.A07);
                if (r5 == C04980Mp.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C05010Mt r52 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r52.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = r52.A0A();
                                this.A00 |= 1;
                                this.A02 = A0A;
                            } else if (A032 == 18) {
                                String A0A2 = r52.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A2;
                            } else if (A032 == 26) {
                                String A0A3 = r52.A0A();
                                this.A00 |= 4;
                                this.A04 = A0A3;
                            } else if (A032 == 34) {
                                String A0A4 = r52.A0A();
                                this.A00 |= 8;
                                this.A06 = A0A4;
                            } else if (A032 == 42) {
                                String A0A5 = r52.A0A();
                                this.A00 |= 16;
                                this.A01 = A0A5;
                            } else if (A032 == 50) {
                                String A0A6 = r52.A0A();
                                this.A00 |= 32;
                                this.A05 = A0A6;
                            } else if (A032 == 56) {
                                this.A00 |= 64;
                                this.A07 = r52.A0H();
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
                return new C77223fo();
            case 5:
                return new C77213fn();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C77223fo.class) {
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
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            i2 += AbstractC11750gu.A09(5, this.A01);
        }
        if ((this.A00 & 32) == 32) {
            i2 += AbstractC11750gu.A09(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            i2 += AbstractC11750gu.A00(7);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0L(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            r4.A0L(5, this.A01);
        }
        if ((this.A00 & 32) == 32) {
            r4.A0L(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            r4.A0M(7, this.A07);
        }
        this.unknownFields.A02(r4);
    }
}
