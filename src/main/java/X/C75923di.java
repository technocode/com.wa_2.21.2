package X;

import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.3di  reason: invalid class name and case insensitive filesystem */
public final class C75923di extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75923di A0K;
    public static volatile AbstractC37151nd A0L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public AnonymousClass071 A06;
    public AnonymousClass071 A07;
    public AnonymousClass071 A08;
    public AnonymousClass071 A09;
    public AnonymousClass071 A0A;
    public AnonymousClass071 A0B;
    public C75423cu A0C;
    public String A0D;
    public String A0E;
    public String A0F = "";
    public String A0G;
    public String A0H = "";
    public String A0I = "";
    public boolean A0J;

    static {
        C75923di r0 = new C75923di();
        A0K = r0;
        r0.A0C();
    }

    public C75923di() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A07 = r0;
        this.A09 = r0;
        this.A0E = "";
        this.A06 = r0;
        this.A0D = "";
        this.A0G = "";
        this.A0B = r0;
        this.A0A = r0;
        this.A08 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r23, Object obj, Object obj2) {
        C75393cr r12;
        int i = 262144;
        int i2 = 131072;
        boolean z = false;
        switch (r23.ordinal()) {
            case 0:
                return A0K;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                C75923di r7 = (C75923di) obj2;
                int i3 = this.A00;
                boolean z2 = false;
                if ((i3 & 1) == 1) {
                    z2 = true;
                }
                String str = this.A0I;
                int i4 = r7.A00;
                boolean z3 = false;
                if ((i4 & 1) == 1) {
                    z3 = true;
                }
                this.A0I = r8.ARH(z2, str, z3, r7.A0I);
                boolean z4 = false;
                if ((i3 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0F;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A0F = r8.ARH(z4, str2, z5, r7.A0F);
                boolean z6 = false;
                if ((i3 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A0H;
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                this.A0H = r8.ARH(z6, str3, z7, r7.A0H);
                boolean z8 = false;
                if ((i3 & 8) == 8) {
                    z8 = true;
                }
                AnonymousClass071 r13 = this.A07;
                boolean z9 = false;
                if ((i4 & 8) == 8) {
                    z9 = true;
                }
                this.A07 = r8.AR6(z8, r13, z9, r7.A07);
                int i5 = this.A00;
                boolean z10 = false;
                if ((i5 & 16) == 16) {
                    z10 = true;
                }
                long j = this.A04;
                int i6 = r7.A00;
                boolean z11 = false;
                if ((i6 & 16) == 16) {
                    z11 = true;
                }
                this.A04 = r8.ARC(z10, j, z11, r7.A04);
                boolean z12 = false;
                if ((i5 & 32) == 32) {
                    z12 = true;
                }
                int i7 = this.A01;
                boolean z13 = false;
                if ((i6 & 32) == 32) {
                    z13 = true;
                }
                this.A01 = r8.AR9(z12, i7, z13, r7.A01);
                boolean z14 = false;
                if ((i5 & 64) == 64) {
                    z14 = true;
                }
                AnonymousClass071 r132 = this.A09;
                boolean z15 = false;
                if ((i6 & 64) == 64) {
                    z15 = true;
                }
                this.A09 = r8.AR6(z14, r132, z15, r7.A09);
                int i8 = this.A00;
                boolean z16 = false;
                if ((i8 & 128) == 128) {
                    z16 = true;
                }
                String str4 = this.A0E;
                int i9 = r7.A00;
                boolean z17 = false;
                if ((i9 & 128) == 128) {
                    z17 = true;
                }
                this.A0E = r8.ARH(z16, str4, z17, r7.A0E);
                boolean z18 = false;
                if ((i8 & 256) == 256) {
                    z18 = true;
                }
                AnonymousClass071 r2 = this.A06;
                boolean z19 = false;
                if ((i9 & 256) == 256) {
                    z19 = true;
                }
                this.A06 = r8.AR6(z18, r2, z19, r7.A06);
                int i10 = this.A00;
                boolean z20 = false;
                if ((i10 & 512) == 512) {
                    z20 = true;
                }
                String str5 = this.A0D;
                int i11 = r7.A00;
                boolean z21 = false;
                if ((i11 & 512) == 512) {
                    z21 = true;
                }
                this.A0D = r8.ARH(z20, str5, z21, r7.A0D);
                boolean z22 = false;
                if ((i10 & 1024) == 1024) {
                    z22 = true;
                }
                long j2 = this.A05;
                boolean z23 = false;
                if ((i11 & 1024) == 1024) {
                    z23 = true;
                }
                this.A05 = r8.ARC(z22, j2, z23, r7.A05);
                boolean z24 = false;
                if ((i10 & 2048) == 2048) {
                    z24 = true;
                }
                boolean z25 = this.A0J;
                boolean z26 = false;
                if ((i11 & 2048) == 2048) {
                    z26 = true;
                }
                this.A0J = r8.AR5(z24, z25, z26, r7.A0J);
                boolean z27 = false;
                if ((i10 & 4096) == 4096) {
                    z27 = true;
                }
                String str6 = this.A0G;
                boolean z28 = false;
                if ((i11 & 4096) == 4096) {
                    z28 = true;
                }
                this.A0G = r8.ARH(z27, str6, z28, r7.A0G);
                boolean z29 = false;
                if ((i10 & 8192) == 8192) {
                    z29 = true;
                }
                AnonymousClass071 r3 = this.A0B;
                boolean z30 = false;
                if ((i11 & 8192) == 8192) {
                    z30 = true;
                }
                this.A0B = r8.AR6(z29, r3, z30, r7.A0B);
                boolean z31 = false;
                if ((this.A00 & 16384) == 16384) {
                    z31 = true;
                }
                AnonymousClass071 r22 = this.A0A;
                boolean z32 = false;
                if ((r7.A00 & 16384) == 16384) {
                    z32 = true;
                }
                this.A0A = r8.AR6(z31, r22, z32, r7.A0A);
                boolean z33 = false;
                if ((this.A00 & 32768) == 32768) {
                    z33 = true;
                }
                AnonymousClass071 r24 = this.A08;
                boolean z34 = false;
                if ((r7.A00 & 32768) == 32768) {
                    z34 = true;
                }
                this.A08 = r8.AR6(z33, r24, z34, r7.A08);
                this.A0C = (C75423cu) r8.ARD(this.A0C, r7.A0C);
                int i12 = this.A00;
                boolean z35 = false;
                if ((i12 & 131072) == 131072) {
                    z35 = true;
                }
                int i13 = this.A02;
                int i14 = r7.A00;
                boolean z36 = false;
                if ((i14 & 131072) == 131072) {
                    z36 = true;
                }
                this.A02 = r8.AR9(z35, i13, z36, r7.A02);
                boolean z37 = false;
                if ((i12 & 262144) == 262144) {
                    z37 = true;
                }
                int i15 = this.A03;
                boolean z38 = false;
                if ((i14 & 262144) == 262144) {
                    z38 = true;
                }
                this.A03 = r8.AR9(z37, i15, z38, r7.A03);
                if (r8 == C04980Mp.A00) {
                    this.A00 = i12 | i14;
                }
                return this;
            case 2:
                C05010Mt r82 = (C05010Mt) obj;
                AnonymousClass1FL r72 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r82.A0A();
                                this.A00 |= 1;
                                this.A0I = A0A2;
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 18:
                                String A0A3 = r82.A0A();
                                this.A00 |= 2;
                                this.A0F = A0A3;
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 26:
                                String A0A4 = r82.A0A();
                                this.A00 |= 4;
                                this.A0H = A0A4;
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 34:
                                this.A00 |= 8;
                                this.A07 = r82.A08();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 40:
                                this.A00 |= 16;
                                this.A04 = r82.A06();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 48:
                                this.A00 |= 32;
                                this.A01 = r82.A02();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 58:
                                this.A00 |= 64;
                                this.A09 = r82.A08();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 66:
                                String A0A5 = r82.A0A();
                                this.A00 |= 128;
                                this.A0E = A0A5;
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 74:
                                this.A00 |= 256;
                                this.A06 = r82.A08();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 82:
                                String A0A6 = r82.A0A();
                                this.A00 |= 512;
                                this.A0D = A0A6;
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 88:
                                this.A00 |= 1024;
                                this.A05 = r82.A06();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 96:
                                this.A00 |= 2048;
                                this.A0J = r82.A0H();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 106:
                                String A0A7 = r82.A0A();
                                this.A00 |= 4096;
                                this.A0G = A0A7;
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 114:
                                this.A00 |= 8192;
                                this.A0B = r82.A08();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 122:
                                this.A00 |= 16384;
                                this.A0A = r82.A08();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 130:
                                this.A00 |= 32768;
                                this.A08 = r82.A08();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 138:
                                if ((this.A00 & 65536) == 65536) {
                                    r12 = (C75393cr) this.A0C.AQb();
                                } else {
                                    r12 = null;
                                }
                                C75423cu r0 = (C75423cu) r82.A09(C75423cu.A0H.A0A(), r72);
                                this.A0C = r0;
                                if (r12 != null) {
                                    r12.A03(r0);
                                    this.A0C = (C75423cu) r12.A00();
                                }
                                this.A00 = 65536 | this.A00;
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*{ENCODED_INT: 144}*/:
                                this.A00 |= i2;
                                this.A02 = r82.A02();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            case 152:
                                this.A00 |= i;
                                this.A03 = r82.A02();
                                continue;
                                i = 262144;
                                i2 = 131072;
                            default:
                                if (!A0G(A032, r82)) {
                                    break;
                                } else {
                                    continue;
                                    i = 262144;
                                    i2 = 131072;
                                }
                        }
                        z = true;
                        i = 262144;
                        i2 = 131072;
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
                return new C75923di();
            case 5:
                return new C75913dh();
            case 6:
                break;
            case 7:
                if (A0L == null) {
                    synchronized (C75923di.class) {
                        if (A0L == null) {
                            A0L = new AnonymousClass275(A0K);
                        }
                    }
                }
                return A0L;
            default:
                throw new UnsupportedOperationException();
        }
        return A0K;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A0I);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A0F);
        }
        if ((this.A00 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A0H);
        }
        int i3 = this.A00;
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A07(4, this.A07);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A06(5, this.A04);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A04(6, this.A01);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A07(7, this.A09);
        }
        if ((i3 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A0E);
        }
        int i4 = this.A00;
        if ((i4 & 256) == 256) {
            i2 += AbstractC11750gu.A07(9, this.A06);
        }
        if ((i4 & 512) == 512) {
            i2 += AbstractC11750gu.A09(10, this.A0D);
        }
        int i5 = this.A00;
        if ((i5 & 1024) == 1024) {
            i2 += AbstractC11750gu.A05(11, this.A05);
        }
        if ((i5 & 2048) == 2048) {
            i2 += AbstractC11750gu.A00(12);
        }
        if ((i5 & 4096) == 4096) {
            i2 += AbstractC11750gu.A09(13, this.A0G);
        }
        int i6 = this.A00;
        if ((i6 & 8192) == 8192) {
            i2 += AbstractC11750gu.A07(14, this.A0B);
        }
        if ((i6 & 16384) == 16384) {
            i2 += AbstractC11750gu.A07(15, this.A0A);
        }
        if ((i6 & 32768) == 32768) {
            i2 += AbstractC11750gu.A07(16, this.A08);
        }
        if ((i6 & 65536) == 65536) {
            C75423cu r0 = this.A0C;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(17, r0);
        }
        int i7 = this.A00;
        if ((i7 & 131072) == 131072) {
            i2 += AbstractC11750gu.A04(18, this.A02);
        }
        if ((i7 & 262144) == 262144) {
            i2 += AbstractC11750gu.A04(19, this.A03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r6) {
        if ((this.A00 & 1) == 1) {
            r6.A0L(1, this.A0I);
        }
        if ((this.A00 & 2) == 2) {
            r6.A0L(2, this.A0F);
        }
        if ((this.A00 & 4) == 4) {
            r6.A0L(3, this.A0H);
        }
        if ((this.A00 & 8) == 8) {
            r6.A0J(4, this.A07);
        }
        if ((this.A00 & 16) == 16) {
            r6.A0H(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            r6.A0F(6, this.A01);
        }
        if ((this.A00 & 64) == 64) {
            r6.A0J(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            r6.A0L(8, this.A0E);
        }
        if ((this.A00 & 256) == 256) {
            r6.A0J(9, this.A06);
        }
        if ((this.A00 & 512) == 512) {
            r6.A0L(10, this.A0D);
        }
        if ((this.A00 & 1024) == 1024) {
            r6.A0I(11, this.A05);
        }
        if ((this.A00 & 2048) == 2048) {
            r6.A0M(12, this.A0J);
        }
        if ((this.A00 & 4096) == 4096) {
            r6.A0L(13, this.A0G);
        }
        if ((this.A00 & 8192) == 8192) {
            r6.A0J(14, this.A0B);
        }
        if ((this.A00 & 16384) == 16384) {
            r6.A0J(15, this.A0A);
        }
        if ((this.A00 & 32768) == 32768) {
            r6.A0J(16, this.A08);
        }
        if ((this.A00 & 65536) == 65536) {
            C75423cu r0 = this.A0C;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r6.A0K(17, r0);
        }
        if ((this.A00 & 131072) == 131072) {
            r6.A0F(18, this.A02);
        }
        if ((this.A00 & 262144) == 262144) {
            r6.A0F(19, this.A03);
        }
        this.unknownFields.A02(r6);
    }
}
