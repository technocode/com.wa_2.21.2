package X;

/* renamed from: X.09x  reason: invalid class name and case insensitive filesystem */
public class C019109x {
    public static volatile C019109x A02;
    public final C014508d A00;
    public final C015708p A01;

    public C019109x(C015708p r1, C014508d r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static C019109x A00() {
        if (A02 == null) {
            synchronized (C019109x.class) {
                if (A02 == null) {
                    A02 = new C019109x(C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r6, int r8) {
        /*
            r5 = this;
            X.08d r0 = r5.A00     // Catch:{ Exception -> 0x0027 }
            X.0OQ r4 = r0.A04()     // Catch:{ Exception -> 0x0027 }
            X.08p r2 = r5.A01     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "INSERT OR REPLACE INTO message_view_once_media (message_row_id, state) VALUES (?, ?)"
            java.lang.String r0 = "INSERT_VIEW_ONCE_SQL"
            X.1VB r3 = r2.A01(r1, r0)     // Catch:{ all -> 0x0020 }
            r0 = 1
            r3.A06(r0, r6)     // Catch:{ all -> 0x0020 }
            r2 = 2
            long r0 = (long) r8     // Catch:{ all -> 0x0020 }
            r3.A06(r2, r0)     // Catch:{ all -> 0x0020 }
            r3.A01()     // Catch:{ all -> 0x0020 }
            r4.close()
            return
        L_0x0020:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        L_0x0027:
            r1 = move-exception
            java.lang.String r0 = "ViewOnceMessageStore/updateInsert failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019109x.A01(long, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r2 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AbstractC007503q r10) {
        /*
            r9 = this;
            r6 = r10
            X.0MM r6 = (X.AnonymousClass0MM) r6
            long r4 = r10.A0p
            X.08d r0 = r9.A00
            X.0OQ r3 = r0.A03()
            X.0BK r8 = r3.A04     // Catch:{ all -> 0x004b }
            java.lang.String r7 = "SELECT state FROM message_view_once_media WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004b }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x004b }
            r2[r1] = r0     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "GET_VIEW_ONCE_STATE_BY_MESSAGE_ROW_ID_SQL"
            android.database.Cursor r2 = r8.A07(r7, r2, r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "state"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0042 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0037
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x0042 }
            r2.close()
            r3.close()
            goto L_0x003e
        L_0x0037:
            r2.close()
            r3.close()
            r0 = 2
        L_0x003e:
            r6.APJ(r0)
            return
        L_0x0042:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        L_0x004b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019109x.A02(X.03q):void");
    }
}
