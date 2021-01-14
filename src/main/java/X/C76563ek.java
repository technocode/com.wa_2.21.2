package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.IOException;

/* renamed from: X.3ek  reason: invalid class name and case insensitive filesystem */
public final class C76563ek extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76563ek A0K;
    public static volatile AbstractC37151nd A0L;
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
    public AbstractC04120Jd A0C;
    public C75423cu A0D;
    public String A0E;
    public String A0F;
    public String A0G = "";
    public String A0H = "";
    public boolean A0I;
    public boolean A0J;

    static {
        C76563ek r0 = new C76563ek();
        A0K = r0;
        r0.A0C();
    }

    public C76563ek() {
        AnonymousClass071 r1 = AnonymousClass071.A01;
        this.A08 = r1;
        this.A0A = r1;
        this.A0E = "";
        this.A07 = r1;
        this.A0C = C05030Mw.A01;
        this.A0F = "";
        this.A09 = r1;
        this.A0B = r1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r22, Object obj, Object obj2) {
        EnumC69933Jc r0;
        C75393cr r12;
        int i = 65536;
        boolean z = false;
        switch (r22.ordinal()) {
            case 0:
                return A0K;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                C76563ek r7 = (C76563ek) obj2;
                int i2 = this.A00;
                boolean z2 = false;
                if ((i2 & 1) == 1) {
                    z2 = true;
                }
                String str = this.A0H;
                int i3 = r7.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A0H = r8.ARH(z2, str, z3, r7.A0H);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0G;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A0G = r8.ARH(z4, str2, z5, r7.A0G);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                AnonymousClass071 r11 = this.A08;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A08 = r8.AR6(z6, r11, z7, r7.A08);
                int i4 = this.A00;
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                long j = this.A05;
                int i5 = r7.A00;
                boolean z9 = false;
                if ((i5 & 8) == 8) {
                    z9 = true;
                }
                this.A05 = r8.ARC(z8, j, z9, r7.A05);
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                int i6 = this.A03;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A03 = r8.AR9(z10, i6, z11, r7.A03);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                AnonymousClass071 r122 = this.A0A;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A0A = r8.AR6(z12, r122, z13, r7.A0A);
                int i7 = this.A00;
                boolean z14 = false;
                if ((i7 & 64) == 64) {
                    z14 = true;
                }
                String str3 = this.A0E;
                int i8 = r7.A00;
                boolean z15 = false;
                if ((i8 & 64) == 64) {
                    z15 = true;
                }
                this.A0E = r8.ARH(z14, str3, z15, r7.A0E);
                boolean z16 = false;
                if ((i7 & 128) == 128) {
                    z16 = true;
                }
                boolean z17 = this.A0I;
                boolean z18 = false;
                if ((i8 & 128) == 128) {
                    z18 = true;
                }
                this.A0I = r8.AR5(z16, z17, z18, r7.A0I);
                boolean z19 = false;
                if ((i7 & 256) == 256) {
                    z19 = true;
                }
                int i9 = this.A02;
                boolean z20 = false;
                if ((i8 & 256) == 256) {
                    z20 = true;
                }
                this.A02 = r8.AR9(z19, i9, z20, r7.A02);
                boolean z21 = false;
                if ((i7 & 512) == 512) {
                    z21 = true;
                }
                int i10 = this.A04;
                boolean z22 = false;
                if ((i8 & 512) == 512) {
                    z22 = true;
                }
                this.A04 = r8.AR9(z21, i10, z22, r7.A04);
                boolean z23 = false;
                if ((i7 & 1024) == 1024) {
                    z23 = true;
                }
                AnonymousClass071 r2 = this.A07;
                boolean z24 = false;
                if ((i8 & 1024) == 1024) {
                    z24 = true;
                }
                this.A07 = r8.AR6(z23, r2, z24, r7.A07);
                this.A0C = r8.ARB(this.A0C, r7.A0C);
                int i11 = this.A00;
                boolean z25 = false;
                if ((i11 & 2048) == 2048) {
                    z25 = true;
                }
                String str4 = this.A0F;
                int i12 = r7.A00;
                boolean z26 = false;
                if ((i12 & 2048) == 2048) {
                    z26 = true;
                }
                this.A0F = r8.ARH(z25, str4, z26, r7.A0F);
                boolean z27 = false;
                if ((i11 & 4096) == 4096) {
                    z27 = true;
                }
                long j2 = this.A06;
                boolean z28 = false;
                if ((i12 & 4096) == 4096) {
                    z28 = true;
                }
                this.A06 = r8.ARC(z27, j2, z28, r7.A06);
                boolean z29 = false;
                if ((i11 & 8192) == 8192) {
                    z29 = true;
                }
                AnonymousClass071 r23 = this.A09;
                boolean z30 = false;
                if ((i12 & 8192) == 8192) {
                    z30 = true;
                }
                this.A09 = r8.AR6(z29, r23, z30, r7.A09);
                this.A0D = (C75423cu) r8.ARD(this.A0D, r7.A0D);
                boolean z31 = false;
                if ((this.A00 & 32768) == 32768) {
                    z31 = true;
                }
                AnonymousClass071 r24 = this.A0B;
                boolean z32 = false;
                if ((r7.A00 & 32768) == 32768) {
                    z32 = true;
                }
                this.A0B = r8.AR6(z31, r24, z32, r7.A0B);
                int i13 = this.A00;
                boolean z33 = false;
                if ((i13 & 65536) == 65536) {
                    z33 = true;
                }
                int i14 = this.A01;
                int i15 = r7.A00;
                boolean z34 = false;
                if ((i15 & 65536) == 65536) {
                    z34 = true;
                }
                this.A01 = r8.AR9(z33, i14, z34, r7.A01);
                boolean z35 = false;
                if ((i13 & 131072) == 131072) {
                    z35 = true;
                }
                boolean z36 = this.A0J;
                boolean z37 = false;
                if ((i15 & 131072) == 131072) {
                    z37 = true;
                }
                this.A0J = r8.AR5(z35, z36, z37, r7.A0J);
                if (r8 == C04980Mp.A00) {
                    this.A00 = i13 | i15;
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
                                this.A0H = A0A2;
                                continue;
                                i = 65536;
                            case 18:
                                String A0A3 = r82.A0A();
                                this.A00 |= 2;
                                this.A0G = A0A3;
                                continue;
                                i = 65536;
                            case 26:
                                this.A00 |= 4;
                                this.A08 = r82.A08();
                                continue;
                                i = 65536;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                this.A00 |= 8;
                                this.A05 = r82.A06();
                                continue;
                                i = 65536;
                            case 40:
                                this.A00 |= 16;
                                this.A03 = r82.A02();
                                continue;
                                i = 65536;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                this.A00 |= 32;
                                this.A0A = r82.A08();
                                continue;
                                i = 65536;
                            case 58:
                                String A0A4 = r82.A0A();
                                this.A00 |= 64;
                                this.A0E = A0A4;
                                continue;
                                i = 65536;
                            case 64:
                                this.A00 |= 128;
                                this.A0I = r82.A0H();
                                continue;
                                i = 65536;
                            case AnonymousClass0PW.A02:
                                this.A00 |= 256;
                                this.A02 = r82.A02();
                                continue;
                                i = 65536;
                            case 80:
                                this.A00 |= 512;
                                this.A04 = r82.A02();
                                continue;
                                i = 65536;
                            case 90:
                                this.A00 |= 1024;
                                this.A07 = r82.A08();
                                continue;
                                i = 65536;
                            case 98:
                                AbstractC04120Jd r1 = this.A0C;
                                if (!((AbstractC05040Mx) r1).A00) {
                                    r1 = AnonymousClass078.A04(r1);
                                    this.A0C = r1;
                                }
                                r1.add(r82.A09(C75503d2.A04.A0A(), r72));
                                continue;
                                i = 65536;
                            case 106:
                                String A0A5 = r82.A0A();
                                this.A00 |= 2048;
                                this.A0F = A0A5;
                                continue;
                                i = 65536;
                            case 112:
                                this.A00 |= 4096;
                                this.A06 = r82.A06();
                                continue;
                                i = 65536;
                            case 130:
                                this.A00 |= 8192;
                                this.A09 = r82.A08();
                                continue;
                                i = 65536;
                            case 138:
                                if ((this.A00 & 16384) == 16384) {
                                    r12 = (C75393cr) this.A0D.AQb();
                                } else {
                                    r12 = null;
                                }
                                C75423cu r02 = (C75423cu) r82.A09(C75423cu.A0H.A0A(), r72);
                                this.A0D = r02;
                                if (r12 != null) {
                                    r12.A03(r02);
                                    this.A0D = (C75423cu) r12.A00();
                                }
                                this.A00 |= 16384;
                                continue;
                                i = 65536;
                            case 146:
                                this.A00 |= 32768;
                                this.A0B = r82.A08();
                                continue;
                                i = 65536;
                            case 152:
                                int A022 = r82.A02();
                                if (A022 == 0) {
                                    r0 = EnumC69933Jc.NONE;
                                } else if (A022 == 1) {
                                    r0 = EnumC69933Jc.GIPHY;
                                } else if (A022 != 2) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC69933Jc.TENOR;
                                }
                                if (r0 == null) {
                                    super.A0D(19, A022);
                                    continue;
                                } else {
                                    this.A00 |= i;
                                    this.A01 = A022;
                                }
                                i = 65536;
                            case 160:
                                this.A00 |= 131072;
                                this.A0J = r82.A0H();
                                continue;
                                i = 65536;
                            default:
                                if (!A0G(A032, r82)) {
                                    break;
                                } else {
                                    continue;
                                    i = 65536;
                                }
                        }
                        z = true;
                        i = 65536;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r13 = new C04190Jk(e2.getMessage());
                        r13.unfinishedMessage = this;
                        throw new RuntimeException(r13);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A0C).A00 = false;
                return null;
            case 4:
                return new C76563ek();
            case 5:
                return new C76553ej();
            case 6:
                break;
            case 7:
                if (A0L == null) {
                    synchronized (C76563ek.class) {
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
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A0H) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A0G);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i += AbstractC11750gu.A07(3, this.A08);
        }
        if ((i3 & 8) == 8) {
            i += AbstractC11750gu.A06(4, this.A05);
        }
        if ((i3 & 16) == 16) {
            i += AbstractC11750gu.A04(5, this.A03);
        }
        if ((i3 & 32) == 32) {
            i += AbstractC11750gu.A07(6, this.A0A);
        }
        if ((i3 & 64) == 64) {
            i += AbstractC11750gu.A09(7, this.A0E);
        }
        int i4 = this.A00;
        if ((i4 & 128) == 128) {
            i += AbstractC11750gu.A00(8);
        }
        if ((i4 & 256) == 256) {
            i += AbstractC11750gu.A04(9, this.A02);
        }
        if ((i4 & 512) == 512) {
            i += AbstractC11750gu.A04(10, this.A04);
        }
        if ((i4 & 1024) == 1024) {
            i += AbstractC11750gu.A07(11, this.A07);
        }
        for (int i5 = 0; i5 < this.A0C.size(); i5++) {
            i += AbstractC11750gu.A08(12, (AnonymousClass076) this.A0C.get(i5));
        }
        if ((this.A00 & 2048) == 2048) {
            i += AbstractC11750gu.A09(13, this.A0F);
        }
        int i6 = this.A00;
        if ((i6 & 4096) == 4096) {
            i += AbstractC11750gu.A05(14, this.A06);
        }
        if ((i6 & 8192) == 8192) {
            i += AbstractC11750gu.A07(16, this.A09);
        }
        if ((i6 & 16384) == 16384) {
            C75423cu r0 = this.A0D;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            i += AbstractC11750gu.A08(17, r0);
        }
        int i7 = this.A00;
        if ((i7 & 32768) == 32768) {
            i += AbstractC11750gu.A07(18, this.A0B);
        }
        if ((i7 & 65536) == 65536) {
            i += AbstractC11750gu.A02(19, this.A01);
        }
        if ((i7 & 131072) == 131072) {
            i += AbstractC11750gu.A00(20);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0L(1, this.A0H);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A0G);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0J(3, this.A08);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0H(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0F(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0J(6, this.A0A);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0L(7, this.A0E);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0M(8, this.A0I);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0F(9, this.A02);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0F(10, this.A04);
        }
        if ((this.A00 & 1024) == 1024) {
            r5.A0J(11, this.A07);
        }
        for (int i = 0; i < this.A0C.size(); i++) {
            r5.A0K(12, (AnonymousClass076) this.A0C.get(i));
        }
        if ((this.A00 & 2048) == 2048) {
            r5.A0L(13, this.A0F);
        }
        if ((this.A00 & 4096) == 4096) {
            r5.A0I(14, this.A06);
        }
        if ((this.A00 & 8192) == 8192) {
            r5.A0J(16, this.A09);
        }
        if ((this.A00 & 16384) == 16384) {
            C75423cu r0 = this.A0D;
            if (r0 == null) {
                r0 = C75423cu.A0H;
            }
            r5.A0K(17, r0);
        }
        if ((this.A00 & 32768) == 32768) {
            r5.A0J(18, this.A0B);
        }
        if ((this.A00 & 65536) == 65536) {
            r5.A0E(19, this.A01);
        }
        if ((this.A00 & 131072) == 131072) {
            r5.A0M(20, this.A0J);
        }
        this.unknownFields.A02(r5);
    }
}
