package X;

/* renamed from: X.1GI  reason: invalid class name */
public final class AnonymousClass1GI {
    public static final int[][] A00 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] A01 = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, AnonymousClass0PW.A03, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] A02 = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] A03 = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void A00(int i, int i2, AnonymousClass05j r7) {
        int i3 = 0;
        do {
            int i4 = i + i3;
            byte[] bArr = r7.A02[i2];
            if (bArr[i4] == -1) {
                bArr[i4] = (byte) 0;
                i3++;
            } else {
                throw new C25191Fl();
            }
        } while (i3 < 8);
    }

    public static void A01(int i, int i2, AnonymousClass05j r9) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = 0;
            do {
                int i5 = A02[i3][i4];
                r9.A02[i2 + i3][i + i4] = (byte) i5;
                i4++;
            } while (i4 < 7);
        }
    }

    public static void A02(int i, int i2, AnonymousClass05j r8) {
        int i3 = 0;
        do {
            int i4 = i2 + i3;
            byte[][] bArr = r8.A02;
            if (bArr[i4][i] == -1) {
                bArr[i4][i] = (byte) 0;
                i3++;
            } else {
                throw new C25191Fl();
            }
        } while (i3 < 7);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass1Fm r17, X.AnonymousClass1G3 r18, X.AnonymousClass1G9 r19, int r20, X.AnonymousClass05j r21) {
        /*
        // Method dump skipped, instructions count: 666
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GI.A03(X.1Fm, X.1G3, X.1G9, int, X.05j):void");
    }
}
