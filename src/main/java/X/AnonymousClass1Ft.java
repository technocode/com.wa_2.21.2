package X;

/* renamed from: X.1Ft  reason: invalid class name */
public final class AnonymousClass1Ft {
    public static final AnonymousClass1Ft A07 = new AnonymousClass1Ft(67, 64, 1);
    public static final AnonymousClass1Ft A08 = new AnonymousClass1Ft(301, 256, 1);
    public static final AnonymousClass1Ft A09 = new AnonymousClass1Ft(285, 256, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass1Fu A03;
    public final AnonymousClass1Fu A04;
    public final int[] A05;
    public final int[] A06;

    static {
        new AnonymousClass1Ft(4201, 4096, 1);
        new AnonymousClass1Ft(1033, 1024, 1);
        new AnonymousClass1Ft(19, 16, 1);
    }

    public AnonymousClass1Ft(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        int[] iArr = new int[i2];
        this.A05 = iArr;
        int[] iArr2 = new int[i2];
        this.A06 = iArr2;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            iArr2[iArr[i6]] = i6;
        }
        this.A04 = new AnonymousClass1Fu(this, new int[]{0});
        this.A03 = new AnonymousClass1Fu(this, new int[]{1});
    }

    public int A00(int i) {
        if (i != 0) {
            return this.A05[(this.A02 - this.A06[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.A05;
        int[] iArr2 = this.A06;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.A02 - 1)];
    }

    public AnonymousClass1Fu A02(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.A04;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new AnonymousClass1Fu(this, iArr);
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("GF(0x");
        A0S.append(Integer.toHexString(this.A01));
        A0S.append(',');
        A0S.append(this.A02);
        A0S.append(')');
        return A0S.toString();
    }
}
