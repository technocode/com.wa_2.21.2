package X;

/* renamed from: X.0Fe  reason: invalid class name and case insensitive filesystem */
public class C03200Fe {
    public static volatile C03200Fe A02;
    public boolean A00;
    public final AnonymousClass00G A01;

    public C03200Fe(AnonymousClass00G r1) {
        this.A01 = r1;
    }

    public static C03200Fe A00() {
        if (A02 == null) {
            synchronized (C03200Fe.class) {
                if (A02 == null) {
                    A02 = new C03200Fe(AnonymousClass00G.A01);
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A00
            if (r0 == r4) goto L_0x002c
            r3.A00 = r4
            X.00G r0 = r3.A01     // Catch:{ IOException -> 0x0026 }
            android.app.Application r2 = r0.A00     // Catch:{ IOException -> 0x0026 }
            java.lang.String r1 = "login_failed"
            r0 = 0
            java.io.FileOutputStream r0 = r2.openFileOutput(r1, r0)     // Catch:{ IOException -> 0x0026 }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0026 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0026 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x001f }
            r1.writeBoolean(r0)     // Catch:{ all -> 0x001f }
            r1.close()
            return
        L_0x001f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        L_0x0026:
            r1 = move-exception
            java.lang.String r0 = "loginmanager/failed/save login_failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03200Fe.A01(boolean):void");
    }
}
