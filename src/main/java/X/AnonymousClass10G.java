package X;

/* renamed from: X.10G  reason: invalid class name */
public final class AnonymousClass10G extends ThreadLocal {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        throw r0;
     */
    @Override // java.lang.ThreadLocal
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object initialValue() {
        /*
            r5 = this;
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.String r0 = "/dev/urandom"
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002f }
            r3.<init>(r0)     // Catch:{ IOException -> 0x002f }
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0028 }
            byte[] r0 = r1.array()     // Catch:{ all -> 0x0028 }
            r3.read(r0)     // Catch:{ all -> 0x0028 }
            long r1 = r1.getLong()     // Catch:{ all -> 0x0028 }
            java.util.Random r0 = new java.util.Random     // Catch:{ all -> 0x0028 }
            r0.<init>(r1)     // Catch:{ all -> 0x0028 }
            r3.close()
            android.os.StrictMode.setThreadPolicy(r4)
            return r0
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0
        L_0x002f:
            r2 = move-exception
            java.lang.String r1 = "Cannot read from /dev/urandom"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0038 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass10G.initialValue():java.lang.Object");
    }
}
