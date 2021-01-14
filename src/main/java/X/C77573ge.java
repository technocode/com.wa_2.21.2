package X;

import java.io.IOException;

/* renamed from: X.3ge  reason: invalid class name and case insensitive filesystem */
public final class C77573ge extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77573ge A07;
    public static volatile AbstractC37151nd A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass071 A04;
    public AnonymousClass071 A05;
    public AnonymousClass071 A06;

    static {
        C77573ge r0 = new C77573ge();
        A07 = r0;
        r0.A0C();
    }

    public C77573ge() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A04 = r0;
        this.A05 = r0;
        this.A06 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r8, Object obj, Object obj2) {
        boolean z = false;
        switch (r8.ordinal()) {
            case 0:
                return A07;
            case 1:
                AbstractC05000Mr r9 = (AbstractC05000Mr) obj;
                C77573ge r10 = (C77573ge) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A02;
                int i3 = r10.A00;
                if ((i3 & 1) == 1) {
                    z = true;
                }
                this.A02 = r9.AR9(z2, i2, z, r10.A02);
                boolean z3 = false;
                if ((i & 2) == 2) {
                    z3 = true;
                }
                int i4 = this.A01;
                boolean z4 = false;
                if ((i3 & 2) == 2) {
                    z4 = true;
                }
                this.A01 = r9.AR9(z3, i4, z4, r10.A01);
                boolean z5 = false;
                if ((i & 4) == 4) {
                    z5 = true;
                }
                int i5 = this.A03;
                boolean z6 = false;
                if ((i3 & 4) == 4) {
                    z6 = true;
                }
                this.A03 = r9.AR9(z5, i5, z6, r10.A03);
                boolean z7 = false;
                if ((i & 8) == 8) {
                    z7 = true;
                }
                AnonymousClass071 r2 = this.A04;
                boolean z8 = false;
                if ((i3 & 8) == 8) {
                    z8 = true;
                }
                this.A04 = r9.AR6(z7, r2, z8, r10.A04);
                boolean z9 = false;
                if ((this.A00 & 16) == 16) {
                    z9 = true;
                }
                AnonymousClass071 r22 = this.A05;
                boolean z10 = false;
                if ((r10.A00 & 16) == 16) {
                    z10 = true;
                }
                this.A05 = r9.AR6(z9, r22, z10, r10.A05);
                boolean z11 = false;
                if ((this.A00 & 32) == 32) {
                    z11 = true;
                }
                AnonymousClass071 r23 = this.A06;
                boolean z12 = false;
                if ((r10.A00 & 32) == 32) {
                    z12 = true;
                }
                this.A06 = r9.AR6(z11, r23, z12, r10.A06);
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
                            if (A032 == 8) {
                                this.A00 |= 2;
                                this.A01 = r92.A02();
                            } else if (A032 == 18) {
                                this.A00 |= 8;
                                this.A04 = r92.A08();
                            } else if (A032 == 26) {
                                this.A00 |= 16;
                                this.A05 = r92.A08();
                            } else if (A032 == 34) {
                                this.A00 |= 32;
                                this.A06 = r92.A08();
                            } else if (A032 == 40) {
                                this.A00 |= 1;
                                this.A02 = r92.A02();
                            } else if (A032 == 48) {
                                this.A00 |= 4;
                                this.A03 = r92.A02();
                            } else if (!A0G(A032, r92)) {
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
                return new C77573ge();
            case 5:
                return new C77563gd(null);
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C77573ge.class) {
                        if (A08 == null) {
                            A08 = new AnonymousClass275(A07);
                        }
                    }
                }
                return A08;
            default:
                throw new UnsupportedOperationException();
        }
        return A07;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.A00;
        if ((i3 & 2) == 2) {
            i2 = 0 + AbstractC11750gu.A04(1, this.A01);
        }
        if ((i3 & 8) == 8) {
            i2 += AbstractC11750gu.A07(2, this.A04);
        }
        if ((i3 & 16) == 16) {
            i2 += AbstractC11750gu.A07(3, this.A05);
        }
        if ((i3 & 32) == 32) {
            i2 += AbstractC11750gu.A07(4, this.A06);
        }
        if ((i3 & 1) == 1) {
            i2 += AbstractC11750gu.A04(5, this.A02);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A04(6, this.A03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 2) == 2) {
            r5.A0F(1, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0J(2, this.A04);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0J(3, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            r5.A0J(4, this.A06);
        }
        if ((this.A00 & 1) == 1) {
            r5.A0F(5, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0F(6, this.A03);
        }
        this.unknownFields.A02(r5);
    }
}
