package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;

/* renamed from: X.3g4  reason: invalid class name and case insensitive filesystem */
public final class C77383g4 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77383g4 A0C;
    public static volatile AbstractC37151nd A0D;
    public int A00;
    public AnonymousClass071 A01 = AnonymousClass071.A01;
    public String A02 = "";
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    static {
        C77383g4 r0 = new C77383g4();
        A0C = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r24, Object obj, Object obj2) {
        switch (r24.ordinal()) {
            case 0:
                return A0C;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C77383g4 r10 = (C77383g4) obj2;
                int i = this.A00;
                boolean z = false;
                if ((i & 1) == 1) {
                    z = true;
                }
                boolean z2 = this.A0B;
                int i2 = r10.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A0B = r11.AR5(z, z2, z3, r10.A0B);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                boolean z5 = this.A09;
                boolean z6 = false;
                if ((i2 & 2) == 2) {
                    z6 = true;
                }
                this.A09 = r11.AR5(z4, z5, z6, r10.A09);
                boolean z7 = false;
                if ((i & 4) == 4) {
                    z7 = true;
                }
                boolean z8 = this.A03;
                boolean z9 = false;
                if ((i2 & 4) == 4) {
                    z9 = true;
                }
                this.A03 = r11.AR5(z7, z8, z9, r10.A03);
                boolean z10 = false;
                if ((i & 8) == 8) {
                    z10 = true;
                }
                boolean z11 = this.A0A;
                boolean z12 = false;
                if ((i2 & 8) == 8) {
                    z12 = true;
                }
                this.A0A = r11.AR5(z10, z11, z12, r10.A0A);
                boolean z13 = false;
                if ((i & 16) == 16) {
                    z13 = true;
                }
                boolean z14 = this.A08;
                boolean z15 = false;
                if ((i2 & 16) == 16) {
                    z15 = true;
                }
                this.A08 = r11.AR5(z13, z14, z15, r10.A08);
                boolean z16 = false;
                if ((i & 32) == 32) {
                    z16 = true;
                }
                boolean z17 = this.A06;
                boolean z18 = false;
                if ((i2 & 32) == 32) {
                    z18 = true;
                }
                this.A06 = r11.AR5(z16, z17, z18, r10.A06);
                boolean z19 = false;
                if ((i & 64) == 64) {
                    z19 = true;
                }
                boolean z20 = this.A07;
                boolean z21 = false;
                if ((i2 & 64) == 64) {
                    z21 = true;
                }
                this.A07 = r11.AR5(z19, z20, z21, r10.A07);
                boolean z22 = false;
                if ((i & 128) == 128) {
                    z22 = true;
                }
                boolean z23 = this.A04;
                boolean z24 = false;
                if ((i2 & 128) == 128) {
                    z24 = true;
                }
                this.A04 = r11.AR5(z22, z23, z24, r10.A04);
                boolean z25 = false;
                if ((i & 256) == 256) {
                    z25 = true;
                }
                boolean z26 = this.A05;
                boolean z27 = false;
                if ((i2 & 256) == 256) {
                    z27 = true;
                }
                this.A05 = r11.AR5(z25, z26, z27, r10.A05);
                boolean z28 = false;
                if ((i & 512) == 512) {
                    z28 = true;
                }
                String str = this.A02;
                boolean z29 = false;
                if ((i2 & 512) == 512) {
                    z29 = true;
                }
                this.A02 = r11.ARH(z28, str, z29, r10.A02);
                boolean z30 = false;
                if ((i & 1024) == 1024) {
                    z30 = true;
                }
                AnonymousClass071 r3 = this.A01;
                boolean z31 = false;
                if ((i2 & 1024) == 1024) {
                    z31 = true;
                }
                this.A01 = r11.AR6(z30, r3, z31, r10.A01);
                if (r11 == C04980Mp.A00) {
                    this.A00 |= r10.A00;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                boolean z32 = false;
                while (!z32) {
                    try {
                        int A032 = r112.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 8:
                                this.A00 |= 1;
                                this.A0B = r112.A0H();
                                continue;
                            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                                this.A00 |= 2;
                                this.A09 = r112.A0H();
                                continue;
                            case 24:
                                this.A00 |= 4;
                                this.A03 = r112.A0H();
                                continue;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                                this.A00 |= 8;
                                this.A0A = r112.A0H();
                                continue;
                            case 40:
                                this.A00 |= 16;
                                this.A08 = r112.A0H();
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A06 = r112.A0H();
                                continue;
                            case 56:
                                this.A00 |= 64;
                                this.A07 = r112.A0H();
                                continue;
                            case 64:
                                this.A00 |= 128;
                                this.A04 = r112.A0H();
                                continue;
                            case AnonymousClass0PW.A02:
                                this.A00 |= 256;
                                this.A05 = r112.A0H();
                                continue;
                            case 82:
                                String A0A2 = r112.A0A();
                                this.A00 |= 512;
                                this.A02 = A0A2;
                                continue;
                            case 90:
                                this.A00 |= 1024;
                                this.A01 = r112.A08();
                                continue;
                            default:
                                if (A0G(A032, r112)) {
                                    continue;
                                }
                                break;
                        }
                        z32 = true;
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
                return new C77383g4();
            case 5:
                return new C77373g3();
            case 6:
                break;
            case 7:
                if (A0D == null) {
                    synchronized (C77383g4.class) {
                        if (A0D == null) {
                            A0D = new AnonymousClass275(A0C);
                        }
                    }
                }
                return A0D;
            default:
                throw new UnsupportedOperationException();
        }
        return A0C;
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
            i2 = 0 + AbstractC11750gu.A00(1);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A00(2);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A00(3);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A00(4);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A00(5);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A00(6);
        }
        if ((i3 & 64) == 64) {
            i2 += AbstractC11750gu.A00(7);
        }
        if ((i3 & 128) == 128) {
            i2 += AbstractC11750gu.A00(8);
        }
        if ((i3 & 256) == 256) {
            i2 += AbstractC11750gu.A00(9);
        }
        if ((i3 & 512) == 512) {
            i2 += AbstractC11750gu.A09(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            i2 += AbstractC11750gu.A07(11, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0M(1, this.A0B);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0M(2, this.A09);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0M(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0M(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0M(5, this.A08);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0M(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            r5.A0M(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            r5.A0M(8, this.A04);
        }
        if ((this.A00 & 256) == 256) {
            r5.A0M(9, this.A05);
        }
        if ((this.A00 & 512) == 512) {
            r5.A0L(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            r5.A0J(11, this.A01);
        }
        this.unknownFields.A02(r5);
    }
}
