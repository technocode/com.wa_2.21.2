package X;

/* renamed from: X.0qB  reason: invalid class name and case insensitive filesystem */
public class C16670qB {
    public final AnonymousClass05V A00 = new AnonymousClass05V();
    public final C015008i A01 = new C015008i();

    public final C16360pg A00(AbstractC11910hD r7, int i) {
        C16650q9 r3;
        C16360pg r1;
        AnonymousClass05V r4 = this.A00;
        int A02 = r4.A02(r7);
        if (A02 >= 0 && (r3 = (C16650q9) r4.A02[(A02 << 1) + 1]) != null) {
            int i2 = r3.A00;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                r3.A00 = i3;
                if (i == 4) {
                    r1 = r3.A02;
                } else if (i == 8) {
                    r1 = r3.A01;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    r4.A05(A02);
                    r3.A00 = 0;
                    r3.A02 = null;
                    r3.A01 = null;
                    C16650q9.A03.A01(r3);
                }
                return r1;
            }
        }
        return null;
    }

    public void A01(AbstractC11910hD r3) {
        C16650q9 r1 = (C16650q9) this.A00.getOrDefault(r3, null);
        if (r1 != null) {
            r1.A00 &= -2;
        }
    }

    public void A02(AbstractC11910hD r7) {
        C015008i r5 = this.A01;
        int A002 = r5.A00() - 1;
        while (true) {
            if (A002 < 0) {
                break;
            } else if (r7 == r5.A02(A002)) {
                Object[] objArr = r5.A03;
                Object obj = objArr[A002];
                Object obj2 = C015008i.A04;
                if (obj != obj2) {
                    objArr[A002] = obj2;
                    r5.A01 = true;
                }
            } else {
                A002--;
            }
        }
        C16650q9 r1 = (C16650q9) this.A00.remove(r7);
        if (r1 != null) {
            r1.A00 = 0;
            r1.A02 = null;
            r1.A01 = null;
            C16650q9.A03.A01(r1);
        }
    }

    public void A03(AbstractC11910hD r4, C16360pg r5) {
        AnonymousClass05V r2 = this.A00;
        C16650q9 r1 = (C16650q9) r2.getOrDefault(r4, null);
        if (r1 == null) {
            r1 = C16650q9.A00();
            r2.put(r4, r1);
        }
        r1.A01 = r5;
        r1.A00 |= 8;
    }
}
