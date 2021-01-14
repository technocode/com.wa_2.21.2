package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: X.08j  reason: invalid class name and case insensitive filesystem */
public class C015108j extends SQLiteOpenHelper implements AnonymousClass08N {
    public AnonymousClass0BK A00;
    public Boolean A01 = null;
    public Boolean A02 = null;
    public Integer A03;
    public boolean A04;
    public final C000300f A05;
    public final AnonymousClass00D A06;
    public final C014608e A07;
    public final AnonymousClass08J A08;
    public final AnonymousClass04q A09;
    public final C014708f A0A;
    public final File A0B;
    public final Object A0C = new Object();

    public C015108j(Context context, C000300f r5, AnonymousClass04q r6, C014608e r7, AnonymousClass00D r8, AnonymousClass08J r9, C014708f r10, File file) {
        super(context, "msgstore.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A05 = r5;
        this.A09 = r6;
        this.A07 = r7;
        this.A06 = r8;
        this.A08 = r9;
        this.A0A = r10;
        this.A0B = file;
    }

    public static Pair A00() {
        String lowerCase = String.format("%s_bu_for_%s_trigger", "message_ephemeral", "message_ephemeral_remove_column").toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE UPDATE ON %s BEGIN %s; END", lowerCase, "message_ephemeral", "UPDATE message_ephemeral_remove_column SET duration=new.duration, expire_timestamp=new.expire_timestamp WHERE message_row_id=new.message_row_id"));
    }

    public static Pair A01(String str, String str2, String str3) {
        String lowerCase = String.format("%s_bd_for_%s_trigger", str, str2).toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE DELETE ON %s BEGIN DELETE FROM %s WHERE %s; END", lowerCase, str, str2, str3));
    }

    public static Pair A02(String str, String str2, String str3) {
        String lowerCase = String.format("%s_bi_for_%s_trigger", str, str2).toLowerCase(Locale.getDefault());
        return new Pair(lowerCase, String.format("CREATE TRIGGER %s BEFORE INSERT ON %s BEGIN %s; END", lowerCase, str, str3));
    }

    public static Pair A03(String str, String str2, boolean z) {
        if (!z) {
            return A01("messages", str, str2);
        }
        return A01("message", str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5) {
        /*
            java.lang.String r2 = "table"
            java.lang.String r3 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0044 }
            r1.<init>()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "select sql from sqlite_master where type='"
            r1.append(r0)     // Catch:{ Exception -> 0x0044 }
            r1.append(r2)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "' and name='"
            r1.append(r0)     // Catch:{ Exception -> 0x0044 }
            r1.append(r5)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = "';"
            r1.append(r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0044 }
            r0 = 0
            android.database.Cursor r1 = r4.rawQuery(r1, r0)     // Catch:{ Exception -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x003e
            r0 = 0
            java.lang.String r3 = r1.getString(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x003e
        L_0x0037:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        L_0x003e:
            if (r1 == 0) goto L_0x0056
            r1.close()
            return r3
        L_0x0044:
            r2 = move-exception
            java.lang.String r1 = "databasehelper/getSqlFor view = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015108j.A04(android.database.sqlite.SQLiteDatabase, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A05(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r1[r2] = r4
            java.lang.String r0 = "SELECT value FROM props WHERE key=?"
            android.database.Cursor r1 = r3.rawQuery(r0, r1)
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x001e }
            r1.close()
            return r0
        L_0x001a:
            r1.close()
            return r5
        L_0x001e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            if (r1 == 0) goto L_0x0026
            r1.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015108j.A05(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void A06(SQLiteDatabase sQLiteDatabase, String str, long j) {
        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO props(key, value) VALUES ( ? , ?)", new String[]{str, String.valueOf(j)});
    }

    public static void A07(AnonymousClass0BK r3, boolean z) {
        SQLiteDatabase sQLiteDatabase = r3.A00;
        sQLiteDatabase.beginTransaction();
        try {
            r3.A0C("DROP VIEW IF EXISTS legacy_available_messages_view", "DROP_VIEW_AVAILABLE_MESSAGES_LEGACY");
            r3.A0C("DROP VIEW IF EXISTS message_view", "DROP_VIEW_MESSAGE");
            r3.A0C("DROP VIEW IF EXISTS available_message_view", "DROP_VIEW_AVAILABLE_MESSAGE");
            r3.A0C("DROP VIEW IF EXISTS deleted_messages_view", "DROP_VIEW_DELETED_MESSAGES");
            r3.A0C("DROP VIEW IF EXISTS deleted_messages_ids_view", "DROP_VIEW_DELETED_MESSAGES_IDS");
            if (z) {
                r3.A0C("CREATE VIEW message_view AS SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, 2 AS table_version FROM message", "CREATE_MESSAGE_VIEW_FROM_V2");
                r3.A0C("CREATE VIEW available_message_view AS  SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, 2 AS table_version, expire_timestamp FROM message LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = message.chat_row_id LEFT JOIN message_ephemeral AS message_ephemeral ON message._id = message_ephemeral.message_row_id WHERE IFNULL(NOT((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR \n(IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR \n( (job.deleted_message_categories IS NOT NULL) AND \n  (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND \n  ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )\n)), 0)", "CREATE_AVAILABLE_MESSAGE_VIEW_FROM_V2");
                r3.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_view AS \n SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, NULL AS sender_jid_raw_string, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, starred, lookup_tables, NULL AS data, NULL AS media_url, NULL AS media_mime_type, NULL AS media_size, NULL AS media_name, NULL AS media_caption, NULL AS media_hash, NULL AS media_duration, NULL AS latitude, NULL AS longitude, NULL AS thumb_image, NULL AS raw_data, NULL AS quoted_row_id, NULL AS mentioned_jids, NULL AS multicast_id, NULL AS edit_version, NULL AS media_enc_hash, NULL AS payment_transaction_id, NULL AS preview_type, NULL AS receipt_device_timestamp, NULL AS read_device_timestamp, NULL AS played_device_timestamp, 2 AS table_version, \n (( ((job.deleted_messages_remove_files == 1) AND ((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)))) OR   ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND   ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))))) as remove_files \n FROM \ndeleted_chat_job AS job JOIN message as message \n ON job.chat_row_id = message.chat_row_id \n WHERE IFNULL((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND   ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0) \n ORDER BY message._id", "CREATE_DELETED_MESSAGES_VIEW_FROM_V2");
                r3.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS \n SELECT message._id, message.chat_row_id, message.message_type FROM \ndeleted_chat_job AS job \n JOIN message AS message \n ON job.chat_row_id = message.chat_row_id \n WHERE IFNULL((IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND   ( (IFNULL(message.starred, 0) = 0 AND message._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(message.starred, 0) = 1 AND message._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0)", "CREATE_DELETED_MESSAGES_IDS_VIEW_FROM_V2");
            } else {
                r3.A0C("CREATE VIEW legacy_available_messages_view AS\n SELECT messages.*, chat._id AS chat_row_id,expire_timestamp\n FROM messages AS messages\n    JOIN\n        jid AS jid\n    ON\n        jid.raw_string = messages.key_remote_jid\n    JOIN\n        chat AS chat\n    ON\n        chat.jid_row_id = jid._id\n    LEFT JOIN\n        deleted_chat_job as job\n    ON \n        job.chat_row_id = chat._id    LEFT JOIN\n        message_ephemeral AS message_ephemeral\n    ON messages._id = message_ephemeral.message_row_id\n WHERE IFNULL(NOT((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))), 0)", "CREATE_AVAILABLE_MESSAGES_VIEW_LEGACY");
                r3.A0C("CREATE VIEW message_view AS SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, 1 AS table_version FROM messages JOIN jid AS chat_jid ON messages.key_remote_jid= chat_jid.raw_string JOIN chat AS chat ON chat.jid_row_id = chat_jid._id", "CREATE_MESSAGE_VIEW_FROM_V1");
                r3.A0C("CREATE VIEW available_message_view AS SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, 1 AS table_version, expire_timestamp FROM messages JOIN jid AS chat_jid ON messages.key_remote_jid= chat_jid.raw_string JOIN chat AS chat ON chat.jid_row_id = chat_jid._id LEFT JOIN message_ephemeral AS message_ephemeral ON messages._id = message_ephemeral.message_row_id LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = chat._id WHERE IFNULL(NOT((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))), 0)", "CREATE_AVAILABLE_MESSAGE_VIEW_FROM_V1");
                r3.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_view AS \n SELECT messages._id AS _id, messages._id AS sort_id, chat._id AS chat_row_id, key_from_me AS from_me, key_id, -1 AS sender_jid_row_id, remote_resource AS sender_jid_raw_string, status, needs_push AS broadcast, recipient_count, participant_hash, forwarded AS origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, '' as text_data, starred, lookup_tables, data, media_url, media_mime_type, media_size, media_name, media_caption, media_hash, media_duration, latitude, longitude, thumb_image, raw_data, quoted_row_id, mentioned_jids, multicast_id, edit_version, media_enc_hash, payment_transaction_id, preview_type, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, 1 AS table_version, \n (( ((job.deleted_messages_remove_files == 1) AND ((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)))) OR   ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) ))))) as remove_files \n FROM deleted_chat_job AS job\n JOIN chat AS chat ON job.chat_row_id = chat._id JOIN jid AS chat_jid ON chat.jid_row_id = chat_jid._id\n LEFT JOIN messages AS messages ON messages.key_remote_jid = chat_jid.raw_string\n WHERE IFNULL((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0) \n ORDER BY messages._id", "CREATE_DELETED_MESSAGES_VIEW_FROM_V1");
                r3.A0C("CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS \n SELECT messages._id AS _id, CAST (CASE WHEN (messages.media_wa_type = 0 AND messages.status=6) THEN 7 ELSE messages.media_wa_type END AS INTEGER) AS message_type, job.chat_row_id AS chat_row_id FROM deleted_chat_job AS job\n JOIN chat AS chat ON job.chat_row_id = chat._id JOIN jid AS chat_jid ON chat.jid_row_id = chat_jid._id\n LEFT JOIN messages AS messages ON messages.key_remote_jid = chat_jid.raw_string\n WHERE IFNULL((IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_starred_message_row_id, 1)) OR ( (job.deleted_message_categories IS NOT NULL) AND   (job.deleted_message_categories LIKE '%\"' || messages.media_wa_type || '\"%') AND   ( (IFNULL(messages.starred, 0) = 0 AND messages._id <= IFNULL(job.deleted_categories_message_row_id, 1)) OR (IFNULL(messages.starred, 0) = 1 AND messages._id <= IFNULL(job.deleted_categories_starred_message_row_id, 1)) )), 0)", "CREATE_DELETED_MESSAGES_IDS_VIEW_FROM_V1");
            }
            r3.A0C("DROP VIEW IF EXISTS chat_view", "DROP_VIEW_CHAT");
            try {
                if (Integer.parseInt(A05(sQLiteDatabase, "chat_ready", String.valueOf(0))) == 2) {
                    r3.A0C("CREATE VIEW chat_view AS SELECT c._id AS _id, j.raw_string AS raw_string_jid, hidden, subject, created_timestamp, display_message_row_id, last_message_row_id, last_read_message_row_id, last_read_receipt_sent_message_row_id, last_important_message_row_id, archived, sort_timestamp, mod_tag, gen, spam_detection, unseen_earliest_message_received_time, unseen_message_count, unseen_missed_calls_count, unseen_row_count, plaintext_disabled, vcard_ui_dismissed, change_number_notified_message_row_id, show_group_description, ephemeral_expiration, last_read_ephemeral_message_row_id, ephemeral_setting_timestamp FROM chat c LEFT JOIN jid j ON c.jid_row_id=j._id", "CREATE_VIEW_CHAT_V2");
                    sQLiteDatabase.setTransactionSuccessful();
                }
            } catch (NumberFormatException unused) {
            }
            r3.A0C("CREATE VIEW chat_view AS SELECT -1 AS _id, key_remote_jid AS raw_string_jid, 0 AS hidden, subject, creation AS created_timestamp, message_table_id AS display_message_row_id, last_message_table_id AS last_message_row_id, last_read_message_table_id AS last_read_message_row_id, last_read_receipt_sent_message_table_id AS last_read_receipt_sent_message_row_id, last_important_message_table_id AS last_important_message_row_id, archived, sort_timestamp, mod_tag, gen, my_messages AS spam_detection, unseen_earliest_message_received_time, unseen_message_count, unseen_missed_calls_count, unseen_row_count, plaintext_disabled, vcard_ui_dismissed, change_number_notified_message_id AS change_number_notified_message_row_id, show_group_description, ephemeral_expiration, last_read_ephemeral_message_table_id AS last_read_ephemeral_message_row_id, ephemeral_setting_timestamp FROM chat_list", "CREATE_VIEW_CHAT_V1");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static boolean A08(SQLiteDatabase sQLiteDatabase) {
        try {
            if (Integer.parseInt(A05(sQLiteDatabase, "migration_completed", String.valueOf(0))) == 1) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        if (A0A(str, str3, str4)) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE ");
            sb.append(str2);
            sb.append(" ADD ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sQLiteDatabase.execSQL(sb.toString());
            return true;
        } catch (SQLiteException e) {
            StringBuilder sb2 = new StringBuilder("databasehelper/addColumnIfNotExists/alter_table ");
            sb2.append(str3);
            Log.w(sb2.toString(), e);
            return false;
        }
    }

    public static boolean A0A(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        if (!str.contains(sb.toString())) {
            StringBuilder sb2 = new StringBuilder("`");
            sb2.append(str2);
            sb2.append("`\t");
            sb2.append(str3);
            if (!str.contains(sb2.toString())) {
                StringBuilder sb3 = new StringBuilder("(`*)");
                sb3.append(str2);
                sb3.append("(`*)(\\s+)");
                sb3.append(str3);
                return Pattern.compile(sb3.toString()).matcher(str).find();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015108j.A0B():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0c56, code lost:
        if (java.lang.Integer.parseInt(A05(r25, "links_ready", java.lang.String.valueOf(0))) == 0) goto L_0x0c58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0de6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0de7, code lost:
        if (r9 != null) goto L_0x0de9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0dec, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.database.sqlite.SQLiteDatabase r25, X.C000300f r26) {
        /*
        // Method dump skipped, instructions count: 3565
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015108j.A0C(android.database.sqlite.SQLiteDatabase, X.00f):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r6 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.database.sqlite.SQLiteDatabase r24, X.C000300f r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 1290
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015108j.A0D(android.database.sqlite.SQLiteDatabase, X.00f, boolean):void");
    }

    public boolean A0E() {
        SQLiteDatabase sQLiteDatabase;
        Boolean bool = this.A02;
        if (bool != null) {
            return bool.booleanValue();
        }
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || (sQLiteDatabase = r0.A00) == null) {
            return true;
        }
        return A0H(sQLiteDatabase, this.A05);
    }

    public synchronized boolean A0F() {
        boolean z = false;
        if (this.A00 == null) {
            z = true;
        }
        AnonymousClass00E.A08(z, "database nust be null");
        try {
            A9x();
            close();
        } catch (SQLiteException unused) {
            return false;
        }
        return true;
    }

    public synchronized boolean A0G() {
        AnonymousClass0BK r0;
        r0 = this.A00;
        if (r0 != null) {
        } else {
            throw new IllegalStateException("databasehelper/getIsMigrationCompleted/database is not initialized");
        }
        return A08(r0.A00);
    }

    public final boolean A0H(SQLiteDatabase sQLiteDatabase, C000300f r5) {
        Boolean bool = this.A02;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!A08(sQLiteDatabase)) {
            this.A02 = Boolean.TRUE;
            return true;
        }
        try {
            if (Integer.parseInt(A05(sQLiteDatabase, "write_to_old_schema_disabled", String.valueOf(0))) != 0) {
                this.A02 = Boolean.FALSE;
                return this.A02.booleanValue();
            }
        } catch (NumberFormatException unused) {
        }
        if (r5.A0D(AbstractC000400g.A0i)) {
            this.A02 = Boolean.FALSE;
            A06(sQLiteDatabase, "write_to_old_schema_disabled", 1);
        } else {
            this.A02 = Boolean.TRUE;
        }
        return this.A02.booleanValue();
    }

    public boolean A0I(String str) {
        AnonymousClass0BK r0 = this.A00;
        if (r0 != null) {
            return !TextUtils.isEmpty(A04(r0.A00, str));
        }
        throw null;
    }

    @Override // X.AnonymousClass08N
    public AnonymousClass08J A7k() {
        return this.A08;
    }

    @Override // X.AnonymousClass08N
    public synchronized AnonymousClass0BK A8g() {
        return A9x();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        if (r8 != false) goto L_0x00f9;
     */
    @Override // X.AnonymousClass08N
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass0BK A9x() {
        /*
        // Method dump skipped, instructions count: 1025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015108j.A9x():X.0BK");
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 != null && r0.A00.isOpen()) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/close, ");
            sb.append(this.A00.A00);
            Log.i(sb.toString());
            this.A00.A00.close();
        }
        this.A00 = null;
        this.A03 = null;
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
        String str;
        try {
            sQLiteDatabase.beginTransactionWithListener(new C28531Ur(this, new AtomicBoolean(false)));
            Log.i("msgstore/create");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS messages", "DROP TABLE IF EXISTS message", "DROP TABLE IF EXISTS chat_list", "DROP TABLE IF EXISTS props");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS messages_fts", "DROP TABLE IF EXISTS message_ftsv2", "DROP TABLE IF EXISTS messages_quotes", "DROP TABLE IF EXISTS message_quoted");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS messages_dehydrated_hsm", "DROP TABLE IF EXISTS messages_hydrated_four_row_template", "DROP TABLE IF EXISTS messages_vcards", "DROP TABLE IF EXISTS messages_vcards_jids");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_orphaned_edit", "DROP TABLE IF EXISTS message_quoted_mentions", "DROP TABLE IF EXISTS message_quoted_vcard", "DROP TABLE IF EXISTS messages_links");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_product", "DROP TABLE IF EXISTS quoted_message_product", "DROP TABLE IF EXISTS message_quoted_product", "DROP TABLE IF EXISTS message_order");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_quoted_order", "DROP TABLE IF EXISTS message_group_invite", "DROP TABLE IF EXISTS message_quoted_group_invite_legacy", "DROP TABLE IF EXISTS message_quoted_group_invite");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_template", "DROP TABLE IF EXISTS message_template_button", "DROP TABLE IF EXISTS message_template_quoted", "DROP TABLE IF EXISTS message_location");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_quoted_location", "DROP TABLE IF EXISTS message_media", "DROP TABLE IF EXISTS message_media_interactive_annotation", "DROP TABLE IF EXISTS message_media_interactive_annotation_vertex");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_quoted_media", "DROP TABLE IF EXISTS frequents", "DROP TABLE IF EXISTS frequent", "DROP TABLE IF EXISTS receipt_user");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS receipt_device", "DROP TABLE IF EXISTS receipt_orphaned", "DROP TABLE IF EXISTS receipts", "DROP TABLE IF EXISTS message_mentions");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_vcard", "DROP TABLE IF EXISTS message_media_vcard_count", "DROP TABLE IF EXISTS message_vcard_jid", "DROP TABLE IF EXISTS message_view_once_media");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS user_device", "DROP TABLE IF EXISTS group_participant_user", "DROP TABLE IF EXISTS group_participant_device", "DROP TABLE IF EXISTS group_participants");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS group_participants_history", "DROP TABLE IF EXISTS group_notification_version", "DROP TABLE IF EXISTS media_refs", "DROP TABLE IF EXISTS media_streaming_sidecar");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_thumbnails", "DROP TABLE IF EXISTS message_streaming_sidecar", "DROP TABLE IF EXISTS mms_thumbnail_metadata", "DROP TABLE IF EXISTS status_list");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS status", "DROP TABLE IF EXISTS conversion_tuples", "DROP TABLE IF EXISTS deleted_chat_jobs", "DROP TABLE IF EXISTS deleted_chat_job");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS pay_transactions", "DROP TABLE IF EXISTS pay_transaction", "DROP TABLE IF EXISTS message_ephemeral", "DROP TABLE IF EXISTS call_log");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS missed_call_logs", "DROP TABLE IF EXISTS missed_call_log_participant", "DROP TABLE IF EXISTS jid", "DROP TABLE IF EXISTS chat");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP VIEW IF EXISTS chat_view", "DROP TABLE IF EXISTS message_link", "DROP TABLE IF EXISTS message_forwarded", "DROP TABLE IF EXISTS message_thumbnail");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_text", "DROP TABLE IF EXISTS message_quoted_text", "DROP TABLE IF EXISTS message_revoked", "DROP TABLE IF EXISTS message_future");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_payment", "DROP TABLE IF EXISTS message_payment_transaction_reminder", "DROP TABLE IF EXISTS message_payment_status_update", "DROP TABLE IF EXISTS message_send_count");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_system", "DROP TABLE IF EXISTS message_system_group", "DROP TABLE IF EXISTS message_system_value_change", "DROP TABLE IF EXISTS message_system_number_change");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_system_device_change", "DROP TABLE IF EXISTS message_system_initial_privacy_provider", "DROP TABLE IF EXISTS message_system_photo_change", "DROP TABLE IF EXISTS message_system_chat_participant");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS message_ephemeral_setting", "DROP TABLE IF EXISTS message_system_block_contact", "DROP TABLE IF EXISTS message_system_business_state", "DROP TABLE IF EXISTS message_system_ephemeral_setting_not_applied");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS media_hash_thumbnail", "DROP TABLE IF EXISTS user_device_info", "DROP TABLE IF EXISTS labeled_jids", "DROP TABLE IF EXISTS labeled_messages");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS labels", "DROP TABLE IF EXISTS labeled_jid", "DROP TABLE IF EXISTS away_messages", "DROP TABLE IF EXISTS away_messages_exemptions");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS quick_replies", "DROP TABLE IF EXISTS quick_reply_usage", "DROP TABLE IF EXISTS quick_reply_keywords", "DROP TABLE IF EXISTS keywords");
            AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS quick_reply_attachments", "DROP TABLE IF EXISTS message_external_ad_content", "DROP TABLE IF EXISTS message_ui_elements", "DROP TABLE IF EXISTS message_quoted_ui_elements");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS message_ui_elements_reply");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS message_quoted_ui_elements_reply");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS message_privacy_state");
            if (TextUtils.isEmpty(A04(sQLiteDatabase, "props"))) {
                sQLiteDatabase.execSQL("CREATE TABLE props (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE, value TEXT)");
            }
            A06(sQLiteDatabase, "fts_ready", 5);
            A06(sQLiteDatabase, "call_log_ready", 1);
            A06(sQLiteDatabase, "chat_ready", 2);
            A06(sQLiteDatabase, "blank_me_jid_ready", 1);
            A06(sQLiteDatabase, "participant_user_ready", 2);
            A06(sQLiteDatabase, "broadcast_me_jid_ready", 2);
            A06(sQLiteDatabase, "receipt_user_ready", 2);
            A06(sQLiteDatabase, "receipt_device_migration_complete", 1);
            A06(sQLiteDatabase, "status_list_ready", 1);
            sQLiteDatabase.execSQL("DELETE FROM props WHERE key = ?", new String[]{"message_streaming_sidecar_timestamp"});
            A06(sQLiteDatabase, "media_message_ready", 2);
            A06(sQLiteDatabase, "media_message_fixer_ready", 1);
            Log.i("DatabaseHelper/using NOT migrated DB");
            C000300f r2 = this.A05;
            A0C(sQLiteDatabase, r2);
            if (A0H(sQLiteDatabase, r2)) {
                sQLiteDatabase.execSQL("INSERT INTO messages(_id, key_remote_jid, key_from_me, key_id, status, needs_push, data, timestamp, media_url, media_mime_type, media_wa_type, media_size, media_name, media_hash, media_duration, origin, latitude, longitude, thumb_image, received_timestamp, send_timestamp, receipt_server_timestamp, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, mentioned_jids) VALUES (1, '-1', 0, '-1', -1, 0, NULL, 0, NULL, NULL, -1, -1, NULL, NULL, 0, 0, 0, 0, NULL, -1, -1, -1, -1, -1, -1, NULL)");
            }
            A07(C001801b.A0D(sQLiteDatabase, this.A09), A08(sQLiteDatabase));
            A0D(sQLiteDatabase, r2, A08(sQLiteDatabase));
            if (A08(sQLiteDatabase)) {
                str = "aa520d37c51f0ca20c31f27a68bccc13";
            } else {
                str = "5cd636ca1ecc5fc45330a06ecccd6174";
            }
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO props(key, value) VALUES ( ? , ?)", new String[]{"msgtore_db_schema_version", str});
            AnonymousClass008.A0n(this.A06, "force_db_check", false);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOpen(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            java.lang.String r0 = "msgstore/open; version="
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            int r0 = r5.getVersion()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.d(r0)
            java.lang.String r0 = "PRAGMA synchronous=NORMAL;"
            r5.execSQL(r0)
            java.lang.String r1 = "PRAGMA secure_delete=1"
            r0 = 0
            android.database.Cursor r3 = r5.rawQuery(r1, r0)     // Catch:{ SQLiteDiskIOException -> 0x004d }
            if (r3 == 0) goto L_0x0053
        L_0x0022:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0042
            r0 = 0
            int r2 = r3.getInt(r0)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "msgstore/enable_secure_delete result: "
            r1.append(r0)     // Catch:{ all -> 0x0046 }
            r1.append(r2)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0046 }
            com.whatsapp.util.Log.d(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0022
        L_0x0042:
            r3.close()
            return
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = "msgstore/enable_secure_delete"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015108j.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("msgstore/upgrade version ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }
}
