package X;

import java.io.IOException;

/* renamed from: X.3fk  reason: invalid class name and case insensitive filesystem */
public final class C77183fk extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77183fk A06;
    public static volatile AbstractC37151nd A07;
    public int A00;
    public int A01;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public String A03 = "";
    public String A04 = "";
    public boolean A05;

    static {
        C77183fk r0 = new C77183fk();
        A06 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r12, Object obj, Object obj2) {
        boolean z = false;
        switch (r12.ordinal()) {
            case 0:
                return A06;
            case 1:
                AbstractC05000Mr r13 = (AbstractC05000Mr) obj;
                C77183fk r14 = (C77183fk) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A04;
                int i2 = r14.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A04 = r13.ARH(z2, str, z3, r14.A04);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A03;
                boolean z5 = false;
                if ((i2 & 2) == 2) {
                    z5 = true;
                }
                this.A03 = r13.ARH(z4, str2, z5, r14.A03);
                this.A02 = r13.ARB(this.A02, r14.A02);
                int i3 = this.A00;
                boolean z6 = false;
                if ((i3 & 4) == 4) {
                    z6 = true;
                }
                int i4 = this.A01;
                int i5 = r14.A00;
                boolean z7 = false;
                if ((i5 & 4) == 4) {
                    z7 = true;
                }
                this.A01 = r13.AR9(z6, i4, z7, r14.A01);
                boolean z8 = false;
                if ((i3 & 8) == 8) {
                    z8 = true;
                }
                boolean z9 = this.A05;
                if ((i5 & 8) == 8) {
                    z = true;
                }
                this.A05 = r13.AR5(z8, z9, z, r14.A05);
                if (r13 == C04980Mp.A00) {
                    this.A00 = i3 | i5;
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
                                this.A04 = A0A;
                            } else if (A032 == 18) {
                                String A0A2 = r132.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A2;
                            } else if (A032 == 26) {
                                String A0A3 = r132.A0A();
                                AbstractC04120Jd r1 = this.A02;
                                if (!((AbstractC05040Mx) r1).A00) {
                                    r1 = AnonymousClass078.A04(r1);
                                    this.A02 = r1;
                                }
                                r1.add(A0A3);
                            } else if (A032 == 32) {
                                this.A00 |= 4;
                                this.A01 = r132.A02();
                            } else if (A032 == 40) {
                                this.A00 |= 8;
                                this.A05 = r132.A0H();
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
                return new C77183fk();
            case 5:
                return new C77173fj();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C77183fk.class) {
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
            i = AbstractC11750gu.A09(1, this.A04) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += AbstractC11750gu.A09(2, this.A03);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += AbstractC11750gu.A0B((String) this.A02.get(i4));
        }
        int size = this.A02.size() + i + i3;
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            size += AbstractC11750gu.A03(4, this.A01);
        }
        if ((i5 & 8) == 8) {
            size += AbstractC11750gu.A00(5);
        }
        int A002 = this.unknownFields.A00() + size;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0L(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0L(2, this.A03);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            r4.A0L(3, (String) this.A02.get(i));
        }
        if ((this.A00 & 4) == 4) {
            r4.A0E(4, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            r4.A0M(5, this.A05);
        }
        this.unknownFields.A02(r4);
    }
}
