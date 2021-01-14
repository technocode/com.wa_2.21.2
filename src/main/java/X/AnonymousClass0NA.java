package X;

import java.io.IOException;

/* renamed from: X.0NA  reason: invalid class name */
public final class AnonymousClass0NA extends AnonymousClass078 implements AnonymousClass077 {
    public static final AnonymousClass0NA A03;
    public static volatile AbstractC37151nd A04;
    public float A00;
    public int A01;
    public String A02 = "";

    static {
        AnonymousClass0NA r0 = new AnonymousClass0NA();
        A03 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r10, Object obj, Object obj2) {
        boolean z = false;
        switch (r10.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                AnonymousClass0NA r12 = (AnonymousClass0NA) obj2;
                int i = this.A01;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                String str = this.A02;
                int i2 = r12.A01;
                boolean z3 = false;
                if ((i2 & 1) == 1) {
                    z3 = true;
                }
                this.A02 = r11.ARH(z2, str, z3, r12.A02);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                float f = this.A00;
                if ((i2 & 2) == 2) {
                    z = true;
                }
                this.A00 = r11.AR8(z4, f, z, r12.A00);
                if (r11 == C04980Mp.A00) {
                    this.A01 = i | i2;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r112.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = r112.A0A();
                                this.A01 |= 1;
                                this.A02 = A0A;
                            } else if (A032 == 21) {
                                this.A01 |= 2;
                                this.A00 = Float.intBitsToFloat(r112.A01());
                            } else if (!A0G(A032, r112)) {
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
                return new AnonymousClass0NA();
            case 5:
                return new C76893fH();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (AnonymousClass0NA.class) {
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
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            i3 = 0 + AbstractC11750gu.A09(1, this.A02);
        }
        if ((this.A01 & 2) == 2) {
            if (!true || !true) {
                i = 1;
            } else if (!true || !true) {
                i = 2;
            } else if (!true || !true) {
                i = 3;
            } else {
                i = 5;
                if (!true || !true) {
                    i = 4;
                }
            }
            i3 += i + 4;
        }
        int A002 = this.unknownFields.A00() + i3;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A01 & 1) == 1) {
            r3.A0L(1, this.A02);
        }
        if ((this.A01 & 2) == 2) {
            r3.A0D(2, Float.floatToRawIntBits(this.A00));
        }
        this.unknownFields.A02(r3);
    }
}
