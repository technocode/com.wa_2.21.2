package X;

import java.io.IOException;

/* renamed from: X.3gC  reason: invalid class name and case insensitive filesystem */
public final class C77463gC extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77463gC A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass071 A03 = AnonymousClass071.A01;
    public String A04 = "";
    public String A05 = "";

    static {
        C77463gC r0 = new C77463gC();
        A06 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r22, Object obj, Object obj2) {
        boolean z = false;
        switch (r22.ordinal()) {
            case 0:
                return A06;
            case 1:
                AbstractC05000Mr r14 = (AbstractC05000Mr) obj;
                C77463gC r4 = (C77463gC) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A01;
                int i3 = r4.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r14.AR9(z2, i2, z3, r4.A01);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str = this.A04;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r14.ARH(z4, str, z5, r4.A04);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                long j = this.A02;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A02 = r14.ARC(z6, j, z7, r4.A02);
                boolean z8 = false;
                if ((i & 8) == 8) {
                    z8 = true;
                }
                String str2 = this.A05;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A05 = r14.ARH(z8, str2, z9, r4.A05);
                boolean z10 = false;
                if ((i & 16) == 16) {
                    z10 = true;
                }
                AnonymousClass071 r1 = this.A03;
                if ((i3 & 16) == 16) {
                    z = true;
                }
                this.A03 = r14.AR6(z10, r1, z, r4.A03);
                if (r14 == C04980Mp.A00) {
                    this.A00 |= r4.A00;
                }
                return this;
            case 2:
                C05010Mt r142 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r142.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r142.A02();
                            } else if (A032 == 18) {
                                String A0A = r142.A0A();
                                this.A00 |= 2;
                                this.A04 = A0A;
                            } else if (A032 == 24) {
                                this.A00 |= 4;
                                this.A02 = r142.A06();
                            } else if (A032 == 34) {
                                String A0A2 = r142.A0A();
                                this.A00 |= 8;
                                this.A05 = A0A2;
                            } else if (A032 == 42) {
                                this.A00 |= 16;
                                this.A03 = r142.A08();
                            } else if (!A0G(A032, r142)) {
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
                return new C77463gC();
            case 5:
                return new C77453gB();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C77463gC.class) {
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
            i2 += AbstractC11750gu.A09(2, this.A04);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i2 += AbstractC11750gu.A06(3, this.A02);
        }
        if ((i4 & 8) == 8) {
            i2 += AbstractC11750gu.A09(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            i2 += AbstractC11750gu.A07(5, this.A03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r5) {
        if ((this.A00 & 1) == 1) {
            r5.A0F(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r5.A0L(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r5.A0H(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            r5.A0L(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            r5.A0J(5, this.A03);
        }
        this.unknownFields.A02(r5);
    }
}
