package X;

import java.io.IOException;

/* renamed from: X.3Cd  reason: invalid class name */
public final class AnonymousClass3Cd extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass3Cd A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;
    public AbstractC04120Jd A03 = C05030Mw.A01;
    public C77803h1 A04;

    static {
        AnonymousClass3Cd r0 = new AnonymousClass3Cd();
        A05 = r0;
        r0.A0C();
    }

    public AnonymousClass3Cd() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A02 = r0;
        this.A01 = r0;
    }

    public static void A08(AnonymousClass3Cd r1, C77803h1 r2) {
        if (r2 != null) {
            r1.A04 = r2;
            r1.A00 |= 4;
            return;
        }
        throw null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r8, Object obj, Object obj2) {
        C77793h0 r2;
        boolean z = false;
        switch (r8.ordinal()) {
            case 0:
                return A05;
            case 1:
                AbstractC05000Mr r9 = (AbstractC05000Mr) obj;
                AnonymousClass3Cd r10 = (AnonymousClass3Cd) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                AnonymousClass071 r22 = this.A02;
                boolean z3 = false;
                if ((r10.A00 & 1) == 1) {
                    z3 = true;
                }
                this.A02 = r9.AR6(z2, r22, z3, r10.A02);
                boolean z4 = false;
                if ((this.A00 & 2) == 2) {
                    z4 = true;
                }
                AnonymousClass071 r1 = this.A01;
                if ((r10.A00 & 2) == 2) {
                    z = true;
                }
                this.A01 = r9.AR6(z4, r1, z, r10.A01);
                this.A04 = (C77803h1) r9.ARD(this.A04, r10.A04);
                this.A03 = r9.ARB(this.A03, r10.A03);
                if (r9 == C04980Mp.A00) {
                    this.A00 |= r10.A00;
                }
                return this;
            case 2:
                C05010Mt r92 = (C05010Mt) obj;
                AnonymousClass1FL r102 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r92.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                this.A00 |= 1;
                                this.A02 = r92.A08();
                            } else if (A032 == 18) {
                                this.A00 |= 2;
                                this.A01 = r92.A08();
                            } else if (A032 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    r2 = (C77793h0) this.A04.AQb();
                                } else {
                                    r2 = null;
                                }
                                C77803h1 r0 = (C77803h1) r92.A09(C77803h1.A03.A0A(), r102);
                                this.A04 = r0;
                                if (r2 != null) {
                                    r2.A03(r0);
                                    this.A04 = (C77803h1) r2.A00();
                                }
                                this.A00 |= 4;
                            } else if (A032 == 34) {
                                AbstractC04120Jd r3 = this.A03;
                                AbstractC04120Jd r23 = r3;
                                if (!((AbstractC05040Mx) r3).A00) {
                                    r23 = AnonymousClass078.A04(r3);
                                    this.A03 = r23;
                                }
                                r23.add(r92.A09(C77823h3.A05.A0A(), r102));
                            } else if (!A0G(A032, r92)) {
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
                return new AnonymousClass3Cd();
            case 5:
                return new C77783gz(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (AnonymousClass3Cd.class) {
                        if (A06 == null) {
                            A06 = new AnonymousClass275(A05);
                        }
                    }
                }
                return A06;
            default:
                throw new UnsupportedOperationException();
        }
        return A05;
    }

    public final void A0I() {
        AbstractC04120Jd r1 = this.A03;
        if (!((AbstractC05040Mx) r1).A00) {
            this.A03 = AnonymousClass078.A04(r1);
        }
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
            i = AbstractC11750gu.A07(1, this.A02) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += AbstractC11750gu.A07(2, this.A01);
        }
        if ((i3 & 4) == 4) {
            C77803h1 r0 = this.A04;
            if (r0 == null) {
                r0 = C77803h1.A03;
            }
            i += AbstractC11750gu.A08(3, r0);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            i += AbstractC11750gu.A08(4, (AnonymousClass076) this.A03.get(i4));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0J(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0J(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            C77803h1 r0 = this.A04;
            if (r0 == null) {
                r0 = C77803h1.A03;
            }
            r4.A0K(3, r0);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            r4.A0K(4, (AnonymousClass076) this.A03.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
