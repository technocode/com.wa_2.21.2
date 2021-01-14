package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.1yc  reason: invalid class name and case insensitive filesystem */
public class C43581yc extends AnonymousClass0PN {
    public final C015308l A00;
    public final C017709j A01;
    public final C015408m A02;
    public final C015708p A03;

    public C43581yc(C015408m r3, C017709j r4, C015308l r5, C015708p r6, AnonymousClass0PQ r7) {
        super("message_mention", 1, r7);
        this.A00 = r5;
        this.A03 = r6;
        this.A02 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("mentioned_jids");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            List<Jid> A0O = C006803i.A0O(cursor.getString(columnIndexOrThrow2));
            if (A0O != null) {
                for (Jid jid : A0O) {
                    if (jid != null) {
                        AnonymousClass1VB A012 = this.A03.A01("INSERT OR IGNORE INTO message_mentions(    message_row_id,    jid_row_id) VALUES (?, ?)", "INSERT_MESSAGE_MENTION_SQL");
                        j = cursor.getLong(columnIndexOrThrow);
                        A012.A06(1, j);
                        A012.A06(2, this.A00.A02(jid));
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
            java.lang.String r1 = "DELETE FROM message_mentions"
            java.lang.String r0 = "CLEAR_TABLE_MESSAGE_MENTIONS"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0036 }
            X.08m r1 = r5.A02     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "mention_message_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_message_mention_index"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_message_mention_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            r3.A00()     // Catch:{ all -> 0x0036 }
            r3.close()
            r4.close()
            java.lang.String r0 = "MentionMessageStore/resetDatabaseMigration/done"
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
        throw new UnsupportedOperationException("Method not decompiled: X.C43581yc.A0D():void");
    }
}
