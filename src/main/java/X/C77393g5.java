package X;

import java.io.IOException;

/* renamed from: X.3g5  reason: invalid class name and case insensitive filesystem */
public final class C77393g5 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77393g5 A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public C77383g4 A01;
    public String A02 = "";
    public String A03 = "";

    static {
        C77393g5 r0 = new C77393g5();
        A04 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r10, Object obj, Object obj2) {
        C77373g3 r1;
        boolean z = false;
        switch (r10.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C77393g5 r12 = (C77393g5) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A02;
                int i2 = r12.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A02 = r11.ARH(z2, str, z3, r12.A02);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A03;
                if ((i2 & 2) == 2) {
                    z = true;
                }
                this.A03 = r11.ARH(z4, str2, z, r12.A03);
                this.A01 = (C77383g4) r11.ARD(this.A01, r12.A01);
                if (r11 == C04980Mp.A00) {
                    this.A00 |= r12.A00;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                AnonymousClass1FL r122 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r112.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = r112.A0A();
                                this.A00 |= 1;
                                this.A02 = A0A;
                            } else if (A032 == 18) {
                                String A0A2 = r112.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A2;
                            } else if (A032 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    r1 = (C77373g3) this.A01.AQb();
                                } else {
                                    r1 = null;
                                }
                                C77383g4 r0 = (C77383g4) r112.A09(C77383g4.A0C.A0A(), r122);
                                this.A01 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A01 = (C77383g4) r1.A00();
                                }
                                this.A00 |= 4;
                            } else if (!A0G(A032, r112)) {
                            }
                        }
                        z = true;
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
                return new C77393g5();
            case 5:
                return new C77363g2();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C77393g5.class) {
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
            i2 = 0 + AbstractC11750gu.A09(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            C77383g4 r0 = this.A01;
            if (r0 == null) {
                r0 = C77383g4.A0C;
            }
            i2 += AbstractC11750gu.A08(3, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0L(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0L(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            C77383g4 r0 = this.A01;
            if (r0 == null) {
                r0 = C77383g4.A0C;
            }
            r3.A0K(3, r0);
        }
        this.unknownFields.A02(r3);
    }
}
