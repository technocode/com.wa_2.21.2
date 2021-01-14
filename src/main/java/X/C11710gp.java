package X;

/* renamed from: X.0gp  reason: invalid class name and case insensitive filesystem */
public class C11710gp {
    public byte[] A00;
    public int[][][] A01;

    public void A00(byte[] bArr) {
        int i;
        int[] iArr = new int[4];
        int i2 = 15;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            int[][][] iArr2 = this.A01;
            int i3 = i2 + i2;
            int[][] iArr3 = iArr2[i3];
            byte b = bArr[i2];
            int[] iArr4 = iArr3[b & 15];
            iArr[0] = iArr[0] ^ iArr4[0];
            iArr[1] = iArr[1] ^ iArr4[1];
            iArr[2] = iArr[2] ^ iArr4[2];
            iArr[3] = iArr4[3] ^ iArr[3];
            int[] iArr5 = iArr2[i3 + 1][(b & 240) >>> 4];
            iArr[0] = iArr[0] ^ iArr5[0];
            iArr[1] = iArr[1] ^ iArr5[1];
            iArr[2] = iArr[2] ^ iArr5[2];
            iArr[3] = iArr[3] ^ iArr5[3];
            i2--;
        }
        int i4 = 0;
        do {
            AnonymousClass1YV.A0C(iArr[i], bArr, i4);
            i4 += 4;
            i++;
        } while (i < 4);
    }
}
