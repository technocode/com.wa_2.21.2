package X;

import java.util.List;

/* renamed from: X.0Yr  reason: invalid class name and case insensitive filesystem */
public class C07620Yr {
    public static List A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(android.content.Context r5) {
        /*
            java.lang.Class<X.0Yr> r4 = X.C07620Yr.class
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0057 }
            r0.<init>()     // Catch:{ all -> 0x0057 }
            X.C07620Yr.A00 = r0     // Catch:{ all -> 0x0057 }
            java.io.File r1 = r5.getFilesDir()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "nfc_ids"
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0057 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x0057 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0055
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x003c }
            r0.<init>(r3)     // Catch:{ IOException -> 0x003c }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x003c }
        L_0x0025:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0031
            java.util.List r0 = X.C07620Yr.A00     // Catch:{ all -> 0x0035 }
            r0.add(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x0025
        L_0x0031:
            r2.close()
            goto L_0x0055
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "newchatnfc/cannot read ids "
            r1.append(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0, r2)
        L_0x0055:
            monitor-exit(r4)
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07620Yr.A00(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A01(android.content.Context r5) {
        /*
            java.lang.Class<X.0Yr> r4 = X.C07620Yr.class
            monitor-enter(r4)
            java.util.List r0 = X.C07620Yr.A00     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.io.File r1 = r5.getFilesDir()
            java.lang.String r0 = "nfc_ids"
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r0)
            r1 = 0
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch:{ IOException -> 0x0043 }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x0043 }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0043 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0043 }
            java.util.List r0 = X.C07620Yr.A00     // Catch:{ all -> 0x003c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0025:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x003c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x003c }
            r2.write(r0)     // Catch:{ all -> 0x003c }
            r2.newLine()     // Catch:{ all -> 0x003c }
            goto L_0x0025
        L_0x0038:
            r2.close()
            goto L_0x005c
        L_0x003c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0
        L_0x0043:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "newchatnfc/cannot write ids "
            r1.append(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0, r2)
        L_0x005c:
            monitor-exit(r4)
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07620Yr.A01(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r29, X.AnonymousClass00S r30, X.AnonymousClass01I r31, X.C006903j r32, X.AnonymousClass0DG r33, X.AnonymousClass01J r34, X.AnonymousClass01A r35, X.AnonymousClass01K r36, X.AnonymousClass321 r37, android.content.Intent r38) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07620Yr.A02(android.content.Context, X.00S, X.01I, X.03j, X.0DG, X.01J, X.01A, X.01K, X.321, android.content.Intent):void");
    }
}
