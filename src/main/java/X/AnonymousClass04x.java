package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.04x  reason: invalid class name */
public class AnonymousClass04x extends SQLiteOpenHelper {
    public AnonymousClass056 A00;
    public AnonymousClass0BK A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass04q A04;
    public final String A05 = "axolotl.db";
    public final boolean A06 = true;

    public AnonymousClass04x(AnonymousClass00G r6, AnonymousClass00S r7, AnonymousClass04q r8) {
        super(r6.A00, "axolotl.db", (SQLiteDatabase.CursorFactory) null, 11);
        this.A03 = r6;
        this.A02 = r7;
        this.A04 = r8;
        setWriteAheadLoggingEnabled(true);
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder("ALTER TABLE ");
        sb.append(str);
        sb.append(" RENAME TO old_");
        sb.append(str);
        sb.append(";");
        sQLiteDatabase.execSQL(sb.toString());
        sQLiteDatabase.execSQL(str2);
        String join = TextUtils.join(", ", strArr);
        sQLiteDatabase.execSQL(AnonymousClass008.A0Q(AnonymousClass008.A0a("INSERT INTO ", str, " (", join, ")"), " SELECT ", join, " FROM old_", str));
        StringBuilder sb2 = new StringBuilder("DROP TABLE old_");
        sb2.append(str);
        sQLiteDatabase.execSQL(sb2.toString());
    }

    public synchronized AnonymousClass0BK A01() {
        return A02();
    }

