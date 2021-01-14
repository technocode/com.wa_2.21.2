package X;

/* renamed from: X.15o  reason: invalid class name and case insensitive filesystem */
public final class C233915o {
    public int A00 = 0;
    public int A01;
    public int A02;
    public byte[] A03;

    public C233915o(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        A03();
    }

    public final int A00() {
        int i = 0;
        int i2 = 0;
        while (!A04()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = A01(i2);
        }
        return i3 + i;
    }

    public int A01(int i) {
        int i2;
        int i3 = this.A00 + i;
        this.A00 = i3;
        int i4 = 0;
        while (true) {
            i2 = 2;
            if (i3 <= 8) {
                break;
            }
            i3 -= 8;
            this.A00 = i3;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            i4 |= (bArr[i5] & 255) << i3;
            if (!A05(i5 + 1)) {
                i2 = 1;
            }
            this.A02 = i5 + i2;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int i7 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i6] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.A00 = 0;
            if (!A05(i6 + 1)) {
                i2 = 1;
            }
            this.A02 = i6 + i2;
        }
        A03();
        return i7;
    }

    public void A02() {
        int i = 1;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == 8) {
            this.A00 = 0;
            int i3 = this.A02;
            if (A05(i3 + 1)) {
                i = 2;
            }
            this.A02 = i3 + i;
        }
        A03();
    }

    public final void A03() {
        int i;
        int i2 = this.A02;
        C002001d.A3A(i2 >= 0 && (i2 < (i = this.A01) || (i2 == i && this.A00 == 0)));
    }

    public boolean A04() {
        boolean z = false;
        if ((this.A03[this.A02] & (128 >> this.A00)) != 0) {
            z = true;
        }
        A02();
        return z;
    }

    public final boolean A05(int i) {
        if (2 > i || i >= this.A01) {
            return false;
        }
        byte[] bArr = this.A03;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
    }
}
