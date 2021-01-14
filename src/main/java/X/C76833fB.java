package X;

import java.io.IOException;

/* renamed from: X.3fB  reason: invalid class name and case insensitive filesystem */
public final class C76833fB extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76833fB A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public int A01;
    public AnonymousClass0ND A02;

    static {
        C76833fB r0 = new C76833fB();
        A03 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r7, Object obj, Object obj2) {
        EnumC69973Jg r0;
        C76863fE r1;
        boolean z = false;
        switch (r7.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                C76833fB r9 = (C76833fB) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                int i = this.A01;
                if ((r9.A00 & 1) == 1) {
                    z = true;
                }
                this.A01 = r8.AR9(z2, i, z, r9.A01);
                this.A02 = (AnonymousClass0ND) r8.ARD(this.A02, r9.A02);
                if (r8 == C04980Mp.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C05010Mt r82 = (C05010Mt) obj;
                AnonymousClass1FL r92 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r82.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                int A022 = r82.A02();
                                if (A022 == 0) {
                                    r0 = EnumC69973Jg.SET;
                                } else if (A022 != 1) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC69973Jg.REMOVE;
                                }
                                if (r0 == null) {
                                    super.A0D(1, A022);
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    r1 = (C76863fE) this.A02.AQb();
                                } else {
                                    r1 = null;
                                }
                                AnonymousClass0ND r02 = (AnonymousClass0ND) r82.A09(AnonymousClass0ND.A04.A0A(), r92);
                                this.A02 = r02;
                                if (r1 != null) {
                                    r1.A03(r02);
                                    this.A02 = (AnonymousClass0ND) r1.A00();
                                }
                                this.A00 |= 2;
                            } else if (!A0G(A032, r82)) {
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
                return new C76833fB();
            case 5:
                return new C76823fA();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C76833fB.class) {
                        if (A04 == null) {
                            A04 = new AnonymousClass275(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
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
            i2 = 0 + AbstractC11750gu.A02(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            AnonymousClass0ND r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass0ND.A04;
            }
            i2 += AbstractC11750gu.A08(2, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0E(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass0ND r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass0ND.A04;
            }
            r3.A0K(2, r0);
        }
        this.unknownFields.A02(r3);
    }
}
