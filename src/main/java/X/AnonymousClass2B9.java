package X;

import java.io.IOException;

/* renamed from: X.2B9  reason: invalid class name */
public final class AnonymousClass2B9 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass2B9 A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public int A01;
    public AnonymousClass071 A02;
    public AnonymousClass071 A03;

    static {
        AnonymousClass2B9 r0 = new AnonymousClass2B9();
        A04 = r0;
        r0.A0C();
    }

    public AnonymousClass2B9() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A03 = r0;
        this.A02 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r11, Object obj, Object obj2) {
        boolean z = false;
        switch (r11.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r12 = (AbstractC05000Mr) obj;
                AnonymousClass2B9 r13 = (AnonymousClass2B9) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A01;
                int i3 = r13.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r12.AR9(z2, i2, z3, r13.A01);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                AnonymousClass071 r2 = this.A03;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r12.AR6(z4, r2, z5, r13.A03);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                AnonymousClass071 r1 = this.A02;
                if ((r13.A00 & 4) == 4) {
                    z = true;
                }
                this.A02 = r12.AR6(z6, r1, z, r13.A02);
                if (r12 == C04980Mp.A00) {
                    this.A00 |= r13.A00;
                }
                return this;
            case 2:
                C05010Mt r122 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r122.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r122.A02();
                            } else if (A032 == 18) {
                                this.A00 |= 2;
                                this.A03 = r122.A08();
                            } else if (A032 == 26) {
                                this.A00 |= 4;
                                this.A02 = r122.A08();
                            } else if (!A0G(A032, r122)) {
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
                return new AnonymousClass2B9();
            case 5:
                return new C77663gn(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass2B9.class) {
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
            i2 += AbstractC11750gu.A07(2, this.A03);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A02);
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
            r3.A0J(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            r3.A0J(3, this.A02);
        }
        this.unknownFields.A02(r3);
    }
}
