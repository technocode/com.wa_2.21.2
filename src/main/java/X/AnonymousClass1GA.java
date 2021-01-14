package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1GA  reason: invalid class name */
public final class AnonymousClass1GA {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C25201Fn A05;
    public final List A06 = new ArrayList(5);
    public final int[] A07;

    public AnonymousClass1GA(C25201Fn r3, int i, int i2, int i3, int i4, float f) {
        this.A05 = r3;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A00 = f;
        this.A07 = new int[3];
    }

    public final C37341o2 A00(int[] iArr, int i, int i2) {
        int i3;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = i4 + i5 + i6;
        float f = ((float) (i2 - i6)) - (((float) i5) / 2.0f);
        int i8 = (int) f;
        int i9 = i5 << 1;
        C25201Fn r3 = this.A05;
        int i10 = r3.A00;
        int[] iArr2 = this.A07;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i11 = i;
        while (i11 >= 0 && r3.A03(i8, i11)) {
            int i12 = iArr2[1];
            if (i12 > i9) {
                break;
            }
            iArr2[1] = i12 + 1;
            i11--;
        }
        float f2 = Float.NaN;
        if (i11 >= 0 && iArr2[1] <= i9) {
            while (!r3.A03(i8, i11) && (i3 = iArr2[0]) <= i9) {
                iArr2[0] = i3 + 1;
                i11--;
                if (i11 < 0) {
                    break;
                }
            }
            if (iArr2[0] <= i9) {
                int i13 = i + 1;
                while (i13 < i10 && r3.A03(i8, i13)) {
                    int i14 = iArr2[1];
                    if (i14 > i9) {
                        break;
                    }
                    iArr2[1] = i14 + 1;
                    i13++;
                }
                if (i13 != i10 && iArr2[1] <= i9) {
                    while (i13 < i10 && !r3.A03(i8, i13)) {
                        int i15 = iArr2[2];
                        if (i15 > i9) {
                            break;
                        }
                        iArr2[2] = i15 + 1;
                        i13++;
                    }
                    int i16 = iArr2[2];
                    if (i16 <= i9) {
                        int i17 = iArr2[0];
                        int i18 = iArr2[1];
                        if (Math.abs(((i17 + i18) + i16) - i7) * 5 < (i7 << 1) && A01(iArr2)) {
                            f2 = ((float) (i13 - i16)) - (((float) i18) / 2.0f);
                        }
                    }
                }
            }
        }
        if (Float.isNaN(f2)) {
            return null;
        }
        float f3 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        List<C37341o2> list = this.A06;
        for (C37341o2 r2 : list) {
            float f4 = r2.A01;
            if (Math.abs(f2 - f4) <= f3) {
                float f5 = ((C25171Fj) r2).A00;
                if (Math.abs(f - f5) <= f3) {
                    float f6 = r2.A00;
                    float abs = Math.abs(f3 - f6);
                    if (abs <= 1.0f || abs <= f6) {
                        return new C37341o2((f5 + f) / 2.0f, (f4 + f2) / 2.0f, (f6 + f3) / 2.0f);
                    }
                } else {
                    continue;
                }
            }
        }
        list.add(new C37341o2(f, f2, f3));
        return null;
    }

    public final boolean A01(int[] iArr) {
        float f = this.A00;
        float f2 = f / 2.0f;
        int i = 0;
        while (Math.abs(f - ((float) iArr[i])) < f2) {
            i++;
            if (i >= 3) {
                return true;
            }
        }
        return false;
    }
}
