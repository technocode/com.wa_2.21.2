package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.0BX  reason: invalid class name */
public class AnonymousClass0BX extends SQLiteOpenHelper {
    public static volatile AnonymousClass0BX A04;
    public AnonymousClass0BK A00;
    public boolean A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass04q A03;

    public AnonymousClass0BX(AnonymousClass00G r5, AnonymousClass04q r6) {
        super(r5.A00, "media.db", (SQLiteDatabase.CursorFactory) null, 20);
        this.A02 = r5;
        this.A03 = r6;
        setWriteAheadLoggingEnabled(true);
    }

    public static AnonymousClass0BX A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0BX.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0BX(AnonymousClass00G.A01, AnonymousClass04q.A00());
                }
            }
        }
        return A04;
    }

    public synchronized AnonymousClass0BK A01() {
        return A02();
    }

    public synchronized AnonymousClass0BK A02() {
        this.A01 = true;
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A00 = C001801b.A0D(super.getWritableDatabase(), this.A03);
        }
        return this.A00;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A01().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A02().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.d("MediaDbHelper/onCreate");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE web_upload_media_data_store (media_id TEXT PRIMARY KEY NOT NULL, file_hash TEXT, media_key BLOB, mime_type TEXT, upload_url TEXT, direct_path TEXT, enc_file_hash TEXT, file_size INTEGER, width INTEGER, height INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("MediaDbHelper/onDowngrade oldVersion=");
        sb.append(i);
        sb.append(" newVersion=");
        sb.append(i2);
        Log.d(sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_files");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_key_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS shared_media_ids");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("MediaDbHelper/onUpgrade oldVersion=");
        sb.append(i);
        sb.append(" newVersion=");
        sb.append(i2);
        Log.d(sb.toString());
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_job");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_experiments");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS media_files");
        if (i < 16) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_key_store");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS web_upload_media_data_store");
            sQLiteDatabase.execSQL("CREATE TABLE web_upload_media_data_store (media_id TEXT PRIMARY KEY NOT NULL, file_hash TEXT, media_key BLOB, mime_type TEXT, upload_url TEXT, direct_path TEXT, enc_file_hash TEXT, file_size INTEGER, width INTEGER, height INTEGER)");
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS shared_media_ids");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
    }
}
