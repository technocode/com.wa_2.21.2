package X;

/* renamed from: X.1nr  reason: invalid class name and case insensitive filesystem */
public final class C37231nr extends AbstractC25141Ff {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C37231nr(int i, int i2, int[] iArr) {
        super(i, i2);
        this.A01 = i;
        this.A00 = i2;
        byte[] bArr = new byte[(i * i2)];
        this.A02 = bArr;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * i;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i4 + i5;
                int i7 = iArr[i6];
                int i8 = (i7 >> 16) & 255;
                int i9 = (i7 >> 8) & 255;
                int i10 = i7 & 255;
                if (i8 == i9 && i9 == i10) {
                    bArr[i6] = (byte) i8;
                } else {
                    bArr[i6] = (byte) ((((i9 << 1) + i8) + i10) >> 2);
                }
            }
        }
    }
}
