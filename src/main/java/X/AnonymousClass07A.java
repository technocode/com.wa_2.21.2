package X;

import java.util.Arrays;

/* renamed from: X.07A  reason: invalid class name */
public final class AnonymousClass07A {
    public static final AnonymousClass07A A04 = new AnonymousClass07A(0, new int[0], new Object[0], false);
    public int A00;
    public boolean A01;
    public int[] A02;
    public Object[] A03;
    public int count;

    public AnonymousClass07A() {
        this(0, new int[8], new Object[8], true);
    }

    public AnonymousClass07A(int i, int[] iArr, Object[] objArr, boolean z) {
        this.A00 = -1;
        this.count = i;
        this.A02 = iArr;
        this.A03 = objArr;
        this.A01 = z;
    }

    public int A00() {
        int A06;
        int i = this.A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.A02[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 += AbstractC11750gu.A01((i5 << 3) | 0) + 8;
                } else if (i6 == 2) {
                    A06 = AbstractC11750gu.A07(i5, (AnonymousClass071) this.A03[i3]);
                } else if (i6 == 3) {
                    i2 = ((AnonymousClass07A) this.A03[i3]).A00() + (AbstractC11750gu.A01((i5 << 3) | 0) << 1) + i2;
                } else if (i6 == 5) {
                    A06 = AbstractC11750gu.A01((i5 << 3) | 0) + 4;
                } else {
                    throw new IllegalStateException(new C04190Jk("Protocol message tag had invalid wire type."));
                }
            } else {
                A06 = AbstractC11750gu.A06(i5, ((Number) this.A03[i3]).longValue());
            }
            i2 = A06 + i2;
        }
        this.A00 = i2;
        return i2;
    }

    public final void A01(int i, Object obj) {
        int i2 = this.count;
        int[] iArr = this.A02;
        if (i2 == iArr.length) {
            int i3 = i2 >> 1;
            if (i2 < 4) {
                i3 = 8;
            }
            int i4 = i2 + i3;
            this.A02 = Arrays.copyOf(iArr, i4);
            this.A03 = Arrays.copyOf(this.A03, i4);
        }
        int[] iArr2 = this.A02;
        int i5 = this.count;
        iArr2[i5] = i;
        this.A03[i5] = obj;
        this.count = i5 + 1;
    }

    public void A02(AbstractC11750gu r6) {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.A02[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                r6.A0H(i3, ((Number) this.A03[i]).longValue());
            } else if (i4 == 1) {
                r6.A0G(i3, ((Number) this.A03[i]).longValue());
            } else if (i4 == 2) {
                r6.A0J(i3, (AnonymousClass071) this.A03[i]);
            } else if (i4 == 3) {
                r6.A0C((i3 << 3) | 3);
                ((AnonymousClass07A) this.A03[i]).A02(r6);
                r6.A0C((i3 << 3) | 4);
            } else if (i4 == 5) {
                r6.A0D(i3, ((Number) this.A03[i]).intValue());
            } else {
                throw new C04190Jk("Protocol message tag had invalid wire type.");
            }
        }
    }

    public boolean A03(int i, C05010Mt r10) {
        int A032;
        if (this.A01) {
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i3 == 0) {
                A01(i, Long.valueOf(r10.A06()));
                return true;
            } else if (i3 == 1) {
                A01(i, Long.valueOf(r10.A05()));
                return true;
            } else if (i3 == 2) {
                A01(i, r10.A08());
                return true;
            } else if (i3 == 3) {
                AnonymousClass07A r1 = new AnonymousClass07A(0, new int[8], new Object[8], true);
                do {
                    A032 = r10.A03();
                    if (A032 == 0) {
                        break;
                    }
                } while (r1.A03(A032, r10));
                r10.A0C((i2 << 3) | 4);
                A01(i, r1);
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    A01(i, Integer.valueOf(r10.A01()));
                    return true;
                }
                throw new C04190Jk("Protocol message tag had invalid wire type.");
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AnonymousClass07A)) {
            return false;
        }
        AnonymousClass07A r5 = (AnonymousClass07A) obj;
        return this.count == r5.count && Arrays.equals(this.A02, r5.A02) && Arrays.deepEquals(this.A03, r5.A03);
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.A03) + ((Arrays.hashCode(this.A02) + ((527 + this.count) * 31)) * 31);
    }
}
