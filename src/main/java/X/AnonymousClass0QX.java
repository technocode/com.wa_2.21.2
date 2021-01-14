package X;

import java.io.IOException;

/* renamed from: X.0QX  reason: invalid class name */
public final class AnonymousClass0QX extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0QX A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public long A01;
    public AnonymousClass0N3 A02;

    static {
        AnonymousClass0QX r0 = new AnonymousClass0QX();
        A03 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r15, Object obj, Object obj2) {
        AnonymousClass0NK r1;
        boolean z = false;
        switch (r15.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r7 = (AbstractC05000Mr) obj;
                AnonymousClass0QX r5 = (AnonymousClass0QX) obj2;
                this.A02 = (AnonymousClass0N3) r7.ARD(this.A02, r5.A02);
                int i = this.A00;
                boolean z2 = false;
                if ((i & 2) == 2) {
                    z2 = true;
                }
                long j = this.A01;
                int i2 = r5.A00;
                boolean z3 = false;
                if ((i2 & 2) == 2) {
                    z3 = true;
                }
                this.A01 = r7.ARC(z2, j, z3, r5.A01);
                if (r7 == C04980Mp.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C05010Mt r72 = (C05010Mt) obj;
                AnonymousClass1FL r52 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A032 = r72.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    r1 = (AnonymousClass0NK) this.A02.AQb();
                                } else {
                                    r1 = null;
                                }
                                AnonymousClass0N3 r0 = (AnonymousClass0N3) r72.A09(AnonymousClass0N3.A05.A0A(), r52);
                                this.A02 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A02 = (AnonymousClass0N3) r1.A00();
                                }
                                this.A00 |= 1;
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A01 = r72.A06();
                            } else if (!A0G(A032, r72)) {
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
                return new AnonymousClass0QX();
            case 5:
                return new C77293fv();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (AnonymousClass0QX.class) {
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
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            AnonymousClass0N3 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            i2 += AbstractC11750gu.A05(2, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            AnonymousClass0N3 r0 = this.A02;
            if (r0 == null) {
                r0 = AnonymousClass0N3.A05;
            }
            r4.A0K(1, r0);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0I(2, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
