package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: X.1yY  reason: invalid class name and case insensitive filesystem */
public class C43541yY extends AnonymousClass0PN {
    public final C02070An A00;
    public final C015408m A01;
    public final C015708p A02;

    public C43541yY(C02070An r3, C015408m r4, C015708p r5, AnonymousClass0PQ r6) {
        super("message_link", 2, r6);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("chat_row_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("data");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("media_caption");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("message_type");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            int i2 = cursor.getInt(columnIndexOrThrow5);
            String str = null;
            if (i2 == 0) {
                str = cursor.getString(columnIndexOrThrow3);
            } else if (i2 == 1 || i2 == 3 || i2 == 13 || i2 == 23 || i2 == 25 || i2 == 37 || i2 == 28 || i2 == 29) {
                str = cursor.getString(columnIndexOrThrow4);
            }
            j = cursor.getLong(columnIndexOrThrow);
            ArrayList A04 = AnonymousClass1Y8.A04(str);
            long j2 = cursor.getLong(columnIndexOrThrow2);
            if (j2 >= 0) {
                if (A04 != null) {
                    AnonymousClass1VB A012 = this.A02.A01("INSERT OR IGNORE INTO message_link(chat_row_id, message_row_id, link_index)  VALUES (?, ?, ?)", "INSERT_MESSAGE_LINK_TABLE");
                    for (int i3 = 0; i3 < A04.size(); i3++) {
                        A012.A06(1, j2);
                        A012.A06(2, j);
                        A012.A06(3, (long) i3);
                        A012.A01();
                    }
                }
                i++;
            }
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
            java.lang.String r1 = "DELETE FROM message_link"
            java.lang.String r0 = "CLEAR_MESSAGE_LINK"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0036 }
            X.08m r1 = r5.A01     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "links_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_link_index"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_link_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            r3.A00()     // Catch:{ all -> 0x0036 }
            r3.close()
            r4.close()
            java.lang.String r0 = "LinkMessageStore/LinkMessageDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.i(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C43541yY.A0D():void");
    }
}
