package X;

import java.io.IOException;

/* renamed from: X.3fs  reason: invalid class name and case insensitive filesystem */
public final class C77263fs extends AnonymousClass078 implements AnonymousClass077 {
    public static final C77263fs A02;
    public static volatile AbstractC37151nd A03;
    public int A00;
    public boolean A01;

    static {
        C77263fs r0 = new C77263fs();
        A02 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r8, Object obj, Object obj2) {
        boolean z = false;
        switch (r8.ordinal()) {
            case 0:
                return A02;
            case 1:
                AbstractC05000Mr r9 = (AbstractC05000Mr) obj;
                C77263fs r10 = (C77263fs) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                boolean z3 = this.A01;
                int i2 = r10.A00;
                if ((i2 & 1) == 1) {
                    z = true;
                }
                this.A01 = r9.AR5(z2, z3, z, r10.A01);
                if (r9 == C04980Mp.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C05010Mt r92 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r92.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r92.A0H();
                            } else if (!A0G(A032, r92)) {
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
                return new C77263fs();
            case 5:
                return new C77253fr();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (C77263fs.class) {
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
            i2 = 0 + AbstractC11750gu.A00(1);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0M(1, this.A01);
        }
        this.unknownFields.A02(r3);
    }
}
