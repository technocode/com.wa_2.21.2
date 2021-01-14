package X;

/* renamed from: X.0h2  reason: invalid class name and case insensitive filesystem */
public class C11820h2 extends AbstractC11750gu {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public C11820h2(byte[] bArr, int i) {
        super(null);
        int length = bArr.length;
        int i2 = 0 + i;
        if ((0 | i | (length - i2)) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
    }

    public final void A0N(long j) {
        if (!AbstractC11750gu.A02 || this.A01 - this.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.A02;
                    int i = this.A00;
                    this.A00 = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new AnonymousClass1FJ(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A00), Integer.valueOf(this.A01), 1), e);
                }
            }
            byte[] bArr2 = this.A02;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        long j2 = AbstractC11750gu.A00 + ((long) this.A00);
        while ((j & -128) != 0) {
            C11770gw.A00(this.A02, j2, (byte) ((((int) j) & 127) | 128));
            this.A00++;
            j >>>= 7;
            j2 = 1 + j2;
        }
        C11770gw.A00(this.A02, j2, (byte) ((int) j));
        this.A00++;
    }
}
