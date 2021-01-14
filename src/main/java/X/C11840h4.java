package X;

import java.io.IOException;

/* renamed from: X.0h4  reason: invalid class name and case insensitive filesystem */
public final class C11840h4 extends AnonymousClass078 implements AnonymousClass077 {
    public static final C11840h4 A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;
    public AnonymousClass071 A03;

    static {
        C11840h4 r0 = new C11840h4();
        A04 = r0;
        r0.A0C();
    }

    public C11840h4() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A01 = r0;
        this.A03 = r0;
        this.A02 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r9, Object obj, Object obj2) {
        boolean z = false;
        switch (r9.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r10 = (AbstractC05000Mr) obj;
                C11840h4 r11 = (C11840h4) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                AnonymousClass071 r2 = this.A01;
                boolean z3 = false;
                if ((r11.A00 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r10.AR6(z2, r2, z3, r11.A01);
                boolean z4 = false;
                if ((this.A00 & 2) == 2) {
                    z4 = true;
                }
                AnonymousClass071 r22 = this.A03;
                boolean z5 = false;
                if ((r11.A00 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r10.AR6(z4, r22, z5, r11.A03);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                AnonymousClass071 r1 = this.A02;
                if ((r11.A00 & 4) == 4) {
                    z = true;
                }
                this.A02 = r10.AR6(z6, r1, z, r11.A02);
                if (r10 == C04980Mp.A00) {
                    this.A00 |= r11.A00;
                }
                return this;
            case 2:
                C05010Mt r102 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r102.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                this.A00 |= 1;
                                this.A01 = r102.A08();
                            } else if (A032 == 18) {
                                this.A00 |= 2;
                                this.A03 = r102.A08();
                            } else if (A032 == 26) {
                                this.A00 |= 4;
                                this.A02 = r102.A08();
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
                return new C11840h4();
            case 5:
                return new C11850h5();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C11840h4.class) {
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A01);
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
            r3.A0J(1, this.A01);
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
