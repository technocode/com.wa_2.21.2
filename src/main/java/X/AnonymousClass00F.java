package X;

import android.os.Build;
import java.io.UnsupportedEncodingException;

/* renamed from: X.00F  reason: invalid class name */
public final class AnonymousClass00F {
    public static final byte[] A00;

    static {
        StringBuilder sb = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            sb.append(str);
        }
        String str2 = Build.SERIAL;
        if (str2 != null) {
            sb.append(str2);
        }
        try {
            A00 = sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding not supported");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00() {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00F.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01() {
        /*
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0044 }
            r3.<init>()     // Catch:{ IOException -> 0x0044 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ all -> 0x003d }
            r2.<init>(r3)     // Catch:{ all -> 0x003d }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0036 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0036 }
            long r0 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            r2.writeLong(r0)     // Catch:{ all -> 0x0036 }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0036 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0036 }
            int r0 = android.os.Process.myUid()     // Catch:{ all -> 0x0036 }
            r2.writeInt(r0)     // Catch:{ all -> 0x0036 }
            byte[] r0 = X.AnonymousClass00F.A00     // Catch:{ all -> 0x0036 }
            r2.write(r0)     // Catch:{ all -> 0x0036 }
            byte[] r0 = r3.toByteArray()     // Catch:{ all -> 0x0036 }
            r2.close()
            r3.close()
            return r0
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        L_0x0044:
            r2 = move-exception
            java.lang.String r1 = "Failed to generate seed"
            java.lang.SecurityException r0 = new java.lang.SecurityException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00F.A01():byte[]");
    }
}
