package X;

import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.3e4  reason: invalid class name and case insensitive filesystem */
public final class C76143e4 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76143e4 A0N;
    public static volatile AbstractC37151nd A0O;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public AnonymousClass071 A07;
    public AnonymousClass071 A08;
    public AnonymousClass071 A09;
    public AnonymousClass071 A0A;
    public AnonymousClass071 A0B;
    public AnonymousClass071 A0C;
    public AnonymousClass071 A0D;
    public AnonymousClass071 A0E;
    public AbstractC11330g6 A0F;
    public AbstractC04120Jd A0G;
    public C75423cu A0H;
    public String A0I = "";
    public String A0J;
    public String A0K = "";
    public String A0L = "";
    public boolean A0M;

    static {
        C76143e4 r0 = new C76143e4();
        A0N = r0;
        r0.A0C();
    }

    public C76143e4() {
        AnonymousClass071 r1 = AnonymousClass071.A01;
        this.A08 = r1;
        this.A0B = r1;
        this.A07 = r1;
        this.A0G = C05030Mw.A01;
        this.A0J = "";
        this.A0A = r1;
        this.A09 = r1;
        this.A0E = r1;
        this.A0F = C11320g5.A02;
        this.A0D = r1;
        this.A0C = r1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r26, Object obj, Object obj2) {
        C75393cr r1;
        int i = 524288;
        int i2 = 131072;
        boolean z = false;
        switch (r26.ordinal()) {
            case 0:
                return A0N;
            case 1:
                AbstractC05000Mr r6 = (AbstractC05000Mr) obj;
                C76143e4 r5 = (C76143e4) obj2;
                int i3 = this.A00;
                boolean z2 = false;
                if ((i3 & 1) == 1) {
                    z2 = true;
                }
                String str = this.A0L;
                int i4 = r5.A00;
                boolean z3 = false;
                if ((i4 & 1) == 1) {
                    z3 = true;
                }
                this.A0L = r6.ARH(z2, str, z3, r5.A0L);
                boolean z4 = false;
                if ((i3 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0K;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A0K = r6.ARH(z4, str2, z5, r5.A0K);
                boolean z6 = false;
                if ((i3 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A0I;
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                this.A0I = r6.ARH(z6, str3, z7, r5.A0I);
                boolean z8 = false;
                if ((i3 & 8) == 8) {
                    z8 = true;
                }
                AnonymousClass071 r11 = this.A08;
                boolean z9 = false;
                if ((i4 & 8) == 8) {
                    z9 = true;
                }
                this.A08 = r6.AR6(z8, r11, z9, r5.A08);
                int i5 = this.A00;
                boolean z10 = false;
                if ((i5 & 16) == 16) {
                    z10 = true;
                }
                long j = this.A05;
                int i6 = r5.A00;
                boolean z11 = false;
                if ((i6 & 16) == 16) {
                    z11 = true;
                }
                this.A05 = r6.ARC(z10, j, z11, r5.A05);
                boolean z12 = false;
                if ((i5 & 32) == 32) {
                    z12 = true;
                }
                int i7 = this.A03;
                boolean z13 = false;
                if ((i6 & 32) == 32) {
                    z13 = true;
                }
                this.A03 = r6.AR9(z12, i7, z13, r5.A03);
                boolean z14 = false;
                if ((i5 & 64) == 64) {
                    z14 = true;
                }
                int i8 = this.A04;
                boolean z15 = false;
                if ((i6 & 64) == 64) {
                    z15 = true;
                }
                this.A04 = r6.AR9(z14, i8, z15, r5.A04);
                boolean z16 = false;
                if ((i5 & 128) == 128) {
                    z16 = true;
                }
                AnonymousClass071 r12 = this.A0B;
                boolean z17 = false;
                if ((i6 & 128) == 128) {
                    z17 = true;
                }
                this.A0B = r6.AR6(z16, r12, z17, r5.A0B);
                boolean z18 = false;
                if ((this.A00 & 256) == 256) {
                    z18 = true;
                }
                AnonymousClass071 r112 = this.A07;
                boolean z19 = false;
                if ((r5.A00 & 256) == 256) {
                    z19 = true;
                }
                this.A07 = r6.AR6(z18, r112, z19, r5.A07);
                this.A0G = r6.ARB(this.A0G, r5.A0G);
                int i9 = this.A00;
                boolean z20 = false;
                if ((i9 & 512) == 512) {
                    z20 = true;
                }
                String str4 = this.A0J;
                int i10 = r5.A00;
                boolean z21 = false;
                if ((i10 & 512) == 512) {
                    z21 = true;
                }
                this.A0J = r6.ARH(z20, str4, z21, r5.A0J);
                boolean z22 = false;
                if ((i9 & 1024) == 1024) {
                    z22 = true;
                }
                long j2 = this.A06;
                boolean z23 = false;
                if ((i10 & 1024) == 1024) {
                    z23 = true;
                }
                this.A06 = r6.ARC(z22, j2, z23, r5.A06);
                boolean z24 = false;
                if ((i9 & 2048) == 2048) {
                    z24 = true;
                }
                AnonymousClass071 r9 = this.A0A;
                boolean z25 = false;
                if ((i10 & 2048) == 2048) {
                    z25 = true;
                }
                this.A0A = r6.AR6(z24, r9, z25, r5.A0A);
                this.A0H = (C75423cu) r6.ARD(this.A0H, r5.A0H);
                boolean z26 = false;
                if ((this.A00 & 8192) == 8192) {
                    z26 = true;
                }
                AnonymousClass071 r2 = this.A09;
                boolean z27 = false;
                if ((r5.A00 & 8192) == 8192) {
                    z27 = true;
                }
                this.A09 = r6.AR6(z26, r2, z27, r5.A09);
                int i11 = this.A00;
                boolean z28 = false;
                if ((i11 & 16384) == 16384) {
                    z28 = true;
                }
                int i12 = this.A02;
                int i13 = r5.A00;
                boolean z29 = false;
                if ((i13 & 16384) == 16384) {
                    z29 = true;
                }
                this.A02 = r6.AR9(z28, i12, z29, r5.A02);
                boolean z30 = false;
                if ((i11 & 32768) == 32768) {
                    z30 = true;
                }
                int i14 = this.A01;
                boolean z31 = false;
                if ((i13 & 32768) == 32768) {
                    z31 = true;
                }
                this.A01 = r6.AR9(z30, i14, z31, r5.A01);
                boolean z32 = false;
                if ((i11 & 65536) == 65536) {
                    z32 = true;
                }
                AnonymousClass071 r22 = this.A0E;
                boolean z33 = false;
                if ((i13 & 65536) == 65536) {
                    z33 = true;
                }
                this.A0E = r6.AR6(z32, r22, z33, r5.A0E);
                this.A0F = r6.ARA(this.A0F, r5.A0F);
                boolean z34 = false;
                if ((this.A00 & 131072) == 131072) {
                    z34 = true;
                }
                AnonymousClass071 r23 = this.A0D;
                boolean z35 = false;
                if ((r5.A00 & 131072) == 131072) {
                    z35 = true;
                }
                this.A0D = r6.AR6(z34, r23, z35, r5.A0D);
                boolean z36 = false;
                if ((this.A00 & 262144) == 262144) {
                    z36 = true;
                }
                AnonymousClass071 r24 = this.A0C;
                boolean z37 = false;
                if ((r5.A00 & 262144) == 262144) {
                    z37 = true;
                }
                this.A0C = r6.AR6(z36, r24, z37, r5.A0C);
                int i15 = this.A00;
                boolean z38 = false;
                if ((i15 & 524288) == 524288) {
                    z38 = true;
                }
                boolean z39 = this.A0M;
                int i16 = r5.A00;
                if ((i16 & 524288) == 524288) {
                    z = true;
                }
                this.A0M = r6.AR5(z38, z39, z, r5.A0M);
                if (r6 == C04980Mp.A00) {
                    this.A00 = i15 | i16;
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
                            case 10:
                                String A0A2 = r62.A0A();
                                this.A00 |= 1;
                                this.A0L = A0A2;
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 18:
                                String A0A3 = r62.A0A();
                                this.A00 |= 2;
                                this.A0K = A0A3;
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 26:
                                String A0A4 = r62.A0A();
                                this.A00 |= 4;
                                this.A0I = A0A4;
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 34:
                                this.A00 |= 8;
                                this.A08 = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 40:
                                this.A00 |= 16;
                                this.A05 = r62.A06();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 48:
                                this.A00 |= 32;
                                this.A03 = r62.A02();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 56:
                                this.A00 |= 64;
                                this.A04 = r62.A02();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 66:
                                this.A00 |= 128;
                                this.A0B = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 74:
                                this.A00 |= 256;
                                this.A07 = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 82:
                                AbstractC04120Jd r13 = this.A0G;
                                if (!((AbstractC05040Mx) r13).A00) {
                                    r13 = AnonymousClass078.A04(r13);
                                    this.A0G = r13;
                                }
                                r13.add(r62.A09(C75503d2.A04.A0A(), r52));
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 90:
                                String A0A5 = r62.A0A();
                                this.A00 |= 512;
                                this.A0J = A0A5;
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 96:
                                this.A00 |= 1024;
                                this.A06 = r62.A06();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 130:
                                this.A00 |= 2048;
                                this.A0A = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 138:
                                if ((this.A00 & 4096) == 4096) {
                                    r1 = (C75393cr) this.A0H.AQb();
                                } else {
                                    r1 = null;
                                }
                                C75423cu r0 = (C75423cu) r62.A09(C75423cu.A0H.A0A(), r52);
                                this.A0H = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A0H = (C75423cu) r1.A00();
                                }
                                this.A00 |= 4096;
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 146:
                                this.A00 |= 8192;
                                this.A09 = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 152:
                                this.A00 |= 16384;
                                this.A02 = r62.A02();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 160:
                                this.A00 |= 32768;
                                this.A01 = r62.A02();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 170:
                                this.A00 |= 65536;
                                this.A0E = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*{ENCODED_INT: 176}*/:
                                AbstractC11330g6 r113 = this.A0F;
                                if (!((AbstractC05040Mx) r113).A00) {
                                    r113 = AnonymousClass078.A03(r113);
                                    this.A0F = r113;
                                }
                                C11320g5 r114 = (C11320g5) r113;
                                r114.A03(r114.A00, r62.A02());
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 178:
                                int A042 = r62.A04(r62.A02());
                                AbstractC11330g6 r14 = this.A0F;
                                if (!((AbstractC05040Mx) r14).A00 && r62.A00() > 0) {
                                    this.A0F = AnonymousClass078.A03(r14);
                                }
                                while (r62.A00() > 0) {
                                    C11320g5 r115 = (C11320g5) this.A0F;
                                    r115.A03(r115.A00, r62.A02());
                                }
                                r62.A03 = A042;
                                r62.A0B();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 186:
                                this.A00 |= i2;
                                this.A0D = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 194:
                                this.A00 |= 262144;
                                this.A0C = r62.A08();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            case 200:
                                this.A00 |= i;
                                this.A0M = r62.A0H();
                                continue;
                                i = 524288;
                                i2 = 131072;
                            default:
                                if (!A0G(A032, r62)) {
                                    break;
                                } else {
                                    continue;
                                    i = 524288;
                                    i2 = 131072;
                                }
                        }
                        z = true;
                        i = 524288;
                        i2 = 131072;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r15 = new C04190Jk(e2.getMessage());
                        r15.unfinishedMessage = this;
                        throw new RuntimeException(r15);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A0G).A00 = false;
                ((AbstractC05040Mx) this.A0F).A00 = false;
                return null;
            case 4:
                return new C76143e4();
            case 5:
                return new C76133e3();
            case 6:
                break;
            case 7:
                if (A0O == null) {
                    synchronized (C76143e4.class) {
                        if (A0O == null) {
                            A0O = new AnonymousClass275(A0N);
                        }
                    }
                }
                return A0O;
            default:
                throw new UnsupportedOperationException();
        }
        return A0N;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A0L) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A0K);
        }
        if ((this.A00 & 4) == 4) {
            i += AbstractC11750gu.A09(3, this.A0I);
        }
        int i3 = this.A00;
        if ((i3 & 8) == 8) {
            i += AbstractC11750gu.A07(4, this.A08);
        }
        if ((i3 & 16) == 16) {
            i += AbstractC11750gu.A06(5, this.A05);
        }
        if ((i3 & 32) == 32) {
            i += AbstractC11750gu.A04(6, this.A03);
        }
        if ((i3 & 64) == 64) {
            i += AbstractC11750gu.A04(7, this.A04);
        }
        if ((i3 & 128) == 128) {
            i += AbstractC11750gu.A07(8, this.A0B);
        }
        if ((i3 & 256) == 256) {
            i += AbstractC11750gu.A07(9, this.A07);
        }
        for (int i4 = 0; i4 < this.A0G.size(); i4++) {
            i += AbstractC11750gu.A08(10, (AnonymousClass076) this.A0G.get(i4));
        }
        if ((this.A00 & 512) == 512) {
            i += AbstractC11750gu.A09(11, this.A0J);
        }
        int i5 = this.A00;
        if ((i5 & 1024) == 1024) {
            i += AbstractC11750gu.A05(12, this.A06);
        }
        if ((i5 & 2048) == 2048) {
            i += AbstractC11750gu.A07(16, this.A0A);
        }
        if ((i5 & 4096) == 4096) {
            C75423cu r0 = this.A0H;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i += AbstractC11750gu.A08(17, r0);
        }
        int i6 = this.A00;
        if ((i6 & 8192) == 8192) {
            i += AbstractC11750gu.A07(18, this.A09);
        }
        if ((i6 & 16384) == 16384) {
            i += AbstractC11750gu.A04(19, this.A02);
        }
        if ((i6 & 32768) == 32768) {
            i += AbstractC11750gu.A04(20, this.A01);
        }
        if ((i6 & 65536) == 65536) {
            i += AbstractC11750gu.A07(21, this.A0E);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.A0F.size(); i8++) {
            C11320g5 r02 = (C11320g5) this.A0F;
            r02.A02(i8);
            i7 += AbstractC11750gu.A01(r02.A01[i8]);
        }
        int size = (this.A0F.size() << 1) + i + i7;
        int i9 = this.A00;
        if ((i9 & 131072) == 131072) {
            size += AbstractC11750gu.A07(23, this.A0D);
        }
        if ((i9 & 262144) == 262144) {
            size += AbstractC11750gu.A07(24, this.A0C);
        }
        if ((i9 & 524288) == 524288) {
            size += AbstractC11750gu.A00(25);
        }
        int A002 = this.unknownFields.A00() + size;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r6) {
        if ((this.A00 & 1) == 1) {
            r6.A0L(1, this.A0L);
        }
        if ((this.A00 & 2) == 2) {
            r6.A0L(2, this.A0K);
        }
        if ((this.A00 & 4) == 4) {
            r6.A0L(3, this.A0I);
        }
        if ((this.A00 & 8) == 8) {
            r6.A0J(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            r6.A0H(5, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            r6.A0F(6, this.A03);
        }
        if ((this.A00 & 64) == 64) {
            r6.A0F(7, this.A04);
        }
        if ((this.A00 & 128) == 128) {
            r6.A0J(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            r6.A0J(9, this.A07);
        }
        for (int i = 0; i < this.A0G.size(); i++) {
            r6.A0K(10, (AnonymousClass076) this.A0G.get(i));
        }
        if ((this.A00 & 512) == 512) {
            r6.A0L(11, this.A0J);
        }
        if ((this.A00 & 1024) == 1024) {
            r6.A0I(12, this.A06);
        }
        if ((this.A00 & 2048) == 2048) {
            r6.A0J(16, this.A0A);
        }
        if ((this.A00 & 4096) == 4096) {
            C75423cu r0 = this.A0H;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r6.A0K(17, r0);
        }
        if ((this.A00 & 8192) == 8192) {
            r6.A0J(18, this.A09);
        }
        if ((this.A00 & 16384) == 16384) {
            r6.A0F(19, this.A02);
        }
        if ((this.A00 & 32768) == 32768) {
            r6.A0F(20, this.A01);
        }
        if ((this.A00 & 65536) == 65536) {
            r6.A0J(21, this.A0E);
        }
        for (int i2 = 0; i2 < this.A0F.size(); i2++) {
            C11320g5 r02 = (C11320g5) this.A0F;
            r02.A02(i2);
            r6.A0F(22, r02.A01[i2]);
        }
        if ((this.A00 & 131072) == 131072) {
            r6.A0J(23, this.A0D);
        }
        if ((this.A00 & 262144) == 262144) {
            r6.A0J(24, this.A0C);
        }
        if ((this.A00 & 524288) == 524288) {
            r6.A0M(25, this.A0M);
        }
        this.unknownFields.A02(r6);
    }
}
