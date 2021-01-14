package X;

import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.3cu  reason: invalid class name and case insensitive filesystem */
public final class C75423cu extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75423cu A0H;
    public static volatile AbstractC37151nd A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;
    public AbstractC04120Jd A07 = C05030Mw.A01;
    public C75383cq A08;
    public C75413ct A09;
    public C02840Dr A0A;
    public AnonymousClass0N3 A0B;
    public String A0C = "";
    public String A0D = "";
    public String A0E = "";
    public String A0F = "";
    public boolean A0G;

    static {
        C75423cu r0 = new C75423cu();
        A0H = r0;
        r0.A0C();
    }

    public C75423cu() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A05 = r0;
        this.A06 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r24, Object obj, Object obj2) {
        C75403cs r14;
        AnonymousClass0NK r142;
        C75373cp r143;
        C04970Mo r144;
        switch (r24.ordinal()) {
            case 0:
                return A0H;
            case 1:
                AbstractC05000Mr r6 = (AbstractC05000Mr) obj;
                C75423cu r5 = (C75423cu) obj2;
                int i = this.A00;
                boolean z = false;
                if ((i & 1) == 1) {
                    z = true;
                }
                String str = this.A0F;
                int i2 = r5.A00;
                boolean z2 = false;
                if ((i2 & 1) == 1) {
                    z2 = true;
                }
                this.A0F = r6.ARH(z, str, z2, r5.A0F);
                boolean z3 = false;
                if ((i & 2) == 2) {
                    z3 = true;
                }
                String str2 = this.A0D;
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                this.A0D = r6.ARH(z3, str2, z4, r5.A0D);
                this.A0A = (C02840Dr) r6.ARD(this.A0A, r5.A0A);
                boolean z5 = false;
                if ((this.A00 & 8) == 8) {
                    z5 = true;
                }
                String str3 = this.A0E;
                boolean z6 = false;
                if ((r5.A00 & 8) == 8) {
                    z6 = true;
                }
                this.A0E = r6.ARH(z5, str3, z6, r5.A0E);
                this.A07 = r6.ARB(this.A07, r5.A07);
                int i3 = this.A00;
                boolean z7 = false;
                if ((i3 & 16) == 16) {
                    z7 = true;
                }
                String str4 = this.A0C;
                int i4 = r5.A00;
                boolean z8 = false;
                if ((i4 & 16) == 16) {
                    z8 = true;
                }
                this.A0C = r6.ARH(z7, str4, z8, r5.A0C);
                boolean z9 = false;
                if ((i3 & 32) == 32) {
                    z9 = true;
                }
                AnonymousClass071 r12 = this.A05;
                boolean z10 = false;
                if ((i4 & 32) == 32) {
                    z10 = true;
                }
                this.A05 = r6.AR6(z9, r12, z10, r5.A05);
                int i5 = this.A00;
                boolean z11 = false;
                if ((i5 & 64) == 64) {
                    z11 = true;
                }
                int i6 = this.A01;
                int i7 = r5.A00;
                boolean z12 = false;
                if ((i7 & 64) == 64) {
                    z12 = true;
                }
                this.A01 = r6.AR9(z11, i6, z12, r5.A01);
                boolean z13 = false;
                if ((i5 & 128) == 128) {
                    z13 = true;
                }
                int i8 = this.A03;
                boolean z14 = false;
                if ((i7 & 128) == 128) {
                    z14 = true;
                }
                this.A03 = r6.AR9(z13, i8, z14, r5.A03);
                boolean z15 = false;
                if ((i5 & 256) == 256) {
                    z15 = true;
                }
                boolean z16 = this.A0G;
                boolean z17 = false;
                if ((i7 & 256) == 256) {
                    z17 = true;
                }
                this.A0G = r6.AR5(z15, z16, z17, r5.A0G);
                this.A08 = (C75383cq) r6.ARD(this.A08, r5.A08);
                this.A0B = (AnonymousClass0N3) r6.ARD(this.A0B, r5.A0B);
                int i9 = this.A00;
                boolean z18 = false;
                if ((i9 & 2048) == 2048) {
                    z18 = true;
                }
                int i10 = this.A02;
                int i11 = r5.A00;
                boolean z19 = false;
                if ((i11 & 2048) == 2048) {
                    z19 = true;
                }
                this.A02 = r6.AR9(z18, i10, z19, r5.A02);
                boolean z20 = false;
                if ((i9 & 4096) == 4096) {
                    z20 = true;
                }
                long j = this.A04;
                boolean z21 = false;
                if ((i11 & 4096) == 4096) {
                    z21 = true;
                }
                this.A04 = r6.ARC(z20, j, z21, r5.A04);
                boolean z22 = false;
                if ((i9 & 8192) == 8192) {
                    z22 = true;
                }
                AnonymousClass071 r2 = this.A06;
                boolean z23 = false;
                if ((i11 & 8192) == 8192) {
                    z23 = true;
                }
                this.A06 = r6.AR6(z22, r2, z23, r5.A06);
                this.A09 = (C75413ct) r6.ARD(this.A09, r5.A09);
                if (r6 == C04980Mp.A00) {
                    this.A00 |= r5.A00;
                }
                return this;
            case 2:
                C05010Mt r62 = (C05010Mt) obj;
                AnonymousClass1FL r52 = (AnonymousClass1FL) obj2;
                boolean z24 = false;
                while (!z24) {
                    try {
                        int A032 = r62.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r62.A0A();
                                this.A00 |= 1;
                                this.A0F = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r62.A0A();
                                this.A00 |= 2;
                                this.A0D = A0A3;
                                continue;
                            case 26:
                                if ((this.A00 & 4) == 4) {
                                    r144 = (C04970Mo) this.A0A.AQb();
                                } else {
                                    r144 = null;
                                }
                                C02840Dr r0 = (C02840Dr) r62.A09(C02840Dr.A0b.A0A(), r52);
                                this.A0A = r0;
                                if (r144 != null) {
                                    r144.A03(r0);
                                    this.A0A = (C02840Dr) r144.A00();
                                }
                                this.A00 |= 4;
                                continue;
                            case 34:
                                String A0A4 = r62.A0A();
                                this.A00 |= 8;
                                this.A0E = A0A4;
                                continue;
                            case 122:
                                String A0A5 = r62.A0A();
                                AbstractC04120Jd r02 = this.A07;
                                if (!((AbstractC05040Mx) r02).A00) {
                                    r02 = AnonymousClass078.A04(r02);
                                    this.A07 = r02;
                                }
                                r02.add(A0A5);
                                continue;
                            case 146:
                                String A0A6 = r62.A0A();
                                this.A00 |= 16;
                                this.A0C = A0A6;
                                continue;
                            case 154:
                                this.A00 |= 32;
                                this.A05 = r62.A08();
                                continue;
                            case 160:
                                this.A00 |= 64;
                                this.A01 = r62.A02();
                                continue;
                            case 168:
                                this.A00 |= 128;
                                this.A03 = r62.A02();
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*{ENCODED_INT: 176}*/:
                                this.A00 |= 256;
                                this.A0G = r62.A0H();
                                continue;
                            case 186:
                                if ((this.A00 & 512) == 512) {
                                    r143 = (C75373cp) this.A08.AQb();
                                } else {
                                    r143 = null;
                                }
                                C75383cq r03 = (C75383cq) r62.A09(C75383cq.A05.A0A(), r52);
                                this.A08 = r03;
                                if (r143 != null) {
                                    r143.A03(r03);
                                    this.A08 = (C75383cq) r143.A00();
                                }
                                this.A00 |= 512;
                                continue;
                            case 194:
                                if ((this.A00 & 1024) == 1024) {
                                    r142 = (AnonymousClass0NK) this.A0B.AQb();
                                } else {
                                    r142 = null;
                                }
                                AnonymousClass0N3 r04 = (AnonymousClass0N3) r62.A09(AnonymousClass0N3.A05.A0A(), r52);
                                this.A0B = r04;
                                if (r142 != null) {
                                    r142.A03(r04);
                                    this.A0B = (AnonymousClass0N3) r142.A00();
                                }
                                this.A00 |= 1024;
                                continue;
                            case 200:
                                this.A00 |= 2048;
                                this.A02 = r62.A02();
                                continue;
                            case 208:
                                this.A00 |= 4096;
                                this.A04 = r62.A06();
                                continue;
                            case 218:
                                this.A00 |= 8192;
                                this.A06 = r62.A08();
                                continue;
                            case 226:
                                if ((this.A00 & 16384) == 16384) {
                                    r14 = (C75403cs) this.A09.AQb();
                                } else {
                                    r14 = null;
                                }
                                C75413ct r05 = (C75413ct) r62.A09(C75413ct.A0A.A0A(), r52);
                                this.A09 = r05;
                                if (r14 != null) {
                                    r14.A03(r05);
                                    this.A09 = (C75413ct) r14.A00();
                                }
                                this.A00 |= 16384;
                                continue;
                            default:
                                if (A0G(A032, r62)) {
                                    continue;
                                }
                                break;
                        }
                        z24 = true;
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
                ((AbstractC05040Mx) this.A07).A00 = false;
                return null;
            case 4:
                return new C75423cu();
            case 5:
                return new C75393cr();
            case 6:
                break;
            case 7:
                if (A0I == null) {
                    synchronized (C75423cu.class) {
                        if (A0I == null) {
                            A0I = new AnonymousClass275(A0H);
                        }
                    }
                }
                return A0I;
            default:
                throw new UnsupportedOperationException();
        }
        return A0H;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A0F) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A0D);
        }
        if ((this.A00 & 4) == 4) {
            C02840Dr r0 = this.A0A;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            i += AbstractC11750gu.A08(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            i += AbstractC11750gu.A09(4, this.A0E);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A07.size(); i4++) {
            i3 += AbstractC11750gu.A0B((String) this.A07.get(i4));
        }
        int size = this.A07.size() + i + i3;
        if ((this.A00 & 16) == 16) {
            size += AbstractC11750gu.A09(18, this.A0C);
        }
        int i5 = this.A00;
        if ((i5 & 32) == 32) {
            size += AbstractC11750gu.A07(19, this.A05);
        }
        if ((i5 & 64) == 64) {
            size += AbstractC11750gu.A04(20, this.A01);
        }
        if ((i5 & 128) == 128) {
            size += AbstractC11750gu.A04(21, this.A03);
        }
        if ((i5 & 256) == 256) {
            size += AbstractC11750gu.A00(22);
        }
        if ((i5 & 512) == 512) {
            C75383cq r02 = this.A08;
            if (r02 == null) {
                r02 = C75383cq.A05;
            }
            size += AbstractC11750gu.A08(23, r02);
        }
        if ((this.A00 & 1024) == 1024) {
            AnonymousClass0N3 r03 = this.A0B;
            if (r03 == null) {
                r03 = AnonymousClass0N3.A05;
            }
            size += AbstractC11750gu.A08(24, r03);
        }
        int i6 = this.A00;
        if ((i6 & 2048) == 2048) {
            size += AbstractC11750gu.A04(25, this.A02);
        }
        if ((i6 & 4096) == 4096) {
            size += AbstractC11750gu.A05(26, this.A04);
        }
        if ((i6 & 8192) == 8192) {
            size += AbstractC11750gu.A07(27, this.A06);
        }
        if ((i6 & 16384) == 16384) {
            C75413ct r04 = this.A09;
            if (r04 == null) {
                r04 = C75413ct.A0A;
            }
            size += AbstractC11750gu.A08(28, r04);
        }
        int A002 = this.unknownFields.A00() + size;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A0F);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A0D);
        }
        if ((this.A00 & 4) == 4) {
            C02840Dr r0 = this.A0A;
            if (r0 == null) {
                r0 = C02840Dr.A0b;
            }
            r4.A0K(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0L(4, this.A0E);
        }
        for (int i = 0; i < this.A07.size(); i++) {
            r4.A0L(15, (String) this.A07.get(i));
        }
        if ((this.A00 & 16) == 16) {
            r4.A0L(18, this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            r4.A0J(19, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            r4.A0F(20, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            r4.A0F(21, this.A03);
        }
        if ((this.A00 & 256) == 256) {
            r4.A0M(22, this.A0G);
        }
        if ((this.A00 & 512) == 512) {
            C75383cq r02 = this.A08;
            if (r02 == null) {
                r02 = C75383cq.A05;
            }
            r4.A0K(23, r02);
        }
        if ((this.A00 & 1024) == 1024) {
            AnonymousClass0N3 r03 = this.A0B;
            if (r03 == null) {
                r03 = AnonymousClass0N3.A05;
            }
            r4.A0K(24, r03);
        }
        if ((this.A00 & 2048) == 2048) {
            r4.A0F(25, this.A02);
        }
        if ((this.A00 & 4096) == 4096) {
            r4.A0I(26, this.A04);
        }
        if ((this.A00 & 8192) == 8192) {
            r4.A0J(27, this.A06);
        }
        if ((this.A00 & 16384) == 16384) {
            C75413ct r04 = this.A09;
            if (r04 == null) {
                r04 = C75413ct.A0A;
            }
            r4.A0K(28, r04);
        }
        this.unknownFields.A02(r4);
    }
}
