package X;

import java.io.IOException;

/* renamed from: X.2B5  reason: invalid class name */
public final class AnonymousClass2B5 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass2B5 A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public int A01;
    public AnonymousClass2B6 A02;
    public AnonymousClass2B6 A03;

    static {
        AnonymousClass2B5 r0 = new AnonymousClass2B5();
        A04 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r7, Object obj, Object obj2) {
        C77533ga r1;
        C77533ga r12;
        switch (r7.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                AnonymousClass2B5 r9 = (AnonymousClass2B5) obj2;
                boolean z = true;
                if ((this.A00 & 1) != 1) {
                    z = false;
                }
                int i = this.A01;
                boolean z2 = true;
                if ((r9.A00 & 1) != 1) {
                    z2 = false;
                }
                this.A01 = r8.AR9(z, i, z2, r9.A01);
                this.A02 = (AnonymousClass2B6) r8.ARD(this.A02, r9.A02);
                this.A03 = (AnonymousClass2B6) r8.ARD(this.A03, r9.A03);
                if (r8 == C04980Mp.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C05010Mt r82 = (C05010Mt) obj;
                AnonymousClass1FL r92 = (AnonymousClass1FL) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int A032 = r82.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r82.A02();
                            } else if (A032 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    r1 = (C77533ga) this.A02.AQb();
                                } else {
                                    r1 = null;
                                }
                                AnonymousClass2B6 r0 = (AnonymousClass2B6) r82.A09(AnonymousClass2B6.A03.A0A(), r92);
                                this.A02 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A02 = (AnonymousClass2B6) r1.A00();
                                }
                                this.A00 |= 2;
                            } else if (A032 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    r12 = (C77533ga) this.A03.AQb();
                                } else {
                                    r12 = null;
                                }
                                AnonymousClass2B6 r02 = (AnonymousClass2B6) r82.A09(AnonymousClass2B6.A03.A0A(), r92);
                                this.A03 = r02;
                                if (r12 != null) {
                                    r12.A03(r02);
                                    this.A03 = (AnonymousClass2B6) r12.A00();
                                }
                                this.A00 |= 4;
                            } else if (!A0G(A032, r82)) {
                            }
                        }
                        z3 = true;
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
                return null;
            case 4:
                return new AnonymousClass2B5();
            case 5:
                return new C77523gZ(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass2B5.class) {
                        if (A05 == null) {
                            A05 = new AnonymousClass275(A04);
                        }
                    }
                }
                return A05;
            default:
                throw new UnsupportedOperationException();
        }
        return A04;
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
            i2 = 0 + AbstractC11750gu.A04(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            AnonymousClass2B6 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass2B6.A03;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass2B6 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass2B6.A03;
            }
            i2 += AbstractC11750gu.A08(3, r02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0F(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass2B6 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass2B6.A03;
            }
            r3.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            AnonymousClass2B6 r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass2B6.A03;
            }
            r3.A0K(3, r02);
        }
        this.unknownFields.A02(r3);
    }
}
