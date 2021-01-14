package X;

import java.io.IOException;

/* renamed from: X.3eE  reason: invalid class name and case insensitive filesystem */
public final class C76243eE extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76243eE A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public int A01;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public String A03 = "";
    public String A04 = "";
    public String A05 = "";

    static {
        C76243eE r0 = new C76243eE();
        A06 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r12, Object obj, Object obj2) {
        AnonymousClass3JU r0;
        boolean z = false;
        switch (r12.ordinal()) {
            case 0:
                return A06;
            case 1:
                AbstractC05000Mr r13 = (AbstractC05000Mr) obj;
                C76243eE r14 = (C76243eE) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A05;
                int i2 = r14.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A05 = r13.ARH(z2, str, z3, r14.A05);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A04;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r13.ARH(z4, str2, z5, r14.A04);
                boolean z6 = false;
                if ((i & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A03;
                boolean z7 = false;
                if ((i2 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r13.ARH(z6, str3, z7, r14.A03);
                boolean z8 = false;
                if ((i & 8) == 8) {
                    z8 = true;
                }
                int i3 = this.A01;
                if ((i2 & 8) == 8) {
                    z = true;
                }
                this.A01 = r13.AR9(z8, i3, z, r14.A01);
                this.A02 = r13.ARB(this.A02, r14.A02);
                if (r13 == C04980Mp.A00) {
                    this.A00 |= r14.A00;
                }
                return this;
            case 2:
                C05010Mt r132 = (C05010Mt) obj;
                AnonymousClass1FL r142 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r132.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = r132.A0A();
                                this.A00 |= 1;
                                this.A05 = A0A;
                            } else if (A032 == 18) {
                                String A0A2 = r132.A0A();
                                this.A00 |= 2;
                                this.A04 = A0A2;
                            } else if (A032 == 26) {
                                String A0A3 = r132.A0A();
                                this.A00 |= 4;
                                this.A03 = A0A3;
                            } else if (A032 == 32) {
                                int A022 = r132.A02();
                                if (A022 == 0) {
                                    r0 = AnonymousClass3JU.UNKNOWN;
                                } else if (A022 != 1) {
                                    r0 = null;
                                } else {
                                    r0 = AnonymousClass3JU.SINGLE_SELECT;
                                }
                                if (r0 == null) {
                                    super.A0D(4, A022);
                                } else {
                                    this.A00 |= 8;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 42) {
                                AbstractC04120Jd r1 = this.A02;
                                if (!((AbstractC05040Mx) r1).A00) {
                                    r1 = AnonymousClass078.A04(r1);
                                    this.A02 = r1;
                                }
                                r1.add(r132.A09(C76233eD.A03.A0A(), r142));
                            } else if (!A0G(A032, r132)) {
                            }
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r15 = new C04190Jk(e2.getMessage());
                        r15.unfinishedMessage = this;
                        throw new RuntimeException(r15);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A02).A00 = false;
                return null;
            case 4:
                return new C76243eE();
            case 5:
                return new C76193e9();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C76243eE.class) {
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
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A09(1, this.A05) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            i += AbstractC11750gu.A09(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            i += AbstractC11750gu.A02(4, this.A01);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += AbstractC11750gu.A08(5, (AnonymousClass076) this.A02.get(i3));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A05);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            r4.A0L(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0E(4, this.A01);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            r4.A0K(5, (AnonymousClass076) this.A02.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
