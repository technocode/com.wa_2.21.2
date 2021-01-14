package X;

/* renamed from: X.0gl  reason: invalid class name and case insensitive filesystem */
public class C11670gl {
    public final byte[] A00;

    public C11670gl(byte[] bArr) {
        this.A00 = bArr;
    }

    public final C11700go A00(long j, boolean z) {
        C11700go r3 = new C11700go(new C11680gm());
        byte[] bArr = new byte[12];
        bArr[11] = (byte) ((int) j);
        bArr[10] = (byte) ((int) (j >> 8));
        bArr[9] = (byte) ((int) (j >> 16));
        bArr[8] = (byte) ((int) (j >> 24));
        bArr[7] = (byte) ((int) (j >> 32));
        bArr[6] = (byte) ((int) (j >> 40));
        bArr[5] = (byte) ((int) (j >> 48));
        bArr[4] = (byte) ((int) (j >> 56));
        r3.A04(z, new C11550gV(new C11520gS(this.A00), bArr));
        return r3;
    }

    public byte[] A01(long j, byte[] bArr, byte[] bArr2) {
        try {
            C11700go A002 = A00(j, false);
            A002.A05(bArr, 0, bArr.length);
            int length = bArr2.length;
            int A003 = A002.A00(length);
            byte[] bArr3 = new byte[A003];
            int A02 = A002.A02(bArr2, 0, length, bArr3, 0);
            int A01 = A002.A01(bArr3, A02) + A02;
            if (A01 >= A003) {
                return bArr3;
            }
            byte[] bArr4 = new byte[A01];
            System.arraycopy(bArr3, 0, bArr4, 0, A01);
            return bArr4;
        } catch (C73273We e) {
            throw new C68163By(this, e);
        }
    }

    public byte[] A02(long j, byte[] bArr, byte[] bArr2, int i) {
        try {
            C11700go A002 = A00(j, true);
            A002.A05(bArr, 0, bArr.length);
            int A003 = A002.A00(i);
            byte[] bArr3 = new byte[A003];
            int A02 = A002.A02(bArr2, 0, i, bArr3, 0);
            int A01 = A002.A01(bArr3, A02) + A02;
            if (A01 >= A003) {
                return bArr3;
            }
            byte[] bArr4 = new byte[A01];
            System.arraycopy(bArr3, 0, bArr4, 0, A01);
            return bArr4;
        } catch (C73273We e) {
            throw new AssertionError(e);
        }
    }
}
