package X;

import java.io.IOException;

/* renamed from: X.0N8  reason: invalid class name */
public final class AnonymousClass0N8 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0N8 A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public AnonymousClass071 A02;
    public AnonymousClass071 A03;
    public C77303fw A04;

    static {
        AnonymousClass0N8 r0 = new AnonymousClass0N8();
        A05 = r0;
        r0.A0C();
    }

    public AnonymousClass0N8() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A02 = r0;
        this.A03 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r9, Object obj, Object obj2) {
        C76933fL r1;
        boolean z = false;
        switch (r9.ordinal()) {
            case 0:
                return A05;
            case 1:
                AbstractC05000Mr r10 = (AbstractC05000Mr) obj;
                AnonymousClass0N8 r11 = (AnonymousClass0N8) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                AnonymousClass071 r2 = this.A02;
                boolean z3 = false;
                if ((r11.A00 & 1) == 1) {
                    z3 = true;
                }
                this.A02 = r10.AR6(z2, r2, z3, r11.A02);
                this.A04 = (C77303fw) r10.ARD(this.A04, r11.A04);
                boolean z4 = false;
                if ((this.A00 & 4) == 4) {
                    z4 = true;
                }
                AnonymousClass071 r22 = this.A03;
                boolean z5 = false;
                if ((r11.A00 & 4) == 4) {
                    z5 = true;
                }
                this.A03 = r10.AR6(z4, r22, z5, r11.A03);
                int i = this.A00;
                boolean z6 = false;
                if ((i & 8) == 8) {
                    z6 = true;
                }
                int i2 = this.A01;
                int i3 = r11.A00;
                if ((i3 & 8) == 8) {
                    z = true;
                }
                this.A01 = r10.AR9(z6, i2, z, r11.A01);
                if (r10 == C04980Mp.A00) {
                    this.A00 = i | i3;
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
                                this.A00 |= 1;
                                this.A02 = r102.A08();
                            } else if (A032 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    r1 = (C76933fL) this.A04.AQb();
                                } else {
                                    r1 = null;
                                }
                                C77303fw r0 = (C77303fw) r102.A09(C77303fw.A0L.A0A(), r112);
                                this.A04 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A04 = (C77303fw) r1.A00();
                                }
                                this.A00 |= 2;
                            } else if (A032 == 26) {
                                this.A00 |= 4;
                                this.A03 = r102.A08();
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A01 = r102.A02();
                            } else if (!A0G(A032, r102)) {
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
                return null;
            case 4:
                return new AnonymousClass0N8();
            case 5:
                return new C76913fJ();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (AnonymousClass0N8.class) {
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

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A07(1, this.A02);
        }
        if ((i3 & 2) == 2) {
            C77303fw r0 = this.A04;
            if (r0 == null) {
                r0 = C77303fw.A0L;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A03);
        }
        if ((i4 & 8) == 8) {
            i2 += AbstractC11750gu.A03(4, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0J(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            C77303fw r0 = this.A04;
            if (r0 == null) {
                r0 = C77303fw.A0L;
            }
            r4.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0J(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0E(4, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
