package X;

/* renamed from: X.0A0  reason: invalid class name */
public class AnonymousClass0A0 {
    public static volatile AnonymousClass0A0 A01;
    public final C014508d A00;

    public AnonymousClass0A0(C014508d r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0A0 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0A0.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0A0(C014508d.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r1 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AbstractC007503q r9) {
        /*
            r8 = this;
            X.08d r0 = r8.A00
            X.0OQ r3 = r0.A03()
            X.0BK r7 = r3.A04     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "SELECT forward_score FROM message_forwarded WHERE message_row_id=?"
            r5 = 1
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ all -> 0x0042 }
            r2 = 0
            long r0 = r9.A0p     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0042 }
            r4[r2] = r0     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "GET_FORWARDING_SCORE_FOR_ROW_ID_SQL"
            android.database.Cursor r1 = r7.A07(r6, r4, r0)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x002e
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "forward_score"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0039 }
            int r5 = r1.getInt(r0)     // Catch:{ all -> 0x0039 }
        L_0x002e:
            r9.A03 = r5     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0035
            r1.close()
        L_0x0035:
            r3.close()
            return
        L_0x0039:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        L_0x0042:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A0.A01(X.03q):void");
    }
}
