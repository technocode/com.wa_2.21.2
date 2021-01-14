package X;

import java.io.IOException;

/* renamed from: X.3gp  reason: invalid class name and case insensitive filesystem */
public final class C77683gp extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77683gp A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public AbstractC04120Jd A01 = C05030Mw.A01;
    public AnonymousClass3AO A02;

    static {
        C77683gp r0 = new C77683gp();
        A03 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r7, Object obj, Object obj2) {
        C77773gy r1;
        boolean z = false;
        switch (r7.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r8 = (AbstractC05000Mr) obj;
                C77683gp r9 = (C77683gp) obj2;
                this.A02 = (AnonymousClass3AO) r8.ARD(this.A02, r9.A02);
                this.A01 = r8.ARB(this.A01, r9.A01);
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
                            if (A032 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    r1 = (C77773gy) this.A02.AQb();
                                } else {
                                    r1 = null;
                                }
                                AnonymousClass3AO r0 = (AnonymousClass3AO) r82.A09(AnonymousClass3AO.A0E.A0A(), r92);
                                this.A02 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A02 = (AnonymousClass3AO) r1.A00();
                                }
                                this.A00 |= 1;
                            } else if (A032 == 18) {
                                AbstractC04120Jd r5 = this.A01;
                                AbstractC04120Jd r12 = r5;
                                if (!((AbstractC05040Mx) r5).A00) {
                                    r12 = AnonymousClass078.A04(r5);
                                    this.A01 = r12;
                                }
                                r12.add(r82.A09(AnonymousClass3AO.A0E.A0A(), r92));
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
                ((AbstractC05040Mx) this.A01).A00 = false;
                return null;
            case 4:
                return new C77683gp();
            case 5:
                return new C77673go(null);
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C77683gp.class) {
                        if (A04 == null) {
                            A04 = new AnonymousClass275(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i;
        int i2 = ((AnonymousClass078) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            AnonymousClass3AO r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass3AO.A0E;
            }
            i = AbstractC11750gu.A08(1, r0) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            i += AbstractC11750gu.A08(2, (AnonymousClass076) this.A01.get(i3));
        }
        int A002 = this.unknownFields.A00() + i;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass3AO r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass3AO.A0E;
            }
            r4.A0K(1, r0);
        }
        for (int i = 0; i < this.A01.size(); i++) {
            r4.A0K(2, (AnonymousClass076) this.A01.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
