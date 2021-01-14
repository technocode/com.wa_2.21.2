package X;

import java.io.IOException;

/* renamed from: X.3eV  reason: invalid class name and case insensitive filesystem */
public final class C76413eV extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76413eV A09;
    public static volatile AbstractC37151nd A0A;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C75623dE A04;
    public C75643dG A05;
    public C76123e2 A06;
    public C76163e6 A07;
    public AnonymousClass0N3 A08;

    static {
        C76413eV r0 = new C76413eV();
        A09 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r20, Object obj, Object obj2) {
        AnonymousClass0NK r1;
        C76113e1 r12;
        C75633dF r13;
        C75613dD r14;
        C76153e5 r15;
        boolean z = false;
        switch (r20.ordinal()) {
            case 0:
                return A09;
            case 1:
                AbstractC05000Mr r122 = (AbstractC05000Mr) obj;
                C76413eV r3 = (C76413eV) obj2;
                this.A08 = (AnonymousClass0N3) r122.ARD(this.A08, r3.A08);
                int i = this.A00;
                boolean z2 = false;
                if ((i & 2) == 2) {
                    z2 = true;
                }
                int i2 = this.A02;
                int i3 = r3.A00;
                boolean z3 = false;
                if ((i3 & 2) == 2) {
                    z3 = true;
                }
                this.A02 = r122.AR9(z2, i2, z3, r3.A02);
                boolean z4 = false;
                if ((i & 4) == 4) {
                    z4 = true;
                }
                int i4 = this.A01;
                boolean z5 = false;
                if ((i3 & 4) == 4) {
                    z5 = true;
                }
                this.A01 = r122.AR9(z4, i4, z5, r3.A01);
                boolean z6 = false;
                if ((i & 8) == 8) {
                    z6 = true;
                }
                long j = this.A03;
                boolean z7 = false;
                if ((i3 & 8) == 8) {
                    z7 = true;
                }
                this.A03 = r122.ARC(z6, j, z7, r3.A03);
                this.A06 = (C76123e2) r122.ARD(this.A06, r3.A06);
                this.A05 = (C75643dG) r122.ARD(this.A05, r3.A05);
                this.A04 = (C75623dE) r122.ARD(this.A04, r3.A04);
                this.A07 = (C76163e6) r122.ARD(this.A07, r3.A07);
                if (r122 == C04980Mp.A00) {
                    this.A00 |= r3.A00;
                }
                return this;
            case 2:
                C05010Mt r123 = (C05010Mt) obj;
                AnonymousClass1FL r32 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r123.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    r1 = (AnonymousClass0NK) this.A08.AQb();
                                } else {
                                    r1 = null;
                                }
                                AnonymousClass0N3 r0 = (AnonymousClass0N3) r123.A09(AnonymousClass0N3.A05.A0A(), r32);
                                this.A08 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A08 = (AnonymousClass0N3) r1.A00();
                                }
                                this.A00 |= 1;
                            } else if (A032 == 16) {
                                int A022 = r123.A02();
                                if (AnonymousClass3JY.A00(A022) == null) {
                                    super.A0D(2, A022);
                                } else {
                                    this.A00 |= 2;
                                    this.A02 = A022;
                                }
                            } else if (A032 == 32) {
                                this.A00 |= 4;
                                this.A01 = r123.A02();
                            } else if (A032 == 40) {
                                this.A00 |= 8;
                                this.A03 = r123.A06();
                            } else if (A032 == 50) {
                                if ((this.A00 & 16) == 16) {
                                    r12 = (C76113e1) this.A06.AQb();
                                } else {
                                    r12 = null;
                                }
                                C76123e2 r02 = (C76123e2) r123.A09(C76123e2.A09.A0A(), r32);
                                this.A06 = r02;
                                if (r12 != null) {
                                    r12.A03(r02);
                                    this.A06 = (C76123e2) r12.A00();
                                }
                                this.A00 |= 16;
                            } else if (A032 == 58) {
                                if ((this.A00 & 32) == 32) {
                                    r13 = (C75633dF) this.A05.AQb();
                                } else {
                                    r13 = null;
                                }
                                C75643dG r03 = (C75643dG) r123.A09(C75643dG.A01.A0A(), r32);
                                this.A05 = r03;
                                if (r13 != null) {
                                    r13.A03(r03);
                                    this.A05 = (C75643dG) r13.A00();
                                }
                                this.A00 |= 32;
                            } else if (A032 == 66) {
                                if ((this.A00 & 64) == 64) {
                                    r14 = (C75613dD) this.A04.AQb();
                                } else {
                                    r14 = null;
                                }
                                C75623dE r04 = (C75623dE) r123.A09(C75623dE.A01.A0A(), r32);
                                this.A04 = r04;
                                if (r14 != null) {
                                    r14.A03(r04);
                                    this.A04 = (C75623dE) r14.A00();
                                }
                                this.A00 |= 64;
                            } else if (A032 == 74) {
                                if ((this.A00 & 128) == 128) {
                                    r15 = (C76153e5) this.A07.AQb();
                                } else {
                                    r15 = null;
                                }
                                C76163e6 r05 = (C76163e6) r123.A09(C76163e6.A02.A0A(), r32);
                                this.A07 = r05;
                                if (r15 != null) {
                                    r15.A03(r05);
                                    this.A07 = (C76163e6) r15.A00();
                                }
                                this.A00 |= 128;
                            } else if (!A0G(A032, r123)) {
                            }
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r16 = new C04190Jk(e2.getMessage());
                        r16.unfinishedMessage = this;
                        throw new RuntimeException(r16);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C76413eV();
            case 5:
                return new C76403eU();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C76413eV.class) {
                        if (A0A == null) {
                            A0A = new AnonymousClass275(A09);
                        }
                    }
                }
                return A0A;
            default:
                throw new UnsupportedOperationException();
        }
        return A09;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            AnonymousClass0N3 r0 = this.A08;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A02(2, this.A02);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A04(4, this.A01);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A05(5, this.A03);
        }
        if ((i3 & 16) == 16) {
            C76123e2 r02 = this.A06;
            if (r02 == null) {
                r02 = C76123e2.A09;
            }
            i2 += AbstractC11750gu.A08(6, r02);
        }
        if ((this.A00 & 32) == 32) {
            C75643dG r03 = this.A05;
            if (r03 == null) {
                r03 = C75643dG.A01;
            }
            i2 += AbstractC11750gu.A08(7, r03);
        }
        if ((this.A00 & 64) == 64) {
            C75623dE r04 = this.A04;
            if (r04 == null) {
                r04 = C75623dE.A01;
            }
            i2 += AbstractC11750gu.A08(8, r04);
        }
        if ((this.A00 & 128) == 128) {
            C76163e6 r05 = this.A07;
            if (r05 == null) {
                r05 = C76163e6.A02;
            }
            i2 += AbstractC11750gu.A08(9, r05);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass0N3 r0 = this.A08;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            r5.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0E(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0F(4, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0I(5, this.A03);
        }
        if ((this.A00 & 16) == 16) {
            C76123e2 r02 = this.A06;
            if (r02 == null) {
                r02 = C76123e2.A09;
            }
            r5.A0K(6, r02);
        }
        if ((this.A00 & 32) == 32) {
            C75643dG r03 = this.A05;
            if (r03 == null) {
                r03 = C75643dG.A01;
            }
            r5.A0K(7, r03);
        }
        if ((this.A00 & 64) == 64) {
            C75623dE r04 = this.A04;
            if (r04 == null) {
                r04 = C75623dE.A01;
            }
            r5.A0K(8, r04);
        }
        if ((this.A00 & 128) == 128) {
            C76163e6 r05 = this.A07;
            if (r05 == null) {
                r05 = C76163e6.A02;
            }
            r5.A0K(9, r05);
        }
        this.unknownFields.A02(r5);
    }
}
