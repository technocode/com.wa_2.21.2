package X;

import java.util.Arrays;

/* renamed from: X.1Fn  reason: invalid class name and case insensitive filesystem */
public final class C25201Fn implements Cloneable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int[] A03;

    public C25201Fn(int i, int i2) {
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.A02 = i;
        this.A00 = i2;
        int i3 = (i + 31) >> 5;
        this.A01 = i3;
        this.A03 = new int[(i3 * i2)];
    }

    public C25201Fn(int i, int i2, int i3, int[] iArr) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = iArr;
    }

    public void A00(int i, int i2) {
        int i3 = (i >> 5) + (i2 * this.A01);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public void A01(int i, int i2) {
        int i3 = (i >> 5) + (i2 * this.A01);
        int[] iArr = this.A03;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void A02(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 < 1 || i3 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.A00 || i5 > this.A02) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.A01 * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.A03;
                    int i9 = (i8 >> 5) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public boolean A03(int i, int i2) {
        return ((this.A03[(i >> 5) + (i2 * this.A01)] >>> (i & 31)) & 1) != 0;
    }

    @Override // java.lang.Object
    public Object clone() {
        return new C25201Fn(this.A02, this.A00, this.A01, (int[]) this.A03.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25201Fn)) {
            return false;
        }
        C25201Fn r4 = (C25201Fn) obj;
        if (this.A02 == r4.A02 && this.A00 == r4.A00 && this.A01 == r4.A01 && Arrays.equals(this.A03, r4.A03)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A02;
        return Arrays.hashCode(this.A03) + (((((((i * 31) + i) * 31) + this.A00) * 31) + this.A01) * 31);
    }

    public String toString() {
        int i = this.A00;
        int i2 = this.A02;
        StringBuilder sb = new StringBuilder((i2 + 1) * i);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(A03(i4, i3) ? "X " : "  ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
