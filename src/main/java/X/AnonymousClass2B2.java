package X;

import java.io.IOException;

/* renamed from: X.2B2  reason: invalid class name */
public final class AnonymousClass2B2 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass2B2 A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public long A01;
    public long A02;
    public AbstractC04120Jd A03 = C05030Mw.A01;
    public String A04 = "";
    public String A05 = "";

    static {
        AnonymousClass2B2 r0 = new AnonymousClass2B2();
        A06 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r19, Object obj, Object obj2) {
        boolean z = false;
        switch (r19.ordinal()) {
            case 0:
                return A06;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                AnonymousClass2B2 r3 = (AnonymousClass2B2) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                long j = this.A02;
                int i2 = r3.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A02 = r11.ARC(z2, j, z3, r3.A02);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str = this.A04;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r11.ARH(z4, str, z5, r3.A04);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                String str2 = this.A05;
                boolean z7 = false;
                if ((i2 & 4) == 4) {
                    z7 = true;
                }
                this.A05 = r11.ARH(z6, str2, z7, r3.A05);
                this.A03 = r11.ARB(this.A03, r3.A03);
                int i3 = this.A00;
                boolean z8 = false;
                if ((i3 & 8) == 8) {
                    z8 = true;
                }
                long j2 = this.A01;
                int i4 = r3.A00;
                boolean z9 = false;
                if ((i4 & 8) == 8) {
                    z9 = true;
                }
                this.A01 = r11.ARC(z8, j2, z9, r3.A01);
                if (r11 == C04980Mp.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                AnonymousClass1FL r32 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r112.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A02 = r112.A06();
                            } else if (A032 == 18) {
                                String A0A = r112.A0A();
                                this.A00 |= 2;
                                this.A04 = A0A;
                            } else if (A032 == 34) {
                                String A0A2 = r112.A0A();
                                this.A00 |= 4;
                                this.A05 = A0A2;
                            } else if (A032 == 66) {
                                AbstractC04120Jd r1 = this.A03;
                                if (!((AbstractC05040Mx) r1).A00) {
                                    r1 = AnonymousClass078.A04(r1);
                                    this.A03 = r1;
                                }
                                r1.add(r112.A09(AnonymousClass2B1.A04.A0A(), r32));
                            } else if (A032 == 80) {
                                this.A00 |= 8;
                                this.A01 = r112.A06();
                            } else if (!A0G(A032, r112)) {
                            }
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
                ((AbstractC05040Mx) this.A03).A00 = false;
                return null;
            case 4:
                return new AnonymousClass2B2();
            case 5:
                return new C77333fz();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (AnonymousClass2B2.class) {
                        if (A07 == null) {
                            A07 = new AnonymousClass275(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
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
            i = AbstractC11750gu.A06(1, this.A02) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            i += AbstractC11750gu.A09(4, this.A05);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            i += AbstractC11750gu.A08(8, (AnonymousClass076) this.A03.get(i4));
        }
        if ((this.A00 & 8) == 8) {
            i += AbstractC11750gu.A06(10, this.A01);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0H(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(4, this.A05);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            r4.A0K(8, (AnonymousClass076) this.A03.get(i));
        }
        if ((this.A00 & 8) == 8) {
            r4.A0H(10, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
