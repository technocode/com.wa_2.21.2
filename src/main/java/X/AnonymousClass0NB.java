package X;

import java.io.IOException;

/* renamed from: X.0NB  reason: invalid class name */
public final class AnonymousClass0NB extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0NB A02;
    public static volatile AbstractC37151nd A03;
    public int A00;
    public long A01;

    static {
        AnonymousClass0NB r0 = new AnonymousClass0NB();
        A02 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r13, Object obj, Object obj2) {
        boolean z = false;
        switch (r13.ordinal()) {
            case 0:
                return A02;
            case 1:
                AbstractC05000Mr r5 = (AbstractC05000Mr) obj;
                AnonymousClass0NB r15 = (AnonymousClass0NB) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                long j = this.A01;
                int i2 = r15.A00;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r5.ARC(z2, j, z3, r15.A01);
                if (r5 == C04980Mp.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C05010Mt r52 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r52.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = r52.A06();
                            } else if (!A0G(A032, r52)) {
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
                return new AnonymousClass0NB();
            case 5:
                return new C76883fG();
            case 6:
                break;
            case 7:
                if (A03 == null) {
                    synchronized (AnonymousClass0NB.class) {
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
            i2 = 0 + AbstractC11750gu.A06(1, this.A01);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        if ((this.A00 & 1) == 1) {
            r4.A0H(1, this.A01);
        }
        this.unknownFields.A02(r4);
    }
}