    public synchronized AnonymousClass0BK A02() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A01;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A04);
                this.A01 = r0;
            } catch (SQLiteException e) {
                Log.e("failed to open axolotl store", e);
                AnonymousClass056 r03 = this.A00;
                if (r03 != null) {
                    r03.A00.A0J();
                }
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A04);
                this.A01 = r0;
            }
            return r0;
        }
        return this.A01;
    }

    public SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A01().A00;
    }

    public SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A02().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass056 r0;
        Log.i("creating axolotl database version 11");
        sQLiteDatabase.execSQL("CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, sent_to_server BOOLEAN, record BLOB, direct_distribution BOOLEAN, upload_timestamp INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
        AnonymousClass008.A0c(sQLiteDatabase, "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, device_id)", "CREATE TABLE signed_prekeys (_id INTEGER PRIMARY KEY AUTOINCREMENT, prekey_id INTEGER UNIQUE, timestamp INTEGER, record BLOB)", "CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, recipient_id INTEGER, device_id INTEGER NOT NULL DEFAULT 0, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)");
        AnonymousClass008.A0c(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)", "CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL, timestamp INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)", "CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, device_id INTEGER NOT NULL DEFAULT 0, record BLOB NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)");
        Log.i("created axolotl database version 11");
        if (this.A06 && (r0 = this.A00) != null) {
            C001000o r3 = r0.A00;
            AnonymousClass05B r02 = r3.A00;
            AnonymousClass1UJ A09 = C001801b.A09();
            ContentValues contentValues = new ContentValues();
            AnonymousClass00S r9 = r02.A01;
            long A052 = r9.A05() / 1000;
            contentValues.put("recipient_id", (Integer) -1);
            contentValues.put("device_id", (Integer) 0);
            try {
                contentValues.put("registration_id", Integer.valueOf(SecureRandom.getInstance("SHA1PRNG").nextInt(2147483646) + 1));
                contentValues.put("public_key", A09.A01.A00.A00());
                AnonymousClass1UD r2 = A09.A00;
                contentValues.put("private_key", r2.A01);
                try {
                    contentValues.put("next_prekey_id", Integer.valueOf(SecureRandom.getInstance("SHA1PRNG").nextInt(16777214) + 1));
                    Long valueOf = Long.valueOf(A052);
                    contentValues.put("timestamp", valueOf);
                    sQLiteDatabase.insertOrThrow("identities", null, contentValues);
                    Log.i("axolotl inserted identity key pair");
                    try {
                        AnonymousClass1UC A07 = C001801b.A07();
                        C05770Qa r1 = A07.A01;
                        byte[] A1t = C001801b.A1t(r2, r1.A00());
                        AnonymousClass2BC r8 = (AnonymousClass2BC) AnonymousClass2BD.A06.AQb();
                        r8.A04(0);
                        byte[] A002 = r1.A00();
                        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
                        r8.A02();
                        AnonymousClass2BD r12 = (AnonymousClass2BD) r8.A00;
                        r12.A00 |= 2;
                        r12.A04 = A003;
                        byte[] bArr = A07.A00.A01;
                        AnonymousClass071 A004 = AnonymousClass071.A00(bArr, 0, bArr.length);
                        r8.A02();
                        AnonymousClass2BD r13 = (AnonymousClass2BD) r8.A00;
                        r13.A00 |= 4;
                        r13.A03 = A004;
                        AnonymousClass071 A005 = AnonymousClass071.A00(A1t, 0, A1t.length);
                        r8.A02();
                        AnonymousClass2BD r14 = (AnonymousClass2BD) r8.A00;
                        r14.A00 |= 8;
                        r14.A05 = A005;
                        r8.A05(r9.A05());
                        AnonymousClass078 A012 = r8.A01();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("prekey_id", (Integer) 0);
                        contentValues2.put("timestamp", valueOf);
                        contentValues2.put("record", A012.A09());
                        sQLiteDatabase.insertOrThrow("signed_prekeys", null, contentValues2);
                        Log.i("axolotl inserted signed prekey");
                        r3.A0H.A00.submit(new RunnableEBaseShape2S0100000_I0_2(r3, 39));
                        r3.A0E.A0g(true);
                        r3.A0G.A02();
                    } catch (AnonymousClass1UK e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchAlgorithmException e2) {
                    throw new AssertionError(e2);
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("axolotl upgrading db from ", i, " to ", i2);
        if (i2 == 11) {
            long A052 = this.A02.A05() / 1000;
            switch (i) {
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN timestamp INTEGER");
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("timestamp", Long.valueOf(A052));
                    sQLiteDatabase.update("sessions", contentValues, null, null);
                case 2:
                    sQLiteDatabase.execSQL("CREATE TABLE message_base_key (_id INTEGER PRIMARY KEY AUTOINCREMENT, msg_key_remote_jid TEXT NOT NULL, msg_key_from_me BOOLEAN NOT NULL, msg_key_id TEXT NOT NULL, last_alice_base_key BLOB NOT NULL, timestamp INTEGER)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id)");
                case 3:
                case 4:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sender_keys");
                    sQLiteDatabase.execSQL("CREATE TABLE sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
                case 5:
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id)");
                case 6:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS fast_ratchet_sender_keys");
                    sQLiteDatabase.execSQL("CREATE TABLE fast_ratchet_sender_keys (_id INTEGER PRIMARY KEY AUTOINCREMENT, group_id TEXT NOT NULL, sender_id INTEGER NOT NULL, record BLOB NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id)");
                case 7:
                    sQLiteDatabase.execSQL("ALTER TABLE sender_keys ADD COLUMN timestamp INTEGER");
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("timestamp", Long.valueOf(A052));
                    sQLiteDatabase.update("sender_keys", contentValues2, null, null);
                case 8:
                    sQLiteDatabase.execSQL("ALTER TABLE prekeys ADD COLUMN direct_distribution BOOLEAN");
                    ContentValues contentValues3 = new ContentValues();
                    contentValues3.put("direct_distribution", Boolean.FALSE);
                    sQLiteDatabase.update("prekeys", contentValues3, null, null);
                case 9:
                    sQLiteDatabase.execSQL("ALTER TABLE prekeys ADD COLUMN upload_timestamp INTEGER");
                    ContentValues contentValues4 = new ContentValues();
                    Long valueOf = Long.valueOf(A052);
                    contentValues4.put("upload_timestamp", valueOf);
                    sQLiteDatabase.update("prekeys", contentValues4, "sent_to_server != 0", null);
                    sQLiteDatabase.execSQL("CREATE TABLE prekey_uploads (_id INTEGER PRIMARY KEY AUTOINCREMENT, upload_timestamp INTEGER)");
                    ContentValues contentValues5 = new ContentValues();
                    contentValues5.put("upload_timestamp", valueOf);
                    sQLiteDatabase.insert("prekey_uploads", null, contentValues5);
                    break;
                case 10:
                    break;
                default:
                    throw new SQLiteException(AnonymousClass008.A0H("Unknown upgrade from ", i, " to ", i2));
            }
            A00(sQLiteDatabase, "identities", "CREATE TABLE identities (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, registration_id INTEGER, public_key BLOB, private_key BLOB, next_prekey_id INTEGER, timestamp INTEGER)", new String[]{"recipient_id", "registration_id", "public_key", "private_key", "next_prekey_id", "timestamp"});
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS identities_idx ON identities(recipient_id, device_id)");
            StringBuilder A0a = AnonymousClass008.A0a("UPDATE ", "identities", " SET ", "device_id", " = ");
            A0a.append(0);
            sQLiteDatabase.execSQL(A0a.toString());
            A00(sQLiteDatabase, "sessions", "CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT, recipient_id INTEGER, device_id INTEGER, record BLOB, timestamp INTEGER)", new String[]{"recipient_id", "record", "timestamp"});
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS sessions_idx ON sessions(recipient_id, device_id)");
            StringBuilder A0a2 = AnonymousClass008.A0a("UPDATE ", "sessions", " SET ", "device_id", " = ");
            A0a2.append(0);
            sQLiteDatabase.execSQL(A0a2.toString());
            sQLiteDatabase.execSQL("ALTER TABLE sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0");
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS sender_keys_idx");
            AnonymousClass008.A0c(sQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS sender_keys_idx ON sender_keys (group_id, sender_id, device_id)", "ALTER TABLE fast_ratchet_sender_keys ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0", "DROP INDEX IF EXISTS fast_ratchet_sender_keys_idx", "CREATE UNIQUE INDEX IF NOT EXISTS fast_ratchet_sender_keys_idx ON fast_ratchet_sender_keys (group_id, sender_id, device_id)");
            AnonymousClass008.A0c(sQLiteDatabase, "ALTER TABLE message_base_key ADD COLUMN recipient_id INTEGER ", "ALTER TABLE message_base_key ADD COLUMN device_id INTEGER NOT NULL DEFAULT 0", "DELETE FROM message_base_key WHERE msg_key_remote_jid NOT GLOB '[0-9]*@s.whatsapp.net'", "UPDATE message_base_key SET recipient_id = CAST(REPLACE(msg_key_remote_jid, '@s.whatsapp.net', '') AS INTEGER)");
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS message_base_key_idx");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_base_key_idx ON message_base_key (msg_key_remote_jid, msg_key_from_me, msg_key_id, recipient_id, device_id)");
            Log.i("axolotl upgraded successfully");
            return;
        }
        throw new SQLiteException(AnonymousClass008.A0H("Unknown upgrade destination version: ", i, " -> ", i2));
    }
}
