package X;

/* renamed from: X.1G4  reason: invalid class name */
public final class AnonymousClass1G4 {
    public static final int[] A02 = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};
    public static final int[][] A03 = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final byte A00;
    public final AnonymousClass1G3 A01;

    public AnonymousClass1G4(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 >= 0) {
            AnonymousClass1G3[] r1 = AnonymousClass1G3.A00;
            if (i2 < r1.length) {
                this.A01 = r1[i2];
                this.A00 = (byte) (i & 7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static int A00(int i, int i2) {
        int i3 = i ^ i2;
        int[] iArr = A02;
        return iArr[i3 & 15] + iArr[(i3 >>> 4) & 15] + iArr[(i3 >>> 8) & 15] + iArr[(i3 >>> 12) & 15] + iArr[(i3 >>> 16) & 15] + iArr[(i3 >>> 20) & 15] + iArr[(i3 >>> 24) & 15] + iArr[(i3 >>> 28) & 15];
    }

    public static AnonymousClass1G4 A01(int i, int i2) {
        int A002;
        int[][] iArr = A03;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : iArr) {
            int i5 = iArr2[0];
            if (i5 == i || i5 == i2) {
                return new AnonymousClass1G4(iArr2[1]);
            }
            int A003 = A00(i, i5);
            if (A003 < i3) {
                i4 = iArr2[1];
                i3 = A003;
            }
            if (i != i2 && (A002 = A00(i2, i5)) < i3) {
                i4 = iArr2[1];
                i3 = A002;
            }
        }
        if (i3 <= 3) {
            return new AnonymousClass1G4(i4);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1G4)) {
            return false;
        }
        AnonymousClass1G4 r4 = (AnonymousClass1G4) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.ordinal() << 3) | this.A00;
    }
}
