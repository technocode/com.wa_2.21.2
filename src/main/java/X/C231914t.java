package X;

/* renamed from: X.14t  reason: invalid class name and case insensitive filesystem */
public final class C231914t {
    public final int A00;
    public final AnonymousClass14A A01;
    public final int[] A02;
    public final int[] A03;
    public final AnonymousClass14A[] A04;
    public final int[][][] A05;

    public C231914t(int[] iArr, AnonymousClass14A[] r3, int[] iArr2, int[][][] iArr3, AnonymousClass14A r6) {
        this.A03 = iArr;
        this.A04 = r3;
        this.A05 = iArr3;
        this.A02 = iArr2;
        this.A01 = r6;
        this.A00 = iArr.length;
    }

    public int A00(int i) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.A00; i4++) {
            if (this.A03[i4] == i) {
                int[][] iArr = this.A05[i4];
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= iArr.length) {
                        break;
                    }
                    for (int i7 = 0; i7 < iArr[i5].length; i7++) {
                        int i8 = iArr[i5][i7] & 7;
                        if (i8 != 3) {
                            if (i8 == 4) {
                                i6 = 3;
                                break;
                            }
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        i6 = Math.max(i6, i2);
                    }
                    i5++;
                }
                i3 = Math.max(i3, i6);
            }
        }
        return i3;
    }
}
