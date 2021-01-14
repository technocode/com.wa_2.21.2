package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0Gs  reason: invalid class name and case insensitive filesystem */
public class C03560Gs extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final Context A02;
    public final AnonymousClass04q A03;

    public C03560Gs(Context context, AnonymousClass04q r5) {
        super(context, "hsmpacks.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.A02 = context;
        this.A03 = r5;
    }

    public synchronized AnonymousClass0BK A00() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A00;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = r0;
            } catch (SQLiteException e) {
                Log.e("failed to open pack store", e);
                A02();
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = r0;
            }
            return r0;
        }
        return this.A00;
    }

    public synchronized AnonymousClass0BK A01() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A01;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = r0;
            } catch (SQLiteException e) {
                Log.e("failed to open pack store", e);
                A02();
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = r0;
            }
            return r0;
        }
        return this.A01;
    }

    public synchronized void A02() {
        close();
        Log.i("deleting HSM pack database...");
        File databasePath = this.A02.getDatabasePath("hsmpacks.db");
        boolean delete = databasePath.delete();
        StringBuilder sb = new StringBuilder();
        sb.append("language-pack-store/deleted HSM pack database; databaseDeleted=");
        sb.append(delete);
        Log.i(sb.toString());
        C001801b.A1p(databasePath, "language-pack-store");
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A00().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A01().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS packs");
        sQLiteDatabase.execSQL("CREATE TABLE packs (_id INTEGER PRIMARY KEY AUTOINCREMENT, lg TEXT NOT NULL, lc TEXT NOT NULL, hash TEXT NOT NULL, namespace TEXT NOT NULL, timestamp INTEGER NOT NULL, data BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS pack_index ON packs (lg, lc, namespace)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("language-pack-store/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("language-pack-store/upgrade from ", i, " to ", i2);
        if (i != 1) {
            Log.e("language-pack-store/upgrade unknown old version");
            onCreate(sQLiteDatabase);
            return;
        }
        onCreate(sQLiteDatabase);
    }
}
