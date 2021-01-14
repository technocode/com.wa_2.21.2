package X;

import java.io.IOException;

/* renamed from: X.0gG  reason: invalid class name and case insensitive filesystem */
public final class C11420gG extends AnonymousClass078 implements AnonymousClass077 {
    public static final C11420gG A03;
    public static volatile AbstractC37151nd A04;
    public int A00;
    public int A01;
    public boolean A02;

    static {
        C11420gG r0 = new C11420gG();
        A03 = r0;
        r0.A0C();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass078
    public final Object A0H(EnumC04960Mn r10, Object obj, Object obj2) {
        EnumC11410gF r0;
        boolean z = false;
        switch (r10.ordinal()) {
            case 0:
                return A03;
            case 1:
                AbstractC05000Mr r11 = (AbstractC05000Mr) obj;
                C11420gG r12 = (C11420gG) obj2;
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
                boolean z5 = this.A02;
                if ((i3 & 2) == 2) {
                    z = true;
                }
                this.A02 = r11.AR5(z4, z5, z, r12.A02);
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
                            if (A032 == 120) {
                                int A022 = r112.A02();
                                if (A022 == 0) {
                                    r0 = EnumC11410gF.SYSTEM;
                                } else if (A022 == 1) {
                                    r0 = EnumC11410gF.GOOGLE;
                                } else if (A022 == 2) {
                                    r0 = EnumC11410gF.HARDCODED;
                                } else if (A022 == 3) {
                                    r0 = EnumC11410gF.OVERRIDE;
                                } else if (A022 != 4) {
                                    r0 = null;
                                } else {
                                    r0 = EnumC11410gF.FALLBACK;
                                }
                                if (r0 == null) {
                                    super.A0D(15, A022);
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A022;
                                }
                            } else if (A032 == 128) {
                                this.A00 |= 2;
                                this.A02 = r112.A0H();
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
                return new C11420gG();
            case 5:
                return new C11430gH();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C11420gG.class) {
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
            i2 = 0 + AbstractC11750gu.A02(15, this.A01);
        }
        if ((i3 & 2) == 2) {
            i2 += AbstractC11750gu.A00(16);
        }
        int A002 = this.unknownFields.A00() + i2;
        ((AnonymousClass078) this).A00 = A002;
        return A002;
    }

    @Override // X.AnonymousClass076
    public void ARP(AbstractC11750gu r3) {
        if ((this.A00 & 1) == 1) {
            r3.A0E(15, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            r3.A0M(16, this.A02);
        }
        this.unknownFields.A02(r3);
    }
}
