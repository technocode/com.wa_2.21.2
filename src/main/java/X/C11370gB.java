package X;

import java.io.IOException;

/* renamed from: X.0gB  reason: invalid class name and case insensitive filesystem */
public final class C11370gB extends AnonymousClass078 implements AnonymousClass077 {
    public static final C11370gB A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    static {
        C11370gB r0 = new C11370gB();
        A05 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r12, Object obj, Object obj2) {
        boolean z = false;
        switch (r12.ordinal()) {
            case 0:
                return A05;
            case 1:
                AbstractC05000Mr r13 = (AbstractC05000Mr) obj;
                C11370gB r14 = (C11370gB) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A01;
                int i3 = r14.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r13.AR9(z2, i2, z3, r14.A01);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                int i4 = this.A03;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r13.AR9(z4, i4, z5, r14.A03);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                int i5 = this.A04;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A04 = r13.AR9(z6, i5, z7, r14.A04);
                boolean z8 = false;
                if ((i & 8) == 8) {
                    z8 = true;
                }
                int i6 = this.A02;
                if ((i3 & 8) == 8) {
                    z = true;
                }
                this.A02 = r13.AR9(z8, i6, z, r14.A02);
                if (r13 == C04980Mp.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C05010Mt r132 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r132.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r132.A02();
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A03 = r132.A02();
                            } else if (A032 == 24) {
                                this.A00 |= 4;
                                this.A04 = r132.A02();
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A02 = r132.A02();
                            } else if (!A0G(A032, r132)) {
                            }
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r1 = new C04190Jk(e2.getMessage());
                        r1.unfinishedMessage = this;
                        throw new RuntimeException(r1);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C11370gB();
            case 5:
                return new C11380gC();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C11370gB.class) {
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
            i2 = 0 + AbstractC11750gu.A04(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A04(2, this.A03);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A04(3, this.A04);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A04(4, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0F(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0F(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0F(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0F(4, this.A02);
        }
        this.unknownFields.A02(r4);
    }
}
