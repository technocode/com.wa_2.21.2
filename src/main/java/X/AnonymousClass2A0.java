package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.2A0  reason: invalid class name */
public class AnonymousClass2A0 extends AbstractC460527u {
    public final C015708p A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2A0(C015708p r4, AnonymousClass0PQ r5) {
        super("message_ephemeral", "message_ephemeral_remove_column", r5);
        HashMap hashMap = new HashMap();
        hashMap.put("start_timestamp", "INTEGER");
        hashMap.put("chat_duration", "INTEGER");
        this.A00 = r4;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("message_row_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("duration");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("expire_timestamp");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            C015708p r2 = this.A00;
            if (r2 != null) {
                AnonymousClass1VB A01 = r2.A01(AnonymousClass1VQ.A06, "INSERT_OR_REPLACE_EPHEMERAL_MESSAGE_FOR_ROW_ID_INTO_COLUMN_DROPPING_TABLE_SQL");
                j = (long) cursor.getInt(columnIndexOrThrow);
                int i2 = cursor.getInt(columnIndexOrThrow2);
                long j2 = cursor.getLong(columnIndexOrThrow3);
                A01.A06(1, j);
                A01.A06(2, (long) i2);
                A01.A06(3, j2);
                A01.A01();
                i++;
            } else {
                throw null;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }
}
