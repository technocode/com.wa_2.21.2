package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.3dk  reason: invalid class name and case insensitive filesystem */
public final class C75943dk extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75943dk A0D;
    public static volatile AbstractC37151nd A0E;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass071 A05 = AnonymousClass071.A01;
    public C75423cu A06;
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public boolean A0C;

    static {
        C75943dk r0 = new C75943dk();
        A0D = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r24, Object obj, Object obj2) {
        C75393cr r2;
        AnonymousClass3JN r0;
        int i = 2048;
        boolean z = true;
        switch (r24.ordinal()) {
            case 0:
                return A0D;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C75943dk r10 = (C75943dk) obj2;
                int i2 = this.A01;
                boolean z2 = false;
                if ((i2 & 1) == 1) {
                    z2 = true;
                }
                String str = this.A0A;
                int i3 = r10.A01;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A0A = r11.ARH(z2, str, z3, r10.A0A);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A09;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A09 = r11.ARH(z4, str2, z5, r10.A09);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A07;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A07 = r11.ARH(z6, str3, z7, r10.A07);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                String str4 = this.A08;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A08 = r11.ARH(z8, str4, z9, r10.A08);
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                String str5 = this.A0B;
                boolean z11 = false;
                if ((i3 & 16) == 16) {
                    z11 = true;
                }
                this.A0B = r11.ARH(z10, str5, z11, r10.A0B);
                boolean z12 = false;
                if ((i2 & 32) == 32) {
                    z12 = true;
                }
                int i4 = this.A04;
                boolean z13 = false;
                if ((i3 & 32) == 32) {
                    z13 = true;
                }
                this.A04 = r11.AR9(z12, i4, z13, r10.A04);
                boolean z14 = false;
                if ((i2 & 64) == 64) {
                    z14 = true;
                }
                int i5 = this.A00;
                boolean z15 = false;
                if ((i3 & 64) == 64) {
                    z15 = true;
                }
                this.A00 = r11.AR9(z14, i5, z15, r10.A00);
                boolean z16 = false;
                if ((i2 & 128) == 128) {
                    z16 = true;
                }
                int i6 = this.A02;
                boolean z17 = false;
                if ((i3 & 128) == 128) {
                    z17 = true;
                }
                this.A02 = r11.AR9(z16, i6, z17, r10.A02);
                boolean z18 = false;
                if ((i2 & 256) == 256) {
                    z18 = true;
                }
                int i7 = this.A03;
                boolean z19 = false;
                if ((i3 & 256) == 256) {
                    z19 = true;
                }
                this.A03 = r11.AR9(z18, i7, z19, r10.A03);
                boolean z20 = false;
                if ((i2 & 512) == 512) {
                    z20 = true;
                }
                AnonymousClass071 r3 = this.A05;
                boolean z21 = false;
                if ((i3 & 512) == 512) {
                    z21 = true;
                }
                this.A05 = r11.AR6(z20, r3, z21, r10.A05);
                this.A06 = (C75423cu) r11.ARD(this.A06, r10.A06);
                int i8 = this.A01;
                boolean z22 = false;
                if ((i8 & 2048) == 2048) {
                    z22 = true;
                }
                boolean z23 = this.A0C;
                int i9 = r10.A01;
                if ((i9 & 2048) != 2048) {
                    z = false;
                }
                this.A0C = r11.AR5(z22, z23, z, r10.A0C);
                if (r11 == C04980Mp.A00) {
                    this.A01 = i8 | i9;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                AnonymousClass1FL r102 = (AnonymousClass1FL) obj2;
                boolean z24 = false;
                while (!z24) {
                    try {
                        int A032 = r112.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r112.A0A();
                                this.A01 |= 1;
                                this.A0A = A0A2;
                                continue;
                                i = 2048;
                            case 18:
                                String A0A3 = r112.A0A();
                                this.A01 |= 2;
                                this.A09 = A0A3;
                                continue;
                                i = 2048;
                            case 34:
                                String A0A4 = r112.A0A();
                                this.A01 |= 4;
                                this.A07 = A0A4;
                                continue;
                                i = 2048;
                            case 42:
                                String A0A5 = r112.A0A();
                                this.A01 |= 8;
                                this.A08 = A0A5;
                                continue;
                                i = 2048;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                String A0A6 = r112.A0A();
                                this.A01 |= 16;
                                this.A0B = A0A6;
                                continue;
                                i = 2048;
                            case 61:
                                this.A01 |= 32;
                                this.A04 = r112.A01();
                                continue;
                                i = 2048;
                            case 69:
                                this.A01 |= 64;
                                this.A00 = r112.A01();
                                continue;
                                i = 2048;
                            case AnonymousClass0PW.A02:
                                int A022 = r112.A02();
                                if (AnonymousClass3JM.A00(A022) == null) {
                                    super.A0D(9, A022);
                                    continue;
                                } else {
                                    this.A01 |= 128;
                                    this.A02 = A022;
                                }
                                i = 2048;
                            case 80:
                                int A023 = r112.A02();
                                if (A023 == 0) {
                                    r0 = AnonymousClass3JN.NONE;
                                } else if (A023 != 1) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JN.VIDEO;
                                }
                                if (r0 == null) {
                                    super.A0D(10, A023);
                                    continue;
                                } else {
                                    this.A01 |= 256;
                                    this.A03 = A023;
                                }
                                i = 2048;
                            case 130:
                                this.A01 |= 512;
                                this.A05 = r112.A08();
                                continue;
                                i = 2048;
                            case 138:
                                if ((this.A01 & 1024) == 1024) {
                                    r2 = (C75393cr) this.A06.AQb();
                                } else {
                                    r2 = null;
                                }
                                C75423cu r02 = (C75423cu) r112.A09(C75423cu.A0H.A0A(), r102);
                                this.A06 = r02;
                                if (r2 != null) {
                                    r2.A03(r02);
                                    this.A06 = (C75423cu) r2.A00();
                                }
                                this.A01 |= 1024;
                                continue;
                                i = 2048;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*{ENCODED_INT: 144}*/:
                                this.A01 |= i;
                                this.A0C = r112.A0H();
                                continue;
                                i = 2048;
                            default:
                                if (!A0G(A032, r112)) {
                                    break;
                                } else {
                                    continue;
                                    i = 2048;
                                }
                        }
                        z24 = true;
                        i = 2048;
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
                return new C75943dk();
            case 5:
                return new C75933dj();
            case 6:
                break;
            case 7:
                if (A0E == null) {
                    synchronized (C75943dk.class) {
                        if (A0E == null) {
                            A0E = new AnonymousClass275(A0D);
                        }
                    }
                }
                return A0E;
            default:
                throw new UnsupportedOperationException();
        }
        return A0D;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2;
        int i3 = ((AnonymousClass078) this).A00;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        if ((this.A01 & 1) == 1) {
            i4 = 0 + AbstractC11750gu.A09(1, this.A0A);
        }
        if ((this.A01 & 2) == 2) {
            i4 += AbstractC11750gu.A09(2, this.A09);
        }
        if ((this.A01 & 4) == 4) {
            i4 += AbstractC11750gu.A09(4, this.A07);
        }
        if ((this.A01 & 8) == 8) {
            i4 += AbstractC11750gu.A09(5, this.A08);
        }
        if ((this.A01 & 16) == 16) {
            i4 += AbstractC11750gu.A09(6, this.A0B);
        }
        int i5 = this.A01;
        if ((i5 & 32) == 32) {
            if (!true || !true) {
                i2 = 1;
            } else if (!true || !true) {
                i2 = 2;
            } else if (!true || !true) {
                i2 = 3;
            } else {
                i2 = 5;
                if (!true || !true) {
                    i2 = 4;
                }
            }
            i4 += i2 + 4;
        }
        if ((i5 & 64) == 64) {
            if (!true || !true) {
                i = 1;
            } else if (!true || !true) {
                i = 2;
            } else if (!true || !true) {
                i = 3;
            } else {
                i = 5;
                if (!true || !true) {
                    i = 4;
                }
            }
            i4 += i + 4;
        }
        if ((i5 & 128) == 128) {
            i4 += AbstractC11750gu.A02(9, this.A02);
        }
        if ((i5 & 256) == 256) {
            i4 += AbstractC11750gu.A02(10, this.A03);
        }
        if ((i5 & 512) == 512) {
            i4 += AbstractC11750gu.A07(16, this.A05);
        }
        if ((i5 & 1024) == 1024) {
            C75423cu r0 = this.A06;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i4 += AbstractC11750gu.A08(17, r0);
        }
        if ((this.A01 & 2048) == 2048) {
            i4 += AbstractC11750gu.A00(18);
        }
        int A002 = this.unknownFields.A00() + i4;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A01 & 1) == 1) {
            r5.A0L(1, this.A0A);
        }
        if ((this.A01 & 2) == 2) {
            r5.A0L(2, this.A09);
        }
        if ((this.A01 & 4) == 4) {
            r5.A0L(4, this.A07);
        }
        if ((this.A01 & 8) == 8) {
            r5.A0L(5, this.A08);
        }
        if ((this.A01 & 16) == 16) {
            r5.A0L(6, this.A0B);
        }
        if ((this.A01 & 32) == 32) {
            r5.A0D(7, this.A04);
        }
        if ((this.A01 & 64) == 64) {
            r5.A0D(8, this.A00);
        }
        if ((this.A01 & 128) == 128) {
            r5.A0E(9, this.A02);
        }
        if ((this.A01 & 256) == 256) {
            r5.A0E(10, this.A03);
        }
        if ((this.A01 & 512) == 512) {
            r5.A0J(16, this.A05);
        }
        if ((this.A01 & 1024) == 1024) {
            C75423cu r0 = this.A06;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r5.A0K(17, r0);
        }
        if ((this.A01 & 2048) == 2048) {
            r5.A0M(18, this.A0C);
        }
        this.unknownFields.A02(r5);
    }
}
