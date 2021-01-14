package X;

/* renamed from: X.0gr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11730gr {
    public static final int[] A00;

    static {
        int[] iArr = new int[256];
        int i = 0;
        do {
            int i2 = 7;
            int i3 = 0;
            do {
                if (((1 << i2) & i) != 0) {
                    i3 ^= -520093696 >>> (7 - i2);
                }
                i2--;
            } while (i2 >= 0);
            iArr[i] = i3;
            i++;
        } while (i < 256);
        A00 = iArr;
    }

    public static void A00(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i = i4 + 1;
        } while (i < 16);
    }

    public static void A01(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        do {
            int i10 = iArr2[i5];
            for (int i11 = 0; i11 < 32; i11++) {
                int i12 = i10 >> 31;
                i10 <<= 1;
                i6 ^= i & i12;
                i7 ^= i2 & i12;
                i8 ^= i3 & i12;
                i9 ^= i12 & i4;
                int i13 = (i4 << 31) >> 8;
                i4 = (i4 >>> 1) | (i3 << 31);
                i3 = (i3 >>> 1) | (i2 << 31);
                i2 = (i2 >>> 1) | (i << 31);
                i = (i >>> 1) ^ (i13 & -520093696);
            }
            i5++;
        } while (i5 < 4);
        iArr[0] = i6;
        iArr[1] = i7;
        iArr[2] = i8;
        iArr[3] = i9;
    }

    public static void A02(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 1;
        int i2 = i << 31;
        int i3 = iArr[1];
        iArr2[1] = i2 | (i3 >>> 1);
        int i4 = i3 << 31;
        int i5 = iArr[2];
        iArr2[2] = i4 | (i5 >>> 1);
        int i6 = i5 << 31;
        int i7 = iArr[3];
        iArr2[3] = i6 | (i7 >>> 1);
        iArr2[0] = (((i7 << 31) >> 8) & -520093696) ^ iArr2[0];
    }
}
