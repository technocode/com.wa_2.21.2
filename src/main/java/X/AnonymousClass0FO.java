package X;

/* renamed from: X.0FO  reason: invalid class name */
public class AnonymousClass0FO {
    public static volatile AnonymousClass0FO A02;
    public final C000300f A00;
    public final AnonymousClass0EK A01;

    public AnonymousClass0FO(C000300f r1, AnonymousClass0EK r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static long A00(int[] iArr) {
        if (iArr == null || iArr.length != 4) {
            return -1;
        }
        return (long) (iArr[0] + iArr[1] + iArr[2]);
    }

    public static AnonymousClass0FO A01() {
        if (A02 == null) {
            synchronized (C02220Bc.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0FO(C000300f.A00(), AnonymousClass0EK.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(java.io.File r6, int r7, boolean r8) {
        /*
            r5 = this;
            long r2 = (long) r7
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r6)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r1)
            X.35K r1 = new X.35K
            r1.<init>(r0, r2)
            byte[] r0 = X.C02220Bc.A0B
            X.0w6 r4 = new X.0w6
            r4.<init>(r1, r0)
            X.0EK r1 = r5.A01     // Catch:{ all -> 0x0038 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0038 }
            r3.<init>()     // Catch:{ all -> 0x0038 }
            r2 = 1
            r3.inJustDecodeBounds = r2     // Catch:{ all -> 0x0038 }
            r0 = 0
            android.graphics.BitmapFactory.decodeStream(r4, r0, r3)     // Catch:{ all -> 0x0038 }
            X.2TP r0 = r1.A02(r8)     // Catch:{ all -> 0x0038 }
            int r1 = r0.A00     // Catch:{ all -> 0x0038 }
            int r0 = r3.outHeight     // Catch:{ all -> 0x0038 }
            if (r0 > r1) goto L_0x0034
            int r0 = r3.outWidth     // Catch:{ all -> 0x0038 }
            if (r0 > r1) goto L_0x0034
            r2 = 0
        L_0x0034:
            r4.close()
            return r2
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FO.A02(java.io.File, int, boolean):boolean");
    }
}
