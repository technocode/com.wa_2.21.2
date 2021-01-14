package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

/* renamed from: X.0Of  reason: invalid class name and case insensitive filesystem */
public class C05360Of {
    public static byte[] A05(int i) {
        byte[] bArr = new byte[3];
        bArr[2] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) (i >> 16);
        return bArr;
    }

    public static int A00(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int A01(byte[] bArr) {
        return (bArr[2] & 255) | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static AnonymousClass238 A02(byte[] bArr) {
        int i = bArr[0] & 255;
        if (i == 5) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 1, bArr2, 0, 32);
            return new AnonymousClass238(bArr2);
        }
        throw new C29361Ye(AnonymousClass008.A0F("Bad key type: ", i));
    }

    public static C29451Yn A03() {
        C11600gc A02 = C11580gY.A00().A02();
        return new C29451Yn(new AnonymousClass238(A02.A01), new AnonymousClass3XA(A02.A00));
    }

    public static byte[] A04(int i) {
        byte[] bArr = new byte[4];
        bArr[3] = (byte) i;
        bArr[2] = (byte) (i >> 8);
        bArr[1] = (byte) (i >> 16);
        bArr[0] = (byte) (i >> 24);
        return bArr;
    }

    public static byte[] A06(AnonymousClass238 r3, AbstractC29461Yo r4) {
        if (5 == r4.A9V()) {
            return C11580gY.A00().A04(r3.A00, ((AnonymousClass3XA) r4).A00);
        }
        throw new C29361Ye("Public and private keys must be of the same type!");
    }

    public static byte[] A07(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] A08(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                byteArrayOutputStream.write(bArr2);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[][] A09(byte[] bArr) {
        byte[][] bArr2 = new byte[2][];
        bArr2[0] = new byte[32];
        System.arraycopy(bArr, 0, bArr2[0], 0, 32);
        bArr2[1] = new byte[32];
        System.arraycopy(bArr, 32, bArr2[1], 0, 32);
        return bArr2;
    }

    public static byte[][] A0A(byte[] bArr, int i, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                byte[][] bArr2 = new byte[3][];
                bArr2[0] = new byte[i];
                System.arraycopy(bArr, 0, bArr2[0], 0, i);
                bArr2[1] = new byte[i2];
                System.arraycopy(bArr, i, bArr2[1], 0, i2);
                bArr2[2] = new byte[i3];
                System.arraycopy(bArr, i4, bArr2[2], 0, i3);
                return bArr2;
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("Input too small: ");
        A0S.append(AnonymousClass3CL.A00(bArr));
        throw new ParseException(A0S.toString(), 0);
    }
}
