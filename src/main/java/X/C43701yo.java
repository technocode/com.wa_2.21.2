package X;

import android.database.Cursor;

/* renamed from: X.1yo  reason: invalid class name and case insensitive filesystem */
public class C43701yo extends AnonymousClass0PN {
    public final C014408c A00;
    public final C015408m A01;
    public final C015708p A02;
    public final AnonymousClass09X A03;
    public final AnonymousClass09Y A04;

    public C43701yo(C014408c r3, AnonymousClass09X r4, C015408m r5, C015708p r6, AnonymousClass09Y r7, AnonymousClass0PQ r8) {
        super("message_text", 1, r8);
        this.A00 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        if (r9 != 0) goto L_0x0097;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(android.database.Cursor r19) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43701yo.A07(android.database.Cursor):android.util.Pair");
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
            java.lang.String r1 = "DELETE FROM message_text"
            java.lang.String r0 = "CLEAR_TABLE_MESSAGE_TEXT"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0037 }
            X.08m r1 = r5.A01     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "text_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "migration_message_text_index"
            r1.A02(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = "migration_message_text_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0037 }
            r3.A00()     // Catch:{ all -> 0x0037 }
            r3.close()
            r4.close()
            java.lang.String r0 = "TextMessageStore/TextMessageDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.i(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C43701yo.A0D():void");
    }

    public final C007303n A0P(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("key_from_me");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("key_id");
        AnonymousClass02N A09 = this.A00.A09(cursor);
        int i = cursor.getInt(columnIndexOrThrow);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        return new C007303n(A09, z, cursor.getString(columnIndexOrThrow2));
    }
}
