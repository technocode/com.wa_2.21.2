package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.Collections;

/* renamed from: X.1yq  reason: invalid class name and case insensitive filesystem */
public class C43721yq extends AnonymousClass0PN {
    public final C015408m A00;
    public final C016909b A01;

    public C43721yq(C015408m r3, C016909b r4, AnonymousClass0PQ r5) {
        super("message_vcard", 1, r5);
        this.A00 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("media_wa_type");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            int i2 = cursor.getInt(columnIndexOrThrow2);
            if (i2 == 4) {
                C016909b.A01(this.A01, Collections.singletonList(cursor.getString(cursor.getColumnIndexOrThrow("data"))), j);
            } else if (i2 == 14) {
                C016909b.A01(this.A01, C003701u.A0B(cursor.getBlob(cursor.getColumnIndexOrThrow("raw_data"))), j);
            }
            i++;
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
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
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x0044 }
            X.0BK r2 = r4.A04     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "DELETE FROM message_vcard"
            java.lang.String r0 = "CLEAR_TABLE_MESSAGE_VCARD"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "DELETE FROM message_vcard_jid"
            java.lang.String r0 = "CLEAR_MESSAGE_VCARD_JID"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x003d }
            X.08m r1 = r5.A00     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "new_vcards_ready"
            r1.A02(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "migration_vcard_index"
            r1.A02(r0)     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "migration_vcard_retry"
            r1.A02(r0)     // Catch:{ all -> 0x003d }
            r3.A00()     // Catch:{ all -> 0x003d }
            r3.close()
            r4.close()
            java.lang.String r0 = "VCardMessageStore/VCardMessageStoreDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.i(r0)
            return
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43721yq.A0D():void");
    }
}
