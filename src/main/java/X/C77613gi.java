package X;

import java.io.IOException;

/* renamed from: X.3gi  reason: invalid class name and case insensitive filesystem */
public final class C77613gi extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77613gi A04;
    public static volatile AbstractC37151nd A05;
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass071 A03 = AnonymousClass071.A01;

    static {
        C77613gi r0 = new C77613gi();
        A04 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r8, Object obj, Object obj2) {
        switch (r8.ordinal()) {
            case 0:
                return A04;
            case 1:
                AbstractC05000Mr r9 = (AbstractC05000Mr) obj;
                C77613gi r10 = (C77613gi) obj2;
                int i = this.A00;
                boolean z = true;
                if ((i & 1) != 1) {
                    z = false;
                }
                int i2 = this.A01;
                int i3 = r10.A00;
                boolean z2 = true;
                if ((i3 & 1) != 1) {
                    z2 = false;
                }
                this.A01 = r9.AR9(z, i2, z2, r10.A01);
                boolean z3 = false;
                if ((i & 2) == 2) {
                    z3 = true;
                }
                int i4 = this.A02;
                boolean z4 = false;
                if ((i3 & 2) == 2) {
                    z4 = true;
                }
                this.A02 = r9.AR9(z3, i4, z4, r10.A02);
                boolean z5 = false;
                if ((i & 4) == 4) {
                    z5 = true;
                }
                AnonymousClass071 r2 = this.A03;
                boolean z6 = false;
                if ((i3 & 4) == 4) {
                    z6 = true;
                }
                this.A03 = r9.AR6(z5, r2, z6, r10.A03);
                if (r9 == C04980Mp.A00) {
                    this.A00 |= r10.A00;
                }
                return this;
            case 2:
                C05010Mt r92 = (C05010Mt) obj;
                boolean z7 = false;
                while (!z7) {
                    try {
                        int A032 = r92.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r92.A02();
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A02 = r92.A02();
                            } else if (A032 == 26) {
                                this.A00 |= 4;
                                this.A03 = r92.A08();
                            } else if (!A0G(A032, r92)) {
                            }
                        }
                        z7 = true;
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
                return new C77613gi();
            case 5:
                return new C77603gh(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C77613gi.class) {
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
            i2 += AbstractC11750gu.A04(2, this.A02);
        }
        if ((i3 & 4) == 4) {
            i2 += AbstractC11750gu.A07(3, this.A03);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0F(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0F(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            r3.A0J(3, this.A03);
        }
        this.unknownFields.A02(r3);
    }
}
