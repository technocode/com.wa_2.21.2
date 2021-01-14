package X;

/* renamed from: X.15m  reason: invalid class name and case insensitive filesystem */
public final class C233715m {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C233715m() {
        this.A03 = AnonymousClass0W2.A05;
    }

    public C233715m(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public C233715m(byte[] bArr, int i) {
        this.A03 = bArr;
        this.A01 = i;
    }

    public int A00(int i) {
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (i2 > 8) {
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            this.A02 = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + 1;
        }
        A01();
        return i6;
    }

    public final void A01() {
        int i;
        int i2 = this.A02;
        C002001d.A3A(i2 >= 0 && (i2 < (i = this.A01) || (i2 == i && this.A00 == 0)));
    }

    public void A02(int i) {
        int i2 = i >> 3;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = (i - (i2 << 3)) + this.A00;
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A01();
    }

    public void A03(byte[] bArr, int i) {
        boolean z = false;
        if (this.A00 == 0) {
            z = true;
        }
        C002001d.A3A(z);
        System.arraycopy(this.A03, this.A02, bArr, 0, i);
        this.A02 += i;
        A01();
    }

    public boolean A04() {
        byte[] bArr = this.A03;
        int i = this.A02;
        byte b = bArr[i];
        int i2 = this.A00;
        boolean z = false;
        if ((b & (128 >> i2)) != 0) {
            z = true;
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 == 8) {
            this.A00 = 0;
            this.A02 = i + 1;
        }
        A01();
        return z;
    }
}
