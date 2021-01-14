package X;

/* renamed from: X.1Fo  reason: invalid class name */
public final class AnonymousClass1Fo {
    public int A00;
    public int A01;
    public final byte[] A02;

    public AnonymousClass1Fo(byte[] bArr) {
        this.A02 = bArr;
    }

    public int A00() {
        return ((this.A02.length - this.A01) << 3) - this.A00;
    }

    public int A01(int i) {
        if (i < 1 || i > 32 || i > A00()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.A00;
        int i3 = i2;
        int i4 = 0;
        if (i2 > 0) {
            int i5 = 8 - i2;
            int i6 = i5;
            if (i < i5) {
                i6 = i;
            }
            int i7 = i5 - i6;
            byte[] bArr = this.A02;
            int i8 = this.A01;
            int i9 = (((255 >> (8 - i6)) << i7) & bArr[i8]) >> i7;
            i -= i6;
            int i10 = i2 + i6;
            this.A00 = i10;
            i3 = i10;
            if (i10 == 8) {
                this.A00 = 0;
                i3 = 0;
                this.A01 = i8 + 1;
            }
            i4 = i9;
        }
        if (i <= 0) {
            return i4;
        }
        while (i >= 8) {
            byte[] bArr2 = this.A02;
            int i11 = this.A01;
            i4 = (bArr2[i11] & 255) | (i4 << 8);
            this.A01 = i11 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i4;
        }
        int i12 = 8 - i;
        int i13 = (i4 << i) | ((((255 >> i12) << i12) & this.A02[this.A01]) >> i12);
        this.A00 = i3 + i;
        return i13;
    }
}
