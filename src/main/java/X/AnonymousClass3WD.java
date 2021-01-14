package X;

import javax.net.ssl.SSLException;

/* renamed from: X.3WD  reason: invalid class name */
public class AnonymousClass3WD implements AnonymousClass2VM {
    public C11700go A00;
    public byte[] A01;
    public byte[] A02;

    public static byte[] A00(byte[] bArr, long j) {
        byte[] bArr2 = {(byte) ((int) (j >> 56)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 8)), (byte) ((int) j)};
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i = length - 8;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i2 = i; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 - i]);
        }
        return bArr3;
    }

    public final byte[] A01(byte[] bArr, int i, int i2) {
        C11700go r4 = this.A00;
        int A002 = r4.A00(i2);
        byte[] bArr2 = new byte[A002];
        int A022 = r4.A02(bArr, i, i2, bArr2, 0);
        int A012 = this.A00.A01(bArr2, A022) + A022;
        if (A012 >= A002) {
            return bArr2;
        }
        byte[] bArr3 = new byte[A012];
        System.arraycopy(bArr2, 0, bArr3, 0, A012);
        return bArr3;
    }

    @Override // X.AnonymousClass2VM
    public byte[] A3Y(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        this.A00.A04(false, new C11550gV(new C11520gS(this.A02), A00(this.A01, j)));
        this.A00.A05(bArr, 0, bArr.length);
        try {
            return A01(bArr2, i, i2);
        } catch (C73273We e) {
            throw new C29001Wo((byte) 51, new SSLException(e), true);
        }
    }

    @Override // X.AnonymousClass2VM
    public byte[] A43(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        this.A00.A04(true, new C11550gV(new C11520gS(this.A02), A00(this.A01, j)));
        this.A00.A05(bArr, 0, bArr.length);
        try {
            return A01(bArr2, i, i2);
        } catch (C73273We e) {
            throw new C29001Wo((byte) 80, new SSLException(e));
        }
    }

    @Override // X.AnonymousClass2VM
    public C006703h A8b() {
        return C006703h.A00();
    }

    @Override // X.AnonymousClass2VM
    public void AAY(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new C29001Wo((byte) 80, new SSLException("Invalid key length."));
        } else if (bArr2 == null || bArr2.length != 12) {
            throw new C29001Wo((byte) 80, new SSLException("Invalid iv length."));
        } else {
            this.A00 = new C11700go(new C11680gm());
            this.A02 = bArr;
            this.A01 = bArr2;
        }
    }
}
