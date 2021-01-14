package X;

import com.whatsapp.util.Log;

/* renamed from: X.095  reason: invalid class name */
public class AnonymousClass095 {
    public static volatile AnonymousClass095 A05;
    public final C014408c A00;
    public final C006903j A01;
    public final AnonymousClass094 A02;
    public final C014508d A03;
    public final AnonymousClass096 A04;

    public AnonymousClass095(C014408c r1, C006903j r2, C014508d r3, AnonymousClass096 r4, AnonymousClass094 r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }

    public static AnonymousClass095 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass095.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass095(C014408c.A00(), C006903j.A00(), C014508d.A00(), AnonymousClass096.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass02N r8, long r9) {
        /*
            r7 = this;
            X.08d r0 = r7.A03
            X.0OQ r4 = r0.A03()
            X.0BK r6 = r4.A04     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = "SELECT COUNT(*) FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id > ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            X.08c r0 = r7.A00     // Catch:{ all -> 0x0056 }
            long r0 = r0.A05(r8)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0056 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x0056 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0056 }
            r2[r1] = r0     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "GET_CHAT_MESSAGES_COUNT_NEWER_THAN_REF_SQL"
            android.database.Cursor r2 = r6.A07(r5, r2, r0)     // Catch:{ all -> 0x0056 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0032
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x004d }
            goto L_0x0046
        L_0x0032:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "msgstore/getnewercount/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x004d }
            r1.append(r8)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004d }
            com.whatsapp.util.Log.i(r0)     // Catch:{ all -> 0x004d }
        L_0x0046:
            r2.close()
            r4.close()
            return r3
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        L_0x0056:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass095.A01(X.02N, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.AnonymousClass02N r8, long r9) {
        /*
            r7 = this;
            X.08d r0 = r7.A03
            X.0OQ r4 = r0.A03()
            X.0BK r6 = r4.A04     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = "SELECT COUNT(*) FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND (message_type = '10') AND _id > ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            X.08c r0 = r7.A00     // Catch:{ all -> 0x0056 }
            long r0 = r0.A05(r8)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0056 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x0056 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0056 }
            r2[r1] = r0     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "GET_CHAT_MISSED_CALLS_COUNT_NEWER_THAN_REF_SQL"
            android.database.Cursor r2 = r6.A07(r5, r2, r0)     // Catch:{ all -> 0x0056 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0032
            int r3 = r2.getInt(r3)     // Catch:{ all -> 0x004d }
            goto L_0x0046
        L_0x0032:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "msgstore/getnewercount/db no message for "
            r1.append(r0)     // Catch:{ all -> 0x004d }
            r1.append(r8)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x004d }
            com.whatsapp.util.Log.i(r0)     // Catch:{ all -> 0x004d }
        L_0x0046:
            r2.close()
            r4.close()
            return r3
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        L_0x0056:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass095.A02(X.02N, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(X.AnonymousClass02N r7, long r8, long r10) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass095.A03(X.02N, long, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r2 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A04() {
        /*
            r5 = this;
            X.08d r0 = r5.A03
            X.0OQ r3 = r0.A03()
            X.0BK r4 = r3.A04     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = " SELECT _id FROM available_message_view ORDER BY _id DESC LIMIT 1"
            r1 = 0
            java.lang.String r0 = "LAST_MESSAGE_ID_SQL"
            android.database.Cursor r2 = r4.A07(r2, r1, r0)     // Catch:{ all -> 0x0049 }
            if (r2 == 0) goto L_0x003e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r1.<init>()     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "msgstore/lastmsgid/count "
            r1.append(r0)     // Catch:{ all -> 0x0037 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x0037 }
            r1.append(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0037 }
            com.whatsapp.util.Log.i(r0)     // Catch:{ all -> 0x0037 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x003e
            r0 = 0
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0042
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            r0 = 1
            if (r2 == 0) goto L_0x0045
        L_0x0042:
            r2.close()
        L_0x0045:
            r3.close()
            return r0
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass095.A04():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(long r10) {
        /*
            r9 = this;
            X.0Kz r8 = new X.0Kz
            r8.<init>()
            java.lang.String r0 = "rowidstore/getRowIdByTimestamp"
            r8.A02 = r0
            r1 = 1
            r8.A03 = r1
            r8.A03()
            r2 = 0
            X.08d r0 = r9.A03
            X.0OQ r7 = r0.A03()
            X.0BK r6 = r7.A04     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "SELECT _id FROM available_message_view WHERE timestamp <= ? ORDER BY _id DESC LIMIT 1"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = java.lang.Long.toString(r10)     // Catch:{ all -> 0x0059 }
            r4 = 0
            r1[r4] = r0     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "GET_ROW_ID_BY_TIMESTAMP"
            android.database.Cursor r1 = r6.A07(r5, r1, r0)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0042
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0037
            long r2 = r1.getLong(r4)     // Catch:{ all -> 0x003b }
        L_0x0037:
            r1.close()
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        L_0x0042:
            r7.close()
            java.lang.String r0 = "rowidstore/getRowIdByTimestamp "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " | time spent:"
            r1.append(r0)
            X.AnonymousClass008.A0s(r8, r1)
            return r2
        L_0x0059:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x005f }
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass095.A05(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r2 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06(X.AnonymousClass02N r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass095.A06(X.02N):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r2 != null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A07(X.AnonymousClass02N r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            X.08c r0 = r6.A00
            long r0 = r0.A05(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = 0
            r5[r4] = r0
            X.08d r0 = r6.A03
            X.0OQ r3 = r0.A03()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "   SELECT _id FROM available_message_view WHERE chat_row_id = ? ORDER BY _id DESC LIMIT 1"
            java.lang.String r0 = "LAST_CHAT_MESSAGE_ID_SQL"
            android.database.Cursor r2 = r2.A07(r1, r5, r0)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x004c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r1.<init>()     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "msgstore/lastmsgid/count "
            r1.append(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x0045 }
            r1.append(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0045 }
            com.whatsapp.util.Log.i(r0)     // Catch:{ all -> 0x0045 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x004c
            long r0 = r2.getLong(r4)     // Catch:{ all -> 0x0045 }
            goto L_0x0050
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0
        L_0x004c:
            r0 = 1
            if (r2 == 0) goto L_0x0053
        L_0x0050:
            r2.close()
        L_0x0053:
            r3.close()
            return r0
        L_0x0057:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass095.A07(X.02N):long");
    }

    public boolean A08(AnonymousClass02N r8, long j) {
        C08560bL A052 = this.A01.A05(r8);
        if (A052 == null) {
            return false;
        }
        if (A052.A0D == 1) {
            if (r8 != null) {
                A052.A0D = A06(r8);
            } else {
                throw null;
            }
        }
        StringBuilder A0W = AnonymousClass008.A0W("msgstore/hasearliermsgs/jid ", r8, " firstref=");
        A0W.append(A052.A0D);
        A0W.append(" startref=");
        A0W.append(j);
        Log.d(A0W.toString());
        long j2 = A052.A0D;
        if (j2 == 1 || j2 >= j) {
            return false;
        }
        return true;
    }
}
