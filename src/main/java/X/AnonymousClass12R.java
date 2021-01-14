package X;

import android.util.Pair;

/* renamed from: X.12R  reason: invalid class name */
public abstract class AnonymousClass12R {
    public static final AnonymousClass12R A00 = new C33841hT();

    public int A00() {
        if (this instanceof C34231i7) {
            return 1;
        }
        if (this instanceof AnonymousClass25Y) {
            AnonymousClass25Y r0 = (AnonymousClass25Y) this;
            return r0.A00 * r0.A02;
        } else if (!(this instanceof AnonymousClass25X)) {
            return 0;
        } else {
            return ((AnonymousClass25X) this).A00.A00();
        }
    }

    public int A01() {
        if (this instanceof C34231i7) {
            return 1;
        }
        if (this instanceof AnonymousClass25Y) {
            AnonymousClass25Y r0 = (AnonymousClass25Y) this;
            return r0.A01 * r0.A02;
        } else if (!(this instanceof AnonymousClass25X)) {
            return 0;
        } else {
            return ((AnonymousClass25X) this).A00.A01();
        }
    }

    public int A02(int i, int i2, boolean z) {
        if (this instanceof AnonymousClass25X) {
            AnonymousClass12R r2 = ((AnonymousClass25X) this).A00;
            int A02 = r2.A02(i, i2, z);
            return A02 == -1 ? r2.A05(z) : A02;
        } else if (this instanceof AbstractC34121hw) {
            AbstractC34121hw r7 = (AbstractC34121hw) this;
            int i3 = 0;
            AnonymousClass25Y r1 = (AnonymousClass25Y) r7;
            int i4 = r1.A01;
            int i5 = i / i4;
            int i6 = i4 * i5;
            AnonymousClass12R r3 = r1.A03;
            int i7 = i - i6;
            if (i2 != 2) {
                i3 = i2;
            }
            int A022 = r3.A02(i7, i3, z);
            if (A022 != -1) {
                return i6 + A022;
            }
            int A0E = r7.A0E(i5, z);
            while (true) {
                if (A0E == -1) {
                    break;
                } else if (r3.A0D()) {
                    A0E = r7.A0E(A0E, z);
                } else if (A0E != -1) {
                    return r3.A05(z) + (A0E * i4);
                }
            }
            if (i2 == 2) {
                return r7.A05(z);
            }
            return -1;
        } else if (i2 == 0) {
            int i8 = i + 1;
            if (i == A06(z)) {
                return -1;
            }
            return i8;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 == 2) {
                return i == A06(z) ? A05(z) : i + 1;
            }
            throw new IllegalStateException();
        }
    }

    public final int A03(int i, AnonymousClass12P r4, AnonymousClass12Q r5, int i2, boolean z) {
        int i3 = A08(i, r4, false).A00;
        if (A0A(i3, r5).A01 != i) {
            return i + 1;
        }
        int A02 = A02(i3, i2, z);
        if (A02 == -1) {
            return -1;
        }
        return A0A(A02, r5).A00;
    }

    public int A04(Object obj) {
        int intValue;
        if (this instanceof C34231i7) {
            return C34231i7.A05.equals(obj) ? 0 : -1;
        }
        if (this instanceof AnonymousClass25X) {
            return ((AnonymousClass25X) this).A00.A04(obj);
        }
        if (!(this instanceof AbstractC34121hw)) {
            return -1;
        }
        AbstractC34121hw r4 = (AbstractC34121hw) this;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        if (!(obj2 instanceof Integer) || (intValue = ((Number) obj2).intValue()) == -1) {
            return -1;
        }
        AnonymousClass25Y r42 = (AnonymousClass25Y) r4;
        int A04 = r42.A03.A04(obj3);
        if (A04 != -1) {
            return (intValue * r42.A00) + A04;
        }
        return -1;
    }

    public int A05(boolean z) {
        if (this instanceof AnonymousClass25X) {
            return ((AnonymousClass25X) this).A00.A05(z);
        }
        if (!(this instanceof AbstractC34121hw)) {
            return A0D() ? -1 : 0;
        }
        AbstractC34121hw r5 = (AbstractC34121hw) this;
        if (r5.A00 != 0) {
            int i = 0;
            if (z && ((C34221i6) r5.A01).A00 <= 0) {
                i = -1;
            }
            do {
                AnonymousClass25Y r3 = (AnonymousClass25Y) r5;
                AnonymousClass12R r2 = r3.A03;
                if (r2.A0D()) {
                    i = r5.A0E(i, z);
                } else {
                    return r2.A05(z) + (i * r3.A01);
                }
            } while (i != -1);
        }
        return -1;
    }

    public int A06(boolean z) {
        int i;
        if (this instanceof AnonymousClass25X) {
            return ((AnonymousClass25X) this).A00.A06(z);
        }
        if (this instanceof AbstractC34121hw) {
            AbstractC34121hw r5 = (AbstractC34121hw) this;
            int i2 = r5.A00;
            if (i2 == 0) {
                return -1;
            }
            if (z) {
                int i3 = ((C34221i6) r5.A01).A00;
                i = i3 - 1;
                if (i3 <= 0) {
                    i = -1;
                }
            } else {
                i = i2 - 1;
            }
            while (true) {
                AnonymousClass25Y r3 = (AnonymousClass25Y) r5;
                AnonymousClass12R r2 = r3.A03;
                if (!r2.A0D()) {
                    return r2.A06(z) + (i * r3.A01);
                }
                if (z) {
                    if (r5.A01 != null) {
                        i--;
                        if (i < 0) {
                            return -1;
                        }
                    } else {
                        throw null;
                    }
                } else if (i <= 0 || i - 1 == -1) {
                    return -1;
                }
            }
        } else if (A0D()) {
            return -1;
        } else {
            return A01() - 1;
        }
    }

    public final Pair A07(AnonymousClass12Q r17, AnonymousClass12P r18, int i, long j, long j2) {
        C002001d.A2M(i, A01());
        A0B(i, r17, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        int i2 = r17.A00;
        long j3 = 0 + j;
        long j4 = A08(i2, r18, true).A01;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < r17.A01) {
            j3 -= j4;
            i2++;
            j4 = A08(i2, r18, true).A01;
        }
        return Pair.create(r18.A04, Long.valueOf(j3));
    }

    public AnonymousClass12P A08(int i, AnonymousClass12P r11, boolean z) {
        Object obj;
        if (this instanceof C34231i7) {
            C34231i7 r1 = (C34231i7) this;
            C002001d.A2M(i, 1);
            if (z) {
                obj = C34231i7.A05;
            } else {
                obj = null;
            }
            long j = r1.A00;
            long j2 = -0;
            if (r11 != null) {
                AnonymousClass14C r0 = AnonymousClass14C.A04;
                r11.A04 = obj;
                r11.A00 = 0;
                r11.A01 = j;
                r11.A02 = j2;
                r11.A03 = r0;
                return r11;
            }
            throw null;
        } else if (this instanceof AnonymousClass25X) {
            return ((AnonymousClass25X) this).A00.A08(i, r11, z);
        } else {
            if (!(this instanceof AbstractC34121hw)) {
                throw new IndexOutOfBoundsException();
            }
            AnonymousClass25Y r02 = (AnonymousClass25Y) ((AbstractC34121hw) this);
            int i2 = r02.A00;
            int i3 = i / i2;
            r02.A03.A08(i - (i2 * i3), r11, z);
            r11.A00 += r02.A01 * i3;
            if (z) {
                r11.A04 = Pair.create(Integer.valueOf(i3), r11.A04);
            }
            return r11;
        }
    }

    public AnonymousClass12P A09(Object obj, AnonymousClass12P r6) {
        int intValue;
        if (!(this instanceof AbstractC34121hw)) {
            return A08(A04(obj), r6, true);
        }
        AbstractC34121hw r3 = (AbstractC34121hw) this;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        if (!(obj2 instanceof Integer)) {
            intValue = -1;
        } else {
            intValue = ((Number) obj2).intValue();
        }
        AnonymousClass25Y r32 = (AnonymousClass25Y) r3;
        int i = intValue * r32.A01;
        r32.A03.A09(obj3, r6);
        r6.A00 += i;
        r6.A04 = obj;
        return r6;
    }

    public final AnonymousClass12Q A0A(int i, AnonymousClass12Q r8) {
        return A0B(i, r8, false, 0);
    }

    public AnonymousClass12Q A0B(int i, AnonymousClass12Q r11, boolean z, long j) {
        if (this instanceof C34231i7) {
            C34231i7 r1 = (C34231i7) this;
            C002001d.A2M(i, 1);
            boolean z2 = r1.A04;
            long j2 = r1.A02;
            r11.A03 = z2;
            r11.A02 = j2;
            r11.A00 = 0;
            r11.A01 = 0;
            return r11;
        } else if (this instanceof AnonymousClass25X) {
            return ((AnonymousClass25X) this).A00.A0B(i, r11, z, j);
        } else {
            if (!(this instanceof AbstractC34121hw)) {
                throw new IndexOutOfBoundsException();
            }
            AnonymousClass25Y r3 = (AnonymousClass25Y) ((AbstractC34121hw) this);
            int i2 = r3.A01;
            int i3 = i / i2;
            int i4 = i2 * i3;
            int i5 = i3 * r3.A00;
            r3.A03.A0B(i - i4, r11, z, j);
            r11.A00 += i5;
            r11.A01 += i5;
            return r11;
        }
    }

    public Object A0C(int i) {
        if (this instanceof C34231i7) {
            C002001d.A2M(i, 1);
            return C34231i7.A05;
        } else if (this instanceof AnonymousClass25X) {
            return ((AnonymousClass25X) this).A00.A0C(i);
        } else {
            if (!(this instanceof AbstractC34121hw)) {
                throw new IndexOutOfBoundsException();
            }
            AnonymousClass25Y r0 = (AnonymousClass25Y) ((AbstractC34121hw) this);
            int i2 = r0.A00;
            int i3 = i / i2;
            return Pair.create(Integer.valueOf(i3), r0.A03.A0C(i - (i2 * i3)));
        }
    }

    public final boolean A0D() {
        return A01() == 0;
    }
}
