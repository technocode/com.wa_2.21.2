package X;

/* renamed from: X.09b  reason: invalid class name and case insensitive filesystem */
public class C016909b {
    public static volatile C016909b A0D;
    public final AnonymousClass01I A00;
    public final C017009c A01;
    public final AnonymousClass01A A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass09A A05;
    public final C014408c A06;
    public final C006903j A07;
    public final C015308l A08;
    public final AnonymousClass094 A09;
    public final C014508d A0A;
    public final C015408m A0B;
    public final C015708p A0C;

    public C016909b(AnonymousClass00G r1, C015308l r2, C014408c r3, AnonymousClass01I r4, C006903j r5, AnonymousClass01A r6, AnonymousClass01X r7, C015408m r8, C015708p r9, AnonymousClass09A r10, C014508d r11, C017009c r12, AnonymousClass094 r13) {
        this.A03 = r1;
        this.A08 = r2;
        this.A06 = r3;
        this.A00 = r4;
        this.A07 = r5;
        this.A02 = r6;
        this.A04 = r7;
        this.A0B = r8;
        this.A0C = r9;
        this.A05 = r10;
        this.A0A = r11;
        this.A01 = r12;
        this.A09 = r13;
    }

    public static C016909b A00() {
        if (A0D == null) {
            synchronized (C016909b.class) {
                if (A0D == null) {
                    AnonymousClass00G r3 = AnonymousClass00G.A01;
                    C015308l A002 = C015308l.A00();
                    C014408c A003 = C014408c.A00();
                    AnonymousClass01I A004 = AnonymousClass01I.A00();
                    C006903j A005 = C006903j.A00();
                    C000300f.A00();
                    A0D = new C016909b(r3, A002, A003, A004, A005, AnonymousClass01A.A00(), AnonymousClass01X.A00(), C015408m.A00(), C015708p.A00(), AnonymousClass09A.A02, C014508d.A00(), C017009c.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C016909b r5, java.util.List r6, long r7) {
        /*
            X.00G r3 = r5.A03
            X.01A r2 = r5.A02
            X.01X r1 = r5.A04
            X.09c r0 = r5.A01
            java.util.List r1 = X.AnonymousClass1Z4.A02(r3, r2, r1, r0, r6)
            X.08d r0 = r5.A0A
            X.0OQ r4 = r0.A04()
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x0042 }
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x003b }
        L_0x001c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x003b }
            X.1Z5 r1 = (X.AnonymousClass1Z5) r1     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x003b }
            r5.A08(r0, r7)     // Catch:{ all -> 0x003b }
            r5.A09(r1, r7)     // Catch:{ all -> 0x003b }
            goto L_0x001c
        L_0x0031:
            r3.A00()     // Catch:{ all -> 0x003b }
            r3.close()
            r4.close()
            return
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        L_0x0042:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A01(X.09b, java.util.List, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r2 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(long r9, boolean r11) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0017
            java.lang.String r7 = "SELECT vcard FROM message_quoted_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\""
        L_0x0004:
            if (r11 == 0) goto L_0x0014
            java.lang.String r6 = "GET_QUOTED_VCARDS_BY_MESSAGE_ROW_ID_SQL"
        L_0x0008:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.08d r0 = r8.A0A
            X.0OQ r4 = r0.A03()
            goto L_0x001a
        L_0x0014:
            java.lang.String r6 = "GET_VCARDS_BY_MESSAGE_ROW_ID_SQL"
            goto L_0x0008
        L_0x0017:
            java.lang.String r7 = "SELECT vcard FROM message_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\""
            goto L_0x0004
        L_0x001a:
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x004f }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r9)     // Catch:{ all -> 0x004f }
            r2[r1] = r0     // Catch:{ all -> 0x004f }
            android.database.Cursor r2 = r3.A07(r7, r2, r6)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "vcard"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0046 }
        L_0x0031:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x0046 }
            r5.add(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0031
        L_0x003f:
            r2.close()
            r4.close()
            return r5
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A02(long, boolean):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 > r4) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C04830Lz r8) {
        /*
            r7 = this;
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x0026
            long r1 = r8.A0p
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0023
            long r2 = r8.A0p
            X.08m r1 = r7.A0B
            java.lang.String r0 = "migration_vcard_index"
            java.lang.String r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x001e
            long r4 = java.lang.Long.parseLong(r0)
        L_0x001e:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0036
        L_0x0026:
            java.lang.String r0 = r8.A0D()
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = r8.A0D()
            long r0 = r8.A0p
            r7.A08(r2, r0)
            return
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A03(X.0Lz):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 > r4) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass0M1 r8) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A04(X.0M1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass0M1 r5, long r6) {
        /*
            r4 = this;
            java.util.List r1 = r5.A0u()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            X.08d r0 = r4.A0A
            X.0OQ r3 = r0.A04()
            X.0Rk r2 = r3.A00()     // Catch:{ all -> 0x003a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0019:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0033 }
            r4.A07(r0, r6)     // Catch:{ all -> 0x0033 }
            goto L_0x0019
        L_0x0029:
            r2.A00()     // Catch:{ all -> 0x0033 }
            r2.close()
            r3.close()
            return
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A05(X.0M1, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass0M2 r6) {
        /*
            r5 = this;
            int r1 = r6.A04
            r0 = 7
            if (r1 != r0) goto L_0x0041
            X.0M4 r0 = r6.A02
            if (r0 == 0) goto L_0x0041
            X.08d r0 = r5.A0A
            X.0OQ r3 = r0.A03()
            r0 = 2
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x003a }
            r4.<init>(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "message_row_id"
            long r0 = r6.A0p     // Catch:{ all -> 0x003a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x003a }
            r4.put(r2, r0)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "count"
            X.0M4 r0 = r6.A02     // Catch:{ all -> 0x003a }
            int r0 = r0.A01     // Catch:{ all -> 0x003a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003a }
            r4.put(r1, r0)     // Catch:{ all -> 0x003a }
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "message_media_vcard_count"
            java.lang.String r0 = "REPLACE_VCARD_COUNT_SQL"
            r2.A04(r1, r4, r0)     // Catch:{ all -> 0x003a }
            r3.close()
            return
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A06(X.0M2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.lang.String r5, long r6) {
        /*
            r4 = this;
            X.08d r0 = r4.A0A
            X.0OQ r3 = r0.A04()
            X.08p r2 = r4.A0C     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "INSERT OR IGNORE INTO message_quoted_vcard(    message_row_id,    vcard) VALUES (?, ?)"
            java.lang.String r0 = "INSERT_QUOTED_VCARD_SQL"
            X.1VB r1 = r2.A01(r1, r0)     // Catch:{ all -> 0x001f }
            r0 = 1
            r1.A06(r0, r6)     // Catch:{ all -> 0x001f }
            r0 = 2
            r1.A07(r0, r5)     // Catch:{ all -> 0x001f }
            r1.A01()     // Catch:{ all -> 0x001f }
            r3.close()
            return
        L_0x001f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A07(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.lang.String r5, long r6) {
        /*
            r4 = this;
            X.08d r0 = r4.A0A
            X.0OQ r3 = r0.A04()
            X.08p r2 = r4.A0C     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "INSERT OR IGNORE INTO message_vcard(    message_row_id,    vcard) VALUES (?, ?)"
            java.lang.String r0 = "INSERT_VCARD_SQL"
            X.1VB r1 = r2.A01(r1, r0)     // Catch:{ all -> 0x001f }
            r0 = 1
            r1.A06(r0, r6)     // Catch:{ all -> 0x001f }
            r0 = 2
            r1.A07(r0, r5)     // Catch:{ all -> 0x001f }
            r1.A01()     // Catch:{ all -> 0x001f }
            r3.close()
            return
        L_0x001f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A08(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
        if (r1 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass1Z5 r11, long r12) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016909b.A09(X.1Z5, long):void");
    }

    public boolean A0A() {
        String A012;
        if (!this.A08.A0C() || (A012 = this.A0B.A01("new_vcards_ready")) == null || Integer.parseInt(A012) != 1) {
            return false;
        }
        return true;
    }
}
