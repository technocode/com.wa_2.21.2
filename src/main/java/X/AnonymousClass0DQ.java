package X;

import android.database.Cursor;

/* renamed from: X.0DQ  reason: invalid class name */
public class AnonymousClass0DQ {
    public static volatile AnonymousClass0DQ A01;
    public final AnonymousClass0DK A00;

    public AnonymousClass0DQ(AnonymousClass0DK r1) {
        this.A00 = r1;
    }

    public final AnonymousClass0DP A00(Cursor cursor) {
        try {
            AnonymousClass0DN A002 = AnonymousClass0DN.A00((C75583dA) AnonymousClass078.A02(C75583dA.A05, cursor.getBlob(cursor.getColumnIndex("fingerprint"))));
            if (A002 != null) {
                return new AnonymousClass0DP(new AnonymousClass0DM((int) cursor.getLong(cursor.getColumnIndex("device_id")), (int) cursor.getLong(cursor.getColumnIndex("epoch"))), new AnonymousClass0DO(cursor.getBlob(cursor.getColumnIndex("key_data")), cursor.getLong(cursor.getColumnIndex("timestamp")), A002));
            }
            throw null;
        } catch (C04190Jk e) {
            throw new IllegalStateException("SyncdCryptoStore/createSyncdKey", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(long r9, java.util.Collection r11) {
        /*
            r8 = this;
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r11)
            r0 = 0
            r1.remove(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            X.0DK r0 = r8.A00
            X.0OQ r4 = r0.A01()
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x0054 }
        L_0x001a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0050
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x0054 }
            X.0DM r6 = (X.AnonymousClass0DM) r6     // Catch:{ all -> 0x0054 }
            X.0BK r5 = r4.A04     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "UPDATE crypto_info SET stale_timestamp = ?  WHERE device_id = ?  AND epoch = ? "
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0054 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            r1 = 1
            int r0 = r6.A01()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            r1 = 2
            int r0 = r6.A02()     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r2[r1] = r0     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "SyncdCryptoInfoTable.UPDATE_STALE_TIMESTAMP_BY_KEY_ID"
            r5.A0D(r3, r2, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x001a
        L_0x0050:
            r4.close()
            return
        L_0x0054:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DQ.A01(long, java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.util.Set r11) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DQ.A02(java.util.Set):void");
    }
}
