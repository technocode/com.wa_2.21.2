package X;

import com.whatsapp.media.transcode.Mozjpeg;

/* renamed from: X.0Be  reason: invalid class name and case insensitive filesystem */
public class C02240Be {
    public static volatile C02240Be A01;
    public final Mozjpeg A00;

    public C02240Be(C02250Bf r2) {
        if (r2 != null) {
            this.A00 = new Mozjpeg();
            return;
        }
        throw null;
    }

    public static C02240Be A00() {
        if (A01 == null) {
            synchronized (C02240Be.class) {
                if (A01 == null) {
                    if (C02250Bf.A00 == null) {
                        synchronized (C02250Bf.class) {
                            if (C02250Bf.A00 == null) {
                                C02250Bf.A00 = new C02250Bf();
                            }
                        }
                    }
                    A01 = new C02240Be(C02250Bf.A00);
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01(android.graphics.Bitmap r12, int r13, boolean r14) {
        /*
            r11 = this;
            r6 = r12
            android.graphics.Bitmap$Config r1 = r12.getConfig()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3 = 0
            if (r1 == r0) goto L_0x000b
            return r3
        L_0x000b:
            java.lang.String r0 = X.C02230Bd.A0N()     // Catch:{ IOException -> 0x004b }
            java.io.File r4 = java.io.File.createTempFile(r0, r3)     // Catch:{ IOException -> 0x004b }
            com.whatsapp.media.transcode.Mozjpeg r5 = r11.A00     // Catch:{ IOException -> 0x004b }
            java.lang.String r7 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x004b }
            r9 = 0
            r8 = r13
            r10 = r14
            r5.A00(r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x004b }
            long r5 = r4.length()     // Catch:{ IOException -> 0x004b }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002a
            return r3
        L_0x002a:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            r0.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0046 }
            r1.<init>(r0)     // Catch:{ all -> 0x0046 }
            byte[] r0 = X.C006803i.A0s(r1)     // Catch:{ all -> 0x003f }
            r1.close()
            r4.delete()
            return r0
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        L_0x0046:
            r0 = move-exception
            r4.delete()
            throw r0
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "BitmapCompressor/createCompressedByteArray"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02240Be.A01(android.graphics.Bitmap, int, boolean):byte[]");
    }
}
