package X;

/* renamed from: X.09S  reason: invalid class name */
public class AnonymousClass09S {
    public static volatile AnonymousClass09S A06;
    public final C014408c A00;
    public final C015308l A01;
    public final C014508d A02;
    public final C015408m A03;
    public final C015708p A04;
    public final AnonymousClass0AL A05;

    public AnonymousClass09S(C015308l r1, C014408c r2, AnonymousClass0AL r3, C015408m r4, C015708p r5, C014508d r6) {
        this.A01 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r6;
    }

    public static AnonymousClass09S A00() {
        if (A06 == null) {
            synchronized (AnonymousClass09S.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass09S(C015308l.A00(), C014408c.A00(), AnonymousClass0AL.A01(), C015408m.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r2 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(X.AnonymousClass02N r7) {
        /*
            r6 = this;
            X.08d r2 = r6.A02
            X.0OQ r3 = r2.A03()
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0055 }
            X.08c r0 = r6.A00     // Catch:{ all -> 0x0055 }
            long r0 = r0.A05(r7)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0055 }
            r4 = 0
            r5[r4] = r0     // Catch:{ all -> 0x0055 }
            r2.A05()     // Catch:{ all -> 0x0055 }
            X.08j r0 = r2.A07     // Catch:{ all -> 0x0055 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r2 = "SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND action_type = 19"
            java.lang.String r1 = "GET_PLAINTEXT_DISABLED_MESSAGE_ROW_ID_SQL"
        L_0x0025:
            X.0BK r0 = r3.A04     // Catch:{ all -> 0x0055 }
            android.database.Cursor r2 = r0.A07(r2, r5, r1)     // Catch:{ all -> 0x0055 }
            goto L_0x0031
        L_0x002c:
            java.lang.String r2 = "SELECT _id FROM message_view WHERE chat_row_id = ? AND from_me = 1 AND message_type = 7 AND media_size = 19"
            java.lang.String r1 = "GET_PLAINTEXT_DISABLED_MESSAGE_ROW_ID_BEFORE_MIGRATION_SQL"
            goto L_0x0025
        L_0x0031:
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0043
            int r0 = r2.getInt(r4)     // Catch:{ all -> 0x004c }
            long r0 = (long) r0     // Catch:{ all -> 0x004c }
            r2.close()
            r3.close()
            return r0
        L_0x0043:
            r2.close()
            r3.close()
            r0 = -1
            return r0
        L_0x004c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            if (r2 == 0) goto L_0x0054
            r2.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09S.A01(X.02N):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0320, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0324, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0334, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0338, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x033b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x033f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C05390Oi r19) {
        /*
        // Method dump skipped, instructions count: 832
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09S.A02(X.0Oi):void");
    }

    public boolean A03() {
        String A012 = this.A03.A01("system_message_ready");
        return A012 != null && Long.parseLong(A012) == 2;
    }
}
