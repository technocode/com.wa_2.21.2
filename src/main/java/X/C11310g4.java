package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.0g4  reason: invalid class name and case insensitive filesystem */
public final class C11310g4 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C11310g4 A0I;
    public static volatile AbstractC37151nd A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public AbstractC11330g6 A09;
    public AbstractC11330g6 A0A;
    public C77353g1 A0B;
    public C11420gG A0C;
    public C11350g8 A0D;
    public C77393g5 A0E;
    public String A0F = "";
    public boolean A0G;
    public boolean A0H;

    static {
        C11310g4 r0 = new C11310g4();
        A0I = r0;
        r0.A0C();
    }

    public C11310g4() {
        C11320g5 r1 = C11320g5.A02;
        this.A09 = r1;
        this.A0A = r1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r22, Object obj, Object obj2) {
        EnumC70003Jj r0;
        C77343g0 r12;
        C11430gH r122;
        EnumC69993Ji r02;
        EnumC11400gE r03;
        C77363g2 r123;
        AnonymousClass0g9 r124;
        EnumC69983Jh r04;
        EnumC69983Jh r05;
        int i = 8192;
        int i2 = 128;
        boolean z = false;
        switch (r22.ordinal()) {
            case 0:
                return A0I;
            case 1:
                AbstractC05000Mr r10 = (AbstractC05000Mr) obj;
                C11310g4 r9 = (C11310g4) obj2;
                int i3 = this.A01;
                boolean z2 = false;
                if ((i3 & 1) == 1) {
                    z2 = true;
                }
                long j = this.A08;
                int i4 = r9.A01;
                boolean z3 = false;
                if ((i4 & 1) == 1) {
                    z3 = true;
                }
                this.A08 = r10.ARC(z2, j, z3, r9.A08);
                boolean z4 = false;
                if ((i3 & 2) == 2) {
                    z4 = true;
                }
                boolean z5 = this.A0G;
                boolean z6 = false;
                if ((i4 & 2) == 2) {
                    z6 = true;
                }
                this.A0G = r10.AR5(z4, z5, z6, r9.A0G);
                this.A09 = r10.ARA(this.A09, r9.A09);
                this.A0D = (C11350g8) r10.ARD(this.A0D, r9.A0D);
                this.A0E = (C77393g5) r10.ARD(this.A0E, r9.A0E);
                int i5 = this.A01;
                boolean z7 = false;
                if ((i5 & 16) == 16) {
                    z7 = true;
                }
                String str = this.A0F;
                int i6 = r9.A01;
                boolean z8 = false;
                if ((i6 & 16) == 16) {
                    z8 = true;
                }
                this.A0F = r10.ARH(z7, str, z8, r9.A0F);
                boolean z9 = false;
                if ((i5 & 32) == 32) {
                    z9 = true;
                }
                int i7 = this.A07;
                boolean z10 = false;
                if ((i6 & 32) == 32) {
                    z10 = true;
                }
                this.A07 = r10.AR9(z9, i7, z10, r9.A07);
                boolean z11 = false;
                if ((i5 & 64) == 64) {
                    z11 = true;
                }
                boolean z12 = this.A0H;
                boolean z13 = false;
                if ((i6 & 64) == 64) {
                    z13 = true;
                }
                this.A0H = r10.AR5(z11, z12, z13, r9.A0H);
                boolean z14 = false;
                if ((i5 & 128) == 128) {
                    z14 = true;
                }
                int i8 = this.A06;
                boolean z15 = false;
                if ((i6 & 128) == 128) {
                    z15 = true;
                }
                this.A06 = r10.AR9(z14, i8, z15, r9.A06);
                boolean z16 = false;
                if ((i5 & 256) == 256) {
                    z16 = true;
                }
                int i9 = this.A04;
                boolean z17 = false;
                if ((i6 & 256) == 256) {
                    z17 = true;
                }
                this.A04 = r10.AR9(z16, i9, z17, r9.A04);
                boolean z18 = false;
                if ((i5 & 512) == 512) {
                    z18 = true;
                }
                int i10 = this.A03;
                boolean z19 = false;
                if ((i6 & 512) == 512) {
                    z19 = true;
                }
                this.A03 = r10.AR9(z18, i10, z19, r9.A03);
                this.A0A = r10.ARA(this.A0A, r9.A0A);
                this.A0C = (C11420gG) r10.ARD(this.A0C, r9.A0C);
                int i11 = this.A01;
                boolean z20 = false;
                if ((i11 & 2048) == 2048) {
                    z20 = true;
                }
                int i12 = this.A02;
                int i13 = r9.A01;
                boolean z21 = false;
                if ((i13 & 2048) == 2048) {
                    z21 = true;
                }
                this.A02 = r10.AR9(z20, i12, z21, r9.A02);
                boolean z22 = false;
                if ((i11 & 4096) == 4096) {
                    z22 = true;
                }
                int i14 = this.A00;
                boolean z23 = false;
                if ((i13 & 4096) == 4096) {
                    z23 = true;
                }
                this.A00 = r10.AR9(z22, i14, z23, r9.A00);
                boolean z24 = false;
                if ((i11 & 8192) == 8192) {
                    z24 = true;
                }
                int i15 = this.A05;
                boolean z25 = false;
                if ((i13 & 8192) == 8192) {
                    z25 = true;
                }
                this.A05 = r10.AR9(z24, i15, z25, r9.A05);
                this.A0B = (C77353g1) r10.ARD(this.A0B, r9.A0B);
                if (r10 == C04980Mp.A00) {
                    this.A01 |= r9.A01;
                }
                return this;
            case 2:
                C05010Mt r102 = (C05010Mt) obj;
                AnonymousClass1FL r92 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r102.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 8:
                                this.A01 |= 1;
                                this.A08 = r102.A06();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 24:
                                this.A01 |= 2;
                                this.A0G = r102.A0H();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                AbstractC11330g6 r125 = this.A09;
                                if (!((AbstractC05040Mx) r125).A00) {
                                    this.A09 = AnonymousClass078.A03(r125);
                                }
                                int A022 = r102.A02();
                                if (A022 != 0) {
                                    r05 = null;
                                } else {
                                    r05 = EnumC69983Jh.A01;
                                }
                                if (r05 == null) {
                                    super.A0D(4, A022);
                                    continue;
                                } else {
                                    C11320g5 r1 = (C11320g5) this.A09;
                                    r1.A03(r1.A00, A022);
                                }
                                i = 8192;
                                i2 = 128;
                            case 34:
                                AbstractC11330g6 r126 = this.A09;
                                if (!((AbstractC05040Mx) r126).A00) {
                                    this.A09 = AnonymousClass078.A03(r126);
                                }
                                int A042 = r102.A04(r102.A02());
                                while (r102.A00() > 0) {
                                    int A023 = r102.A02();
                                    if (A023 != 0) {
                                        r04 = null;
                                    } else {
                                        r04 = EnumC69983Jh.A01;
                                    }
                                    if (r04 == null) {
                                        super.A0D(4, A023);
                                    } else {
                                        C11320g5 r127 = (C11320g5) this.A09;
                                        r127.A03(r127.A00, A023);
                                    }
                                }
                                r102.A03 = A042;
                                r102.A0B();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 42:
                                if ((this.A01 & 4) == 4) {
                                    r124 = (AnonymousClass0g9) this.A0D.AQb();
                                } else {
                                    r124 = null;
                                }
                                C11350g8 r06 = (C11350g8) r102.A09(C11350g8.A0E.A0A(), r92);
                                this.A0D = r06;
                                if (r124 != null) {
                                    r124.A03(r06);
                                    this.A0D = (C11350g8) r124.A00();
                                }
                                this.A01 |= 4;
                                continue;
                                i = 8192;
                                i2 = 128;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                if ((this.A01 & 8) == 8) {
                                    r123 = (C77363g2) this.A0E.AQb();
                                } else {
                                    r123 = null;
                                }
                                C77393g5 r07 = (C77393g5) r102.A09(C77393g5.A04.A0A(), r92);
                                this.A0E = r07;
                                if (r123 != null) {
                                    r123.A03(r07);
                                    this.A0E = (C77393g5) r123.A00();
                                }
                                this.A01 |= 8;
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 58:
                                String A0A2 = r102.A0A();
                                this.A01 |= 16;
                                this.A0F = A0A2;
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 77:
                                this.A01 |= 32;
                                this.A07 = r102.A01();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 80:
                                this.A01 |= 64;
                                this.A0H = r102.A0H();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 96:
                                int A024 = r102.A02();
                                if (A024 == 0) {
                                    r03 = EnumC11400gE.CELLULAR_UNKNOWN;
                                } else if (A024 != 1) {
                                    switch (A024) {
                                        case 100:
                                            r03 = EnumC11400gE.CELLULAR_EDGE;
                                            break;
                                        case 101:
                                            r03 = EnumC11400gE.CELLULAR_IDEN;
                                            break;
                                        case 102:
                                            r03 = EnumC11400gE.CELLULAR_UMTS;
                                            break;
                                        case 103:
                                            r03 = EnumC11400gE.CELLULAR_EVDO;
                                            break;
                                        case 104:
                                            r03 = EnumC11400gE.CELLULAR_GPRS;
                                            break;
                                        case 105:
                                            r03 = EnumC11400gE.CELLULAR_HSDPA;
                                            break;
                                        case 106:
                                            r03 = EnumC11400gE.CELLULAR_HSUPA;
                                            break;
                                        case 107:
                                            r03 = EnumC11400gE.CELLULAR_HSPA;
                                            break;
                                        case AnonymousClass0PW.A03:
                                            r03 = EnumC11400gE.CELLULAR_CDMA;
                                            break;
                                        case 109:
                                            r03 = EnumC11400gE.CELLULAR_1XRTT;
                                            break;
                                        case 110:
                                            r03 = EnumC11400gE.CELLULAR_EHRPD;
                                            break;
                                        case 111:
                                            r03 = EnumC11400gE.CELLULAR_LTE;
                                            break;
                                        case 112:
                                            r03 = EnumC11400gE.CELLULAR_HSPAP;
                                            break;
                                        default:
                                            r03 = null;
                                            break;
                                    }
                                } else {
                                    r03 = EnumC11400gE.WIFI_UNKNOWN;
                                }
                                if (r03 == null) {
                                    super.A0D(12, A024);
                                    continue;
                                } else {
                                    this.A01 |= 256;
                                    this.A04 = A024;
                                }
                                i = 8192;
                                i2 = 128;
                            case 104:
                                int A025 = r102.A02();
                                if (A025 == 0) {
                                    r02 = EnumC69993Ji.PUSH;
                                } else if (A025 == 1) {
                                    r02 = EnumC69993Ji.USER_ACTIVATED;
                                } else if (A025 == 2) {
                                    r02 = EnumC69993Ji.SCHEDULED;
                                } else if (A025 == 3) {
                                    r02 = EnumC69993Ji.ERROR_RECONNECT;
                                } else if (A025 == 4) {
                                    r02 = EnumC69993Ji.NETWORK_SWITCH;
                                } else if (A025 != 5) {
                                    r02 = null;
                                } else {
                                    r02 = EnumC69993Ji.PING_RECONNECT;
                                }
                                if (r02 == null) {
                                    super.A0D(13, A025);
                                    continue;
                                } else {
                                    this.A01 |= 512;
                                    this.A03 = A025;
                                }
                                i = 8192;
                                i2 = 128;
                            case 112:
                                AbstractC11330g6 r128 = this.A0A;
                                if (!((AbstractC05040Mx) r128).A00) {
                                    r128 = AnonymousClass078.A03(r128);
                                    this.A0A = r128;
                                }
                                C11320g5 r129 = (C11320g5) r128;
                                r129.A03(r129.A00, r102.A02());
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 114:
                                int A043 = r102.A04(r102.A02());
                                AbstractC11330g6 r13 = this.A0A;
                                if (!((AbstractC05040Mx) r13).A00 && r102.A00() > 0) {
                                    this.A0A = AnonymousClass078.A03(r13);
                                }
                                while (r102.A00() > 0) {
                                    C11320g5 r1210 = (C11320g5) this.A0A;
                                    r1210.A03(r1210.A00, r102.A02());
                                }
                                r102.A03 = A043;
                                r102.A0B();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 122:
                                if ((this.A01 & 1024) == 1024) {
                                    r122 = (C11430gH) this.A0C.AQb();
                                } else {
                                    r122 = null;
                                }
                                C11420gG r08 = (C11420gG) r102.A09(C11420gG.A03.A0A(), r92);
                                this.A0C = r08;
                                if (r122 != null) {
                                    r122.A03(r08);
                                    this.A0C = (C11420gG) r122.A00();
                                }
                                this.A01 |= 1024;
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 128:
                                this.A01 |= 2048;
                                this.A02 = r102.A02();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 136:
                                this.A01 |= 4096;
                                this.A00 = r102.A02();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*{ENCODED_INT: 144}*/:
                                this.A01 |= i;
                                this.A05 = r102.A02();
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 154:
                                if ((this.A01 & 16384) == 16384) {
                                    r12 = (C77343g0) this.A0B.AQb();
                                } else {
                                    r12 = null;
                                }
                                C77353g1 r09 = (C77353g1) r102.A09(C77353g1.A09.A0A(), r92);
                                this.A0B = r09;
                                if (r12 != null) {
                                    r12.A03(r09);
                                    this.A0B = (C77353g1) r12.A00();
                                }
                                this.A01 |= 16384;
                                continue;
                                i = 8192;
                                i2 = 128;
                            case 240:
                                int A026 = r102.A02();
                                if (A026 == 0) {
                                    r0 = EnumC70003Jj.SHARE_EXTENSION;
                                } else if (A026 == 1) {
                                    r0 = EnumC70003Jj.SERVICE_EXTENSION;
                                } else if (A026 != 2) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC70003Jj.INTENTS_EXTENSION;
                                }
                                if (r0 == null) {
                                    super.A0D(30, A026);
                                    continue;
                                } else {
                                    this.A01 |= i2;
                                    this.A06 = A026;
                                }
                                i = 8192;
                                i2 = 128;
                            default:
                                if (!A0G(A032, r102)) {
                                    break;
                                } else {
                                    continue;
                                    i = 8192;
                                    i2 = 128;
                                }
                        }
                        z = true;
                        i = 8192;
                        i2 = 128;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r14 = new C04190Jk(e2.getMessage());
                        r14.unfinishedMessage = this;
                        throw new RuntimeException(r14);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A09).A00 = false;
                ((AbstractC05040Mx) this.A0A).A00 = false;
                return null;
            case 4:
                return new C11310g4();
            case 5:
                return new C11340g7();
            case 6:
                break;
            case 7:
                if (A0J == null) {
                    synchronized (C11310g4.class) {
                        if (A0J == null) {
                            A0J = new AnonymousClass275(A0I);
                        }
                    }
                }
                return A0J;
            default:
                throw new UnsupportedOperationException();
        }
        return A0I;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = ((AnonymousClass078) this).A00;
        if (i5 != -1) {
            return i5;
        }
        int i6 = this.A01;
        if ((i6 & 1) == 1) {
            i = AbstractC11750gu.A06(1, this.A08) + 0;
        } else {
            i = 0;
        }
        if ((i6 & 2) == 2) {
            i += AbstractC11750gu.A00(3);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.A09.size(); i8++) {
            C11320g5 r0 = (C11320g5) this.A09;
            r0.A02(i8);
            int i9 = r0.A01[i8];
            if (i9 >= 0) {
                i4 = AbstractC11750gu.A01(i9);
            } else {
                i4 = 10;
            }
            i7 += i4;
        }
        int size = this.A09.size() + i + i7;
        if ((this.A01 & 4) == 4) {
            C11350g8 r02 = this.A0D;
            if (r02 == null) {
                r02 = C11350g8.A0E;
            }
            size += AbstractC11750gu.A08(5, r02);
        }
        if ((this.A01 & 8) == 8) {
            C77393g5 r03 = this.A0E;
            if (r03 == null) {
                r03 = C77393g5.A04;
            }
            size += AbstractC11750gu.A08(6, r03);
        }
        if ((this.A01 & 16) == 16) {
            size += AbstractC11750gu.A09(7, this.A0F);
        }
        int i10 = this.A01;
        if ((i10 & 32) == 32) {
            if (!true || !true) {
                i3 = 1;
            } else if (!true || !true) {
                i3 = 2;
            } else if (!true || !true) {
                i3 = 3;
            } else {
                i3 = 5;
                if (!true || !true) {
                    i3 = 4;
                }
            }
            size += i3 + 4;
        }
        if ((i10 & 64) == 64) {
            size += AbstractC11750gu.A00(10);
        }
        if ((i10 & 256) == 256) {
            size += AbstractC11750gu.A02(12, this.A04);
        }
        if ((i10 & 512) == 512) {
            size += AbstractC11750gu.A02(13, this.A03);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.A0A.size(); i12++) {
            C11320g5 r04 = (C11320g5) this.A0A;
            r04.A02(i12);
            int i13 = r04.A01[i12];
            if (i13 >= 0) {
                i2 = AbstractC11750gu.A01(i13);
            } else {
                i2 = 10;
            }
            i11 += i2;
        }
        int size2 = this.A0A.size() + size + i11;
        if ((this.A01 & 1024) == 1024) {
            C11420gG r05 = this.A0C;
            if (r05 == null) {
                r05 = C11420gG.A03;
            }
            size2 += AbstractC11750gu.A08(15, r05);
        }
        int i14 = this.A01;
        if ((i14 & 2048) == 2048) {
            size2 += AbstractC11750gu.A04(16, this.A02);
        }
        if ((i14 & 4096) == 4096) {
            size2 += AbstractC11750gu.A04(17, this.A00);
        }
        if ((i14 & 8192) == 8192) {
            size2 += AbstractC11750gu.A04(18, this.A05);
        }
        if ((i14 & 16384) == 16384) {
            C77353g1 r06 = this.A0B;
            if (r06 == null) {
                r06 = C77353g1.A09;
            }
            size2 += AbstractC11750gu.A08(19, r06);
        }
        if ((this.A01 & 128) == 128) {
            size2 += AbstractC11750gu.A02(30, this.A06);
        }
        int A002 = this.unknownFields.A00() + size2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A01 & 1) == 1) {
            r5.A0H(1, this.A08);
        }
        if ((this.A01 & 2) == 2) {
            r5.A0M(3, this.A0G);
        }
        for (int i = 0; i < this.A09.size(); i++) {
            C11320g5 r0 = (C11320g5) this.A09;
            r0.A02(i);
            r5.A0E(4, r0.A01[i]);
        }
        if ((this.A01 & 4) == 4) {
            C11350g8 r02 = this.A0D;
            if (r02 == null) {
                r02 = C11350g8.A0E;
            }
            r5.A0K(5, r02);
        }
        if ((this.A01 & 8) == 8) {
            C77393g5 r03 = this.A0E;
            if (r03 == null) {
                r03 = C77393g5.A04;
            }
            r5.A0K(6, r03);
        }
        if ((this.A01 & 16) == 16) {
            r5.A0L(7, this.A0F);
        }
        if ((this.A01 & 32) == 32) {
            r5.A0D(9, this.A07);
        }
        if ((this.A01 & 64) == 64) {
            r5.A0M(10, this.A0H);
        }
        if ((this.A01 & 256) == 256) {
            r5.A0E(12, this.A04);
        }
        if ((this.A01 & 512) == 512) {
            r5.A0E(13, this.A03);
        }
        for (int i2 = 0; i2 < this.A0A.size(); i2++) {
            C11320g5 r04 = (C11320g5) this.A0A;
            r04.A02(i2);
            r5.A0E(14, r04.A01[i2]);
        }
        if ((this.A01 & 1024) == 1024) {
            C11420gG r05 = this.A0C;
            if (r05 == null) {
                r05 = C11420gG.A03;
            }
            r5.A0K(15, r05);
        }
        if ((this.A01 & 2048) == 2048) {
            r5.A0F(16, this.A02);
        }
        if ((this.A01 & 4096) == 4096) {
            r5.A0F(17, this.A00);
        }
        if ((this.A01 & 8192) == 8192) {
            r5.A0F(18, this.A05);
        }
        if ((this.A01 & 16384) == 16384) {
            C77353g1 r06 = this.A0B;
            if (r06 == null) {
                r06 = C77353g1.A09;
            }
            r5.A0K(19, r06);
        }
        if ((this.A01 & 128) == 128) {
            r5.A0E(30, this.A06);
        }
        this.unknownFields.A02(r5);
    }
}
