package X;

import java.io.IOException;

/* renamed from: X.3fS  reason: invalid class name and case insensitive filesystem */
public final class C77003fS extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77003fS A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public long A01;
    public boolean A02;

    static {
        C77003fS r0 = new C77003fS();
        A03 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r18, Object obj, Object obj2) {
        boolean z = false;
        switch (r18.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r10 = (AbstractC05000Mr) obj;
                C77003fS r6 = (C77003fS) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                boolean z3 = this.A02;
                int i2 = r6.A00;
                boolean z4 = false;
                if ((i2 & 1) == 1) {
                    z4 = true;
                }
                this.A02 = r10.AR5(z2, z3, z4, r6.A02);
                boolean z5 = false;
                if ((i & 2) == 2) {
                    z5 = true;
                }
                long j = this.A01;
                boolean z6 = false;
                if ((i2 & 2) == 2) {
                    z6 = true;
                }
                this.A01 = r10.ARC(z5, j, z6, r6.A01);
                if (r10 == C04980Mp.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C05010Mt r102 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r102.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A02 = r102.A0H();
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A01 = r102.A06();
                            } else if (!A0G(A032, r102)) {
                            }
                        }
                        z = true;
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
                return new C77003fS();
            case 5:
                return new C76993fR();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C77003fS.class) {
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
            i2 = 0 + AbstractC11750gu.A00(1);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A05(2, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0M(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            r4.A0I(2, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
