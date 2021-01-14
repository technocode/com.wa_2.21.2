package X;

import android.database.Cursor;
import android.util.Pair;

/* renamed from: X.1ym  reason: invalid class name and case insensitive filesystem */
public class C43681ym extends AnonymousClass0PN {
    public final C015408m A00;
    public final AnonymousClass0B1 A01;
    public final C015708p A02;

    public C43681ym(C015408m r3, C015708p r4, AnonymousClass0B1 r5, AnonymousClass0PQ r6) {
        super("message_send_count", 1, r6);
        this.A01 = r5;
        this.A00 = r3;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("send_count");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            AnonymousClass1VB A012 = this.A02.A01("INSERT OR REPLACE INTO message_send_count (    message_row_id,    send_count) VALUES (?, ?)", "INSERT_MESSAGE_SEND_COUNT_SQL");
            j = cursor.getLong(columnIndexOrThrow);
            int i2 = cursor.getInt(columnIndexOrThrow2);
            if (i2 != 0) {
                A012.A06(1, j);
                A012.A06(2, (long) i2);
                A012.A01();
                i++;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
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
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x003e }
            X.0BK r2 = r4.A04     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = "DELETE FROM message_send_count"
            java.lang.String r0 = "CLEAR_TABLE_MESSAGE_SEND_COUNT"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0037 }
            X.08m r1 = r5.A00     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "send_count_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "migration_message_send_count_index"
            r1.A02(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "migration_message_send_count_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0037 }
            r3.A00()     // Catch:{ all -> 0x0037 }
            r3.close()
            r4.close()
            java.lang.String r0 = "SendCountMessageStore/resetDatabaseMigration/done"
            com.whatsapp.util.Log.d(r0)
            return
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43681ym.A0D():void");
    }
}
