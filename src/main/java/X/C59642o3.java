package X;

import java.io.File;

/* renamed from: X.2o3  reason: invalid class name and case insensitive filesystem */
public class C59642o3 extends AbstractC53892e0 implements AbstractC48882Od {
    @Override // X.AbstractC48882Od
    public long A67() {
        return 0;
    }

    @Override // X.AbstractC48882Od
    public String A7T() {
        return "image/*";
    }

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 0;
    }

    public C59642o3(File file, long j) {
        super(file, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r1 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        throw r0;
     */
    @Override // X.AbstractC48882Od
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap AQZ(int r5) {
        /*
            r4 = this;
            long r2 = (long) r5
            long r2 = r2 * r2
            r0 = 2
            long r2 = r2 * r0
            java.io.File r1 = r4.A04     // Catch:{ IOException -> 0x0022, SecurityException -> 0x0020 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ IOException -> 0x0022, SecurityException -> 0x0020 }
            android.graphics.Bitmap r0 = X.C28051Sr.A0L(r5, r2, r1)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0029
            r1.close()
            return r0
        L_0x0017:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            if (r1 == 0) goto L_0x001f
            r1.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        L_0x0020:
            r1 = move-exception
            goto L_0x0023
        L_0x0022:
            r1 = move-exception
        L_0x0023:
            java.lang.String r0 = "got exception decoding bitmap "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59642o3.AQZ(int):android.graphics.Bitmap");
    }
}
