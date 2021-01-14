package X;

import java.io.IOException;

/* renamed from: X.0Jf  reason: invalid class name and case insensitive filesystem */
public final class C04140Jf extends AnonymousClass078 implements AnonymousClass077 {
    public static final C04140Jf A09;
    public static volatile AbstractC37151nd A0A;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";

    static {
        C04140Jf r0 = new C04140Jf();
        A09 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r21, Object obj, Object obj2) {
        AnonymousClass3JE r0;
        AnonymousClass3JC r02;
        boolean z = false;
        switch (r21.ordinal()) {
            case 0:
                return A09;
            case 1:
                AbstractC05000Mr r5 = (AbstractC05000Mr) obj;
                C04140Jf r9 = (C04140Jf) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A07;
                int i2 = r9.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A07 = r5.ARH(z2, str, z3, r9.A07);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A06;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A06 = r5.ARH(z4, str2, z5, r9.A06);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                int i3 = this.A04;
                boolean z7 = false;
                if ((i2 & 4) == 4) {
                    z7 = true;
                }
                this.A04 = r5.AR9(z6, i3, z7, r9.A04);
                boolean z8 = false;
                if ((i & 8) == 8) {
                    z8 = true;
                }
                int i4 = this.A05;
                boolean z9 = false;
                if ((i2 & 8) == 8) {
                    z9 = true;
                }
                this.A05 = r5.AR9(z8, i4, z9, r9.A05);
                boolean z10 = false;
                if ((i & 16) == 16) {
                    z10 = true;
                }
                int i5 = this.A03;
                boolean z11 = false;
                if ((i2 & 16) == 16) {
                    z11 = true;
                }
                this.A03 = r5.AR9(z10, i5, z11, r9.A03);
                boolean z12 = false;
                if ((i & 32) == 32) {
                    z12 = true;
                }
                int i6 = this.A02;
                boolean z13 = false;
                if ((i2 & 32) == 32) {
                    z13 = true;
                }
                this.A02 = r5.AR9(z12, i6, z13, r9.A02);
                boolean z14 = false;
                if ((i & 64) == 64) {
                    z14 = true;
                }
                int i7 = this.A01;
                boolean z15 = false;
                if ((i2 & 64) == 64) {
                    z15 = true;
                }
                this.A01 = r5.AR9(z14, i7, z15, r9.A01);
                boolean z16 = false;
                if ((i & 128) == 128) {
                    z16 = true;
                }
                String str3 = this.A08;
                if ((i2 & 128) == 128) {
                    z = true;
                }
                this.A08 = r5.ARH(z16, str3, z, r9.A08);
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
                                String A0A2 = r52.A0A();
                                this.A00 |= 1;
                                this.A07 = A0A2;
                            } else if (A032 == 18) {
                                String A0A3 = r52.A0A();
                                this.A00 |= 2;
                                this.A06 = A0A3;
                            } else if (A032 == 24) {
                                this.A00 |= 4;
                                this.A04 = r52.A02();
                            } else if (A032 == 32) {
                                int A022 = r52.A02();
                                if (A022 == 0) {
                                    r0 = AnonymousClass3JE.TITLE;
                                } else if (A022 == 1) {
                                    r0 = AnonymousClass3JE.CONTENT;
                                } else if (A022 == 2) {
                                    r0 = AnonymousClass3JE.FOOTER;
                                } else if (A022 != 3) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JE.BUTTON;
                                }
                                if (r0 == null) {
                                    super.A0D(4, A022);
                                } else {
                                    this.A00 |= 8;
                                    this.A05 = A022;
                                }
                            } else if (A032 == 40) {
                                int A023 = r52.A02();
                                if (AnonymousClass3JD.A00(A023) == null) {
                                    super.A0D(5, A023);
                                } else {
                                    this.A00 |= 16;
                                    this.A03 = A023;
                                }
                            } else if (A032 == 48) {
                                this.A00 |= 32;
                                this.A02 = r52.A02();
                            } else if (A032 == 56) {
                                int A024 = r52.A02();
                                if (A024 == 0) {
                                    r02 = AnonymousClass3JC.DISPLAY_TEXT;
                                } else if (A024 == 1) {
                                    r02 = AnonymousClass3JC.URL;
                                } else if (A024 != 2) {
                                    r02 = null;
                                } else {
                                    r02 = AnonymousClass3JC.PHONE_NUMBER;
                                }
                                if (r02 == null) {
                                    super.A0D(7, A024);
                                } else {
                                    this.A00 |= 64;
                                    this.A01 = A024;
                                }
                            } else if (A032 == 66) {
                                String A0A4 = r52.A0A();
                                this.A00 |= 128;
                                this.A08 = A0A4;
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
                return new C04140Jf();
            case 5:
                return new C75303ci();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C04140Jf.class) {
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
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A06);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A04(3, this.A04);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A02(4, this.A05);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A02(5, this.A03);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A04(6, this.A02);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A02(7, this.A01);
        }
        if ((i3 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A08);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0F(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0E(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0E(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0F(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0E(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0L(8, this.A08);
        }
        this.unknownFields.A02(r5);
    }
}
