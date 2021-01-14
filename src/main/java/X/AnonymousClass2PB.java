package X;

import android.os.Environment;

/* renamed from: X.2PB  reason: invalid class name */
public class AnonymousClass2PB {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().toString());
        sb.append("/DCIM/Camera");
        String obj = sb.toString();
        A01 = obj;
        A00 = String.valueOf(obj.toLowerCase().hashCode());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if ((r1 & 1) != 0) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AbstractC48892Oe A00(X.AnonymousClass00G r13, X.AnonymousClass009 r14, X.C000300f r15, X.AnonymousClass0XO r16, X.AnonymousClass03S r17, X.C007703s r18, X.AnonymousClass2PA r19) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PB.A00(X.00G, X.009, X.00f, X.0XO, X.03S, X.03s, X.2PA):X.2Oe");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(android.content.ContentResolver r8) {
        /*
            android.net.Uri r4 = android.provider.MediaStore.getMediaScannerUri()
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r0 = "volume"
            r2 = 0
            r5[r2] = r0
            r6 = 0
            r3 = r8
            if (r8 == 0) goto L_0x0037
            r7 = r6
            r8 = r6
            android.database.Cursor r6 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ UnsupportedOperationException -> 0x0017 }
        L_0x0017:
            if (r6 == 0) goto L_0x0037
            int r0 = r6.getCount()     // Catch:{ all -> 0x0030 }
            if (r0 != r1) goto L_0x002c
            r6.moveToFirst()     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "external"
            java.lang.String r0 = r6.getString(r2)     // Catch:{ all -> 0x0030 }
            boolean r2 = r1.equals(r0)     // Catch:{ all -> 0x0030 }
        L_0x002c:
            r6.close()
            return r2
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r0
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PB.A01(android.content.ContentResolver):boolean");
    }
}
