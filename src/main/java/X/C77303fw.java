package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.IOException;

/* renamed from: X.3fw  reason: invalid class name and case insensitive filesystem */
public final class C77303fw extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77303fw A0L;
    public static volatile AbstractC37151nd A0M;
    public int A00;
    public long A01;
    public AnonymousClass0N6 A02;
    public C76953fN A03;
    public AnonymousClass0N4 A04;
    public C76983fQ A05;
    public C77003fS A06;
    public C77023fU A07;
    public C77043fW A08;
    public C77063fY A09;
    public C77083fa A0A;
    public C77103fc A0B;
    public C77123fe A0C;
    public C77143fg A0D;
    public C77163fi A0E;
    public C77183fk A0F;
    public C77203fm A0G;
    public C77223fo A0H;
    public C77243fq A0I;
    public C77263fs A0J;
    public C77283fu A0K;

    static {
        C77303fw r0 = new C77303fw();
        A0L = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r15, Object obj, Object obj2) {
        C76973fP r1;
        C76943fM r12;
        C77093fb r13;
        C77013fT r14;
        C76993fR r16;
        C76923fK r17;
        C77073fZ r18;
        C77033fV r19;
        C77053fX r110;
        C77193fl r111;
        C77213fn r112;
        C77233fp r113;
        C77173fj r114;
        C77153fh r115;
        C77253fr r116;
        C77133ff r117;
        C77113fd r118;
        C76963fO r119;
        C77273ft r120;
        boolean z = false;
        switch (r15.ordinal()) {
            case 0:
                return A0L;
            case 1:
                AbstractC05000Mr r7 = (AbstractC05000Mr) obj;
                C77303fw r2 = (C77303fw) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                long j = this.A01;
                boolean z3 = false;
                if ((r2.A00 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r7.ARC(z2, j, z3, r2.A01);
                this.A0K = (C77283fu) r7.ARD(this.A0K, r2.A0K);
                this.A04 = (AnonymousClass0N4) r7.ARD(this.A04, r2.A04);
                this.A0C = (C77123fe) r7.ARD(this.A0C, r2.A0C);
                this.A0D = (C77143fg) r7.ARD(this.A0D, r2.A0D);
                this.A0J = (C77263fs) r7.ARD(this.A0J, r2.A0J);
                this.A0E = (C77163fi) r7.ARD(this.A0E, r2.A0E);
                this.A0F = (C77183fk) r7.ARD(this.A0F, r2.A0F);
                this.A0I = (C77243fq) r7.ARD(this.A0I, r2.A0I);
                this.A0H = (C77223fo) r7.ARD(this.A0H, r2.A0H);
                this.A0G = (C77203fm) r7.ARD(this.A0G, r2.A0G);
                this.A09 = (C77063fY) r7.ARD(this.A09, r2.A09);
                this.A08 = (C77043fW) r7.ARD(this.A08, r2.A08);
                this.A0A = (C77083fa) r7.ARD(this.A0A, r2.A0A);
                this.A02 = (AnonymousClass0N6) r7.ARD(this.A02, r2.A02);
                this.A06 = (C77003fS) r7.ARD(this.A06, r2.A06);
                this.A07 = (C77023fU) r7.ARD(this.A07, r2.A07);
                this.A0B = (C77103fc) r7.ARD(this.A0B, r2.A0B);
                this.A03 = (C76953fN) r7.ARD(this.A03, r2.A03);
                this.A05 = (C76983fQ) r7.ARD(this.A05, r2.A05);
                if (r7 == C04980Mp.A00) {
                    this.A00 |= r2.A00;
                }
                return this;
            case 2:
                C05010Mt r72 = (C05010Mt) obj;
                AnonymousClass1FL r22 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r72.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 8:
                                this.A00 |= 1;
                                this.A01 = r72.A06();
                                continue;
                            case 18:
                                if ((this.A00 & 2) == 2) {
                                    r120 = (C77273ft) this.A0K.AQb();
                                } else {
                                    r120 = null;
                                }
                                C77283fu r0 = (C77283fu) r72.A09(C77283fu.A02.A0A(), r22);
                                this.A0K = r0;
                                if (r120 != null) {
                                    r120.A03(r0);
                                    this.A0K = (C77283fu) r120.A00();
                                }
                                this.A00 |= 2;
                                continue;
                            case 26:
                                if ((this.A00 & 4) == 4) {
                                    r119 = (C76963fO) this.A04.AQb();
                                } else {
                                    r119 = null;
                                }
                                AnonymousClass0N4 r02 = (AnonymousClass0N4) r72.A09(AnonymousClass0N4.A03.A0A(), r22);
                                this.A04 = r02;
                                if (r119 != null) {
                                    r119.A03(r02);
                                    this.A04 = (AnonymousClass0N4) r119.A00();
                                }
                                this.A00 |= 4;
                                continue;
                            case 34:
                                if ((this.A00 & 8) == 8) {
                                    r118 = (C77113fd) this.A0C.AQb();
                                } else {
                                    r118 = null;
                                }
                                C77123fe r03 = (C77123fe) r72.A09(C77123fe.A03.A0A(), r22);
                                this.A0C = r03;
                                if (r118 != null) {
                                    r118.A03(r03);
                                    this.A0C = (C77123fe) r118.A00();
                                }
                                this.A00 |= 8;
                                continue;
                            case 42:
                                if ((this.A00 & 16) == 16) {
                                    r117 = (C77133ff) this.A0D.AQb();
                                } else {
                                    r117 = null;
                                }
                                C77143fg r04 = (C77143fg) r72.A09(C77143fg.A02.A0A(), r22);
                                this.A0D = r04;
                                if (r117 != null) {
                                    r117.A03(r04);
                                    this.A0D = (C77143fg) r117.A00();
                                }
                                this.A00 |= 16;
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                if ((this.A00 & 32) == 32) {
                                    r116 = (C77253fr) this.A0J.AQb();
                                } else {
                                    r116 = null;
                                }
                                C77263fs r05 = (C77263fs) r72.A09(C77263fs.A02.A0A(), r22);
                                this.A0J = r05;
                                if (r116 != null) {
                                    r116.A03(r05);
                                    this.A0J = (C77263fs) r116.A00();
                                }
                                this.A00 |= 32;
                                continue;
                            case 58:
                                if ((this.A00 & 64) == 64) {
                                    r115 = (C77153fh) this.A0E.AQb();
                                } else {
                                    r115 = null;
                                }
                                C77163fi r06 = (C77163fi) r72.A09(C77163fi.A02.A0A(), r22);
                                this.A0E = r06;
                                if (r115 != null) {
                                    r115.A03(r06);
                                    this.A0E = (C77163fi) r115.A00();
                                }
                                this.A00 |= 64;
                                continue;
                            case 66:
                                if ((this.A00 & 128) == 128) {
                                    r114 = (C77173fj) this.A0F.AQb();
                                } else {
                                    r114 = null;
                                }
                                C77183fk r07 = (C77183fk) r72.A09(C77183fk.A06.A0A(), r22);
                                this.A0F = r07;
                                if (r114 != null) {
                                    r114.A03(r07);
                                    this.A0F = (C77183fk) r114.A00();
                                }
                                this.A00 |= 128;
                                continue;
                            case 74:
                                if ((this.A00 & 256) == 256) {
                                    r113 = (C77233fp) this.A0I.AQb();
                                } else {
                                    r113 = null;
                                }
                                C77243fq r08 = (C77243fq) r72.A09(C77243fq.A01.A0A(), r22);
                                this.A0I = r08;
                                if (r113 != null) {
                                    r113.A03(r08);
                                    this.A0I = (C77243fq) r113.A00();
                                }
                                this.A00 |= 256;
                                continue;
                            case 82:
                                if ((this.A00 & 512) == 512) {
                                    r112 = (C77213fn) this.A0H.AQb();
                                } else {
                                    r112 = null;
                                }
                                C77223fo r09 = (C77223fo) r72.A09(C77223fo.A08.A0A(), r22);
                                this.A0H = r09;
                                if (r112 != null) {
                                    r112.A03(r09);
                                    this.A0H = (C77223fo) r112.A00();
                                }
                                this.A00 |= 512;
                                continue;
                            case 90:
                                if ((this.A00 & 1024) == 1024) {
                                    r111 = (C77193fl) this.A0G.AQb();
                                } else {
                                    r111 = null;
                                }
                                C77203fm r010 = (C77203fm) r72.A09(C77203fm.A01.A0A(), r22);
                                this.A0G = r010;
                                if (r111 != null) {
                                    r111.A03(r010);
                                    this.A0G = (C77203fm) r111.A00();
                                }
                                this.A00 |= 1024;
                                continue;
                            case 114:
                                if ((this.A00 & 2048) == 2048) {
                                    r110 = (C77053fX) this.A09.AQb();
                                } else {
                                    r110 = null;
                                }
                                C77063fY r011 = (C77063fY) r72.A09(C77063fY.A05.A0A(), r22);
                                this.A09 = r011;
                                if (r110 != null) {
                                    r110.A03(r011);
                                    this.A09 = (C77063fY) r110.A00();
                                }
                                this.A00 |= 2048;
                                continue;
                            case 122:
                                if ((this.A00 & 4096) == 4096) {
                                    r19 = (C77033fV) this.A08.AQb();
                                } else {
                                    r19 = null;
                                }
                                C77043fW r012 = (C77043fW) r72.A09(C77043fW.A02.A0A(), r22);
                                this.A08 = r012;
                                if (r19 != null) {
                                    r19.A03(r012);
                                    this.A08 = (C77043fW) r19.A00();
                                }
                                this.A00 |= 4096;
                                continue;
                            case 130:
                                if ((this.A00 & 8192) == 8192) {
                                    r18 = (C77073fZ) this.A0A.AQb();
                                } else {
                                    r18 = null;
                                }
                                C77083fa r013 = (C77083fa) r72.A09(C77083fa.A02.A0A(), r22);
                                this.A0A = r013;
                                if (r18 != null) {
                                    r18.A03(r013);
                                    this.A0A = (C77083fa) r18.A00();
                                }
                                this.A00 |= 8192;
                                continue;
                            case 138:
                                if ((this.A00 & 16384) == 16384) {
                                    r17 = (C76923fK) this.A02.AQb();
                                } else {
                                    r17 = null;
                                }
                                AnonymousClass0N6 r014 = (AnonymousClass0N6) r72.A09(AnonymousClass0N6.A03.A0A(), r22);
                                this.A02 = r014;
                                if (r17 != null) {
                                    r17.A03(r014);
                                    this.A02 = (AnonymousClass0N6) r17.A00();
                                }
                                this.A00 |= 16384;
                                continue;
                            case 146:
                                if ((this.A00 & 32768) == 32768) {
                                    r16 = (C76993fR) this.A06.AQb();
                                } else {
                                    r16 = null;
                                }
                                C77003fS r015 = (C77003fS) r72.A09(C77003fS.A03.A0A(), r22);
                                this.A06 = r015;
                                if (r16 != null) {
                                    r16.A03(r015);
                                    this.A06 = (C77003fS) r16.A00();
                                }
                                this.A00 |= 32768;
                                continue;
                            case 154:
                                if ((this.A00 & 65536) == 65536) {
                                    r14 = (C77013fT) this.A07.AQb();
                                } else {
                                    r14 = null;
                                }
                                C77023fU r016 = (C77023fU) r72.A09(C77023fU.A02.A0A(), r22);
                                this.A07 = r016;
                                if (r14 != null) {
                                    r14.A03(r016);
                                    this.A07 = (C77023fU) r14.A00();
                                }
                                this.A00 |= 65536;
                                continue;
                            case 162:
                                if ((this.A00 & 131072) == 131072) {
                                    r13 = (C77093fb) this.A0B.AQb();
                                } else {
                                    r13 = null;
                                }
                                C77103fc r017 = (C77103fc) r72.A09(C77103fc.A03.A0A(), r22);
                                this.A0B = r017;
                                if (r13 != null) {
                                    r13.A03(r017);
                                    this.A0B = (C77103fc) r13.A00();
                                }
                                this.A00 |= 131072;
                                continue;
                            case 170:
                                if ((this.A00 & 262144) == 262144) {
                                    r12 = (C76943fM) this.A03.AQb();
                                } else {
                                    r12 = null;
                                }
                                C76953fN r018 = (C76953fN) r72.A09(C76953fN.A02.A0A(), r22);
                                this.A03 = r018;
                                if (r12 != null) {
                                    r12.A03(r018);
                                    this.A03 = (C76953fN) r12.A00();
                                }
                                this.A00 |= 262144;
                                continue;
                            case 178:
                                if ((this.A00 & 524288) == 524288) {
                                    r1 = (C76973fP) this.A05.AQb();
                                } else {
                                    r1 = null;
                                }
                                C76983fQ r019 = (C76983fQ) r72.A09(C76983fQ.A02.A0A(), r22);
                                this.A05 = r019;
                                if (r1 != null) {
                                    r1.A03(r019);
                                    this.A05 = (C76983fQ) r1.A00();
                                }
                                this.A00 |= 524288;
                                continue;
                            default:
                                if (A0G(A032, r72)) {
                                    continue;
                                }
                                break;
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r121 = new C04190Jk(e2.getMessage());
                        r121.unfinishedMessage = this;
                        throw new RuntimeException(r121);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C77303fw();
            case 5:
                return new C76933fL();
            case 6:
                break;
            case 7:
                if (A0M == null) {
                    synchronized (C77303fw.class) {
                        if (A0M == null) {
                            A0M = new AnonymousClass275(A0L);
                        }
                    }
                }
                return A0M;
            default:
                throw new UnsupportedOperationException();
        }
        return A0L;
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
            i2 = 0 + AbstractC11750gu.A05(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            C77283fu r0 = this.A0K;
            if (r0 == null) {
                r0 = C77283fu.A02;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass0N4 r02 = this.A04;
            if (r02 == null) {
                r02 = AnonymousClass0N4.A03;
            }
            i2 += AbstractC11750gu.A08(3, r02);
        }
        if ((this.A00 & 8) == 8) {
            C77123fe r03 = this.A0C;
            if (r03 == null) {
                r03 = C77123fe.A03;
            }
            i2 += AbstractC11750gu.A08(4, r03);
        }
        if ((this.A00 & 16) == 16) {
            C77143fg r04 = this.A0D;
            if (r04 == null) {
                r04 = C77143fg.A02;
            }
            i2 += AbstractC11750gu.A08(5, r04);
        }
        if ((this.A00 & 32) == 32) {
            C77263fs r05 = this.A0J;
            if (r05 == null) {
                r05 = C77263fs.A02;
            }
            i2 += AbstractC11750gu.A08(6, r05);
        }
        if ((this.A00 & 64) == 64) {
            C77163fi r06 = this.A0E;
            if (r06 == null) {
                r06 = C77163fi.A02;
            }
            i2 += AbstractC11750gu.A08(7, r06);
        }
        if ((this.A00 & 128) == 128) {
            C77183fk r07 = this.A0F;
            if (r07 == null) {
                r07 = C77183fk.A06;
            }
            i2 += AbstractC11750gu.A08(8, r07);
        }
        if ((this.A00 & 256) == 256) {
            C77243fq r08 = this.A0I;
            if (r08 == null) {
                r08 = C77243fq.A01;
            }
            i2 += AbstractC11750gu.A08(9, r08);
        }
        if ((this.A00 & 512) == 512) {
            C77223fo r09 = this.A0H;
            if (r09 == null) {
                r09 = C77223fo.A08;
            }
            i2 += AbstractC11750gu.A08(10, r09);
        }
        if ((this.A00 & 1024) == 1024) {
            C77203fm r010 = this.A0G;
            if (r010 == null) {
                r010 = C77203fm.A01;
            }
            i2 += AbstractC11750gu.A08(11, r010);
        }
        if ((this.A00 & 2048) == 2048) {
            C77063fY r011 = this.A09;
            if (r011 == null) {
                r011 = C77063fY.A05;
            }
            i2 += AbstractC11750gu.A08(14, r011);
        }
        if ((this.A00 & 4096) == 4096) {
            C77043fW r012 = this.A08;
            if (r012 == null) {
                r012 = C77043fW.A02;
            }
            i2 += AbstractC11750gu.A08(15, r012);
        }
        if ((this.A00 & 8192) == 8192) {
            C77083fa r013 = this.A0A;
            if (r013 == null) {
                r013 = C77083fa.A02;
            }
            i2 += AbstractC11750gu.A08(16, r013);
        }
        if ((this.A00 & 16384) == 16384) {
            AnonymousClass0N6 r014 = this.A02;
            if (r014 == null) {
                r014 = AnonymousClass0N6.A03;
            }
            i2 += AbstractC11750gu.A08(17, r014);
        }
        if ((this.A00 & 32768) == 32768) {
            C77003fS r015 = this.A06;
            if (r015 == null) {
                r015 = C77003fS.A03;
            }
            i2 += AbstractC11750gu.A08(18, r015);
        }
        if ((this.A00 & 65536) == 65536) {
            C77023fU r016 = this.A07;
            if (r016 == null) {
                r016 = C77023fU.A02;
            }
            i2 += AbstractC11750gu.A08(19, r016);
        }
        if ((this.A00 & 131072) == 131072) {
            C77103fc r017 = this.A0B;
            if (r017 == null) {
                r017 = C77103fc.A03;
            }
            i2 += AbstractC11750gu.A08(20, r017);
        }
        if ((this.A00 & 262144) == 262144) {
            C76953fN r018 = this.A03;
            if (r018 == null) {
                r018 = C76953fN.A02;
            }
            i2 += AbstractC11750gu.A08(21, r018);
        }
        if ((this.A00 & 524288) == 524288) {
            C76983fQ r019 = this.A05;
            if (r019 == null) {
                r019 = C76983fQ.A02;
            }
            i2 += AbstractC11750gu.A08(22, r019);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0I(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C77283fu r0 = this.A0K;
            if (r0 == null) {
                r0 = C77283fu.A02;
            }
            r5.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass0N4 r02 = this.A04;
            if (r02 == null) {
                r02 = AnonymousClass0N4.A03;
            }
            r5.A0K(3, r02);
        }
        if ((this.A00 & 8) == 8) {
            C77123fe r03 = this.A0C;
            if (r03 == null) {
                r03 = C77123fe.A03;
            }
            r5.A0K(4, r03);
        }
        if ((this.A00 & 16) == 16) {
            C77143fg r04 = this.A0D;
            if (r04 == null) {
                r04 = C77143fg.A02;
            }
            r5.A0K(5, r04);
        }
        if ((this.A00 & 32) == 32) {
            C77263fs r05 = this.A0J;
            if (r05 == null) {
                r05 = C77263fs.A02;
            }
            r5.A0K(6, r05);
        }
        if ((this.A00 & 64) == 64) {
            C77163fi r06 = this.A0E;
            if (r06 == null) {
                r06 = C77163fi.A02;
            }
            r5.A0K(7, r06);
        }
        if ((this.A00 & 128) == 128) {
            C77183fk r07 = this.A0F;
            if (r07 == null) {
                r07 = C77183fk.A06;
            }
            r5.A0K(8, r07);
        }
        if ((this.A00 & 256) == 256) {
            C77243fq r08 = this.A0I;
            if (r08 == null) {
                r08 = C77243fq.A01;
            }
            r5.A0K(9, r08);
        }
        if ((this.A00 & 512) == 512) {
            C77223fo r09 = this.A0H;
            if (r09 == null) {
                r09 = C77223fo.A08;
            }
            r5.A0K(10, r09);
        }
        if ((this.A00 & 1024) == 1024) {
            C77203fm r010 = this.A0G;
            if (r010 == null) {
                r010 = C77203fm.A01;
            }
            r5.A0K(11, r010);
        }
        if ((this.A00 & 2048) == 2048) {
            C77063fY r011 = this.A09;
            if (r011 == null) {
                r011 = C77063fY.A05;
            }
            r5.A0K(14, r011);
        }
        if ((this.A00 & 4096) == 4096) {
            C77043fW r012 = this.A08;
            if (r012 == null) {
                r012 = C77043fW.A02;
            }
            r5.A0K(15, r012);
        }
        if ((this.A00 & 8192) == 8192) {
            C77083fa r013 = this.A0A;
            if (r013 == null) {
                r013 = C77083fa.A02;
            }
            r5.A0K(16, r013);
        }
        if ((this.A00 & 16384) == 16384) {
            AnonymousClass0N6 r014 = this.A02;
            if (r014 == null) {
                r014 = AnonymousClass0N6.A03;
            }
            r5.A0K(17, r014);
        }
        if ((this.A00 & 32768) == 32768) {
            C77003fS r015 = this.A06;
            if (r015 == null) {
                r015 = C77003fS.A03;
            }
            r5.A0K(18, r015);
        }
        if ((this.A00 & 65536) == 65536) {
            C77023fU r016 = this.A07;
            if (r016 == null) {
                r016 = C77023fU.A02;
            }
            r5.A0K(19, r016);
        }
        if ((this.A00 & 131072) == 131072) {
            C77103fc r017 = this.A0B;
            if (r017 == null) {
                r017 = C77103fc.A03;
            }
            r5.A0K(20, r017);
        }
        if ((this.A00 & 262144) == 262144) {
            C76953fN r018 = this.A03;
            if (r018 == null) {
                r018 = C76953fN.A02;
            }
            r5.A0K(21, r018);
        }
        if ((this.A00 & 524288) == 524288) {
            C76983fQ r019 = this.A05;
            if (r019 == null) {
                r019 = C76983fQ.A02;
            }
            r5.A0K(22, r019);
        }
        this.unknownFields.A02(r5);
    }
}
