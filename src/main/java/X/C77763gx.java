package X;

import java.io.IOException;

/* renamed from: X.3gx  reason: invalid class name and case insensitive filesystem */
public final class C77763gx extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77763gx A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public AnonymousClass071 A01;
    public AnonymousClass071 A02;

    static {
        C77763gx r0 = new C77763gx();
        A03 = r0;
        r0.A0C();
    }

    public C77763gx() {
        AnonymousClass071 r0 = AnonymousClass071.A01;
        this.A02 = r0;
        this.A01 = r0;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r6, Object obj, Object obj2) {
        boolean z = false;
        switch (r6.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r7 = (AbstractC05000Mr) obj;
                C77763gx r8 = (C77763gx) obj2;
                boolean z2 = false;
                if ((this.A00 & 1) == 1) {
                    z2 = true;
                }
                AnonymousClass071 r1 = this.A02;
                if ((r8.A00 & 1) == 1) {
                    z = true;
                }
                this.A02 = r7.AR6(z2, r1, z, r8.A02);
                boolean z3 = false;
                if ((this.A00 & 2) == 2) {
                    z3 = true;
                }
                AnonymousClass071 r2 = this.A01;
                boolean z4 = false;
                if ((r8.A00 & 2) == 2) {
                    z4 = true;
                }
                this.A01 = r7.AR6(z3, r2, z4, r8.A01);
                if (r7 == C04980Mp.A00) {
                    this.A00 |= r8.A00;
                }
                return this;
            case 2:
                C05010Mt r72 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r72.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                this.A00 |= 1;
                                this.A02 = r72.A08();
                            } else if (A032 == 18) {
                                this.A00 |= 2;
                                this.A01 = r72.A08();
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
                return new C77763gx();
            case 5:
                return new C77753gw(null);
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C77763gx.class) {
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
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i2 = 0 + AbstractC11750gu.A07(1, this.A02);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A07(2, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0J(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0J(2, this.A01);
        }
        this.unknownFields.A02(r3);
    }
}
