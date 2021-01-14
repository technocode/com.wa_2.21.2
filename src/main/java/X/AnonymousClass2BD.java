package X;

import java.io.IOException;

/* renamed from: X.2BD  reason: invalid class name */
public final class AnonymousClass2BD extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass2BD A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass071 A03;
    public AnonymousClass071 A04;
    public AnonymousClass071 A05;

    static {
        AnonymousClass2BD r0 = new AnonymousClass2BD();
        A06 = r0;
        r0.A0C();
    }

    public AnonymousClass2BD() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A04 = r0;
        this.A03 = r0;
        this.A05 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r21, Object obj, Object obj2) {
        switch (r21.ordinal()) {
            case 0:
                return A06;
            case 1:
                AbstractC05000Mr r13 = (AbstractC05000Mr) obj;
                AnonymousClass2BD r6 = (AnonymousClass2BD) obj2;
                int i = this.A00;
                boolean z = false;
                if ((i & 1) == 1) {
                    z = true;
                }
                int i2 = this.A01;
                int i3 = r6.A00;
                boolean z2 = false;
                if ((i3 & 1) == 1) {
                    z2 = true;
                }
                this.A01 = r13.AR9(z, i2, z2, r6.A01);
                boolean z3 = false;
                if ((i & 2) == 2) {
                    z3 = true;
                }
                AnonymousClass071 r2 = this.A04;
                boolean z4 = false;
                if ((i3 & 2) == 2) {
                    z4 = true;
                }
                this.A04 = r13.AR6(z3, r2, z4, r6.A04);
                boolean z5 = false;
                if ((this.A00 & 4) == 4) {
                    z5 = true;
                }
                AnonymousClass071 r22 = this.A03;
                boolean z6 = false;
                if ((r6.A00 & 4) == 4) {
                    z6 = true;
                }
                this.A03 = r13.AR6(z5, r22, z6, r6.A03);
                boolean z7 = false;
                if ((this.A00 & 8) == 8) {
                    z7 = true;
                }
                AnonymousClass071 r23 = this.A05;
                boolean z8 = false;
                if ((r6.A00 & 8) == 8) {
                    z8 = true;
                }
                this.A05 = r13.AR6(z7, r23, z8, r6.A05);
                int i4 = this.A00;
                boolean z9 = false;
                if ((i4 & 16) == 16) {
                    z9 = true;
                }
                long j = this.A02;
                int i5 = r6.A00;
                boolean z10 = false;
                if ((i5 & 16) == 16) {
                    z10 = true;
                }
                this.A02 = r13.ARC(z9, j, z10, r6.A02);
                if (r13 == C04980Mp.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C05010Mt r132 = (C05010Mt) obj;
                while (true) {
                    try {
                        int A032 = r132.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A01 = r132.A02();
                        } else if (A032 == 18) {
                            this.A00 |= 2;
                            this.A04 = r132.A08();
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A03 = r132.A08();
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A05 = r132.A08();
                        } else if (A032 == 41) {
                            this.A00 |= 16;
                            this.A02 = r132.A05();
                        } else if (!A0G(A032, r132)) {
                            break;
                        }
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r1 = new C04190Jk(e2.getMessage());
                        r1.unfinishedMessage = this;
                        throw new RuntimeException(r1);
                    }
                }
            case 3:
                return null;
            case 4:
                return new AnonymousClass2BD();
            case 5:
                return new AnonymousClass2BC(null);
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (AnonymousClass2BD.class) {
                        if (A07 == null) {
                            A07 = new AnonymousClass275(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + AbstractC11750gu.A04(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            i3 += AbstractC11750gu.A07(2, this.A04);
        }
        if ((i4 & 4) == 4) {
            i3 += AbstractC11750gu.A07(3, this.A03);
        }
        if ((i4 & 8) == 8) {
            i3 += AbstractC11750gu.A07(4, this.A05);
        }
        if ((i4 & 16) == 16) {
            if (!true || !true) {
                i = 1;
            } else if (!true || !true) {
                i = 2;
            } else if (!true || !true) {
                i = 3;
            } else {
                i = 5;
                if (!true || !true) {
                    i = 4;
                }
            }
            i3 += i + 8;
        }
        int A002 = this.unknownFields.A00() + i3;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0F(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0J(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0J(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0J(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            r4.A0G(5, this.A02);
        }
        this.unknownFields.A02(r4);
    }
}
