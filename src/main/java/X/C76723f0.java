package X;

import java.io.IOException;

/* renamed from: X.3f0  reason: invalid class name and case insensitive filesystem */
public final class C76723f0 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76723f0 A08;
    public static volatile AbstractC37151nd A09;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AbstractC04120Jd A05;
    public AbstractC04120Jd A06;
    public AbstractC04120Jd A07;

    static {
        C76723f0 r0 = new C76723f0();
        A08 = r0;
        r0.A0C();
    }

    public C76723f0() {
        C05030Mw r0 = C05030Mw.A01;
        this.A05 = r0;
        this.A07 = r0;
        this.A06 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r10, Object obj, Object obj2) {
        EnumC69963Jf r0;
        boolean z = false;
        switch (r10.ordinal()) {
            case 0:
                byte b = this.A00;
                if (b == 1) {
                    return A08;
                }
                if (b == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z2 = false;
                if ((this.A01 & 1) == 1) {
                    z2 = true;
                }
                if (!z2) {
                    if (booleanValue) {
                        this.A00 = 0;
                    }
                    return null;
                }
                for (int i = 0; i < this.A05.size(); i++) {
                    if (!((AnonymousClass078) this.A05.get(i)).A0F()) {
                        if (booleanValue) {
                            this.A00 = 0;
                        }
                        return null;
                    }
                }
                for (int i2 = 0; i2 < this.A07.size(); i2++) {
                    if (!((AnonymousClass078) this.A07.get(i2)).A0F()) {
                        if (booleanValue) {
                            this.A00 = 0;
                        }
                        return null;
                    }
                }
                if (booleanValue) {
                    this.A00 = 1;
                }
                return A08;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C76723f0 r12 = (C76723f0) obj2;
                boolean z3 = false;
                if ((this.A01 & 1) == 1) {
                    z3 = true;
                }
                int i3 = this.A04;
                boolean z4 = false;
                if ((r12.A01 & 1) == 1) {
                    z4 = true;
                }
                this.A04 = r11.AR9(z3, i3, z4, r12.A04);
                this.A05 = r11.ARB(this.A05, r12.A05);
                this.A07 = r11.ARB(this.A07, r12.A07);
                int i4 = this.A01;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                int i5 = this.A02;
                int i6 = r12.A01;
                boolean z6 = false;
                if ((i6 & 2) == 2) {
                    z6 = true;
                }
                this.A02 = r11.AR9(z5, i5, z6, r12.A02);
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                int i7 = this.A03;
                if ((i6 & 4) == 4) {
                    z = true;
                }
                this.A03 = r11.AR9(z7, i7, z, r12.A03);
                this.A06 = r11.ARB(this.A06, r12.A06);
                if (r11 == C04980Mp.A00) {
                    this.A01 |= r12.A01;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                AnonymousClass1FL r122 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r112.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                int A022 = r112.A02();
                                if (A022 == 0) {
                                    r0 = EnumC69963Jf.INITIAL_BOOTSTRAP;
                                } else if (A022 == 1) {
                                    r0 = EnumC69963Jf.INITIAL_STATUS_V3;
                                } else if (A022 == 2) {
                                    r0 = EnumC69963Jf.FULL;
                                } else if (A022 == 3) {
                                    r0 = EnumC69963Jf.RECENT;
                                } else if (A022 != 4) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC69963Jf.PUSH_NAME;
                                }
                                if (r0 == null) {
                                    super.A0D(1, A022);
                                } else {
                                    this.A01 |= 1;
                                    this.A04 = A022;
                                }
                            } else if (A032 == 18) {
                                AbstractC04120Jd r1 = this.A05;
                                if (!((AbstractC05040Mx) r1).A00) {
                                    r1 = AnonymousClass078.A04(r1);
                                    this.A05 = r1;
                                }
                                r1.add(r112.A09(C76703ey.A0E.A0A(), r122));
                            } else if (A032 == 26) {
                                AbstractC04120Jd r13 = this.A07;
                                if (!((AbstractC05040Mx) r13).A00) {
                                    r13 = AnonymousClass078.A04(r13);
                                    this.A07 = r13;
                                }
                                r13.add(r112.A09(AnonymousClass0Ms.A0T.A0A(), r122));
                            } else if (A032 == 40) {
                                this.A01 |= 2;
                                this.A02 = r112.A02();
                            } else if (A032 == 48) {
                                this.A01 |= 4;
                                this.A03 = r112.A02();
                            } else if (A032 == 58) {
                                AbstractC04120Jd r4 = this.A06;
                                AbstractC04120Jd r14 = r4;
                                if (!((AbstractC05040Mx) r4).A00) {
                                    r14 = AnonymousClass078.A04(r4);
                                    this.A06 = r14;
                                }
                                r14.add(r112.A09(C76763f4.A03.A0A(), r122));
                            } else if (!A0G(A032, r112)) {
                            }
                        }
                        z = true;
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
                ((AbstractC05040Mx) this.A05).A00 = false;
                ((AbstractC05040Mx) this.A07).A00 = false;
                ((AbstractC05040Mx) this.A06).A00 = false;
                return null;
            case 4:
                return new C76723f0();
            case 5:
                return new C76713ez();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C76723f0.class) {
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
        if ((this.A01 & 1) == 1) {
            i = AbstractC11750gu.A02(1, this.A04) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A05.size(); i3++) {
            i += AbstractC11750gu.A08(2, (AnonymousClass076) this.A05.get(i3));
        }
        for (int i4 = 0; i4 < this.A07.size(); i4++) {
            i += AbstractC11750gu.A08(3, (AnonymousClass076) this.A07.get(i4));
        }
        int i5 = this.A01;
        if ((i5 & 2) == 2) {
            i += AbstractC11750gu.A04(5, this.A02);
        }
        if ((i5 & 4) == 4) {
            i += AbstractC11750gu.A04(6, this.A03);
        }
        for (int i6 = 0; i6 < this.A06.size(); i6++) {
            i += AbstractC11750gu.A08(7, (AnonymousClass076) this.A06.get(i6));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r6) {
        if ((this.A01 & 1) == 1) {
            r6.A0E(1, this.A04);
        }
        for (int i = 0; i < this.A05.size(); i++) {
            r6.A0K(2, (AnonymousClass076) this.A05.get(i));
        }
        for (int i2 = 0; i2 < this.A07.size(); i2++) {
            r6.A0K(3, (AnonymousClass076) this.A07.get(i2));
        }
        if ((this.A01 & 2) == 2) {
            r6.A0F(5, this.A02);
        }
        if ((this.A01 & 4) == 4) {
            r6.A0F(6, this.A03);
        }
        for (int i3 = 0; i3 < this.A06.size(); i3++) {
            r6.A0K(7, (AnonymousClass076) this.A06.get(i3));
        }
        this.unknownFields.A02(r6);
    }
}
