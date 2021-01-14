package X;

import java.io.IOException;

/* renamed from: X.2B7  reason: invalid class name */
public final class AnonymousClass2B7 extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass2B7 A01;
    public static volatile AbstractC37151nd A02;
    public AbstractC04120Jd A00 = C05030Mw.A01;

    static {
        AnonymousClass2B7 r0 = new AnonymousClass2B7();
        A01 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r5, Object obj, Object obj2) {
        boolean z = false;
        switch (r5.ordinal()) {
            case 0:
                return A01;
            case 1:
                this.A00 = ((AbstractC05000Mr) obj).ARB(this.A00, ((AnonymousClass2B7) obj2).A00);
                return this;
            case 2:
                C05010Mt r6 = (C05010Mt) obj;
                AnonymousClass1FL r7 = (AnonymousClass1FL) obj2;
                while (!z) {
                    try {
                        int A03 = r6.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                AbstractC04120Jd r2 = this.A00;
                                AbstractC04120Jd r1 = r2;
                                if (!((AbstractC05040Mx) r2).A00) {
                                    r1 = AnonymousClass078.A04(r2);
                                    this.A00 = r1;
                                }
                                r1.add(r6.A09(AnonymousClass2B8.A04.A0A(), r7));
                            } else if (!A0G(A03, r6)) {
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
                ((AbstractC05040Mx) this.A00).A00 = false;
                return null;
            case 4:
                return new AnonymousClass2B7();
            case 5:
                return new C77643gl(null);
            case 6:
                break;
            case 7:
                if (A02 == null) {
                    synchronized (AnonymousClass2B7.class) {
                        if (A02 == null) {
                            A02 = new AnonymousClass275(A01);
                        }
                    }
                }
                return A02;
            default:
                throw new UnsupportedOperationException();
        }
        return A01;
    }

    @Override // X.AnonymousClass076
    public int A90() {
        int i = ((AnonymousClass078) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00.size(); i3++) {
            i2 += AbstractC11750gu.A08(1, (AnonymousClass076) this.A00.get(i3));
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r4) {
        for (int i = 0; i < this.A00.size(); i++) {
            r4.A0K(1, (AnonymousClass076) this.A00.get(i));
        }
        this.unknownFields.A02(r4);
    }
}
