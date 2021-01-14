package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.1ya  reason: invalid class name and case insensitive filesystem */
public class C43561ya extends AnonymousClass0PN {
    public final AnonymousClass09W A00;
    public final AnonymousClass09Q A01;
    public final C015408m A02;
    public final C015708p A03;

    public C43561ya(AnonymousClass09W r3, AnonymousClass09Q r4, C015408m r5, C015708p r6, AnonymousClass0PQ r7) {
        super("message_main", 1, r7);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            AnonymousClass09Q r6 = this.A01;
            AbstractC007503q A022 = r6.A02(cursor);
            if (A022 == null) {
                StringBuilder sb = new StringBuilder("MainMessageStore/MainMessageDatabaseMigration/processBatch/missing message; rowId=");
                sb.append(j);
                Log.e(sb.toString());
            } else {
                AnonymousClass1VB A012 = this.A03.A01(C015708p.A04, "INSERT_MESSAGE_MAIN_WITH_ROW_ID_SQL");
                r6.A06(A022, A012);
                A012.A01();
                i++;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009a, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43561ya.A0D():void");
    }
}
