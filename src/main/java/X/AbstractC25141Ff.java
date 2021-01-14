package X;

/* renamed from: X.1Ff  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC25141Ff {
    public final int A00;
    public final int A01;

    public AbstractC25141Ff(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public byte[] A00() {
        if (!(this instanceof C37231nr)) {
            C37221nq r8 = (C37221nq) this;
            int i = ((AbstractC25141Ff) r8).A01;
            int i2 = ((AbstractC25141Ff) r8).A00;
            int i3 = r8.A01;
            if (i == i3 && i2 == r8.A00) {
                return r8.A04;
            }
            int i4 = i * i2;
            byte[] bArr = new byte[i4];
            int i5 = (r8.A03 * i3) + r8.A02;
            if (i == i3) {
                System.arraycopy(r8.A04, i5, bArr, 0, i4);
                return bArr;
            }
            byte[] bArr2 = r8.A04;
            for (int i6 = 0; i6 < i2; i6++) {
                System.arraycopy(bArr2, i5, bArr, i6 * i, i);
                i5 += i3;
            }
            return bArr;
        }
        C37231nr r82 = (C37231nr) this;
        int i7 = ((AbstractC25141Ff) r82).A01;
        int i8 = ((AbstractC25141Ff) r82).A00;
        int i9 = r82.A01;
        if (i7 == i9 && i8 == r82.A00) {
            return r82.A02;
        }
        int i10 = i7 * i8;
        byte[] bArr3 = new byte[i10];
        int i11 = (0 * i9) + 0;
        if (i7 == i9) {
            System.arraycopy(r82.A02, i11, bArr3, 0, i10);
            return bArr3;
        }
        byte[] bArr4 = r82.A02;
        for (int i12 = 0; i12 < i8; i12++) {
            System.arraycopy(bArr4, i11, bArr3, i12 * i7, i7);
            i11 += i9;
        }
        return bArr3;
    }

    public byte[] A01(int i, byte[] bArr) {
        if (!(this instanceof C37231nr)) {
            C37221nq r1 = (C37221nq) this;
            if (i < 0 || i >= ((AbstractC25141Ff) r1).A00) {
                throw new IllegalArgumentException(AnonymousClass008.A0F("Requested row is outside the image: ", i));
            }
            int i2 = ((AbstractC25141Ff) r1).A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            System.arraycopy(r1.A04, ((i + r1.A03) * r1.A01) + r1.A02, bArr, 0, i2);
            return bArr;
        }
        C37231nr r12 = (C37231nr) this;
        if (i < 0 || i >= ((AbstractC25141Ff) r12).A00) {
            throw new IllegalArgumentException(AnonymousClass008.A0F("Requested row is outside the image: ", i));
        }
        int i3 = ((AbstractC25141Ff) r12).A01;
        if (bArr == null || bArr.length < i3) {
            bArr = new byte[i3];
        }
        System.arraycopy(r12.A02, ((i + 0) * r12.A01) + 0, bArr, 0, i3);
        return bArr;
    }

    public final String toString() {
        char c;
        int i = this.A01;
        byte[] bArr = new byte[i];
        int i2 = this.A00;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = A01(i3, bArr);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                if (i5 < 64) {
                    c = '#';
                } else if (i5 < 128) {
                    c = '+';
                } else {
                    c = ' ';
                    if (i5 < 192) {
                        c = '.';
                    }
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
