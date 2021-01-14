package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gh  reason: invalid class name and case insensitive filesystem */
public class C03450Gh extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final AnonymousClass088 A02 = AnonymousClass088.A00();
    public final AnonymousClass04q A03;
    public final ReentrantReadWriteLock A04;

    public C03450Gh(Context context, AnonymousClass04q r5) {
        super(context, "gifs.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.A03 = r5;
        this.A04 = new ReentrantReadWriteLock();
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
        sQLiteDatabase.execSQL("CREATE TABLE gifs (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, plain_file_hash TEXT NOT NULL, file_path TEXT NOT NULL, height INTEGER NOT NULL, width INTEGER NOT NULL, gif_attribution INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS gifs_hash_index ON gifs(plain_file_hash);");
        sQLiteDatabase.execSQL("CREATE TABLE recent_gifs (plaintext_hash TEXT PRIMARY KEY, entry_weight FLOAT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS recents_weight_index ON recent_gifs(entry_weight);");
        sQLiteDatabase.execSQL("CREATE TABLE starred_gifs (plaintext_hash TEXT PRIMARY KEY, timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_gifs (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, timestamp INTEGER NOT NULL, gif_id TEXT NOT NULL, static_url TEXT NOT NULL, static_width INTEGER NOT NULL, static_height INTEGER NOT NULL, preview_url TEXT NOT NULL, preview_width INTEGER NOT NULL, preview_height INTEGER NOT NULL, content_url TEXT NOT NULL, content_width INTEGER NOT NULL, content_height INTEGER NOT NULL, gif_attribution INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS media_url_index ON downloadable_gifs(content_url);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("GifDBHelper/onDowngrade/oldVersion:", i, ", newVersion:", i2);
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS gifs", "DROP TABLE IF EXISTS recent_gifs", "DROP TABLE IF EXISTS starred_gifs", "DROP TABLE IF EXISTS downloadable_gifs");
        C006803i.A0a(this.A02.A08());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("GifDBHelper/onUpgrade/old version:", i, ", new version: ", i2);
        if (i == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE starred_gifs (plaintext_hash TEXT PRIMARY KEY, timestamp INTEGER NOT NULL)");
        } else if (i != 2) {
            if (i != 3) {
                return;
            }
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS gifs", "DROP TABLE IF EXISTS recent_gifs", "DROP TABLE IF EXISTS starred_gifs", "DROP TABLE IF EXISTS downloadable_gifs");
            C006803i.A0a(this.A02.A08());
            onCreate(sQLiteDatabase);
        }
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_gifs (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, timestamp INTEGER NOT NULL, gif_id TEXT NOT NULL, static_url TEXT NOT NULL, static_width INTEGER NOT NULL, static_height INTEGER NOT NULL, preview_url TEXT NOT NULL, preview_width INTEGER NOT NULL, preview_height INTEGER NOT NULL, content_url TEXT NOT NULL, content_width INTEGER NOT NULL, content_height INTEGER NOT NULL, gif_attribution INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS media_url_index ON downloadable_gifs(content_url);");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS gifs", "DROP TABLE IF EXISTS recent_gifs", "DROP TABLE IF EXISTS starred_gifs", "DROP TABLE IF EXISTS downloadable_gifs");
        C006803i.A0a(this.A02.A08());
        onCreate(sQLiteDatabase);
    }
}
