package X;

import java.io.IOException;

/* renamed from: X.3eI  reason: invalid class name and case insensitive filesystem */
public final class C76283eI extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76283eI A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public int A01;
    public C75423cu A02;
    public C76273eH A03;
    public String A04 = "";
    public String A05 = "";

    static {
        C76283eI r0 = new C76283eI();
        A06 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r11, Object obj, Object obj2) {
        AnonymousClass3JV r0;
        C76263eG r1;
        C75393cr r12;
        boolean z = false;
        switch (r11.ordinal()) {
            case 0:
                return A06;
            case 1:
                AbstractC05000Mr r122 = (AbstractC05000Mr) obj;
                C76283eI r13 = (C76283eI) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A05;
                int i2 = r13.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A05 = r122.ARH(z2, str, z3, r13.A05);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                int i3 = this.A01;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A01 = r122.AR9(z4, i3, z5, r13.A01);
                this.A03 = (C76273eH) r122.ARD(this.A03, r13.A03);
                this.A02 = (C75423cu) r122.ARD(this.A02, r13.A02);
                int i4 = this.A00;
                boolean z6 = false;
                if ((i4 & 16) == 16) {
                    z6 = true;
                }
                String str2 = this.A04;
                int i5 = r13.A00;
                if ((i5 & 16) == 16) {
                    z = true;
                }
                this.A04 = r122.ARH(z6, str2, z, r13.A04);
                if (r122 == C04980Mp.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C05010Mt r123 = (C05010Mt) obj;
                AnonymousClass1FL r132 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r123.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = r123.A0A();
                                this.A00 |= 1;
                                this.A05 = A0A;
                            } else if (A032 == 16) {
                                int A022 = r123.A02();
                                if (A022 == 0) {
                                    r0 = AnonymousClass3JV.UNKNOWN;
                                } else if (A022 != 1) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JV.SINGLE_SELECT;
                                }
                                if (r0 == null) {
                                    super.A0D(2, A022);
                                } else {
                                    this.A00 |= 2;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    r1 = (C76263eG) this.A03.AQb();
                                } else {
                                    r1 = null;
                                }
                                C76273eH r02 = (C76273eH) r123.A09(C76273eH.A02.A0A(), r132);
                                this.A03 = r02;
                                if (r1 != null) {
                                    r1.A03(r02);
                                    this.A03 = (C76273eH) r1.A00();
                                }
                                this.A00 |= 4;
                            } else if (A032 == 34) {
                                if ((this.A00 & 8) == 8) {
                                    r12 = (C75393cr) this.A02.AQb();
                                } else {
                                    r12 = null;
                                }
                                C75423cu r03 = (C75423cu) r123.A09(C75423cu.A0H.A0A(), r132);
                                this.A02 = r03;
                                if (r12 != null) {
                                    r12.A03(r03);
                                    this.A02 = (C75423cu) r12.A00();
                                }
                                this.A00 |= 8;
                            } else if (A032 == 42) {
                                String A0A2 = r123.A0A();
                                this.A00 |= 16;
                                this.A04 = A0A2;
                            } else if (!A0G(A032, r123)) {
                            }
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r14 = new C04190Jk(e2.getMessage());
                        r14.unfinishedMessage = this;
                        throw new RuntimeException(r14);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C76283eI();
            case 5:
                return new C76253eF();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C76283eI.class) {
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
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A05);
        }
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A02(2, this.A01);
        }
        if ((i3 & 4) == 4) {
            C76273eH r0 = this.A03;
            if (r0 == null) {
                r0 = C76273eH.A02;
            }
            i2 += AbstractC11750gu.A08(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            C75423cu r02 = this.A02;
            if (r02 == null) {
                r02 = C75423cu.A0H;
            }
            i2 += AbstractC11750gu.A08(4, r02);
        }
        if ((this.A00 & 16) == 16) {
            i2 += AbstractC11750gu.A09(5, this.A04);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A05);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0E(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            C76273eH r0 = this.A03;
            if (r0 == null) {
                r0 = C76273eH.A02;
            }
            r4.A0K(3, r0);
        }
        if ((this.A00 & 8) == 8) {
            C75423cu r02 = this.A02;
            if (r02 == null) {
                r02 = C75423cu.A0H;
            }
            r4.A0K(4, r02);
        }
        if ((this.A00 & 16) == 16) {
            r4.A0L(5, this.A04);
        }
        this.unknownFields.A02(r4);
    }
}
