package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.0DK  reason: invalid class name */
public class AnonymousClass0DK extends SQLiteOpenHelper implements AnonymousClass08N {
    public static volatile AnonymousClass0DK A05;
    public AnonymousClass0BK A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass08J A03 = new AnonymousClass08J();
    public final AnonymousClass04q A04;

    public AnonymousClass0DK(AnonymousClass00G r5, AnonymousClass009 r6, AnonymousClass04q r7) {
        super(r5.A00, "sync.db", (SQLiteDatabase.CursorFactory) null, 32);
        this.A02 = r5;
        this.A01 = r6;
        this.A04 = r7;
    }

    public static AnonymousClass0DK A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0DK.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0DK(AnonymousClass00G.A01, AnonymousClass009.A00(), AnonymousClass04q.A00());
                }
            }
        }
        return A05;
    }

    public AnonymousClass0OQ A01() {
        return new AnonymousClass0OQ(null, this, null, true, this.A01);
    }

    public void A02(SQLiteDatabase sQLiteDatabase) {
        Log.i("sync-db-helper/reset");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS syncd_mutations");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS collection_versions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS pending_mutations");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS peer_messages");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS encrypted_mutations", "DROP TABLE IF EXISTS msg_history_sync", "DROP TABLE IF EXISTS crypto_info", "DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP INDEX IF EXISTS peer_messages_message_key_index", "DROP TABLE IF EXISTS fanout_backfill_messages", "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger", "DROP TABLE IF EXISTS missing_keys");
        onCreate(sQLiteDatabase);
    }

    @Override // X.AnonymousClass08N
    public AnonymousClass08J A7k() {
        return this.A03;
    }

    @Override // X.AnonymousClass08N
    public synchronized AnonymousClass0BK A8g() {
        return A9x();
    }

    @Override // X.AnonymousClass08N
    public synchronized AnonymousClass0BK A9x() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A00 = C001801b.A0D(super.getWritableDatabase(), this.A04);
        }
        return this.A00;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A8g().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A9x().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass008.A0c(sQLiteDatabase, "CREATE TABLE syncd_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, collection_name TEXT NOT NULL, are_dependencies_missing BOOLEAN NOT NULL, mutation_mac BLOB, device_id INTEGER NOT NULL, epoch INTEGER NOT NULL )", "CREATE TABLE collection_versions (collection_name TEXT PRIMARY KEY, version INTEGER NOT NULL,lt_hash BLOB)", "CREATE TABLE pending_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, operation BLOB NOT NULL, is_ready_to_sync BOOLEAN NOT NULL, collection_name TEXT, device_id INTEGER, epoch INTEGER, are_dependencies_missing BOOLEAN NOT NULL )", "CREATE TABLE peer_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_type INTEGER NOT NULL, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, device_id TEXT, timestamp INTEGER, data TEXT)");
        AnonymousClass008.A0c(sQLiteDatabase, "CREATE TABLE encrypted_mutations (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, key_id BLOB NOT NULL, operation BLOB NOT NULL, index_hash BLOB NOT NULL, index_and_value_cipher_text BLOB NOT NULL)", "CREATE TABLE msg_history_sync(_id INTEGER PRIMARY KEY AUTOINCREMENT, device_id TEXT NOT NULL, sync_type INTEGER NOT NULL, last_processed_msg_row_id INTEGER, oldest_msg_row_id INTEGER, sent_msgs_count INTEGER, chunk_order INTEGER, sent_bytes INTEGER, last_chunk_timestamp INTEGER, status INTEGER, peer_msg_row_id INTEGER, oldest_message_to_sync_row_id INTEGER)", "CREATE TABLE crypto_info (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, key_data BLOB NOT NULL, timestamp INTEGER NOT NULL, fingerprint BLOB NOT NULL, stale_timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY ( device_id , epoch ) )", "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )");
        sQLiteDatabase.execSQL("CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("sync-db-helper/onDowngrade oldVersion:", i, ", newVersion:", i2);
        A02(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("sync-db-helper/onUpgrade oldVersion:", i, ", newVersion:", i2);
        switch (i) {
            case 23:
                AnonymousClass008.A0c(sQLiteDatabase, "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger", "DROP TABLE IF EXISTS missing_keys", "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )", "CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END");
            case 24:
                sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS peer_messages_bi_for_fanout_backfill_messages_trigger");
                sQLiteDatabase.execSQL("DROP INDEX IF EXISTS peer_messages_message_key_index");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fanout_backfill_messages");
            case 25:
                sQLiteDatabase.execSQL("ALTER TABLE collection_versions ADD lt_hash BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE syncd_mutations ADD mutation_mac BLOB");
            case 26:
                sQLiteDatabase.execSQL("ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER");
            case 27:
                sQLiteDatabase.execSQL("ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1");
            case 28:
                sQLiteDatabase.execSQL("ALTER TABLE pending_mutations ADD collection_name TEXT");
            case 29:
                AnonymousClass008.A0c(sQLiteDatabase, "ALTER TABLE pending_mutations ADD device_id INTEGER", "ALTER TABLE pending_mutations ADD epoch INTEGER", "ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0", "ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0");
            case 30:
                sQLiteDatabase.execSQL("ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0");
                break;
            case 31:
                break;
            default:
                StringBuilder sb = new StringBuilder("sync-db-helper/onUpgrade unknown oldVersion:");
                sb.append(i);
                sb.append(", newVersion:");
                sb.append(i2);
                Log.e(sb.toString());
                A02(sQLiteDatabase);
                return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0");
    }
}
