package X;

import java.util.Arrays;

/* renamed from: X.1Fm  reason: invalid class name */
public final class AnonymousClass1Fm implements Cloneable {
    public int A00;
    public int[] A01;

    public AnonymousClass1Fm() {
        this.A00 = 0;
        this.A01 = new int[1];
    }

    public AnonymousClass1Fm(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    public final void A00(int i) {
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i > (length << 5)) {
            int[] iArr2 = new int[((i + 31) >> 5)];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.A01 = iArr2;
        }
    }

    public void A01(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        A00(this.A00 + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            A02(z);
            i2--;
        }
    }

    public void A02(boolean z) {
        A00(this.A00 + 1);
        if (z) {
            int[] iArr = this.A01;
            int i = this.A00;
            int i2 = i >> 5;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.A00++;
    }

    public boolean A03(int i) {
        return ((1 << (i & 31)) & this.A01[i >> 5]) != 0;
    }

    @Override // java.lang.Object
    public Object clone() {
        return new AnonymousClass1Fm((int[]) this.A01.clone(), this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1Fm)) {
            return false;
        }
        AnonymousClass1Fm r4 = (AnonymousClass1Fm) obj;
        if (this.A00 != r4.A00 || !Arrays.equals(this.A01, r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01) + (this.A00 * 31);
    }

    public String toString() {
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            char c = '.';
            if (A03(i2)) {
                c = 'X';
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
