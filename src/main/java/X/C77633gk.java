package X;

import java.io.IOException;

/* renamed from: X.3gk  reason: invalid class name and case insensitive filesystem */
public final class C77633gk extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77633gk A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass071 A03;
    public AnonymousClass071 A04;

    static {
        C77633gk r0 = new C77633gk();
        A05 = r0;
        r0.A0C();
    }

    public C77633gk() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A04 = r0;
        this.A03 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r10, Object obj, Object obj2) {
        boolean z = false;
        switch (r10.ordinal()) {
            case 0:
                return A05;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C77633gk r12 = (C77633gk) obj2;
                boolean z2 = true;
                if ((this.A00 & 1) != 1) {
                    z2 = false;
                }
                AnonymousClass071 r2 = this.A04;
                boolean z3 = true;
                if ((r12.A00 & 1) != 1) {
                    z3 = false;
                }
                this.A04 = r11.AR6(z2, r2, z3, r12.A04);
                int i = this.A00;
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                int i2 = this.A01;
                int i3 = r12.A00;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A01 = r11.AR9(z4, i2, z5, r12.A01);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                int i4 = this.A02;
                if ((i3 & 4) == 4) {
                    z = true;
                }
                this.A02 = r11.AR9(z6, i4, z, r12.A02);
                boolean z7 = false;
                if ((i & 8) == 8) {
                    z7 = true;
                }
                AnonymousClass071 r22 = this.A03;
                boolean z8 = false;
                if ((i3 & 8) == 8) {
                    z8 = true;
                }
                this.A03 = r11.AR6(z7, r22, z8, r12.A03);
                if (r11 == C04980Mp.A00) {
                    this.A00 |= r12.A00;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r112.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                this.A00 |= 1;
                                this.A04 = r112.A08();
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A01 = r112.A02();
                            } else if (A032 == 24) {
                                this.A00 |= 4;
                                this.A02 = r112.A02();
                            } else if (A032 == 34) {
                                this.A00 |= 8;
                                this.A03 = r112.A08();
                            } else if (!A0G(A032, r112)) {
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
                return new C77633gk();
            case 5:
                return new C77623gj(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C77633gk.class) {
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
            i2 = 0 + AbstractC11750gu.A07(1, this.A04);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A04(2, this.A01);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A04(3, this.A02);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A07(4, this.A03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0J(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0F(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0F(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0J(4, this.A03);
        }
        this.unknownFields.A02(r4);
    }
}
