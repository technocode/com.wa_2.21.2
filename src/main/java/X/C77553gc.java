package X;

import java.io.IOException;

/* renamed from: X.3gc  reason: invalid class name and case insensitive filesystem */
public final class C77553gc extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77553gc A05;
    public static volatile AbstractC37151nd A06;
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass071 A03 = AnonymousClass071.A01;
    public AbstractC04120Jd A04 = C05030Mw.A01;

    static {
        C77553gc r0 = new C77553gc();
        A05 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r7, Object obj, Object obj2) {
        boolean z = false;
        switch (r7.ordinal()) {
            case 0:
                return A05;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                C77553gc r9 = (C77553gc) obj2;
                int i = this.A00;
                boolean z2 = true;
                if ((i & 1) != 1) {
                    z2 = false;
                }
                int i2 = this.A01;
                int i3 = r9.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r8.AR9(z2, i2, z3, r9.A01);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                int i4 = this.A02;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A02 = r8.AR9(z4, i4, z5, r9.A02);
                this.A04 = r8.ARB(this.A04, r9.A04);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                AnonymousClass071 r2 = this.A03;
                boolean z7 = false;
                if ((r9.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r8.AR6(z6, r2, z7, r9.A03);
                if (r8 == C04980Mp.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C05010Mt r82 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r82.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r82.A02();
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A02 = r82.A02();
                            } else if (A032 == 26) {
                                AbstractC04120Jd r22 = this.A04;
                                AbstractC04120Jd r1 = r22;
                                if (!((AbstractC05040Mx) r22).A00) {
                                    r1 = AnonymousClass078.A04(r22);
                                    this.A04 = r1;
                                }
                                r1.add(r82.A08());
                            } else if (A032 == 34) {
                                this.A00 |= 4;
                                this.A03 = r82.A08();
                            } else if (!A0G(A032, r82)) {
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
                ((AbstractC05040Mx) this.A04).A00 = false;
                return null;
            case 4:
                return new C77553gc();
            case 5:
                return new C77543gb(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C77553gc.class) {
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
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = AbstractC11750gu.A04(1, this.A01) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += AbstractC11750gu.A04(2, this.A02);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A04.size(); i5++) {
            int length = ((AnonymousClass072) ((AnonymousClass071) this.A04.get(i5))).bytes.length;
            i4 += AbstractC11750gu.A01(length) + length;
        }
        int size = this.A04.size() + i + i4;
        if ((this.A00 & 4) == 4) {
            size += AbstractC11750gu.A07(4, this.A03);
        }
        int A002 = this.unknownFields.A00() + size;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0F(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0F(2, this.A02);
        }
        for (int i = 0; i < this.A04.size(); i++) {
            r4.A0J(3, (AnonymousClass071) this.A04.get(i));
        }
        if ((this.A00 & 4) == 4) {
            r4.A0J(4, this.A03);
        }
        this.unknownFields.A02(r4);
    }
}
