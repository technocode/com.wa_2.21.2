package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.09r  reason: invalid class name and case insensitive filesystem */
public class C018509r {
    public static volatile C018509r A03;
    public final C014408c A00;
    public final C015308l A01;
    public final C014508d A02;

    public C018509r(C015308l r1, C014408c r2, C014508d r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static C018509r A00() {
        if (A03 == null) {
            synchronized (C018509r.class) {
                if (A03 == null) {
                    A03 = new C018509r(C015308l.A00(), C014408c.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r2 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A01(X.AnonymousClass02U r8, com.whatsapp.jid.UserJid r9) {
        /*
            r7 = this;
            r5 = -1
            if (r8 == 0) goto L_0x005f
            if (r9 == 0) goto L_0x005f
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]
            r2 = 0
            X.08l r3 = r7.A01
            long r0 = r3.A02(r8)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r2] = r0
            r2 = 1
            long r0 = r3.A02(r9)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r2] = r0
            X.08d r0 = r7.A02
            X.0OQ r3 = r0.A03()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "SELECT message_row_id FROM message_group_invite WHERE group_jid_row_id = ? AND admin_jid_row_id = ? AND expired = 0 ORDER BY invite_time DESC"
            java.lang.String r0 = "GET_LAST_GROUP_INVITE_MESSAGE_BY_GROUP_AND_ADMIN_SQL"
            android.database.Cursor r2 = r2.A07(r1, r4, r0)     // Catch:{ all -> 0x0058 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004f }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x004f }
            r2.close()
            r3.close()
            return r0
        L_0x0048:
            r2.close()
            r3.close()
            return r5
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0
        L_0x0058:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x005e }
        L_0x005e:
            throw r0
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018509r.A01(X.02U, com.whatsapp.jid.UserJid):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r2 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A02(X.AnonymousClass02U r8, com.whatsapp.jid.UserJid r9) {
        /*
            r7 = this;
            r5 = -1
            if (r8 == 0) goto L_0x0061
            if (r9 == 0) goto L_0x0061
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]
            r2 = 0
            X.08l r0 = r7.A01
            long r0 = r0.A02(r8)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r2] = r0
            r2 = 1
            X.08c r0 = r7.A00
            long r0 = r0.A05(r9)
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4[r2] = r0
            X.08d r0 = r7.A02
            X.0OQ r3 = r0.A03()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "SELECT invite.message_row_id AS message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND message.chat_row_id = ? AND invite.expired = 0 ORDER BY invite.invite_time DESC"
            java.lang.String r0 = "GET_LAST_SENT_GROUP_INVITE_MESSAGE_BY_GROUP_AND_REMOTE_SQL"
            android.database.Cursor r2 = r2.A07(r1, r4, r0)     // Catch:{ all -> 0x005a }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0051 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0051 }
            r2.close()
            r3.close()
            return r0
        L_0x004a:
            r2.close()
            r3.close()
            return r5
        L_0x0051:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r0
        L_0x005a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018509r.A02(X.02U, com.whatsapp.jid.UserJid):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        if (r7 != null) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0073, code lost:
        if (r1 == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass0ZF r14) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018509r.A03(X.0ZF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass0ZF r6) {
        /*
            r5 = this;
            X.08d r0 = r5.A02
            X.0OQ r4 = r0.A04()
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x0019 }
            java.lang.String r2 = "INSERT or REPLACE INTO message_group_invite (message_row_id, group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration , invite_time, expired) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            long r0 = r6.A0p     // Catch:{ all -> 0x0019 }
            java.lang.String[] r1 = r5.A06(r6, r0)     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "INSERT_GROUP_INVITE_MESSAGE_SQL"
            r3.A0D(r2, r1, r0)     // Catch:{ all -> 0x0019 }
            r4.close()
            return
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x001f }
        L_0x001f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018509r.A04(X.0ZF):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass0ZF r6, long r7) {
        /*
            r5 = this;
            X.08d r0 = r5.A02
            X.0OQ r4 = r0.A04()
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "INSERT or REPLACE INTO message_quoted_group_invite (message_row_id, group_jid_row_id, admin_jid_row_id, group_name, invite_code, expiration, invite_time, expired) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
            java.lang.String[] r1 = r5.A06(r6, r7)     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = "INSERT_QUOTED_GROUP_INVITE_MESSAGE_SQL"
            r3.A0D(r2, r1, r0)     // Catch:{ all -> 0x0017 }
            r4.close()
            return
        L_0x0017:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x001d }
        L_0x001d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018509r.A05(X.0ZF, long):void");
    }

    public final String[] A06(AnonymousClass0ZF r6, long j) {
        String l;
        String[] strArr = new String[8];
        strArr[0] = Long.toString(j);
        AnonymousClass02U r1 = r6.A01;
        String str = null;
        if (r1 == null) {
            l = null;
        } else {
            l = Long.toString(this.A01.A02(r1));
        }
        strArr[1] = l;
        UserJid userJid = r6.A02;
        if (userJid != null) {
            str = Long.toString(this.A01.A02(userJid));
        }
        strArr[2] = str;
        strArr[3] = r6.A04;
        strArr[4] = r6.A05;
        strArr[5] = Long.toString(r6.A00);
        strArr[6] = Long.toString(r6.A0E);
        strArr[7] = Integer.toString(r6.A06 ? 1 : 0);
        return strArr;
    }
}
