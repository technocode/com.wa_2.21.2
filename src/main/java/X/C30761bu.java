package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1bu  reason: invalid class name and case insensitive filesystem */
public class C30761bu implements AbstractC16990qn {
    public static final String[] A01 = new String[0];
    public final SQLiteDatabase A00;

    public C30761bu(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
    }

    public Cursor A00(AbstractC17050qt r6) {
        return this.A00.rawQueryWithFactory(new C17060qu(r6), r6.A9A(), A01, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }
}
