package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.IOException;

/* renamed from: X.3AO  reason: invalid class name */
public final class AnonymousClass3AO extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass3AO A0E;
    public static volatile AbstractC37151nd A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;
    public AnonymousClass071 A07;
    public AnonymousClass071 A08;
    public AbstractC04120Jd A09 = C05030Mw.A01;
    public AnonymousClass3Cd A0A;
    public AnonymousClass3BW A0B;
    public AnonymousClass3Ai A0C;
    public boolean A0D;

    static {
        AnonymousClass3AO r0 = new AnonymousClass3AO();
        A0E = r0;
        r0.A0C();
    }

    public AnonymousClass3AO() {
        AnonymousClass071 r1 = AnonymousClass071.A01;
        this.A06 = r1;
        this.A07 = r1;
        this.A08 = r1;
        this.A05 = r1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r23, Object obj, Object obj2) {
        AnonymousClass3Aj r15;
        C68003Bi r152;
        C77783gz r153;
        boolean z = false;
        switch (r23.ordinal()) {
            case 0:
                return A0E;
            case 1:
                AbstractC05000Mr r6 = (AbstractC05000Mr) obj;
                AnonymousClass3AO r5 = (AnonymousClass3AO) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A04;
                int i3 = r5.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A04 = r6.AR9(z2, i2, z3, r5.A04);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                AnonymousClass071 r2 = this.A06;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A06 = r6.AR6(z4, r2, z5, r5.A06);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                AnonymousClass071 r22 = this.A07;
                boolean z7 = false;
                if ((r5.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A07 = r6.AR6(z6, r22, z7, r5.A07);
                boolean z8 = false;
                if ((this.A00 & 8) == 8) {
                    z8 = true;
                }
                AnonymousClass071 r24 = this.A08;
                boolean z9 = false;
                if ((r5.A00 & 8) == 8) {
                    z9 = true;
                }
                this.A08 = r6.AR6(z8, r24, z9, r5.A08);
                boolean z10 = false;
                if ((this.A00 & 16) == 16) {
                    z10 = true;
                }
                int i4 = this.A02;
                boolean z11 = false;
                if ((r5.A00 & 16) == 16) {
                    z11 = true;
                }
                this.A02 = r6.AR9(z10, i4, z11, r5.A02);
                this.A0A = (AnonymousClass3Cd) r6.ARD(this.A0A, r5.A0A);
                this.A09 = r6.ARB(this.A09, r5.A09);
                this.A0B = (AnonymousClass3BW) r6.ARD(this.A0B, r5.A0B);
                this.A0C = (AnonymousClass3Ai) r6.ARD(this.A0C, r5.A0C);
                int i5 = this.A00;
                boolean z12 = false;
                if ((i5 & 256) == 256) {
                    z12 = true;
                }
                int i6 = this.A03;
                int i7 = r5.A00;
                boolean z13 = false;
                if ((i7 & 256) == 256) {
                    z13 = true;
                }
                this.A03 = r6.AR9(z12, i6, z13, r5.A03);
                boolean z14 = false;
                if ((i5 & 512) == 512) {
                    z14 = true;
                }
                int i8 = this.A01;
                boolean z15 = false;
                if ((i7 & 512) == 512) {
                    z15 = true;
                }
                this.A01 = r6.AR9(z14, i8, z15, r5.A01);
                boolean z16 = false;
                if ((i5 & 1024) == 1024) {
                    z16 = true;
                }
                boolean z17 = this.A0D;
                boolean z18 = false;
                if ((i7 & 1024) == 1024) {
                    z18 = true;
                }
                this.A0D = r6.AR5(z16, z17, z18, r5.A0D);
                boolean z19 = false;
                if ((i5 & 2048) == 2048) {
                    z19 = true;
                }
                AnonymousClass071 r1 = this.A05;
                if ((i7 & 2048) == 2048) {
                    z = true;
                }
                this.A05 = r6.AR6(z19, r1, z, r5.A05);
                if (r6 == C04980Mp.A00) {
                    this.A00 |= r5.A00;
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
                            case 8:
                                this.A00 |= 1;
                                this.A04 = r62.A02();
                                continue;
                            case 18:
                                this.A00 |= 2;
                                this.A06 = r62.A08();
                                continue;
                            case 26:
                                this.A00 |= 4;
                                this.A07 = r62.A08();
                                continue;
                            case 34:
                                this.A00 |= 8;
                                this.A08 = r62.A08();
                                continue;
                            case 40:
                                this.A00 |= 16;
                                this.A02 = r62.A02();
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                if ((this.A00 & 32) == 32) {
                                    r153 = (C77783gz) this.A0A.AQb();
                                } else {
                                    r153 = null;
                                }
                                AnonymousClass3Cd r0 = (AnonymousClass3Cd) r62.A09(AnonymousClass3Cd.A05.A0A(), r52);
                                this.A0A = r0;
                                if (r153 != null) {
                                    r153.A03(r0);
                                    this.A0A = (AnonymousClass3Cd) r153.A00();
                                }
                                this.A00 |= 32;
                                continue;
                            case 58:
                                AbstractC04120Jd r25 = this.A09;
                                if (!((AbstractC05040Mx) r25).A00) {
                                    r25 = AnonymousClass078.A04(r25);
                                    this.A09 = r25;
                                }
                                r25.add(r62.A09(AnonymousClass3Cd.A05.A0A(), r52));
                                continue;
                            case 66:
                                if ((this.A00 & 64) == 64) {
                                    r152 = (C68003Bi) this.A0B.AQb();
                                } else {
                                    r152 = null;
                                }
                                AnonymousClass3BW r02 = (AnonymousClass3BW) r62.A09(AnonymousClass3BW.A08.A0A(), r52);
                                this.A0B = r02;
                                if (r152 != null) {
                                    r152.A03(r02);
                                    this.A0B = (AnonymousClass3BW) r152.A00();
                                }
                                this.A00 |= 64;
                                continue;
                            case 74:
                                if ((this.A00 & 128) == 128) {
                                    r15 = (AnonymousClass3Aj) this.A0C.AQb();
                                } else {
                                    r15 = null;
                                }
                                AnonymousClass3Ai r03 = (AnonymousClass3Ai) r62.A09(AnonymousClass3Ai.A04.A0A(), r52);
                                this.A0C = r03;
                                if (r15 != null) {
                                    r15.A03(r03);
                                    this.A0C = (AnonymousClass3Ai) r15.A00();
                                }
                                this.A00 |= 128;
                                continue;
                            case 80:
                                this.A00 |= 256;
                                this.A03 = r62.A02();
                                continue;
                            case 88:
                                this.A00 |= 512;
                                this.A01 = r62.A02();
                                continue;
                            case 96:
                                this.A00 |= 1024;
                                this.A0D = r62.A0H();
                                continue;
                            case 106:
                                this.A00 |= 2048;
                                this.A05 = r62.A08();
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
                ((AbstractC05040Mx) this.A09).A00 = false;
                return null;
            case 4:
                return new AnonymousClass3AO();
            case 5:
                return new C77773gy(null);
            case 6:
                break;
            case 7:
                if (A0F == null) {
                    synchronized (AnonymousClass3AO.class) {
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

    public final void A0I() {
        AbstractC04120Jd r1 = this.A09;
        if (!((AbstractC05040Mx) r1).A00) {
            this.A09 = AnonymousClass078.A04(r1);
        }
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = AbstractC11750gu.A04(1, this.A04) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += AbstractC11750gu.A07(2, this.A06);
        }
        if ((i3 & 4) == 4) {
            i += AbstractC11750gu.A07(3, this.A07);
        }
        if ((i3 & 8) == 8) {
            i += AbstractC11750gu.A07(4, this.A08);
        }
        if ((i3 & 16) == 16) {
            i += AbstractC11750gu.A04(5, this.A02);
        }
        if ((i3 & 32) == 32) {
            AnonymousClass3Cd r0 = this.A0A;
            if (r0 == null) {
                r0 = AnonymousClass3Cd.A05;
            }
            i += AbstractC11750gu.A08(6, r0);
        }
        for (int i4 = 0; i4 < this.A09.size(); i4++) {
            i += AbstractC11750gu.A08(7, (AnonymousClass076) this.A09.get(i4));
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass3BW r02 = this.A0B;
            if (r02 == null) {
                r02 = AnonymousClass3BW.A08;
            }
            i += AbstractC11750gu.A08(8, r02);
        }
        if ((this.A00 & 128) == 128) {
            AnonymousClass3Ai r03 = this.A0C;
            if (r03 == null) {
                r03 = AnonymousClass3Ai.A04;
            }
            i += AbstractC11750gu.A08(9, r03);
        }
        int i5 = this.A00;
        if ((i5 & 256) == 256) {
            i += AbstractC11750gu.A04(10, this.A03);
        }
        if ((i5 & 512) == 512) {
            i += AbstractC11750gu.A04(11, this.A01);
        }
        if ((i5 & 1024) == 1024) {
            i += AbstractC11750gu.A00(12);
        }
        if ((i5 & 2048) == 2048) {
            i += AbstractC11750gu.A07(13, this.A05);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0F(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0J(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0J(3, this.A07);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0J(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0F(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            AnonymousClass3Cd r0 = this.A0A;
            if (r0 == null) {
                r0 = AnonymousClass3Cd.A05;
            }
            r5.A0K(6, r0);
        }
        for (int i = 0; i < this.A09.size(); i++) {
            r5.A0K(7, (AnonymousClass076) this.A09.get(i));
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass3BW r02 = this.A0B;
            if (r02 == null) {
                r02 = AnonymousClass3BW.A08;
            }
            r5.A0K(8, r02);
        }
        if ((this.A00 & 128) == 128) {
            AnonymousClass3Ai r03 = this.A0C;
            if (r03 == null) {
                r03 = AnonymousClass3Ai.A04;
            }
            r5.A0K(9, r03);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0F(10, this.A03);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0F(11, this.A01);
        }
        if ((this.A00 & 1024) == 1024) {
            r5.A0M(12, this.A0D);
        }
        if ((this.A00 & 2048) == 2048) {
            r5.A0J(13, this.A05);
        }
        this.unknownFields.A02(r5);
    }
}
