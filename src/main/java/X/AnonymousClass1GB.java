package X;

/* renamed from: X.1GB  reason: invalid class name */
public class AnonymousClass1GB {
    public final C25201Fn A00;

    public AnonymousClass1GB(C25201Fn r1) {
        this.A00 = r1;
    }

    public final float A00(int i, int i2, int i3, int i4) {
        double sqrt;
        boolean z;
        int i5 = i;
        int i6 = i3;
        int i7 = 1;
        boolean z2 = false;
        int i8 = i2;
        int i9 = i4;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z2 = true;
            i8 = i5;
            i5 = i2;
            i9 = i6;
            i6 = i4;
        }
        int abs = Math.abs(i6 - i5);
        int i10 = i9 - i8;
        int abs2 = Math.abs(i10);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = -1;
        if (i5 < i6) {
            i13 = 1;
        }
        if (i8 < i9) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i5;
        int i16 = i8;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                break;
            }
            int i18 = i15;
            if (z2) {
                i18 = i16;
            }
            int i19 = i16;
            if (z2) {
                i19 = i15;
            }
            if (i17 == i7) {
                z = true;
            } else {
                z = false;
            }
            if (z == this.A00.A03(i18, i19)) {
                if (i17 == 2) {
                    int i20 = i15 - i5;
                    int i21 = i16 - i8;
                    sqrt = Math.sqrt((double) ((i21 * i21) + (i20 * i20)));
                    break;
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i9) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i7 = 1;
        }
        if (i17 != 2) {
            return Float.NaN;
        }
        int i22 = i14 - i5;
        sqrt = Math.sqrt((double) ((i10 * i10) + (i22 * i22)));
        return (float) sqrt;
    }

    public final float A01(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float A002 = A00(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else {
            int i7 = this.A00.A02;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f = ((float) (i8 - i)) / ((float) (i5 - i));
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f3 = (float) i2;
        int i9 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i9 < 0) {
            f2 = f3 / ((float) (i2 - i9));
        } else {
            int i10 = this.A00.A00;
            if (i9 >= i10) {
                i6 = i10 - 1;
                f2 = ((float) (i6 - i2)) / ((float) (i9 - i2));
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (A00(i, i2, (int) ((((float) (i5 - i)) * f2) + ((float) i)), i6) + A002) - 1.0f;
    }

    public final float A02(C25171Fj r6, C25171Fj r7) {
        int i = (int) r6.A00;
        int i2 = (int) r6.A01;
        int i3 = (int) r7.A00;
        int i4 = (int) r7.A01;
        float A01 = A01(i, i2, i3, i4);
        float A012 = A01(i3, i4, i, i2);
        if (Float.isNaN(A01)) {
            return A012 / 7.0f;
        }
        return Float.isNaN(A012) ? A01 / 7.0f : (A01 + A012) / 14.0f;
    }
}
