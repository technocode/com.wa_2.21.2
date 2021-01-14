package X;

import java.io.IOException;

/* renamed from: X.2B6  reason: invalid class name */
public final class AnonymousClass2B6 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass2B6 A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;

    static {
        AnonymousClass2B6 r0 = new AnonymousClass2B6();
        A03 = r0;
        r0.A0C();
    }

    public AnonymousClass2B6() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A01 = r0;
        this.A02 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r8, Object obj, Object obj2) {
        boolean z = false;
        switch (r8.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r9 = (AbstractC05000Mr) obj;
                AnonymousClass2B6 r10 = (AnonymousClass2B6) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                AnonymousClass071 r2 = this.A01;
                boolean z3 = false;
                if ((r10.A00 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r9.AR6(z2, r2, z3, r10.A01);
                boolean z4 = false;
                if ((this.A00 & 2) == 2) {
                    z4 = true;
                }
                AnonymousClass071 r1 = this.A02;
                if ((r10.A00 & 2) == 2) {
                    z = true;
                }
                this.A02 = r9.AR6(z4, r1, z, r10.A02);
                if (r9 == C04980Mp.A00) {
                    this.A00 |= r10.A00;
                }
                return this;
            case 2:
                C05010Mt r92 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r92.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                this.A00 |= 1;
                                this.A01 = r92.A08();
                            } else if (A032 == 18) {
                                this.A00 |= 2;
                                this.A02 = r92.A08();
                            } else if (!A0G(A032, r92)) {
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
                return new AnonymousClass2B6();
            case 5:
                return new C77533ga(null);
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (AnonymousClass2B6.class) {
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0J(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0J(2, this.A02);
        }
        this.unknownFields.A02(r3);
    }
}
