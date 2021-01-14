package X;

/* renamed from: X.0gQ  reason: invalid class name and case insensitive filesystem */
public class C11500gQ {
    public int A00;
    public C11510gR A01;
    public byte[] A02;
    public byte[] A03;
    public byte[] A04;

    public C11500gQ(AbstractC05820Qj r2) {
        C11510gR r0 = new C11510gR(r2);
        this.A01 = r0;
        this.A04 = new byte[r0.A01];
    }

    public AbstractC11530gT A00(int i) {
        int i2 = i >> 3;
        byte[] A012 = A01(i2);
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int length = A012.length - 0;
            if (length < i2) {
                System.arraycopy(A012, 0, bArr, 0, length);
            } else {
                System.arraycopy(A012, 0, bArr, 0, i2);
            }
            return new C11520gS(bArr, i2);
        }
        StringBuffer stringBuffer = new StringBuffer(0);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public final byte[] A01(int i) {
        int i2 = this.A01.A01;
        int i3 = ((i + i2) - 1) / i2;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[(i3 * i2)];
        this.A01.A00(new C11520gS(this.A02));
        int i4 = 0;
        for (int i5 = 1; i5 <= i3; i5++) {
            int i6 = 3;
            while (true) {
                byte b = (byte) (bArr[i6] + 1);
                bArr[i6] = b;
                if (b != 0) {
                    break;
                }
                i6--;
            }
            byte[] bArr3 = this.A03;
            int i7 = this.A00;
            if (i7 != 0) {
                if (bArr3 != null) {
                    this.A01.A02.update(bArr3, 0, bArr3.length);
                }
                C11510gR r1 = this.A01;
                r1.A02.update(bArr, 0, 4);
                r1.A01(this.A04);
                byte[] bArr4 = this.A04;
                System.arraycopy(bArr4, 0, bArr2, i4, bArr4.length);
                for (int i8 = 1; i8 < i7; i8++) {
                    C11510gR r3 = this.A01;
                    byte[] bArr5 = this.A04;
                    r3.A02.update(bArr5, 0, bArr5.length);
                    r3.A01(bArr5);
                    int i9 = 0;
                    while (true) {
                        byte[] bArr6 = this.A04;
                        if (i9 == bArr6.length) {
                            break;
                        }
                        int i10 = i4 + i9;
                        bArr2[i10] = (byte) (bArr6[i9] ^ bArr2[i10]);
                        i9++;
                    }
                }
                i4 += i2;
            } else {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
        }
        return bArr2;
    }
}
