package X;

import android.database.Cursor;
import android.util.Pair;

/* renamed from: X.1yW  reason: invalid class name and case insensitive filesystem */
public class C43521yW extends AnonymousClass0PN {
    public final C017309f A00;
    public final C015408m A01;
    public final C015708p A02;

    public C43521yW(C015408m r3, C015708p r4, C017309f r5, AnonymousClass0PQ r6) {
        super("message_future", 1, r6);
        this.A00 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("media_duration");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("raw_data");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            AnonymousClass1VB A012 = this.A02.A01("INSERT INTO message_future(    message_row_id,    version,    data) VALUES (?, ?, ?)", "INSERT_MESSAGE_FUTURE_SQL");
            j = cursor.getLong(columnIndexOrThrow);
            int i2 = cursor.getInt(columnIndexOrThrow2);
            byte[] blob = cursor.getBlob(columnIndexOrThrow3);
            A012.A06(1, j);
            A012.A06(2, (long) i2);
            if (blob == null) {
                A012.A04(3);
            } else {
                A012.A08(3, blob);
            }
            A012.A01();
            i++;
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r5 = this;
            super.A0D()
            X.08d r0 = r5.A05
            X.0OQ r4 = r0.A04()
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x003d }
            X.0BK r2 = r4.A04     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "DELETE FROM message_future"
            java.lang.String r0 = "CLEAR_TABLE_MESSAGE_FUTURE"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0036 }
            X.08m r1 = r5.A01     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "future_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_message_future_index"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_message_future_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            r3.A00()     // Catch:{ all -> 0x0036 }
            r3.close()
            r4.close()
            java.lang.String r0 = "FutureMessageStore/FutureMessageDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.d(r0)
            return
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43521yW.A0D():void");
    }
}
