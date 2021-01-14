package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Gv  reason: invalid class name and case insensitive filesystem */
public class C03590Gv extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass04q A03;
    public final ReentrantReadWriteLock A04 = new ReentrantReadWriteLock();

    public C03590Gv(Context context, AnonymousClass009 r5, AnonymousClass04q r6) {
        super(context, "stickers.db", (SQLiteDatabase.CursorFactory) null, 24);
        this.A02 = r5;
        this.A03 = r6;
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS downloadable_sticker_packs", "DROP TABLE IF EXISTS stickers", "DROP TABLE IF EXISTS installed_sticker_packs", "DROP TABLE IF EXISTS starred_stickers");
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS sticker_pack_order", "DROP TABLE IF EXISTS recent_stickers", "DROP TABLE IF EXISTS unseen_sticker_packs", "DROP TABLE IF EXISTS third_party_whitelist_packs");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS new_sticker_packs");
    }

    public static final void A01(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            sb.append(str);
            sb.append(" ADD ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            sQLiteDatabase.execSQL(sb.toString());
        } catch (SQLiteException e) {
            StringBuilder sb2 = new StringBuilder("StickerDBHelper/addColumnIfNotExists/alter_table ");
            sb2.append(str2);
            Log.w(sb2.toString(), e);
        }
    }

    public synchronized AnonymousClass0BK A02() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A00 = C001801b.A0D(super.getReadableDatabase(), this.A03);
        }
        return this.A00;
    }

    public synchronized AnonymousClass0BK A03() {
        AnonymousClass0BK r0 = this.A01;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A01 = C001801b.A0D(super.getWritableDatabase(), this.A03);
        }
        return this.A01;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableDatabase instead");
        return A02().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A03().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, PRIMARY KEY(plain_file_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, PRIMARY KEY(installed_id))");
        sQLiteDatabase.execSQL("CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
        sQLiteDatabase.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("StickerDBHelper/onDowngrade/oldVersion:", i, ", newVersion:", i2);
        A00(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0187, code lost:
        if (r6.getColumnIndex(r3[r4]) != -1) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0189, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x018b, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x018f, code lost:
        if (r4 >= 8) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0191, code lost:
        if (r16 != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0194, code lost:
        if (r16 != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0196, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01c1, code lost:
        r16 = r15.keySet();
        r5 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01cd, code lost:
        if (r5.hasNext() == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01cf, code lost:
        r3 = (java.lang.String) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01da, code lost:
        if (r6.getColumnIndex(r3) != -1) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2 = r29.A02;
        r1 = new java.lang.StringBuilder();
        r1.append("recent_stickers");
        r1.append(" table migration failed due to non-existent desired column ");
        r1.append(r3);
        r2.A03(r1.toString(), 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01f7, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01fb, code lost:
        r4 = android.text.TextUtils.join(",", r15.keySet());
        r2 = new java.util.ArrayList();
        r17 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0214, code lost:
        if (r17.hasNext() == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0216, code lost:
        r1 = (java.lang.String) r17.next();
        r3 = new java.lang.StringBuilder();
        r3.append(r1);
        r3.append(" ");
        r3.append((java.lang.String) r15.get(r1));
        r2.add(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0242, code lost:
        r3 = android.text.TextUtils.join(", ", r2);
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0250, code lost:
        if (r15.containsKey("plaintext_hash") == false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0252, code lost:
        r2 = ", PRIMARY KEY(plaintext_hash)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0254, code lost:
        r15 = new java.lang.StringBuilder();
        r15.append("CREATE TEMPORARY TABLE ");
        r15.append("recent_stickers_temp");
        r15.append(" (");
        r15.append(r3);
        r15.append(")");
        r30.execSQL(r15.toString());
        r15 = new java.lang.StringBuilder();
        r15.append("INSERT INTO ");
        r15.append("recent_stickers_temp");
        r15.append(" SELECT ");
        r15.append(r4);
        r15.append(" FROM ");
        r15.append("recent_stickers");
        r30.execSQL(r15.toString());
        r30.execSQL("DROP TABLE recent_stickers");
        r15 = new java.lang.StringBuilder();
        r15.append("CREATE TABLE ");
        r15.append("recent_stickers");
        r15.append(" (");
        r15.append(r3);
        r15.append(r2);
        r15.append(")");
        r30.execSQL(r15.toString());
        r1 = new java.lang.StringBuilder();
        r1.append("INSERT INTO ");
        r1.append("recent_stickers");
        r1.append(" SELECT ");
        r1.append(r4);
        r1.append(" FROM ");
        r1.append("recent_stickers_temp");
        r30.execSQL(r1.toString());
        r30.execSQL("DROP TABLE recent_stickers_temp");
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x02e4, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r30, int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 808
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03590Gv.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
