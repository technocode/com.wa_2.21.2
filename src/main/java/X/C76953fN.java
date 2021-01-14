package X;

import java.io.IOException;

/* renamed from: X.3fN  reason: invalid class name and case insensitive filesystem */
public final class C76953fN extends AnonymousClass078 implements AnonymousClass077 {
    public static final C76953fN A02;
    public static volatile AbstractC37151nd A03;
    public int A00;
    public C04820Ly A01;

    static {
        C76953fN r0 = new C76953fN();
        A02 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r6, Object obj, Object obj2) {
        AnonymousClass0OR r1;
        switch (r6.ordinal()) {
            case 0:
                return A02;
            case 1:
                AbstractC05000Mr r7 = (AbstractC05000Mr) obj;
                C76953fN r8 = (C76953fN) obj2;
                this.A01 = (C04820Ly) r7.ARD(this.A01, r8.A01);
                if (r7 == C04980Mp.A00) {
                    this.A00 |= r8.A00;
                }
                return this;
            case 2:
                C05010Mt r72 = (C05010Mt) obj;
                AnonymousClass1FL r82 = (AnonymousClass1FL) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int A032 = r72.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    r1 = (AnonymousClass0OR) this.A01.AQb();
                                } else {
                                    r1 = null;
                                }
                                C04820Ly r0 = (C04820Ly) r72.A09(C04820Ly.A04.A0A(), r82);
                                this.A01 = r0;
                                if (r1 != null) {
                                    r1.A03(r0);
                                    this.A01 = (C04820Ly) r1.A00();
                                }
                                this.A00 |= 1;
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
                return new C76953fN();
            case 5:
                return new C76943fM();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C76953fN.class) {
                        if (A03 == null) {
                            A03 = new AnonymousClass275(A02);
                        }
                    }
                }
                return A03;
            default:
                throw new UnsupportedOperationException();
        }
        return A02;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            C04820Ly r0 = this.A01;
            if (r0 == null) {
                r0 = C04820Ly.A04;
            }
            i2 = 0 + AbstractC11750gu.A08(1, r0);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            C04820Ly r0 = this.A01;
            if (r0 == null) {
                r0 = C04820Ly.A04;
            }
            r3.A0K(1, r0);
        }
        this.unknownFields.A02(r3);
    }
}
