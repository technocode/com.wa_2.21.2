package X;

import java.io.IOException;

/* renamed from: X.3fY  reason: invalid class name and case insensitive filesystem */
public final class C77063fY extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77063fY A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public int A02;
    public String A03 = "";
    public boolean A04;

    static {
        C77063fY r0 = new C77063fY();
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
                C77063fY r14 = (C77063fY) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A03;
                int i2 = r14.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A03 = r13.ARH(z2, str, z3, r14.A03);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                int i3 = this.A01;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A01 = r13.AR9(z4, i3, z5, r14.A01);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                int i4 = this.A02;
                boolean z7 = false;
                if ((i2 & 4) == 4) {
                    z7 = true;
                }
                this.A02 = r13.AR9(z6, i4, z7, r14.A02);
                boolean z8 = false;
                if ((i & 8) == 8) {
                    z8 = true;
                }
                boolean z9 = this.A04;
                if ((i2 & 8) == 8) {
                    z = true;
                }
                this.A04 = r13.AR5(z8, z9, z, r14.A04);
                if (r13 == C04980Mp.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C05010Mt r132 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r132.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = r132.A0A();
                                this.A00 |= 1;
                                this.A03 = A0A;
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A01 = r132.A02();
                            } else if (A032 == 24) {
                                this.A00 |= 4;
                                this.A02 = r132.A02();
                            } else if (A032 == 32) {
                                this.A00 |= 8;
                                this.A04 = r132.A0H();
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
                return new C77063fY();
            case 5:
                return new C77053fX();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C77063fY.class) {
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
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A03(2, this.A01);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A03(3, this.A02);
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
            r4.A0E(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0E(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0M(4, this.A04);
        }
        this.unknownFields.A02(r4);
    }
}
