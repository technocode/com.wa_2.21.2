package X;

/* renamed from: X.0An  reason: invalid class name and case insensitive filesystem */
public class C02070An {
    public static volatile C02070An A07;
    public final AnonymousClass09V A00;
    public final C014408c A01;
    public final AnonymousClass0AM A02;
    public final C014508d A03;
    public final C015408m A04;
    public final C015708p A05;
    public final C02080Ao A06;

    public C02070An(C014408c r1, AnonymousClass0AM r2, C02080Ao r3, C015408m r4, C015708p r5, AnonymousClass09V r6, C014508d r7) {
        this.A01 = r1;
        this.A02 = r2;
        this.A06 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = r6;
        this.A03 = r7;
    }

    public static C02070An A00() {
        if (A07 == null) {
            synchronized (C02070An.class) {
                if (A07 == null) {
                    A07 = new C02070An(C014408c.A00(), AnonymousClass0AM.A00(), new C02080Ao(), C015408m.A00(), C015708p.A00(), AnonymousClass09V.A00(), C014508d.A00());
                }
            }
        }
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        ((android.database.CursorWrapper) r2).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass02N r8, X.C04080Iy r9) {
        /*
            r7 = this;
            X.08c r0 = r7.A01
            long r0 = r0.A05(r8)
            java.lang.String r6 = java.lang.Long.toString(r0)
            X.08d r0 = r7.A03
            X.0OQ r3 = r0.A03()
            X.0BK r5 = r3.A04     // Catch:{ all -> 0x004f }
            java.lang.String r4 = "SELECT COUNT(*) as count FROM message_link WHERE chat_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            r1 = 0
            r2[r1] = r6     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "MESSAGE_LINK_TABLE_GET_COUNT"
            android.database.Cursor r2 = r5.A06(r4, r2, r9, r0)     // Catch:{ all -> 0x004f }
            r0 = r2
            android.database.CursorWrapper r0 = (android.database.CursorWrapper) r0
            boolean r0 = r0.moveToFirst()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "count"
            r1 = r2
            android.database.CursorWrapper r1 = (android.database.CursorWrapper) r1
            int r0 = r1.getColumnIndexOrThrow(r0)
            int r0 = r1.getInt(r0)
            r1.close()
            r3.close()
            return r0
        L_0x003d:
            android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2
            r2.close()
            r3.close()
            return r1
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02070An.A01(X.02N, X.0Iy):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        ((android.database.CursorWrapper) r2).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.AnonymousClass02N r8, X.C04080Iy r9) {
        /*
            r7 = this;
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x000b
            int r0 = r7.A01(r8, r9)
            return r0
        L_0x000b:
            java.lang.String r6 = r8.getRawString()
            X.08d r0 = r7.A03
            X.0OQ r3 = r0.A03()
            X.0BK r5 = r3.A04     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "SELECT COUNT(*) as count FROM messages_links WHERE key_remote_jid = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0054 }
            r1 = 0
            r2[r1] = r6     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "GET_MESSAGES_LINK_COUNT_SQL"
            android.database.Cursor r2 = r5.A06(r4, r2, r9, r0)     // Catch:{ all -> 0x0054 }
            r0 = r2
            android.database.CursorWrapper r0 = (android.database.CursorWrapper) r0
            boolean r0 = r0.moveToFirst()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "count"
            r1 = r2
            android.database.CursorWrapper r1 = (android.database.CursorWrapper) r1
            int r0 = r1.getColumnIndexOrThrow(r0)
            int r0 = r1.getInt(r0)
            r1.close()
            r3.close()
            return r0
        L_0x0042:
            android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2
            r2.close()
            r3.close()
            return r1
        L_0x004b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2
            r2.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02070An.A02(X.02N, X.0Iy):int");
    }

    public boolean A03() {
        String A012 = this.A04.A01("links_ready");
        return A012 != null && Long.parseLong(A012) == 2;
    }
}
