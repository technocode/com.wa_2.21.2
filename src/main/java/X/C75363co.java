package X;

import java.io.IOException;

/* renamed from: X.3co  reason: invalid class name and case insensitive filesystem */
public final class C75363co extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75363co A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public C75343cm A02;
    public String A03 = "";
    public boolean A04;

    static {
        C75363co r0 = new C75363co();
        A05 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r10, Object obj, Object obj2) {
        C75333cl r1;
        boolean z = false;
        switch (r10.ordinal()) {
            case 0:
                return A05;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C75363co r12 = (C75363co) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                String str = this.A03;
                boolean z3 = false;
                if ((r12.A00 & 1) == 1) {
                    z3 = true;
                }
                this.A03 = r11.ARH(z2, str, z3, r12.A03);
                this.A02 = (C75343cm) r11.ARD(this.A02, r12.A02);
                int i = this.A00;
                boolean z4 = false;
                if ((i & 4) == 4) {
                    z4 = true;
                }
                int i2 = this.A01;
                int i3 = r12.A00;
                boolean z5 = false;
                if ((i3 & 4) == 4) {
                    z5 = true;
                }
                this.A01 = r11.AR9(z4, i2, z5, r12.A01);
                boolean z6 = false;
                if ((i & 8) == 8) {
                    z6 = true;
                }
                boolean z7 = this.A04;
                if ((i3 & 8) == 8) {
                    z = true;
                }
                this.A04 = r11.AR5(z6, z7, z, r12.A04);
                if (r11 == C04980Mp.A00) {
                    this.A00 = i | i3;
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
                                this.A03 = A0A;
                            } else if (A032 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    r1 = (C75333cl) this.A02.AQb();
                                } else {
                                    r1 = null;
                                }
                                C75343cm r0 = (C75343cm) r112.A09(C75343cm.A05.A0A(), r122);
                                this.A02 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A02 = (C75343cm) r1.A00();
                                }
                                this.A00 |= 2;
                            } else if (A032 == 24) {
                                int A022 = r112.A02();
                                if (EnumC449622i.A00(A022) == null) {
                                    super.A0D(3, A022);
                                } else {
                                    this.A00 |= 4;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A04 = r112.A0H();
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
                return new C75363co();
            case 5:
                return new C75353cn();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C75363co.class) {
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
        if ((this.A00 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A09(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            C75343cm r0 = this.A02;
            if (r0 == null) {
                r0 = C75343cm.A05;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A02(3, this.A01);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A00(4);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            C75343cm r0 = this.A02;
            if (r0 == null) {
                r0 = C75343cm.A05;
            }
            r4.A0K(2, r0);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0E(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0M(4, this.A04);
        }
        this.unknownFields.A02(r4);
    }
}
