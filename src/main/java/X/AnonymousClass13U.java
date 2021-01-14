package X;

/* renamed from: X.13U  reason: invalid class name */
public final class AnonymousClass13U {
    public final int A00;
    public final int A01;
    public final long A02;
    public final AnonymousClass13S A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public AnonymousClass13U(AnonymousClass13S r7, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = false;
        C002001d.A39(length == length2);
        int length3 = jArr.length;
        C002001d.A39(length3 == length2);
        int length4 = iArr2.length;
        C002001d.A39(length4 == length2 ? true : z);
        this.A03 = r7;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public int A00(long j) {
        for (int A022 = AnonymousClass0W2.A02(this.A07, j); A022 >= 0; A022--) {
            if ((this.A04[A022] & 1) != 0) {
                return A022;
            }
        }
        return -1;
    }

    public int A01(long j) {
        long[] jArr = this.A07;
        for (int A032 = AnonymousClass0W2.A03(jArr, j, true, false); A032 < jArr.length; A032++) {
            if ((this.A04[A032] & 1) != 0) {
                return A032;
            }
        }
        return -1;
    }
}
