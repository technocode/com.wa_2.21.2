package X;

/* renamed from: X.0B4  reason: invalid class name */
public class AnonymousClass0B4 {
    public static volatile AnonymousClass0B4 A03;
    public final C014608e A00;
    public final C014508d A01;
    public final C015708p A02;

    public AnonymousClass0B4(C015708p r1, C014608e r2, C014508d r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static AnonymousClass0B4 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0B4.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0B4(C015708p.A00(), C014608e.A01, C014508d.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(java.lang.String r8) {
        /*
            r7 = this;
            r3 = 1
            X.08d r0 = r7.A01     // Catch:{ SQLiteDiskIOException -> 0x003e }
            X.0OQ r5 = r0.A03()     // Catch:{ SQLiteDiskIOException -> 0x003e }
            X.0BK r6 = r5.A04     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "SELECT ref_count FROM media_refs WHERE path = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0037 }
            r2 = 0
            r1[r2] = r8     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "GET_MEDIA_REF_COUNT_SQL"
            android.database.Cursor r1 = r6.A07(r4, r1, r0)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "ref_count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002c }
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x002c }
        L_0x0028:
            r1.close()
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        L_0x0033:
            r5.close()
            return r2
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            r1 = move-exception
            X.08e r0 = r7.A00
            r0.A00(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B4.A01(java.lang.String):int");
    }
}
