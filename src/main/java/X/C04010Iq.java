package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.0Iq  reason: invalid class name and case insensitive filesystem */
public class C04010Iq extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final Context A02;
    public final AnonymousClass04q A03;

    public C04010Iq(Context context, AnonymousClass04q r5) {
        super(context, "emojidictionary.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A02 = context;
        this.A03 = r5;
    }

    public synchronized AnonymousClass0BK A00() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A00 = C001801b.A0D(super.getReadableDatabase(), this.A03);
        }
        return this.A00;
    }

    public synchronized AnonymousClass0BK A01() {
        AnonymousClass0BK r0 = this.A01;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A01 = C001801b.A0D(super.getWritableDatabase(), this.A03);
        }
        return this.A01;
    }

    public SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return super.getReadableDatabase();
    }

    public SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return super.getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE emoji_search_tag (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, type INTEGER NOT NULL, symbol TEXT NOT NULL, tag TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS emoji_search_pack_index on emoji_search_tag (type, symbol, tag)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }
}
