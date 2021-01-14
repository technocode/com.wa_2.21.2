package X;

import android.content.ContentValues;

/* renamed from: X.09z  reason: invalid class name and case insensitive filesystem */
public class C019309z {
    public static volatile C019309z A06;
    public final C000300f A00;
    public final AnonymousClass01A A01;
    public final C014408c A02;
    public final C006903j A03;
    public final C014508d A04;
    public final AnonymousClass096 A05;

    public C019309z(C014408c r1, C006903j r2, C000300f r3, AnonymousClass01A r4, C014508d r5, AnonymousClass096 r6) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static final int A00(AnonymousClass0OQ r5, AbstractC007503q r6) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("duration", Integer.valueOf(r6.A02));
        Long l = r6.A0R;
        if (l != null) {
            contentValues.put("expire_timestamp", l);
            return r5.A04.A00("message_ephemeral", contentValues, "message_row_id = ?", new String[]{String.valueOf(r6.A0p)}, "updateEphemeralMessage/UPDATE_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL");
        }
        throw null;
    }

    public static C019309z A01() {
        if (A06 == null) {
            synchronized (C019309z.class) {
                if (A06 == null) {
                    A06 = new C019309z(C014408c.A00(), C006903j.A00(), C000300f.A00(), AnonymousClass01A.A00(), C014508d.A00(), AnonymousClass096.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C007103l A02(X.AbstractC007503q r11, long r12) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019309z.A02(X.03q, long):X.03l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AbstractC007503q r8) {
        /*
            r7 = this;
            X.00f r1 = r7.A00
            X.01l r0 = X.AbstractC000400g.A0t
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            X.08d r0 = r7.A04
            X.0OQ r3 = r0.A03()
            X.0BK r6 = r3.A04     // Catch:{ all -> 0x005b }
            java.lang.String r5 = "SELECT duration, expire_timestamp FROM message_ephemeral WHERE message_row_id=?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x005b }
            r2 = 0
            long r0 = r8.A0p     // Catch:{ all -> 0x005b }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x005b }
            r4[r2] = r0     // Catch:{ all -> 0x005b }
            java.lang.String r0 = "GET_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL"
            android.database.Cursor r4 = r6.A07(r5, r4, r0)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x0057
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "duration"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "expire_timestamp"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0050 }
            int r0 = r4.getInt(r2)     // Catch:{ all -> 0x0050 }
            r8.A0Q(r0)     // Catch:{ all -> 0x0050 }
            long r0 = r4.getLong(r1)     // Catch:{ all -> 0x0050 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0050 }
            r8.A0R = r0     // Catch:{ all -> 0x0050 }
        L_0x004c:
            r4.close()
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        L_0x0057:
            r3.close()
            return
        L_0x005b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019309z.A03(X.03q):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AbstractC007503q r8) {
        /*
            r7 = this;
            X.08d r0 = r7.A04
            X.0OQ r3 = r0.A04()
            X.0BK r6 = r3.A04     // Catch:{ all -> 0x0031 }
            java.lang.String r5 = X.AnonymousClass1VQ.A05     // Catch:{ all -> 0x0031 }
            r0 = 3
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0031 }
            r2 = 0
            long r0 = r8.A0p     // Catch:{ all -> 0x0031 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0031 }
            r4[r2] = r0     // Catch:{ all -> 0x0031 }
            r1 = 1
            int r0 = r8.A02     // Catch:{ all -> 0x0031 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0031 }
            r4[r1] = r0     // Catch:{ all -> 0x0031 }
            r1 = 2
            java.lang.Long r0 = r8.A0R     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            r4[r1] = r0     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = "INSERT_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL"
            r6.A0D(r5, r4, r0)     // Catch:{ all -> 0x0031 }
            r3.close()
            return
        L_0x002f:
            r0 = 0
            throw r0
        L_0x0031:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019309z.A04(X.03q):void");
    }
}
