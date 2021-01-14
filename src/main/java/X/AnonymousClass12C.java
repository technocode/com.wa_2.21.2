package X;

import android.util.Pair;

/* renamed from: X.12C  reason: invalid class name */
public final class AnonymousClass12C {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass12A A04;
    public AnonymousClass12A A05;
    public AnonymousClass12A A06;
    public AnonymousClass12R A07 = AnonymousClass12R.A00;
    public Object A08;
    public boolean A09;
    public final AnonymousClass12P A0A = new AnonymousClass12P();
    public final AnonymousClass12Q A0B = new AnonymousClass12Q();

    public AnonymousClass12A A00() {
        AnonymousClass12A r1 = this.A05;
        if (r1 != null) {
            if (r1 == this.A06) {
                this.A06 = r1.A01;
            }
            r1.A02();
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
                AnonymousClass12A r12 = this.A05;
                this.A08 = r12.A0B;
                this.A03 = r12.A02.A03.A03;
            }
            AnonymousClass12A r0 = this.A05.A01;
            this.A05 = r0;
            return r0;
        }
        AnonymousClass12A r02 = this.A04;
        this.A05 = r02;
        this.A06 = r02;
        return r02;
    }

    public final AnonymousClass12B A01(AnonymousClass12A r24, long j) {
        AnonymousClass12B r4 = r24.A02;
        long j2 = (r24.A00 + r4.A01) - j;
        long j3 = 0;
        if (r4.A05) {
            int A042 = this.A07.A04(r4.A03.A04);
            AnonymousClass12R r15 = this.A07;
            AnonymousClass12P r7 = this.A0A;
            AnonymousClass12Q r9 = this.A0B;
            int A032 = r15.A03(A042, r7, r9, this.A01, this.A09);
            if (A032 == -1) {
                return null;
            }
            int i = this.A07.A08(A032, r7, true).A00;
            Object obj = r7.A04;
            long j4 = r4.A03.A03;
            if (this.A07.A0A(i, r9).A00 == A032) {
                Pair A072 = this.A07.A07(r9, r7, i, -9223372036854775807L, Math.max(0L, j2));
                if (A072 == null) {
                    return null;
                }
                obj = A072.first;
                j3 = ((Number) A072.second).longValue();
                AnonymousClass12A r0 = r24.A01;
                if (r0 == null || !r0.A0B.equals(obj)) {
                    j4 = this.A02;
                    this.A02 = 1 + j4;
                } else {
                    j4 = r24.A01.A02.A03.A03;
                }
            }
            C229113r A052 = A05(obj, j3, j4);
            AnonymousClass12R r02 = this.A07;
            Object obj2 = A052.A04;
            r02.A09(obj2, r7);
            if (A052.A00()) {
                return null;
            }
            return A03(obj2, j3, A052.A03);
        }
        C229113r r92 = r4.A03;
        AnonymousClass12R r2 = this.A07;
        Object obj3 = r92.A04;
        AnonymousClass12P r1 = this.A0A;
        r2.A09(obj3, r1);
        if (r92.A00()) {
            return null;
        }
        long j5 = r4.A03.A02;
        if (j5 != Long.MIN_VALUE) {
            long[] jArr = r1.A03.A02;
            int length = jArr.length - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                long j6 = jArr[length];
                if (j6 != Long.MIN_VALUE && j5 >= j6) {
                    break;
                }
                length--;
            }
            if (length == -1) {
                return A03(r92.A04, j5, r92.A03);
            }
            return null;
        }
        AnonymousClass14C r03 = r1.A03;
        int i2 = r03.A00;
        if (i2 == 0) {
            return null;
        }
        return r03.A02[i2 - 1] == Long.MIN_VALUE ? null : null;
    }

    public AnonymousClass12B A02(AnonymousClass12B r14) {
        long j;
        C229113r r4 = r14.A03;
        boolean A092 = A09(r4);
        boolean A0A2 = A0A(r4, A092);
        AnonymousClass12R r1 = this.A07;
        Object obj = r4.A04;
        AnonymousClass12P r3 = this.A0A;
        r1.A09(obj, r3);
        if (r4.A00()) {
            j = -9223372036854775807L;
        } else {
            j = r4.A02;
            if (j == Long.MIN_VALUE) {
                j = r3.A01;
            }
        }
        return new AnonymousClass12B(r4, r14.A02, r14.A00, j, A092, A0A2);
    }

    public final AnonymousClass12B A03(Object obj, long j, long j2) {
        long j3;
        AnonymousClass12P r4 = this.A0A;
        int A002 = r4.A00(j);
        if (A002 == -1) {
            j3 = Long.MIN_VALUE;
        } else {
            j3 = r4.A03.A02[A002];
        }
        C229113r r6 = new C229113r(obj, j2, j3);
        this.A07.A09(r6.A04, r4);
        boolean A092 = A09(r6);
        boolean A0A2 = A0A(r6, A092);
        if (j3 == Long.MIN_VALUE) {
            j3 = r4.A01;
        }
        return new AnonymousClass12B(r6, j, -9223372036854775807L, j3, A092, A0A2);
    }

    public C229113r A04(Object obj, long j) {
        long j2;
        int A042;
        AnonymousClass12R r0 = this.A07;
        AnonymousClass12P r6 = this.A0A;
        int i = r0.A09(obj, r6).A00;
        Object obj2 = this.A08;
        if (obj2 == null || (A042 = this.A07.A04(obj2)) == -1 || this.A07.A08(A042, r6, false).A00 != i) {
            AnonymousClass12A r1 = this.A05;
            if (r1 == null) {
                r1 = this.A04;
            }
            while (true) {
                if (r1 == null) {
                    AnonymousClass12A r3 = this.A05;
                    if (r3 == null) {
                        r3 = this.A04;
                    }
                    while (true) {
                        if (r3 != null) {
                            int A043 = this.A07.A04(r3.A0B);
                            if (A043 != -1 && this.A07.A08(A043, r6, false).A00 == i) {
                                j2 = r3.A02.A03.A03;
                                break;
                            }
                            r3 = r3.A01;
                        } else {
                            j2 = this.A02;
                            this.A02 = 1 + j2;
                            break;
                        }
                    }
                } else if (r1.A0B.equals(obj)) {
                    j2 = r1.A02.A03.A03;
                    break;
                } else {
                    r1 = r1.A01;
                }
            }
        } else {
            j2 = this.A03;
        }
        return A05(obj, j, j2);
    }

    public final C229113r A05(Object obj, long j, long j2) {
        long j3;
        AnonymousClass12R r0 = this.A07;
        AnonymousClass12P r10 = this.A0A;
        r0.A09(obj, r10);
        AnonymousClass14C r9 = r10.A03;
        long[] jArr = r9.A02;
        int length = jArr.length - 1;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            long j4 = jArr[length];
            if (j4 != Long.MIN_VALUE && j >= j4) {
                break;
            }
            length--;
        }
        if (length == -1) {
            int A002 = r10.A00(j);
            if (A002 == -1) {
                j3 = Long.MIN_VALUE;
            } else {
                j3 = jArr[A002];
            }
            return new C229113r(obj, j2, j3);
        }
        AnonymousClass14B r3 = r9.A03[length];
        int i = 0;
        while (true) {
            int[] iArr = r3.A01;
            if (i < iArr.length && iArr[i] != 0 && iArr[i] != 1) {
                i++;
            }
        }
        return new C229113r(obj, length, i, j2);
    }

    public void A06(boolean z) {
        Object obj;
        AnonymousClass12A r3 = this.A05;
        if (r3 == null) {
            r3 = this.A04;
        }
        if (r3 != null) {
            if (z) {
                obj = r3.A0B;
            } else {
                obj = null;
            }
            this.A08 = obj;
            this.A03 = r3.A02.A03.A03;
            r3.A02();
            A08(r3);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A07() {
        AnonymousClass12A r3;
        AnonymousClass12A r2 = this.A05;
        if (r2 == null) {
            r2 = this.A04;
        }
        if (r2 == null) {
            return true;
        }
        int A042 = this.A07.A04(r2.A0B);
        while (true) {
            A042 = this.A07.A03(A042, this.A0A, this.A0B, this.A01, this.A09);
            while (true) {
                r3 = r2.A01;
                if (r3 != null && !r2.A02.A05) {
                    r2 = r3;
                }
            }
            if (A042 == -1 || r3 == null || this.A07.A04(r3.A0B) != A042) {
                boolean A082 = A08(r2);
                r2.A02 = A02(r2.A02);
            } else {
                r2 = r2.A01;
            }
        }
        boolean A0822 = A08(r2);
        r2.A02 = A02(r2.A02);
        if (!A0822 || this.A05 == null) {
            return true;
        }
        return false;
    }

    public boolean A08(AnonymousClass12A r4) {
        boolean z = false;
        boolean z2 = false;
        if (r4 != null) {
            z2 = true;
        }
        C002001d.A3A(z2);
        this.A04 = r4;
        while (true) {
            r4 = r4.A01;
            if (r4 != null) {
                if (r4 == this.A06) {
                    this.A06 = this.A05;
                    z = true;
                }
                r4.A02();
                this.A00--;
            } else {
                this.A04.A01 = null;
                return z;
            }
        }
    }

    public final boolean A09(C229113r r9) {
        AnonymousClass12R r1 = this.A07;
        Object obj = r9.A04;
        AnonymousClass12P r3 = this.A0A;
        int i = r1.A09(obj, r3).A03.A00;
        if (i == 0) {
            return true;
        }
        boolean A002 = r9.A00();
        if (r3.A03.A02[i - 1] == Long.MIN_VALUE || A002 || r9.A02 != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean A0A(C229113r r10, boolean z) {
        int A042 = this.A07.A04(r10.A04);
        AnonymousClass12R r1 = this.A07;
        AnonymousClass12P r5 = this.A0A;
        int i = r1.A08(A042, r5, false).A00;
        AnonymousClass12R r0 = this.A07;
        AnonymousClass12Q r6 = this.A0B;
        r0.A0A(i, r6);
        if (this.A07.A03(A042, r5, r6, this.A01, this.A09) != -1 || !z) {
            return false;
        }
        return true;
    }
}
