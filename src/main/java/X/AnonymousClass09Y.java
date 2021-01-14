package X;

import android.database.Cursor;

/* renamed from: X.09Y  reason: invalid class name */
public class AnonymousClass09Y {
    public static volatile AnonymousClass09Y A04;
    public final AnonymousClass09Z A00;
    public final C014508d A01;
    public final C015408m A02;
    public final C015708p A03;

    public AnonymousClass09Y(C015408m r1, C015708p r2, C014508d r3, AnonymousClass09Z r4) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A00 = r4;
    }

    public static AnonymousClass09Y A00() {
        if (A04 == null) {
            synchronized (AnonymousClass09Y.class) {
                if (A04 == null) {
                    C000300f.A00();
                    A04 = new AnonymousClass09Y(C015408m.A00(), C015708p.A00(), C014508d.A00(), AnonymousClass09Z.A01());
                }
            }
        }
        return A04;
    }

    public static C007303n A01(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("key_remote_jid");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("key_from_me");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("key_id");
        AnonymousClass02N A012 = AnonymousClass02N.A01(cursor.getString(columnIndexOrThrow));
        int i = cursor.getInt(columnIndexOrThrow2);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        return new C007303n(A012, z, cursor.getString(columnIndexOrThrow3));
    }

    public static final void A02(AbstractC007503q r7) {
        boolean z = false;
        boolean z2 = false;
        if (r7.A0p > 0) {
            z2 = true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("ThumbnailMessageStore/isThumbnailV2Ready/message must have row_id set; key=");
        C007303n r1 = r7.A0n;
        AnonymousClass008.A1R(A0S, r1, z2);
        if (r7.A09 == 1) {
            z = true;
        }
        AnonymousClass008.A1R(AnonymousClass008.A0S("ThumbnailMessageStore/isThumbnailV2Ready/message in main storage; key="), r1, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(long r5) {
        /*
            r4 = this;
            X.08d r0 = r4.A01
            X.0OQ r3 = r0.A04()
            X.08p r2 = r4.A03     // Catch:{ all -> 0x001b }
            java.lang.String r1 = "DELETE FROM message_thumbnail WHERE message_row_id=?"
            java.lang.String r0 = "DELETE_MESSAGE_THUMBNAIL_SQL"
            X.1VB r1 = r2.A01(r1, r0)     // Catch:{ all -> 0x001b }
            r0 = 1
            r1.A06(r0, r5)     // Catch:{ all -> 0x001b }
            r1.A00()     // Catch:{ all -> 0x001b }
            r3.close()
            return
        L_0x001b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0021 }
        L_0x0021:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A03(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(long r6, byte[] r8) {
        /*
            r5 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            X.08d r0 = r5.A01
            X.0OQ r4 = r0.A04()
            X.08p r2 = r5.A03     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "INSERT OR REPLACE INTO message_thumbnail (    message_row_id,    thumbnail) VALUES (?, ?)"
            java.lang.String r0 = "INSERT_MESSAGE_THUMBNAIL_SQL"
            X.1VB r1 = r2.A01(r1, r0)     // Catch:{ all -> 0x002d }
            r3 = 1
            r1.A06(r3, r6)     // Catch:{ all -> 0x002d }
            r0 = 2
            r1.A08(r0, r8)     // Catch:{ all -> 0x002d }
            long r1 = r1.A01()     // Catch:{ all -> 0x002d }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0024
            r3 = 0
        L_0x0024:
            java.lang.String r0 = "ThumbnailMessageStore/insertOrUpdateThumbnailV2/inserted row should has same row_id"
            X.AnonymousClass00E.A0A(r3, r0)     // Catch:{ all -> 0x002d }
            r4.close()
            return
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A04(long, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C007303n r10) {
        /*
            r9 = this;
            X.08d r0 = r9.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x005b }
            X.0OQ r4 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x005b }
            X.02N r0 = r10.A00     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0054 }
            X.0BK r8 = r4.A04     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "message_thumbnails"
            java.lang.String r6 = "key_remote_jid=? AND key_from_me=? AND key_id=?"
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x0054 }
            r2 = 0
            r5[r2] = r1     // Catch:{ all -> 0x0054 }
            boolean r0 = r10.A02     // Catch:{ all -> 0x0054 }
            r1 = 1
            if (r0 == 0) goto L_0x0020
            r2 = 1
        L_0x0020:
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0054 }
            r5[r1] = r0     // Catch:{ all -> 0x0054 }
            r0 = 2
            java.lang.String r3 = r10.A01     // Catch:{ all -> 0x0054 }
            r5[r0] = r3     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "deleteMessageThumbnailV1/DELETE_MESSAGE_THUMBNAILS_DEPRECATED"
            int r2 = r8.A01(r7, r6, r5, r0)     // Catch:{ all -> 0x0054 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
            r1.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "thumbnailmsgstore/deleteMessageThumbnail/"
            r1.append(r0)     // Catch:{ all -> 0x0054 }
            r1.append(r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x0054 }
            r1.append(r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0054 }
            com.whatsapp.util.Log.i(r0)     // Catch:{ all -> 0x0054 }
            r4.close()
            return
        L_0x0052:
            r0 = 0
            throw r0
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "thumbnailmsgstore/deleteMessageThumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A05(X.03n):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C007303n r8, byte[] r9) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A06(X.03n, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (r7 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC007503q r11) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A07(X.03q):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (r5 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ab, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(java.util.Collection r13) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A08(java.util.Collection):void");
    }

    public void A09(byte[] bArr, long j, C007303n r7) {
        if (A0B(j)) {
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            StringBuilder sb = new StringBuilder("ThumbnailMessageStore/insertOrUpdateMessageThumbnail/message must have row_id set; key=");
            sb.append(r7);
            AnonymousClass00E.A09(z, sb.toString());
            A04(j, bArr);
            return;
        }
        A06(r7, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(byte[] r6, X.AbstractC007503q r7) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A0A(byte[], X.03q):void");
    }

    public final boolean A0B(long j) {
        C015408m r3 = this.A02;
        String A012 = r3.A01("thumbnail_ready");
        if (A012 != null && Integer.parseInt(A012) == 2) {
            return true;
        }
        long j2 = 0;
        if (j <= 0) {
            return false;
        }
        String A013 = r3.A01("migration_message_thumbnail_index");
        if (A013 != null) {
            j2 = Long.parseLong(A013);
        }
        if (j2 >= j) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r1 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c4, code lost:
        if (r1 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A0C(X.AbstractC007503q r11) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A0C(X.03q):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A0D(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r5 = 0
            if (r0 == 0) goto L_0x0008
            return r5
        L_0x0008:
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r0 = 0
            r4[r0] = r7
            X.08d r0 = r6.A01
            X.0OQ r3 = r0.A03()
            X.0BK r2 = r3.A04     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "SELECT thumbnail FROM media_hash_thumbnail WHERE media_hash=?"
            java.lang.String r0 = "GET_THUMBNAIL_BY_MEDIA_HASH_SQL"
            android.database.Cursor r1 = r2.A07(r1, r4, r0)     // Catch:{ all -> 0x0046 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "thumbnail"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003d }
            byte[] r0 = r1.getBlob(r0)     // Catch:{ all -> 0x003d }
            r1.close()
            r3.close()
            return r0
        L_0x0036:
            r1.close()
            r3.close()
            return r5
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            throw r0
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09Y.A0D(java.lang.String):byte[]");
    }
}
