package X;

import java.io.IOException;

/* renamed from: X.0NE  reason: invalid class name */
public final class AnonymousClass0NE extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0NE A08;
    public static volatile AbstractC37151nd A09;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;
    public AbstractC04120Jd A03 = C05030Mw.A01;
    public C76783f6 A04;
    public AnonymousClass0NJ A05;
    public AnonymousClass0NI A06;
    public AnonymousClass0NB A07;

    static {
        AnonymousClass0NE r0 = new AnonymousClass0NE();
        A08 = r0;
        r0.A0C();
    }

    public AnonymousClass0NE() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A02 = r0;
        this.A01 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r9, Object obj, Object obj2) {
        C76883fG r1;
        C76793f7 r12;
        C76803f8 r13;
        C76773f5 r14;
        boolean z = false;
        switch (r9.ordinal()) {
            case 0:
                return A08;
            case 1:
                AbstractC05000Mr r10 = (AbstractC05000Mr) obj;
                AnonymousClass0NE r11 = (AnonymousClass0NE) obj2;
                this.A07 = (AnonymousClass0NB) r10.ARD(this.A07, r11.A07);
                this.A03 = r10.ARB(this.A03, r11.A03);
                this.A05 = (AnonymousClass0NJ) r10.ARD(this.A05, r11.A05);
                boolean z2 = false;
                if ((this.A00 & 4) == 4) {
                    z2 = true;
                }
                AnonymousClass071 r2 = this.A02;
                boolean z3 = false;
                if ((r11.A00 & 4) == 4) {
                    z3 = true;
                }
                this.A02 = r10.AR6(z2, r2, z3, r11.A02);
                boolean z4 = false;
                if ((this.A00 & 8) == 8) {
                    z4 = true;
                }
                AnonymousClass071 r15 = this.A01;
                if ((r11.A00 & 8) == 8) {
                    z = true;
                }
                this.A01 = r10.AR6(z4, r15, z, r11.A01);
                this.A06 = (AnonymousClass0NI) r10.ARD(this.A06, r11.A06);
                this.A04 = (C76783f6) r10.ARD(this.A04, r11.A04);
                if (r10 == C04980Mp.A00) {
                    this.A00 |= r11.A00;
                }
                return this;
            case 2:
                C05010Mt r102 = (C05010Mt) obj;
                AnonymousClass1FL r112 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r102.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    r1 = (C76883fG) this.A07.AQb();
                                } else {
                                    r1 = null;
                                }
                                AnonymousClass0NB r0 = (AnonymousClass0NB) r102.A09(AnonymousClass0NB.A02.A0A(), r112);
                                this.A07 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A07 = (AnonymousClass0NB) r1.A00();
                                }
                                this.A00 |= 1;
                            } else if (A032 == 18) {
                                AbstractC04120Jd r3 = this.A03;
                                AbstractC04120Jd r16 = r3;
                                if (!((AbstractC05040Mx) r3).A00) {
                                    r16 = AnonymousClass078.A04(r3);
                                    this.A03 = r16;
                                }
                                r16.add(r102.A09(C76833fB.A03.A0A(), r112));
                            } else if (A032 == 26) {
                                if ((this.A00 & 2) == 2) {
                                    r12 = (C76793f7) this.A05.AQb();
                                } else {
                                    r12 = null;
                                }
                                AnonymousClass0NJ r02 = (AnonymousClass0NJ) r102.A09(AnonymousClass0NJ.A07.A0A(), r112);
                                this.A05 = r02;
                                if (r12 != null) {
                                    r12.A03(r02);
                                    this.A05 = (AnonymousClass0NJ) r12.A00();
                                }
                                this.A00 |= 2;
                            } else if (A032 == 34) {
                                this.A00 |= 4;
                                this.A02 = r102.A08();
                            } else if (A032 == 42) {
                                this.A00 |= 8;
                                this.A01 = r102.A08();
                            } else if (A032 == 50) {
                                if ((this.A00 & 16) == 16) {
                                    r13 = (C76803f8) this.A06.AQb();
                                } else {
                                    r13 = null;
                                }
                                AnonymousClass0NI r03 = (AnonymousClass0NI) r102.A09(AnonymousClass0NI.A02.A0A(), r112);
                                this.A06 = r03;
                                if (r13 != null) {
                                    r13.A03(r03);
                                    this.A06 = (AnonymousClass0NI) r13.A00();
                                }
                                this.A00 |= 16;
                            } else if (A032 == 58) {
                                if ((this.A00 & 32) == 32) {
                                    r14 = (C76773f5) this.A04.AQb();
                                } else {
                                    r14 = null;
                                }
                                C76783f6 r04 = (C76783f6) r102.A09(C76783f6.A03.A0A(), r112);
                                this.A04 = r04;
                                if (r14 != null) {
                                    r14.A03(r04);
                                    this.A04 = (C76783f6) r14.A00();
                                }
                                this.A00 |= 32;
                            } else if (!A0G(A032, r102)) {
                            }
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r17 = new C04190Jk(e2.getMessage());
                        r17.unfinishedMessage = this;
                        throw new RuntimeException(r17);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A03).A00 = false;
                return null;
            case 4:
                return new AnonymousClass0NE();
            case 5:
                return new C76853fD();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (AnonymousClass0NE.class) {
                        if (A09 == null) {
                            A09 = new AnonymousClass275(A08);
                        }
                    }
                }
                return A09;
            default:
                throw new UnsupportedOperationException();
        }
        return A08;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            AnonymousClass0NB r0 = this.A07;
            if (r0 == null) {
                r0 = AnonymousClass0NB.A02;
            }
            i = AbstractC11750gu.A08(1, r0) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A03.size(); i3++) {
            i += AbstractC11750gu.A08(2, (AnonymousClass076) this.A03.get(i3));
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass0NJ r02 = this.A05;
            if (r02 == null) {
                r02 = AnonymousClass0NJ.A07;
            }
            i += AbstractC11750gu.A08(3, r02);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i += AbstractC11750gu.A07(4, this.A02);
        }
        if ((i4 & 8) == 8) {
            i += AbstractC11750gu.A07(5, this.A01);
        }
        if ((i4 & 16) == 16) {
            AnonymousClass0NI r03 = this.A06;
            if (r03 == null) {
                r03 = AnonymousClass0NI.A02;
            }
            i += AbstractC11750gu.A08(6, r03);
        }
        if ((this.A00 & 32) == 32) {
            C76783f6 r04 = this.A04;
            if (r04 == null) {
                r04 = C76783f6.A03;
            }
            i += AbstractC11750gu.A08(7, r04);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass0NB r0 = this.A07;
            if (r0 == null) {
                r0 = AnonymousClass0NB.A02;
            }
            r4.A0K(1, r0);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            r4.A0K(2, (AnonymousClass076) this.A03.get(i));
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass0NJ r02 = this.A05;
            if (r02 == null) {
                r02 = AnonymousClass0NJ.A07;
            }
            r4.A0K(3, r02);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0J(4, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0J(5, this.A01);
        }
        if ((this.A00 & 16) == 16) {
            AnonymousClass0NI r03 = this.A06;
            if (r03 == null) {
                r03 = AnonymousClass0NI.A02;
            }
            r4.A0K(6, r03);
        }
        if ((this.A00 & 32) == 32) {
            C76783f6 r04 = this.A04;
            if (r04 == null) {
                r04 = C76783f6.A03;
            }
            r4.A0K(7, r04);
        }
        this.unknownFields.A02(r4);
    }
}
