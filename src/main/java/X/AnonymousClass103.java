package X;

/* renamed from: X.103  reason: invalid class name */
public class AnonymousClass103 {
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b9, code lost:
        android.util.Log.v("ExifUtil", "Orientation not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00be, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(byte[] r12) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass103.A00(byte[]):int");
    }

    public static int A01(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (bArr[i] & 255) | (i4 << 8);
            i += i3;
            i2 = i5;
        }
    }
}
