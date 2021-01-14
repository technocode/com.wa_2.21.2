package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.IOException;

/* renamed from: X.0g8  reason: invalid class name and case insensitive filesystem */
public final class C11350g8 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C11350g8 A0E;
    public static volatile AbstractC37151nd A0F;
    public int A00;
    public int A01;
    public int A02;
    public C11370gB A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public String A0C = "";
    public String A0D = "";

    static {
        C11350g8 r0 = new C11350g8();
        A0E = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r24, Object obj, Object obj2) {
        EnumC11390gD r0;
        C11380gC r15;
        EnumC11360gA r02;
        int i = 4096;
        switch (r24.ordinal()) {
            case 0:
                return A0E;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C11350g8 r10 = (C11350g8) obj2;
                boolean z = false;
                if ((this.A00 & 1) == 1) {
                    z = true;
                }
                int i2 = this.A01;
                boolean z2 = false;
                if ((r10.A00 & 1) == 1) {
                    z2 = true;
                }
                this.A01 = r11.AR9(z, i2, z2, r10.A01);
                this.A03 = (C11370gB) r11.ARD(this.A03, r10.A03);
                int i3 = this.A00;
                boolean z3 = false;
                if ((i3 & 4) == 4) {
                    z3 = true;
                }
                String str = this.A09;
                int i4 = r10.A00;
                boolean z4 = false;
                if ((i4 & 4) == 4) {
                    z4 = true;
                }
                this.A09 = r11.ARH(z3, str, z4, r10.A09);
                boolean z5 = false;
                if ((i3 & 8) == 8) {
                    z5 = true;
                }
                String str2 = this.A0A;
                boolean z6 = false;
                if ((i4 & 8) == 8) {
                    z6 = true;
                }
                this.A0A = r11.ARH(z5, str2, z6, r10.A0A);
                boolean z7 = false;
                if ((i3 & 16) == 16) {
                    z7 = true;
                }
                String str3 = this.A0C;
                boolean z8 = false;
                if ((i4 & 16) == 16) {
                    z8 = true;
                }
                this.A0C = r11.ARH(z7, str3, z8, r10.A0C);
                boolean z9 = false;
                if ((i3 & 32) == 32) {
                    z9 = true;
                }
                String str4 = this.A08;
                boolean z10 = false;
                if ((i4 & 32) == 32) {
                    z10 = true;
                }
                this.A08 = r11.ARH(z9, str4, z10, r10.A08);
                boolean z11 = false;
                if ((i3 & 64) == 64) {
                    z11 = true;
                }
                String str5 = this.A05;
                boolean z12 = false;
                if ((i4 & 64) == 64) {
                    z12 = true;
                }
                this.A05 = r11.ARH(z11, str5, z12, r10.A05);
                boolean z13 = false;
                if ((i3 & 128) == 128) {
                    z13 = true;
                }
                String str6 = this.A0B;
                boolean z14 = false;
                if ((i4 & 128) == 128) {
                    z14 = true;
                }
                this.A0B = r11.ARH(z13, str6, z14, r10.A0B);
                boolean z15 = false;
                if ((i3 & 256) == 256) {
                    z15 = true;
                }
                String str7 = this.A0D;
                boolean z16 = false;
                if ((i4 & 256) == 256) {
                    z16 = true;
                }
                this.A0D = r11.ARH(z15, str7, z16, r10.A0D);
                boolean z17 = false;
                if ((i3 & 512) == 512) {
                    z17 = true;
                }
                int i5 = this.A02;
                boolean z18 = false;
                if ((i4 & 512) == 512) {
                    z18 = true;
                }
                this.A02 = r11.AR9(z17, i5, z18, r10.A02);
                boolean z19 = false;
                if ((i3 & 1024) == 1024) {
                    z19 = true;
                }
                String str8 = this.A07;
                boolean z20 = false;
                if ((i4 & 1024) == 1024) {
                    z20 = true;
                }
                this.A07 = r11.ARH(z19, str8, z20, r10.A07);
                boolean z21 = false;
                if ((i3 & 2048) == 2048) {
                    z21 = true;
                }
                String str9 = this.A06;
                boolean z22 = false;
                if ((i4 & 2048) == 2048) {
                    z22 = true;
                }
                this.A06 = r11.ARH(z21, str9, z22, r10.A06);
                boolean z23 = false;
                if ((i3 & 4096) == 4096) {
                    z23 = true;
                }
                String str10 = this.A04;
                boolean z24 = false;
                if ((i4 & 4096) == 4096) {
                    z24 = true;
                }
                this.A04 = r11.ARH(z23, str10, z24, r10.A04);
                if (r11 == C04980Mp.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                AnonymousClass1FL r102 = (AnonymousClass1FL) obj2;
                boolean z25 = false;
                while (!z25) {
                    try {
                        int A032 = r112.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 8:
                                int A022 = r112.A02();
                                switch (A022) {
                                    case 0:
                                        r02 = EnumC11360gA.ANDROID;
                                        break;
                                    case 1:
                                        r02 = EnumC11360gA.IOS;
                                        break;
                                    case 2:
                                        r02 = EnumC11360gA.WINDOWS_PHONE;
                                        break;
                                    case 3:
                                        r02 = EnumC11360gA.BLACKBERRY;
                                        break;
                                    case 4:
                                        r02 = EnumC11360gA.BLACKBERRYX;
                                        break;
                                    case 5:
                                        r02 = EnumC11360gA.S40;
                                        break;
                                    case 6:
                                        r02 = EnumC11360gA.S60;
                                        break;
                                    case 7:
                                        r02 = EnumC11360gA.PYTHON_CLIENT;
                                        break;
                                    case 8:
                                        r02 = EnumC11360gA.TIZEN;
                                        break;
                                    case 9:
                                        r02 = EnumC11360gA.ENTERPRISE;
                                        break;
                                    case 10:
                                        r02 = EnumC11360gA.SMB_ANDROID;
                                        break;
                                    case 11:
                                        r02 = EnumC11360gA.KAIOS;
                                        break;
                                    case 12:
                                        r02 = EnumC11360gA.SMB_IOS;
                                        break;
                                    case 13:
                                        r02 = EnumC11360gA.WINDOWS;
                                        break;
                                    case 14:
                                        r02 = EnumC11360gA.WEB;
                                        break;
                                    default:
                                        r02 = null;
                                        break;
                                }
                                if (r02 == null) {
                                    super.A0D(1, A022);
                                    continue;
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A022;
                                }
                                i = 4096;
                            case 18:
                                if ((this.A00 & 2) == 2) {
                                    r15 = (C11380gC) this.A03.AQb();
                                } else {
                                    r15 = null;
                                }
                                C11370gB r03 = (C11370gB) r112.A09(C11370gB.A05.A0A(), r102);
                                this.A03 = r03;
                                if (r15 != null) {
                                    r15.A03(r03);
                                    this.A03 = (C11370gB) r15.A00();
                                }
                                this.A00 |= 2;
                                continue;
                                i = 4096;
                            case 26:
                                String A0A2 = r112.A0A();
                                this.A00 |= 4;
                                this.A09 = A0A2;
                                continue;
                                i = 4096;
                            case 34:
                                String A0A3 = r112.A0A();
                                this.A00 |= 8;
                                this.A0A = A0A3;
                                continue;
                                i = 4096;
                            case 42:
                                String A0A4 = r112.A0A();
                                this.A00 |= 16;
                                this.A0C = A0A4;
                                continue;
                                i = 4096;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                                String A0A5 = r112.A0A();
                                this.A00 |= 32;
                                this.A08 = A0A5;
                                continue;
                                i = 4096;
                            case 58:
                                String A0A6 = r112.A0A();
                                this.A00 |= 64;
                                this.A05 = A0A6;
                                continue;
                                i = 4096;
                            case 66:
                                String A0A7 = r112.A0A();
                                this.A00 |= 128;
                                this.A0B = A0A7;
                                continue;
                                i = 4096;
                            case 74:
                                String A0A8 = r112.A0A();
                                this.A00 |= 256;
                                this.A0D = A0A8;
                                continue;
                                i = 4096;
                            case 80:
                                int A023 = r112.A02();
                                if (A023 == 0) {
                                    r0 = EnumC11390gD.RELEASE;
                                } else if (A023 == 1) {
                                    r0 = EnumC11390gD.BETA;
                                } else if (A023 == 2) {
                                    r0 = EnumC11390gD.ALPHA;
                                } else if (A023 != 3) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC11390gD.DEBUG;
                                }
                                if (r0 == null) {
                                    super.A0D(10, A023);
                                    continue;
                                } else {
                                    this.A00 |= 512;
                                    this.A02 = A023;
                                }
                                i = 4096;
                            case 90:
                                String A0A9 = r112.A0A();
                                this.A00 |= 1024;
                                this.A07 = A0A9;
                                continue;
                                i = 4096;
                            case 98:
                                String A0A10 = r112.A0A();
                                this.A00 |= 2048;
                                this.A06 = A0A10;
                                continue;
                                i = 4096;
                            case 106:
                                String A0A11 = r112.A0A();
                                this.A00 |= i;
                                this.A04 = A0A11;
                                continue;
                                i = 4096;
                            default:
                                if (!A0G(A032, r112)) {
                                    break;
                                } else {
                                    continue;
                                    i = 4096;
                                }
                        }
                        z25 = true;
                        i = 4096;
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
                return new C11350g8();
            case 5:
                return new AnonymousClass0g9();
            case 6:
                break;
            case 7:
                if (A0F == null) {
                    synchronized (C11350g8.class) {
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

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A02(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            C11370gB r0 = this.A03;
            if (r0 == null) {
                r0 = C11370gB.A05;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            i2 += AbstractC11750gu.A09(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            i2 += AbstractC11750gu.A09(5, this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            i2 += AbstractC11750gu.A09(6, this.A08);
        }
        if ((this.A00 & 64) == 64) {
            i2 += AbstractC11750gu.A09(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            i2 += AbstractC11750gu.A09(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            i2 += AbstractC11750gu.A09(9, this.A0D);
        }
        int i4 = this.A00;
        if ((i4 & 512) == 512) {
            i2 += AbstractC11750gu.A02(10, this.A02);
        }
        if ((i4 & 1024) == 1024) {
            i2 += AbstractC11750gu.A09(11, this.A07);
        }
        if ((this.A00 & 2048) == 2048) {
            i2 += AbstractC11750gu.A09(12, this.A06);
        }
        if ((this.A00 & 4096) == 4096) {
            i2 += AbstractC11750gu.A09(13, this.A04);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0E(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C11370gB r0 = this.A03;
            if (r0 == null) {
                r0 = C11370gB.A05;
            }
            r5.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0L(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0L(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0L(5, this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0L(6, this.A08);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0L(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0L(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0L(9, this.A0D);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0E(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            r5.A0L(11, this.A07);
        }
        if ((this.A00 & 2048) == 2048) {
            r5.A0L(12, this.A06);
        }
        if ((this.A00 & 4096) == 4096) {
            r5.A0L(13, this.A04);
        }
        this.unknownFields.A02(r5);
    }
}
