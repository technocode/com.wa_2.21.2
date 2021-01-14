package X;

import java.io.IOException;

/* renamed from: X.0Ly  reason: invalid class name and case insensitive filesystem */
public final class C04820Ly extends AnonymousClass078 implements AnonymousClass077 {
    public static final C04820Ly A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public long A01;
    public long A02;
    public AbstractC04120Jd A03 = C05030Mw.A01;

    static {
        C04820Ly r0 = new C04820Ly();
        A04 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r15, Object obj, Object obj2) {
        boolean z = false;
        switch (r15.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r7 = (AbstractC05000Mr) obj;
                C04820Ly r0 = (C04820Ly) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                long j = this.A01;
                int i2 = r0.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r7.ARC(z2, j, z3, r0.A01);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                long j2 = this.A02;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A02 = r7.ARC(z4, j2, z5, r0.A02);
                this.A03 = r7.ARB(this.A03, r0.A03);
                if (r7 == C04980Mp.A00) {
                    this.A00 |= r0.A00;
                }
                return this;
            case 2:
                C05010Mt r72 = (C05010Mt) obj;
                AnonymousClass1FL r02 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r72.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r72.A06();
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A02 = r72.A06();
                            } else if (A032 == 26) {
                                AbstractC04120Jd r3 = this.A03;
                                if (!((AbstractC05040Mx) r3).A00) {
                                    r3 = AnonymousClass078.A04(r3);
                                    this.A03 = r3;
                                }
                                r3.add(r72.A09(AnonymousClass0QX.A03.A0A(), r02));
                            } else if (!A0G(A032, r72)) {
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
                ((AbstractC05040Mx) this.A03).A00 = false;
                return null;
            case 4:
                return new C04820Ly();
            case 5:
                return new AnonymousClass0OR();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C04820Ly.class) {
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
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = AbstractC11750gu.A05(1, this.A01) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += AbstractC11750gu.A05(2, this.A02);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            i += AbstractC11750gu.A08(3, (AnonymousClass076) this.A03.get(i4));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0I(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0I(2, this.A02);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            r4.A0K(3, (AnonymousClass076) this.A03.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
