package X;

import java.io.IOException;

/* renamed from: X.3ck  reason: invalid class name and case insensitive filesystem */
public final class C75323ck extends AnonymousClass078 implements AnonymousClass077 {
    public static final C75323ck A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public int A01;
    public String A02 = "";

    static {
        C75323ck r0 = new C75323ck();
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
                C75323ck r12 = (C75323ck) obj2;
                int i = this.A00;
                boolean z2 = false;
                if ((i & 1) == 1) {
                    z2 = true;
                }
                int i2 = this.A01;
                int i3 = r12.A00;
                boolean z3 = false;
                if ((i3 & 1) == 1) {
                    z3 = true;
                }
                this.A01 = r11.AR9(z2, i2, z3, r12.A01);
                boolean z4 = false;
                if ((i & 2) == 2) {
                    z4 = true;
                }
                String str = this.A02;
                if ((i3 & 2) == 2) {
                    z = true;
                }
                this.A02 = r11.ARH(z4, str, z, r12.A02);
                if (r11 == C04980Mp.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C05010Mt r112 = (C05010Mt) obj;
                while (!z) {
                    try {
                        int A032 = r112.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                int A022 = r112.A02();
                                if (AnonymousClass3JG.A00(A022) == null) {
                                    super.A0D(1, A022);
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 18) {
                                String A0A = r112.A0A();
                                this.A00 |= 2;
                                this.A02 = A0A;
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
                return new C75323ck();
            case 5:
                return new C75313cj();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C75323ck.class) {
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
            i2 = 0 + AbstractC11750gu.A02(1, this.A01);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A09(2, this.A02);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0E(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0L(2, this.A02);
        }
        this.unknownFields.A02(r3);
    }
}