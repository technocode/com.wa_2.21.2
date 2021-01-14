package X;

/* renamed from: X.27u  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC460527u extends AbstractC43731yr {
    public AbstractC460527u(String str, String str2, AnonymousClass0PQ r3) {
        super(str, str2, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C014508d r5, java.lang.String r6, java.util.Map r7) {
        /*
            X.0OQ r4 = r5.A03()
            r5.A05()     // Catch:{ all -> 0x005d }
            X.08j r1 = r5.A07     // Catch:{ all -> 0x005d }
            monitor-enter(r1)     // Catch:{ all -> 0x005d }
            X.0BK r0 = r1.A00     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0051
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x005a }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0051
            X.0BK r0 = r1.A00     // Catch:{ all -> 0x005a }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0052
            android.database.sqlite.SQLiteDatabase r0 = r0.A00
            java.lang.String r3 = X.C015108j.A04(r0, r6)
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0029:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C015108j.A0A(r3, r1, r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x004a
        L_0x0048:
            r0 = 0
            goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            r0 = r0 ^ 1
            r4.close()
            return r0
        L_0x0051:
            monitor-exit(r1)
        L_0x0052:
            java.lang.String r1 = "databasehelper/doesAnyColumnExist/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x005a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x005d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC460527u.A00(X.08d, java.lang.String, java.util.Map):boolean");
    }
}
