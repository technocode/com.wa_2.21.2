package X;

import android.database.Cursor;
import android.util.Pair;
import java.util.Collections;

/* renamed from: X.29z  reason: invalid class name and case insensitive filesystem */
public class C464129z extends AbstractC460527u {
    public final C015708p A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C464129z(C015708p r3, AnonymousClass0PQ r4) {
        super("message_ephemeral_setting", "message_ephemeral_setting_remove_column", r4);
        Collections.singletonMap("ephemerality_enabled", "BOOLEAN");
        this.A00 = r3;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("message_row_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("setting_duration");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            C015708p r2 = this.A00;
            if (r2 != null) {
                AnonymousClass1VB A01 = r2.A01(AnonymousClass1VP.A03, "INSERT_EPHEMERAL_SETTING_DURATION_INTO_COLUMN_DROPPING_TABLE");
                j = (long) cursor.getInt(columnIndexOrThrow);
                int i2 = cursor.getInt(columnIndexOrThrow2);
                A01.A06(1, j);
                A01.A06(2, (long) i2);
                A01.A01();
                i++;
            } else {
                throw null;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }
}
