package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.0qu  reason: invalid class name and case insensitive filesystem */
public class C17060qu implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ AbstractC17050qt A00;

    public C17060qu(AbstractC17050qt r1) {
        this.A00 = r1;
    }

    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.A00.A2G(new C30791bx(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
