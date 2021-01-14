package X;

import java.io.IOException;

/* renamed from: X.0h6  reason: invalid class name and case insensitive filesystem */
public final class C11860h6 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C11860h6 A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public C77413g7 A01;
    public C11840h4 A02;
    public C77433g9 A03;

    static {
        C11860h6 r0 = new C11860h6();
        A04 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r7, Object obj, Object obj2) {
        C11850h5 r1;
        C77423g8 r12;
        C77403g6 r13;
        switch (r7.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                C11860h6 r9 = (C11860h6) obj2;
                this.A02 = (C11840h4) r8.ARD(this.A02, r9.A02);
                this.A03 = (C77433g9) r8.ARD(this.A03, r9.A03);
                this.A01 = (C77413g7) r8.ARD(this.A01, r9.A01);
                if (r8 == C04980Mp.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C05010Mt r82 = (C05010Mt) obj;
                AnonymousClass1FL r92 = (AnonymousClass1FL) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int A032 = r82.A03();
                        if (A032 != 0) {
                            if (A032 == 18) {
                                if ((this.A00 & 1) == 1) {
                                    r1 = (C11850h5) this.A02.AQb();
                                } else {
                                    r1 = null;
                                }
                                C11840h4 r0 = (C11840h4) r82.A09(C11840h4.A04.A0A(), r92);
                                this.A02 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A02 = (C11840h4) r1.A00();
                                }
                                this.A00 |= 1;
                            } else if (A032 == 26) {
                                if ((this.A00 & 2) == 2) {
                                    r12 = (C77423g8) this.A03.AQb();
                                } else {
                                    r12 = null;
                                }
                                C77433g9 r02 = (C77433g9) r82.A09(C77433g9.A04.A0A(), r92);
                                this.A03 = r02;
                                if (r12 != null) {
                                    r12.A03(r02);
                                    this.A03 = (C77433g9) r12.A00();
                                }
                                this.A00 |= 2;
                            } else if (A032 == 34) {
                                if ((this.A00 & 4) == 4) {
                                    r13 = (C77403g6) this.A01.AQb();
                                } else {
                                    r13 = null;
                                }
                                C77413g7 r03 = (C77413g7) r82.A09(C77413g7.A03.A0A(), r92);
                                this.A01 = r03;
                                if (r13 != null) {
                                    r13.A03(r03);
                                    this.A01 = (C77413g7) r13.A00();
                                }
                                this.A00 |= 4;
                            } else if (!A0G(A032, r82)) {
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
                return new C11860h6();
            case 5:
                return new C11870h7();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C11860h6.class) {
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
        if ((this.A00 & 1) == 1) {
            C11840h4 r0 = this.A02;
            if (r0 == null) {
                r0 = C11840h4.A04;
            }
            i2 = 0 + AbstractC11750gu.A08(2, r0);
        }
        if ((this.A00 & 2) == 2) {
            C77433g9 r02 = this.A03;
            if (r02 == null) {
                r02 = C77433g9.A04;
            }
            i2 += AbstractC11750gu.A08(3, r02);
        }
        if ((this.A00 & 4) == 4) {
            C77413g7 r03 = this.A01;
            if (r03 == null) {
                r03 = C77413g7.A03;
            }
            i2 += AbstractC11750gu.A08(4, r03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            C11840h4 r0 = this.A02;
            if (r0 == null) {
                r0 = C11840h4.A04;
            }
            r4.A0K(2, r0);
        }
        if ((this.A00 & 2) == 2) {
            C77433g9 r02 = this.A03;
            if (r02 == null) {
                r02 = C77433g9.A04;
            }
            r4.A0K(3, r02);
        }
        if ((this.A00 & 4) == 4) {
            C77413g7 r03 = this.A01;
            if (r03 == null) {
                r03 = C77413g7.A03;
            }
            r4.A0K(4, r03);
        }
        this.unknownFields.A02(r4);
    }
}
