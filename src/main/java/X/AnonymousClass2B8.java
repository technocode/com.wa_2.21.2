package X;

import java.io.IOException;

/* renamed from: X.2B8  reason: invalid class name */
public final class AnonymousClass2B8 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass2B8 A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public int A01;
    public AbstractC04120Jd A02 = C05030Mw.A01;
    public C77763gx A03;

    static {
        AnonymousClass2B8 r0 = new AnonymousClass2B8();
        A04 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r7, Object obj, Object obj2) {
        C77753gw r1;
        boolean z = false;
        switch (r7.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                AnonymousClass2B8 r9 = (AnonymousClass2B8) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                int i = this.A01;
                if ((r9.A00 & 1) == 1) {
                    z = true;
                }
                this.A01 = r8.AR9(z2, i, z, r9.A01);
                this.A02 = r8.ARB(this.A02, r9.A02);
                this.A03 = (C77763gx) r8.ARD(this.A03, r9.A03);
                if (r8 == C04980Mp.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C05010Mt r82 = (C05010Mt) obj;
                AnonymousClass1FL r92 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r82.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r82.A02();
                            } else if (A032 == 18) {
                                AbstractC04120Jd r2 = this.A02;
                                AbstractC04120Jd r12 = r2;
                                if (!((AbstractC05040Mx) r2).A00) {
                                    r12 = AnonymousClass078.A04(r2);
                                    this.A02 = r12;
                                }
                                r12.add(r82.A09(C77723gt.A03.A0A(), r92));
                            } else if (A032 == 26) {
                                if ((this.A00 & 2) == 2) {
                                    r1 = (C77753gw) this.A03.AQb();
                                } else {
                                    r1 = null;
                                }
                                C77763gx r0 = (C77763gx) r82.A09(C77763gx.A03.A0A(), r92);
                                this.A03 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A03 = (C77763gx) r1.A00();
                                }
                                this.A00 |= 2;
                            } else if (!A0G(A032, r82)) {
                            }
                        }
                        z = true;
                    } catch (C04190Jk e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C04190Jk r13 = new C04190Jk(e2.getMessage());
                        r13.unfinishedMessage = this;
                        throw new RuntimeException(r13);
                    }
                }
                break;
            case 3:
                ((AbstractC05040Mx) this.A02).A00 = false;
                return null;
            case 4:
                return new AnonymousClass2B8();
            case 5:
                return new C77653gm(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass2B8.class) {
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
        if ((this.A00 & 1) == 1) {
            i = AbstractC11750gu.A04(1, this.A01) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += AbstractC11750gu.A08(2, (AnonymousClass076) this.A02.get(i3));
        }
        if ((this.A00 & 2) == 2) {
            C77763gx r0 = this.A03;
            if (r0 == null) {
                r0 = C77763gx.A03;
            }
            i += AbstractC11750gu.A08(3, r0);
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0F(1, this.A01);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            r4.A0K(2, (AnonymousClass076) this.A02.get(i));
        }
        if ((this.A00 & 2) == 2) {
            C77763gx r0 = this.A03;
            if (r0 == null) {
                r0 = C77763gx.A03;
            }
            r4.A0K(3, r0);
        }
        this.unknownFields.A02(r4);
    }
}
