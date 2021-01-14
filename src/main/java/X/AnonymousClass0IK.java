package X;

import java.util.HashSet;

/* renamed from: X.0IK  reason: invalid class name */
public class AnonymousClass0IK {
    public HashSet A00;
    public final AnonymousClass00G A01;

    public AnonymousClass0IK(AnonymousClass00G r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet A00() {
        /*
            r3 = this;
            java.util.HashSet r0 = r3.A00
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            X.00G r0 = r3.A01
            android.app.Application r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = "invalid_numbers"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x004f
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x004f
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ ClassNotFoundException -> 0x0049, IOException -> 0x0047, IllegalArgumentException -> 0x004b }
            r2.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0049, IOException -> 0x0047, IllegalArgumentException -> 0x004b }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0040 }
            r1.<init>(r2)     // Catch:{ all -> 0x0040 }
            java.lang.Object r0 = r1.readObject()     // Catch:{ all -> 0x0039 }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x0039 }
            r3.A00 = r0     // Catch:{ all -> 0x0039 }
            r1.close()
            r2.close()
            goto L_0x004f
        L_0x0039:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        L_0x0047:
            r0 = move-exception
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            com.whatsapp.util.Log.e(r0)
        L_0x004f:
            java.util.HashSet r0 = r3.A00
            if (r0 != 0) goto L_0x005a
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A00 = r0
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IK.A00():java.util.HashSet");
    }
}
