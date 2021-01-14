package X;

/* renamed from: X.0Px  reason: invalid class name and case insensitive filesystem */
public class C05750Px {
    public static final byte[][] A00;

    static {
        byte[][] bArr = new byte[3][];
        A00 = bArr;
        bArr[0] = new byte[]{87, 65, 77, 3};
        bArr[1] = new byte[]{87, 65, 77, 4};
        bArr[2] = new byte[]{87, 65, 77, 5};
    }

    public static byte[] A00(int i) {
        if (i >= 0) {
            byte[][] bArr = A00;
            if (i <= bArr.length - 1) {
                return bArr[i];
            }
        }
        throw new RuntimeException(AnonymousClass008.A0F("Invalid version: ", i));
    }
}
