package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.Closeable;
import java.util.List;

/* renamed from: X.26N  reason: invalid class name */
public final class AnonymousClass26N extends AbstractC35671kk implements Closeable {
    public static final String A03 = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String A04 = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final C243019y A00;
    public final AnonymousClass1AI A01;
    public final AnonymousClass1AI A02;

    public AnonymousClass26N(C242819u r3) {
        super(r3);
        AbstractC240018k r1 = ((C242619s) this).A00.A03;
        this.A01 = new AnonymousClass1AI(r1);
        this.A02 = new AnonymousClass1AI(r1);
        this.A00 = new C243019y(this, r3.A00);
    }

    public final SQLiteDatabase A0D() {
        try {
            return this.A00.getWritableDatabase();
        } catch (SQLiteException e) {
            A08("Error opening database", e);
            throw e;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x007e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.1kk, X.19s, X.26N] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.HashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        if (r12.startsWith("http:") == false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0E(long r24) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26N.A0E(long):java.util.List");
    }

    public final void A0F() {
        A0C();
        A0D().endTransaction();
    }

    public final void A0G() {
        A0C();
        A0D().setTransactionSuccessful();
    }

    public final void A0H(List list) {
        C001801b.A1Q(list);
        AnonymousClass16M.A00();
        A0C();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Number number = (Number) list.get(i);
                if (number == null || number.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(number);
            }
            sb.append(")");
            String obj = sb.toString();
            try {
                SQLiteDatabase A0D = A0D();
                A06("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = A0D.delete("hits2", obj, null);
                if (delete != list.size()) {
                    A02(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), obj);
                }
            } catch (SQLiteException e) {
                A09("Error deleting hits", e);
                throw e;
            }
        }
    }

    public final boolean A0I() {
        AnonymousClass16M.A00();
        A0C();
        Cursor cursor = null;
        try {
            Cursor rawQuery = A0D().rawQuery("SELECT COUNT(*) FROM hits2", null);
            if (rawQuery.moveToFirst()) {
                long j = rawQuery.getLong(0);
                rawQuery.close();
                if (j == 0) {
                    return true;
                }
                return false;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            A02(6, "Database error", "SELECT COUNT(*) FROM hits2", e, null);
            throw e;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.A00.close();
        } catch (SQLiteException e) {
            A09("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            A09("Error closing database", e2);
        }
    }
}
