package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.08H  reason: invalid class name */
public class AnonymousClass08H extends SQLiteOpenHelper {
    public static volatile AnonymousClass08H A08;
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass00G A03;
    public final AnonymousClass08N A04;
    public final AnonymousClass04q A05;
    public final AnonymousClass08I A06 = new AnonymousClass08I();
    public final ReentrantReadWriteLock A07 = new ReentrantReadWriteLock();

    public AnonymousClass08H(AnonymousClass00G r5, AnonymousClass009 r6, AnonymousClass04q r7) {
        super(r5.A00, "wa.db", (SQLiteDatabase.CursorFactory) null, 44);
        this.A02 = r6;
        this.A05 = r7;
        this.A04 = new AnonymousClass08M(this, new AnonymousClass08J());
        setWriteAheadLoggingEnabled(true);
        this.A03 = r5;
    }

    public static AnonymousClass08H A00() {
        if (A08 == null) {
            synchronized (AnonymousClass08H.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass08H(AnonymousClass00G.A01, AnonymousClass009.A00(), AnonymousClass04q.A00());
                }
            }
        }
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.database.sqlite.SQLiteDatabase r5) {
        /*
            java.lang.String r4 = "wa_contacts"
            java.lang.String r3 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003a }
            r1.<init>()     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "select sql from sqlite_master where type='table' and name='"
            r1.append(r0)     // Catch:{ Exception -> 0x003a }
            r1.append(r4)     // Catch:{ Exception -> 0x003a }
            java.lang.String r0 = "';"
            r1.append(r0)     // Catch:{ Exception -> 0x003a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x003a }
            r0 = 0
            android.database.Cursor r1 = r5.rawQuery(r1, r0)     // Catch:{ Exception -> 0x003a }
            if (r1 != 0) goto L_0x0024
            return r3
        L_0x0024:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002f
            r0 = 0
            java.lang.String r3 = r1.getString(r0)     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r1.close()
            return r3
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0
        L_0x003a:
            r2 = move-exception
            java.lang.String r1 = "cannot get schema for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08H.A01(android.database.sqlite.SQLiteDatabase):java.lang.String");
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        if (!str.contains(sb.toString())) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ALTER TABLE ");
                sb2.append("wa_contacts");
                sb2.append(" ADD ");
                sb2.append(str2);
                sb2.append(" ");
                sb2.append(str3);
                sQLiteDatabase.execSQL(sb2.toString());
            } catch (SQLiteException e) {
                StringBuilder A0a = AnonymousClass008.A0a("cannot add column ", str2, " ", str3, " to ");
                A0a.append("wa_contacts");
                Log.e(A0a.toString(), e);
            }
        }
    }

    public AnonymousClass0OQ A03() {
        return new AnonymousClass0OQ(this.A07.readLock(), this.A04, null, true, this.A02);
    }

    public synchronized AnonymousClass0BK A04() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A00;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A05);
                this.A00 = r0;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("Contacts database is corrupt. Removing...", e);
                A06();
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A05);
                this.A00 = r0;
            } catch (SQLiteException e2) {
                String obj = e2.toString();
                if (obj.contains("file is encrypted")) {
                    Log.w("Contacts database is encrypted. Removing...", e2);
                    A06();
                    this.A00 = C001801b.A0D(super.getReadableDatabase(), this.A05);
                } else if (obj.contains("upgrade read-only database")) {
                    Log.w("Client actually opened database as read-only and can't upgrade. Switching to writable...", e2);
                    this.A00 = A05();
                }
                throw e2;
            } catch (StackOverflowError e3) {
                Log.w("StackOverflowError during db init check");
                for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                        A06();
                        this.A00 = C001801b.A0D(super.getReadableDatabase(), this.A05);
                    }
                }
                throw e3;
            }
            return r0;
        }
        return this.A00;
    }

    public synchronized AnonymousClass0BK A05() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A01;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A05);
                this.A01 = r0;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("Contacts database is corrupt. Removing...", e);
                A06();
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A05);
                this.A01 = r0;
            } catch (SQLiteException e2) {
                if (e2.toString().contains("file is encrypted")) {
                    Log.w("Contacts database is encrypted. Removing...", e2);
                    A06();
                    this.A01 = C001801b.A0D(super.getWritableDatabase(), this.A05);
                }
                throw e2;
            } catch (StackOverflowError e3) {
                Log.w("StackOverflowError during db init check");
                for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                        A06();
                        this.A01 = C001801b.A0D(super.getWritableDatabase(), this.A05);
                    }
                }
                throw e3;
            }
            return r0;
        }
        return this.A01;
    }

    public void A06() {
        synchronized (this) {
            close();
            Log.i("deleting contact database...");
            AnonymousClass00G r6 = this.A03;
            boolean delete = r6.A00.getDatabasePath("wa.db").delete();
            File databasePath = r6.A00.getDatabasePath("wa.db");
            String path = databasePath.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append(databasePath.getName());
            sb.append("-journal");
            boolean delete2 = new File(path, sb.toString()).delete();
            File databasePath2 = r6.A00.getDatabasePath("wa.db");
            String path2 = databasePath2.getPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(databasePath2.getName());
            sb2.append("-wal");
            boolean delete3 = new File(path2, sb2.toString()).delete();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("deleted contact database; databaseDeleted=");
            sb3.append(delete);
            sb3.append("; journalDeleted=");
            sb3.append(delete2);
            sb3.append("; writeAheadLogDeleted=");
            sb3.append(delete3);
            Log.i(sb3.toString());
        }
        for (AnonymousClass08O r0 : this.A06.A00) {
            AnonymousClass01C r2 = r0.A00;
            if (r2 instanceof AnonymousClass01B) {
                AnonymousClass01B r22 = (AnonymousClass01B) r2;
                synchronized (r22.A06) {
                    r22.A00 = 0;
                }
            }
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A04().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A05().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("creating contacts database version 44");
        Log.i("creating contacts table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_contacts");
        sQLiteDatabase.execSQL("CREATE TABLE wa_contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, is_whatsapp_user BOOLEAN NOT NULL, status TEXT, status_timestamp INTEGER, number TEXT, raw_contact_id INTEGER, display_name TEXT, phone_type INTEGER, phone_label TEXT, unseen_msg_count INTEGER, photo_ts INTEGER, thumb_ts INTEGER, photo_id_timestamp INTEGER, given_name TEXT, family_name TEXT, wa_name TEXT, sort_name TEXT, nickname TEXT, company TEXT, title TEXT, status_autodownload_disabled INTEGER, keep_timestamp INTEGER, is_spam_reported INTEGER, is_sidelist_synced BOOLEAN DEFAULT 0, is_business_synced BOOLEAN DEFAULT 0)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);");
        Log.i("creating system contacts version table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS system_contacts_version_table");
        sQLiteDatabase.execSQL("CREATE TABLE system_contacts_version_table (id INTEGER PRIMARY KEY, version INTEGER)");
        Log.i("creating wa_vnames table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_vnames");
        sQLiteDatabase.execSQL("CREATE TABLE wa_vnames (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, serial INTEGER NOT NULL, issuer TEXT NOT NULL, expires INTEGER, verified_name TEXT NOT NULL, industry TEXT, city TEXT, country TEXT, verified_level INTEGER, identity_unconfirmed_since INTEGER, cert_blob BLOB, host_storage INTEGER DEFAULT 0, actual_actors INTEGER DEFAULT 0, privacy_mode_ts INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);");
        Log.i("creating wa_vnames_localized table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_vnames_localized");
        sQLiteDatabase.execSQL("CREATE TABLE wa_vnames_localized (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, lg TEXT NOT NULL, lc TEXT NOT NULL, verified_name TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);");
        Log.i("creating storage usage table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_contact_storage_usage");
        sQLiteDatabase.execSQL("CREATE TABLE wa_contact_storage_usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, conversation_size INTEGER NOT NULL, conversation_message_count INTEGER NOT NULL)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)");
        Log.i("creating wa_biz_profiles table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TRIGGER IF EXISTS contact_bd_for_business_profiles", "DROP TABLE IF EXISTS wa_biz_profiles", "CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, latitude REAL, longitude REAL, tag TEXT, vertical TEXT,time_zone TEXT,hours_note TEXT,has_catalog BOOLEAN DEFAULT 0, address_postal_code TEXT, address_city_id TEXT, address_city_name TEXT, commerce_experience TEXT, shop_url TEXT, cart_enabled BOOLEAN DEFAULT 0 )", "CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);");
        sQLiteDatabase.execSQL("CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        sQLiteDatabase.execSQL("CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
        Log.i("creating wa_biz_profiles_websites table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_websites");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles_websites (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, websites TEXT)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_website_index ON wa_biz_profiles_websites(wa_biz_profile_id, websites);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_websites_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = old._id; END");
        Log.i("creating wa_biz_profiles_hours table for contacts database version 44");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS wa_biz_profiles_hours", "CREATE TABLE wa_biz_profiles_hours (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, day_of_week TEXT,mode TEXT,open_time INTEGER,close_time INTEGER)", " CREATE INDEX IF NOT EXISTS biz_profile_id_hours_index ON wa_biz_profiles_hours(wa_biz_profile_id);", "CREATE TRIGGER business_profiles_bd_for_hours_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_hours WHERE wa_biz_profile_id = old._id; END");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger", "DROP TABLE IF EXISTS wa_biz_profiles_categories", "CREATE TABLE wa_biz_profiles_categories (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, category_id TEXT NOT NULL,category_name TEXT NOT NULL)", " CREATE INDEX IF NOT EXISTS biz_profile_id_category_index ON wa_biz_profiles_categories(wa_biz_profile_id, category_id);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_categories_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_categories WHERE wa_biz_profile_id = old._id; END");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_group_descriptions");
        sQLiteDatabase.execSQL("CREATE TABLE wa_group_descriptions (jid TEXT NOT NULL, description TEXT NOT NULL, description_id INTEGER, description_time INTEGER, description_setter_jid TEXT NOT NULL, description_id_string TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger", "DROP TABLE IF EXISTS wa_group_admin_settings", "CREATE TABLE wa_group_admin_settings (jid TEXT NOT NULL, restrict_mode BOOLEAN NOT NULL, announcement_group BOOLEAN NOT NULL, no_frequently_forwarded BOOLEAN NOT NULL, ephemeral_duration INTEGER DEFAULT NULL, creator_jid TEXT, in_app_support BOOLEAN NOT NULL )", "CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)");
        AnonymousClass008.A0c(sQLiteDatabase, "CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END", "DROP TABLE IF EXISTS wa_block_list", "CREATE TABLE wa_block_list (jid TEXT NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS block_list_jid_index ON wa_block_list (jid)");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS wa_group_add_black_list", "CREATE TABLE wa_group_add_black_list (jid TEXT NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS group_add_black_list_jid_index ON wa_group_add_black_list (jid)", "DROP TABLE IF EXISTS wa_props");
        AnonymousClass008.A0c(sQLiteDatabase, "CREATE TABLE wa_props (_id INTEGER PRIMARY KEY AUTOINCREMENT, prop_name TEXT UNIQUE, prop_value TEXT)", "DROP TABLE IF EXISTS wa_last_entry_point", "CREATE TABLE wa_last_entry_point (jid TEXT NOT NULL, entry_point_type TEXT NOT NULL, entry_point_id TEXT, entry_point_time INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("Downgrading contacts database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0191, code lost:
        if (r31 == 12) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0321, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0322, code lost:
        if (r12 != null) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0327, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0334, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0335, code lost:
        if (r10 != null) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x033a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a0 A[Catch:{ all -> 0x0321 }, LOOP:0: B:11:0x009a->B:13:0x00a0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r30, int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 914
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08H.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
