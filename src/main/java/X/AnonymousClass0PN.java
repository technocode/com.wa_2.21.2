package X;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0PN  reason: invalid class name */
public abstract class AnonymousClass0PN {
    public List A00;
    public final int A01;
    public final C000300f A02;
    public final AnonymousClass00C A03;
    public final AnonymousClass0I6 A04;
    public final C014508d A05;
    public final C015408m A06;
    public final C06290Sq A07;
    public final C06220Sg A08;
    public final AnonymousClass00Y A09;
    public final String A0A;

    public abstract Pair A07(Cursor cursor);

    public AnonymousClass0PN(String str, int i, AnonymousClass0PQ r4) {
        this.A0A = str;
        this.A01 = i;
        this.A09 = r4.A0q;
        this.A02 = r4.A03;
        this.A03 = r4.A04;
        this.A06 = r4.A0Z;
        this.A08 = r4.A0o;
        this.A05 = r4.A0Q;
        this.A04 = r4.A0P;
        this.A07 = r4.A0m;
    }

    public static final int A01(AnonymousClass0PS r2) {
        Integer num;
        Iterator it = r2.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            AnonymousClass0PR r1 = (AnonymousClass0PR) it.next();
            if (!r1.isValid()) {
                num = r1.A3e();
                break;
            }
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cf, code lost:
        if (r0 == false) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02() {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PN.A02():int");
    }

    public final int A03() {
        if (A0I()) {
            return 11;
        }
        if (A02() == 2) {
            if (A0G()) {
                return 1;
            }
            if (!A0F()) {
                return 4;
            }
            return 0;
        } else if (A02() == 3) {
            if (A0G()) {
                return 1;
            }
            if (A0J()) {
                return 2;
            }
            if (!A0L() || !A0M() || !A0K()) {
                return 10;
            }
            if (A0F()) {
                return 3;
            }
            return 5;
        } else if (A02() != 1) {
            return 9;
        } else {
            if (A0G() || A0F()) {
                return 7;
            }
            return 4;
        }
    }

    public long A04() {
        long j;
        long parseLong;
        String A012;
        if (!(this instanceof C43571yb)) {
            j = 0;
        } else {
            j = 1;
        }
        C015408m r5 = this.A06;
        String A013 = r5.A01(AnonymousClass008.A0O(new StringBuilder(), this.A0A, "_retry_revision"));
        if (A013 == null) {
            parseLong = 0;
        } else {
            parseLong = Long.parseLong(A013);
        }
        if (j != parseLong || (A012 = r5.A01(A09())) == null) {
            return 0;
        }
        return Long.parseLong(A012);
    }

    public long A05() {
        String A012 = this.A06.A01(A0A());
        if (A012 == null) {
            return 0;
        }
        return Long.parseLong(A012);
    }

    public Cursor A06(long j, int i, AnonymousClass0OQ r18) {
        long j2;
        String str;
        if (!(this instanceof AbstractC43741ys)) {
            AnonymousClass0BK r4 = r18.A04;
            if (this instanceof AnonymousClass27y) {
                str = AnonymousClass27y.A07;
            } else if (this instanceof AnonymousClass2A0) {
                str = "SELECT message_row_id, duration, expire_timestamp FROM message_ephemeral WHERE message_row_id>? ORDER BY message_row_id ASC LIMIT ?";
            } else if (this instanceof C464129z) {
                str = "SELECT message_row_id, setting_duration FROM message_ephemeral_setting WHERE message_row_id>? ORDER BY message_row_id ASC LIMIT ?";
            } else if (this instanceof AnonymousClass0PM) {
                str = "";
            } else if (this instanceof AnonymousClass0PO) {
                str = "";
            } else if (this instanceof AnonymousClass0PP) {
                str = "SELECT _id FROM jid WHERE raw_string = '' AND type = 11 AND _id > ?  ORDER BY _id ASC LIMIT ? ";
            } else if (this instanceof C43721yq) {
                str = "SELECT _id, media_wa_type, data, raw_data FROM messages WHERE _id > ?  AND media_wa_type IN (4, 14) ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43711yp) {
                str = "SELECT messages._id, message_thumbnails.thumbnail, message_thumbnails.key_remote_jid, message_thumbnails.key_from_me, message_thumbnails.key_id   FROM messages, message_thumbnails  WHERE messages._id>? AND message_thumbnails.key_remote_jid=messages.key_remote_jid AND message_thumbnails.key_from_me=messages.key_from_me AND message_thumbnails.key_id=messages.key_id  ORDER BY messages._id ASC LIMIT ?";
            } else if (this instanceof C43701yo) {
                str = "SELECT _id, key_remote_jid, key_from_me, key_id, media_name, media_caption, media_url, thumb_image, preview_type  FROM messages WHERE _id > ? AND status != 6 AND media_wa_type IN (0, 27) ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43691yn) {
                str = AnonymousClass2L1.A04;
            } else if (this instanceof C43681ym) {
                str = "SELECT _id, send_count FROM messages WHERE _id > ? ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43671yl) {
                str = "SELECT _id, media_name FROM messages WHERE _id > ? AND media_wa_type = 15 ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C52622bQ) {
                str = "SELECT _id, key_id, key_remote_jid, remote_resource, receipt_device_timestamp, read_device_timestamp, played_device_timestamp FROM messages WHERE _id > ?  AND key_from_me = 1  AND (status IS NULL OR status!=6) ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43661yk) {
                str = "SELECT _id, key_remote_jid, key_id, remote_resource, status, receipt_device_timestamp, read_device_timestamp, played_device_timestamp, participant_hash FROM messages WHERE key_from_me = 1 AND _id > ? ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43651yj) {
                str = AnonymousClass2L1.A03;
            } else if (this instanceof C43641yi) {
                str = "SELECT pay_transactions.rowid AS _id, pay_transactions.key_remote_jid, (CASE WHEN pay_transactions.key_remote_jid IS NOT NULL THEN pay_transactions.key_id else NULL END) AS key_id,messages.rowid AS message_row_id, (CASE WHEN pay_transactions.key_remote_jid IS NULL THEN pay_transactions.key_id else NULL END) AS interop_id, id, pay_transactions.timestamp AS timestamp, pay_transactions.status AS status, error_code, sender, receiver, type, currency, amount_1000, credential_id, methods, bank_transaction_id, metadata, init_timestamp, request_key_id, country, version, future_data, service_id FROM pay_transactions LEFT JOIN messages ON pay_transactions.key_id = messages.key_id WHERE pay_transactions.rowid>? LIMIT ?";
            } else if (this instanceof C43631yh) {
                str = "SELECT _id, gjid, jid, admin, pending, sent_sender_key FROM group_participants WHERE _id > ?  ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43621yg) {
                str = "SELECT group_participant_user._id, group_jid_row_id FROM group_participant_user LEFT JOIN jid ON group_jid_row_id = jid._id WHERE group_participant_user._id > ?  AND type = 3 GROUP BY group_jid_row_id ORDER BY group_participant_user._id LIMIT ? ";
            } else if (this instanceof C43611yf) {
                str = AnonymousClass2L1.A02;
            } else if (this instanceof C43581yc) {
                str = "SELECT _id, mentioned_jids FROM messages WHERE _id > ?  AND mentioned_jids IS NOT NULL  AND mentioned_jids != \"\" ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43571yb) {
                str = "SELECT _id, thumb_image, media_wa_type, key_remote_jid, multicast_id, media_url, media_mime_type, media_size, media_name, media_hash, media_duration, media_enc_hash  FROM messages WHERE _id > ?  AND +media_wa_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' )  ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43561ya) {
                str = AnonymousClass2L1.A01;
            } else if (this instanceof C43551yZ) {
                str = "SELECT _id, key_remote_jid, media_wa_type, media_name, media_url, media_duration, media_size, latitude, longitude, thumb_image  FROM messages WHERE _id > ? AND media_wa_type IN (16, 5, 30) ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43541yY) {
                str = "SELECT _id, chat_row_id, data, media_caption, message_type FROM available_message_view WHERE _id > ? ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43531yX) {
                str = "SELECT _id, label_id, jid  FROM labeled_jids WHERE _id>?  ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43521yW) {
                str = "SELECT _id, media_duration, raw_data  FROM messages WHERE _id > ?   AND media_wa_type IN (12) ORDER BY _id ASC LIMIT ?";
            } else if (this instanceof C43511yV) {
                str = AnonymousClass2L1.A00;
            } else if (!(this instanceof C43501yU)) {
                throw new UnsupportedOperationException();
            } else {
                str = "SELECT _id, jid, type, message_count FROM frequents WHERE _id > ? ORDER BY _id ASC LIMIT ?";
            }
            String[] strArr = {String.valueOf(j), String.valueOf(i)};
            StringBuilder A0S = AnonymousClass008.A0S("MIGRATION_GET_QUERY_FOR_");
            A0S.append(this.A0A);
            return r4.A07(str, strArr, A0S.toString());
        }
        AbstractC43741ys r9 = (AbstractC43741ys) this;
        AnonymousClass0BK r8 = r18.A04;
        String A0O = AnonymousClass008.A0O(new StringBuilder(), AnonymousClass27y.A07, " OFFSET ?");
        String[] strArr2 = new String[3];
        strArr2[0] = String.valueOf(j);
        strArr2[1] = String.valueOf(i);
        long j3 = (long) 50;
        AnonymousClass2LJ r11 = r9.A03;
        int i2 = r11.A00;
        if (i2 < 1) {
            j2 = 0;
        } else {
            int nextInt = r11.A02.nextInt(i2);
            int i3 = r11.A01;
            int i4 = nextInt;
            if (i3 > -1) {
                i4 = ((i2 - i3) - 1) + nextInt;
            }
            r11.A01 = nextInt;
            j2 = (long) i4;
        }
        strArr2[2] = String.valueOf(j3 * j2);
        StringBuilder A0S2 = AnonymousClass008.A0S("MIGRATION_GET_QUERY_FOR_");
        A0S2.append(r9.A0A);
        return r8.A07(A0O, strArr2, A0S2.toString());
    }

    public String A08() {
        if (this instanceof C43721yq) {
            return "new_vcards_ready";
        }
        if (this instanceof C43711yp) {
            return "thumbnail_ready";
        }
        if (this instanceof C43701yo) {
            return "text_ready";
        }
        if (this instanceof C43691yn) {
            return "system_message_ready";
        }
        if (this instanceof C43681ym) {
            return "send_count_ready";
        }
        if (this instanceof C43671yl) {
            return "revoked_ready";
        }
        if (this instanceof C43651yj) {
            return "quoted_message_ready";
        }
        if (this instanceof C43641yi) {
            return "new_pay_transaction_ready";
        }
        if (this instanceof C43581yc) {
            return "mention_message_ready";
        }
        if (this instanceof C43561ya) {
            return "main_message_ready";
        }
        if (this instanceof C43551yZ) {
            return "location_ready";
        }
        if (this instanceof C43541yY) {
            return "links_ready";
        }
        if (this instanceof C43531yX) {
            return "labeled_jids_ready";
        }
        if (!(this instanceof C43521yW)) {
            return !(this instanceof C43501yU) ? AnonymousClass008.A0O(new StringBuilder(), this.A0A, "_complete") : "frequent_ready";
        }
        return "future_ready";
    }

    public String A09() {
        if (this instanceof AnonymousClass27y) {
            return "message_main_verification_retry_count";
        }
        if (this instanceof AnonymousClass0PM) {
            return "migration_jid_store_retry_count";
        }
        if (this instanceof AnonymousClass0PO) {
            return "migration_chat_store_retry_count";
        }
        if (this instanceof AnonymousClass0PP) {
            return "migration_blank_me_jid_retry";
        }
        if (this instanceof AbstractC43731yr) {
            AbstractC43731yr r0 = (AbstractC43731yr) this;
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass008.A0M("alter_", r0.A00, "_to_", r0.A01));
            sb.append("_retry");
            return sb.toString();
        } else if (this instanceof C43721yq) {
            return "migration_vcard_retry";
        } else {
            if (this instanceof C43711yp) {
                return "migration_message_thumbnail_retry";
            }
            if (this instanceof C43701yo) {
                return "migration_message_text_retry";
            }
            if (this instanceof C43691yn) {
                return "migration_message_system_retry";
            }
            if (this instanceof C43681ym) {
                return "migration_message_send_count_retry";
            }
            if (this instanceof C43671yl) {
                return "migration_message_revoked_retry";
            }
            if (this instanceof C52622bQ) {
                return "migration_receipt_retry";
            }
            if (this instanceof C43661yk) {
                return "migration_receipt_device_retry";
            }
            if (this instanceof C43651yj) {
                return "migration_message_quoted_retry";
            }
            if (this instanceof C43641yi) {
                return "migration_pay_transaction_retry";
            }
            if (this instanceof C43631yh) {
                return "migration_participant_user_retry";
            }
            if (this instanceof C43621yg) {
                return "migration_broadcast_me_jid_retry";
            }
            if (this instanceof C43611yf) {
                return "migration_missed_calls_log_retry";
            }
            if (this instanceof C43581yc) {
                return "migration_message_mention_retry";
            }
            if (this instanceof C43571yb) {
                return !(((C43571yb) this) instanceof AnonymousClass27t) ? "migration_message_media_retry" : "migration_message_media_fixer_retry";
            }
            if (this instanceof C43561ya) {
                return "migration_message_main_retry";
            }
            if (this instanceof C43551yZ) {
                return "migration_message_location_retry";
            }
            if (this instanceof C43541yY) {
                return "migration_link_retry";
            }
            if (this instanceof C43531yX) {
                return "migration_labeled_jid_retry";
            }
            if (this instanceof C43521yW) {
                return "migration_message_future_retry";
            }
            if (!(this instanceof C43511yV)) {
                return !(this instanceof C43501yU) ? "call_log_retry_count" : "migration_frequent_retry";
            }
            return "migration_fts_retry";
        }
    }

    public String A0A() {
        if (this instanceof AnonymousClass27y) {
            return "message_main_verification_start_index";
        }
        if (this instanceof AnonymousClass0PM) {
            return "migration_jid_store_start_index";
        }
        if (this instanceof AnonymousClass0PO) {
            return "migration_chat_store_start_index";
        }
        if (this instanceof AnonymousClass0PP) {
            return "migration_blank_me_jid_index";
        }
        if (this instanceof AbstractC43731yr) {
            AbstractC43731yr r0 = (AbstractC43731yr) this;
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass008.A0M("alter_", r0.A00, "_to_", r0.A01));
            sb.append("_index");
            return sb.toString();
        } else if (this instanceof C43721yq) {
            return "migration_vcard_index";
        } else {
            if (this instanceof C43711yp) {
                return "migration_message_thumbnail_index";
            }
            if (this instanceof C43701yo) {
                return "migration_message_text_index";
            }
            if (this instanceof C43691yn) {
                return "migration_message_system_index";
            }
            if (this instanceof C43681ym) {
                return "migration_message_send_count_index";
            }
            if (this instanceof C43671yl) {
                return "migration_message_revoked_index";
            }
            if (this instanceof C52622bQ) {
                return "migration_receipt_index";
            }
            if (this instanceof C43661yk) {
                return "migration_receipt_device_index";
            }
            if (this instanceof C43651yj) {
                return "migration_message_quoted_index";
            }
            if (this instanceof C43641yi) {
                return "migration_pay_transaction_index";
            }
            if (this instanceof C43631yh) {
                return "migration_participant_user_index";
            }
            if (this instanceof C43621yg) {
                return "migration_broadcast_me_jid_index";
            }
            if (this instanceof C43611yf) {
                return "migration_missed_calls_log_index";
            }
            if (this instanceof C43581yc) {
                return "migration_message_mention_index";
            }
            if (this instanceof C43571yb) {
                return !(((C43571yb) this) instanceof AnonymousClass27t) ? "migration_message_media_index" : "migration_message_media_fixer_index";
            }
            if (this instanceof C43561ya) {
                return "migration_message_main_index";
            }
            if (this instanceof C43551yZ) {
                return "migration_message_location_index";
            }
            if (this instanceof C43541yY) {
                return "migration_link_index";
            }
            if (this instanceof C43531yX) {
                return "migration_labeled_jid_index";
            }
            if (this instanceof C43521yW) {
                return "migration_message_future_index";
            }
            if (!(this instanceof C43511yV)) {
                return !(this instanceof C43501yU) ? "call_log_start_index" : "migration_frequent_index";
            }
            return "migration_fts_index";
        }
    }

    public Set A0B() {
        if (this instanceof AnonymousClass27y) {
            HashSet hashSet = new HashSet();
            hashSet.add("message_main");
            return hashSet;
        } else if (this instanceof AnonymousClass0PO) {
            return Collections.singleton("migration_jid_store");
        } else {
            if (this instanceof AnonymousClass0PP) {
                HashSet hashSet2 = new HashSet();
                hashSet2.add("migration_jid_store");
                hashSet2.add("migration_chat_store");
                return hashSet2;
            } else if (this instanceof C43721yq) {
                HashSet hashSet3 = new HashSet();
                hashSet3.add("migration_jid_store");
                hashSet3.add("migration_chat_store");
                return hashSet3;
            } else if (this instanceof C43711yp) {
                HashSet hashSet4 = new HashSet();
                hashSet4.add("migration_jid_store");
                hashSet4.add("migration_chat_store");
                return hashSet4;
            } else if (this instanceof C43701yo) {
                HashSet hashSet5 = new HashSet();
                hashSet5.add("migration_jid_store");
                hashSet5.add("migration_chat_store");
                hashSet5.add("message_thumbnail");
                return hashSet5;
            } else if (this instanceof C43691yn) {
                HashSet hashSet6 = new HashSet();
                hashSet6.add("migration_jid_store");
                hashSet6.add("migration_chat_store");
                hashSet6.add("message_quoted");
                return hashSet6;
            } else if (this instanceof C43681ym) {
                HashSet hashSet7 = new HashSet();
                hashSet7.add("migration_jid_store");
                hashSet7.add("migration_chat_store");
                return hashSet7;
            } else if (this instanceof C43671yl) {
                HashSet hashSet8 = new HashSet();
                hashSet8.add("migration_jid_store");
                hashSet8.add("migration_chat_store");
                return hashSet8;
            } else if (this instanceof C52622bQ) {
                HashSet hashSet9 = new HashSet();
                hashSet9.add("migration_jid_store");
                hashSet9.add("migration_chat_store");
                return hashSet9;
            } else if (this instanceof C43661yk) {
                HashSet hashSet10 = new HashSet();
                hashSet10.add("migration_jid_store");
                hashSet10.add("migration_chat_store");
                return hashSet10;
            } else if (this instanceof C43651yj) {
                HashSet hashSet11 = new HashSet();
                hashSet11.add("migration_jid_store");
                hashSet11.add("migration_chat_store");
                return hashSet11;
            } else if (this instanceof C43641yi) {
                HashSet hashSet12 = new HashSet();
                hashSet12.add("migration_jid_store");
                hashSet12.add("migration_chat_store");
                return hashSet12;
            } else if (this instanceof C43631yh) {
                HashSet hashSet13 = new HashSet();
                hashSet13.add("migration_jid_store");
                hashSet13.add("migration_chat_store");
                hashSet13.add("blank_me_jid");
                return hashSet13;
            } else if (this instanceof C43621yg) {
                HashSet hashSet14 = new HashSet();
                hashSet14.add("migration_jid_store");
                hashSet14.add("migration_chat_store");
                hashSet14.add("participant_user");
                return hashSet14;
            } else if (this instanceof C43611yf) {
                HashSet hashSet15 = new HashSet();
                hashSet15.add("migration_jid_store");
                hashSet15.add("migration_chat_store");
                return hashSet15;
            } else if (this instanceof C43581yc) {
                HashSet hashSet16 = new HashSet();
                hashSet16.add("migration_jid_store");
                hashSet16.add("migration_chat_store");
                return hashSet16;
            } else if (this instanceof C43571yb) {
                HashSet hashSet17 = new HashSet();
                hashSet17.add("migration_jid_store");
                hashSet17.add("migration_chat_store");
                return hashSet17;
            } else if (this instanceof C43561ya) {
                HashSet hashSet18 = new HashSet();
                hashSet18.add("migration_jid_store");
                hashSet18.add("migration_chat_store");
                hashSet18.add("message_frequent");
                hashSet18.add("message_future");
                hashSet18.add("labeled_jid");
                hashSet18.add("message_link");
                hashSet18.add("message_location");
                hashSet18.add("message_media");
                hashSet18.add("message_mention");
                hashSet18.add("missed_calls");
                hashSet18.add("payment_transaction");
                hashSet18.add("message_quoted");
                hashSet18.add("message_revoked");
                hashSet18.add("message_send_count");
                hashSet18.add("message_system");
                hashSet18.add("message_text");
                hashSet18.add("message_thumbnail");
                hashSet18.add("message_vcard");
                return hashSet18;
            } else if (this instanceof C43551yZ) {
                HashSet hashSet19 = new HashSet();
                hashSet19.add("migration_jid_store");
                hashSet19.add("migration_chat_store");
                return hashSet19;
            } else if (this instanceof C43541yY) {
                HashSet hashSet20 = new HashSet();
                hashSet20.add("migration_jid_store");
                hashSet20.add("migration_chat_store");
                return hashSet20;
            } else if (this instanceof C43531yX) {
                HashSet hashSet21 = new HashSet();
                hashSet21.add("migration_jid_store");
                hashSet21.add("migration_chat_store");
                return hashSet21;
            } else if (this instanceof C43521yW) {
                HashSet hashSet22 = new HashSet();
                hashSet22.add("migration_jid_store");
                hashSet22.add("migration_chat_store");
                return hashSet22;
            } else if (!(this instanceof C43501yU)) {
                return new HashSet();
            } else {
                HashSet hashSet23 = new HashSet();
                hashSet23.add("migration_jid_store");
                hashSet23.add("migration_chat_store");
                return hashSet23;
            }
        }
    }

    public void A0C() {
        C015408m r4 = this.A06;
        r4.A02(A0A());
        r4.A02(A09());
        StringBuilder sb = new StringBuilder();
        String str = this.A0A;
        r4.A02(AnonymousClass008.A0O(sb, str, "_retry_revision"));
        int i = this.A01;
        if (Integer.MIN_VALUE != i) {
            r4.A02(AnonymousClass008.A0O(new StringBuilder(), str, "_in_progress"));
            r4.A03(A08(), i);
        }
    }

    public void A0D() {
        int i;
        if (this.A01 != Integer.MIN_VALUE) {
            C015408m r3 = this.A06;
            r3.A02(AnonymousClass008.A0O(new StringBuilder(), this.A0A, "_in_progress"));
            if (!(this instanceof C43541yY)) {
                i = -1;
            } else {
                i = 1;
            }
            if (i != -1) {
                r3.A03(A08(), i);
            } else {
                r3.A02(A08());
            }
        }
        C015408m r32 = this.A06;
        r32.A02(A09());
        StringBuilder sb = new StringBuilder();
        String str = this.A0A;
        r32.A02(AnonymousClass008.A0O(sb, str, "_retry_revision"));
        r32.A02(A0A());
        StringBuilder A0S = AnonymousClass008.A0S("migration_stats_");
        A0S.append(str);
        r32.A02(A0S.toString());
    }

    public final void A0E(AnonymousClass2LL r7) {
        String str;
        C015408m r4 = this.A06;
        StringBuilder A0S = AnonymousClass008.A0S("migration_stats_");
        A0S.append(this.A0A);
        String obj = A0S.toString();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("row_processed", r7.A03);
            jSONObject.put("row_skipped", r7.A04);
            jSONObject.put("db_size_change", r7.A00);
            jSONObject.put("migration_time_spent", r7.A01);
            jSONObject.put("retry_count", r7.A02);
            str = jSONObject.toString();
        } catch (JSONException e) {
            Log.e("Failed to save migration statistics to JSON object.", e);
            str = null;
        }
        r4.A05(obj, str);
    }

    public boolean A0F() {
        return A05() > 0;
    }

    public boolean A0G() {
        String A012;
        if (this instanceof AnonymousClass27y) {
            String A013 = this.A06.A01("message_main_verification_done");
            if (A013 == null || Integer.parseInt(A013) != 1) {
                return false;
            }
            return true;
        } else if (this instanceof AnonymousClass2A0) {
            C014508d r3 = this.A05;
            HashMap hashMap = new HashMap();
            hashMap.put("start_timestamp", "INTEGER");
            hashMap.put("chat_duration", "INTEGER");
            return AbstractC460527u.A00(r3, "message_ephemeral", hashMap);
        } else if (this instanceof C464129z) {
            return AbstractC460527u.A00(this.A05, "message_ephemeral_setting", Collections.singletonMap("ephemerality_enabled", "BOOLEAN"));
        } else {
            if (this instanceof AnonymousClass0PM) {
                return ((AnonymousClass0PM) this).A01.A0C();
            }
            if (this instanceof AnonymousClass0PO) {
                return ((AnonymousClass0PO) this).A01.A0G();
            }
            if (this instanceof AnonymousClass0PP) {
                String A014 = ((AnonymousClass0PP) this).A03.A01("blank_me_jid_ready");
                if (A014 == null || Integer.parseInt(A014) != 1) {
                    return false;
                }
                return true;
            } else if (this instanceof C43721yq) {
                return ((C43721yq) this).A01.A0A();
            } else {
                if (this instanceof C43711yp) {
                    String A015 = ((C43711yp) this).A02.A02.A01("thumbnail_ready");
                    if (A015 == null || Integer.parseInt(A015) != 2) {
                        return false;
                    }
                    return true;
                } else if (this instanceof C43701yo) {
                    return ((C43701yo) this).A03.A05();
                } else {
                    if (this instanceof C43691yn) {
                        return ((C43691yn) this).A02.A03();
                    }
                    if (this instanceof C43681ym) {
                        return ((C43681ym) this).A01.A02();
                    }
                    if (this instanceof C43671yl) {
                        return ((C43671yl) this).A01.A02();
                    }
                    if (this instanceof C52622bQ) {
                        return ((C52622bQ) this).A07.A04();
                    }
                    if (this instanceof C43661yk) {
                        String A016 = ((C43661yk) this).A04.A07.A01("receipt_device_migration_complete");
                        if (A016 == null || Integer.parseInt(A016) != 1) {
                            return false;
                        }
                        return true;
                    } else if (this instanceof C43651yj) {
                        return ((C43651yj) this).A0A.A08();
                    } else {
                        if (this instanceof C43641yi) {
                            return ((C43641yi) this).A01.A0a();
                        }
                        if (this instanceof C43631yh) {
                            return ((C43631yh) this).A02.A0F();
                        }
                        if (this instanceof C43621yg) {
                            String A017 = ((C43621yg) this).A03.A01("broadcast_me_jid_ready");
                            if (A017 == null || Integer.parseInt(A017) != 2) {
                                return false;
                            }
                            return true;
                        } else if (this instanceof C43611yf) {
                            String A018 = this.A06.A01("missed_calls_ready");
                            if (A018 == null || Integer.parseInt(A018) != 1) {
                                return false;
                            }
                            return true;
                        } else if (this instanceof C43581yc) {
                            return ((C43581yc) this).A01.A03();
                        } else {
                            if (this instanceof C43571yb) {
                                C43571yb r1 = (C43571yb) this;
                                if (!(r1 instanceof AnonymousClass27t)) {
                                    return r1.A01.A0F();
                                }
                                String A019 = r1.A02.A01("media_message_fixer_ready");
                                if (A019 == null || Integer.parseInt(A019) != 1) {
                                    return false;
                                }
                                return true;
                            } else if (this instanceof C43561ya) {
                                return ((C43561ya) this).A01.A09();
                            } else {
                                if (this instanceof C43551yZ) {
                                    return ((C43551yZ) this).A01.A05();
                                }
                                if (this instanceof C43541yY) {
                                    return ((C43541yY) this).A00.A03();
                                }
                                if (this instanceof C43531yX) {
                                    AnonymousClass0AN r12 = ((C43531yX) this).A01;
                                    return r12.A01.A0C() && (A012 = r12.A04.A01("labeled_jids_ready")) != null && Long.parseLong(A012) == 1;
                                } else if (this instanceof C43521yW) {
                                    return ((C43521yW) this).A00.A03();
                                } else {
                                    if (this instanceof C43511yV) {
                                        AnonymousClass0AM r13 = ((C43511yV) this).A00;
                                        return r13.A0O() && r13.A05() == 5;
                                    } else if (!(this instanceof C43501yU)) {
                                        return ((C43491yS) this).A00.A08();
                                    } else {
                                        return ((C43501yU) this).A00.A07();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean A0H() {
        C06220Sg r0 = this.A08;
        return C06220Sg.A00(r0.A00.A06(242), this.A0A);
    }

    public boolean A0I() {
        int parseInt;
        int parseInt2;
        int i;
        int i2 = this.A01;
        if (Integer.MIN_VALUE == i2) {
            return false;
        }
        C015408m r5 = this.A06;
        String A012 = r5.A01(AnonymousClass008.A0O(new StringBuilder(), this.A0A, "_in_progress"));
        if (A012 == null) {
            parseInt = -1;
        } else {
            parseInt = Integer.parseInt(A012);
        }
        if (A0F() && parseInt == -1) {
            return true;
        }
        if (parseInt != -1 && parseInt != i2) {
            return true;
        }
        String A013 = r5.A01(A08());
        if (A013 == null || (parseInt2 = Integer.parseInt(A013)) == -1) {
            return false;
        }
        if (!(this instanceof C43541yY)) {
            i = -1;
        } else {
            i = 1;
        }
        if ((i == -1 || i < parseInt2) && parseInt2 != i2) {
            return true;
        }
        return false;
    }

    public boolean A0J() {
        return !(this instanceof AnonymousClass0PM) && !(this instanceof AnonymousClass0PO) && A04() > 3;
    }

    public boolean A0K() {
        if (this instanceof AnonymousClass27y) {
            C014508d r0 = ((AnonymousClass27y) this).A03;
            r0.A05();
            return r0.A07.A0G();
        } else if (this instanceof AnonymousClass0PP) {
            AnonymousClass01I r02 = ((AnonymousClass0PP) this).A00;
            r02.A04();
            return r02.A03 != null;
        } else if (this instanceof C52622bQ) {
            AnonymousClass01I r03 = ((C52622bQ) this).A02;
            r03.A04();
            return r03.A03 != null;
        } else if (this instanceof C43661yk) {
            AnonymousClass01I r04 = ((C43661yk) this).A00;
            r04.A04();
            return r04.A03 != null;
        } else if (this instanceof C43631yh) {
            AnonymousClass01I r05 = ((C43631yh) this).A00;
            r05.A04();
            return r05.A03 != null;
        } else if (this instanceof C43621yg) {
            AnonymousClass01I r06 = ((C43621yg) this).A00;
            r06.A04();
            return r06.A03 != null;
        } else if (this instanceof AnonymousClass27t) {
            return ((C43571yb) this).A01.A0F();
        } else {
            if (!(this instanceof C43561ya)) {
                return true;
            }
            return ((C43561ya) this).A00.A08();
        }
    }

    public final boolean A0L() {
        long A032 = this.A03.A03();
        if (A032 > 10485760) {
            return true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("DatabaseMigration/hasEnoughStorageForMigration/insufficient storage for migration; name=");
        A0S.append(this.A0A);
        A0S.append("; availableInternalPhoneStorage=");
        A0S.append(A032);
        A0S.append("; minInternalStorageRequired=");
        A0S.append(10485760L);
        Log.w(A0S.toString());
        return false;
    }

    public final boolean A0M() {
        long A022;
        Long A012;
        if (A0F()) {
            return true;
        }
        if (this instanceof C43721yq) {
            A022 = this.A08.A02();
        } else if (this instanceof C43711yp) {
            A022 = this.A08.A02();
        } else if (this instanceof C43701yo) {
            A022 = this.A08.A02();
        } else if (this instanceof C43691yn) {
            A022 = this.A08.A02();
        } else if (this instanceof C43681ym) {
            A022 = this.A08.A02();
        } else if (this instanceof C43671yl) {
            A022 = this.A08.A02();
        } else if (this instanceof C43651yj) {
            A022 = this.A08.A02();
        } else if (this instanceof C43641yi) {
            A022 = this.A08.A02();
        } else if (this instanceof C43611yf) {
            A022 = this.A08.A02();
        } else if (this instanceof C43581yc) {
            A022 = this.A08.A02();
        } else if (this instanceof C43561ya) {
            A022 = this.A08.A02();
        } else if (this instanceof C43551yZ) {
            A022 = this.A08.A02();
        } else if (this instanceof C43541yY) {
            A022 = this.A08.A02();
        } else if (this instanceof C43531yX) {
            A022 = this.A08.A02();
        } else if (this instanceof C43521yW) {
            A022 = this.A08.A02();
        } else if (!(this instanceof C43501yU)) {
            A022 = 0;
        } else {
            A022 = this.A08.A02();
        }
        if (A022 > 0 && (A012 = this.A04.A01()) != null && A012.longValue() > A022) {
            return false;
        }
        return true;
    }

    public boolean A0N(SQLException sQLException, int i) {
        if (sQLException instanceof SQLiteDatabaseCorruptException) {
            return false;
        }
        if (i != 1) {
            if ((sQLException instanceof SQLiteBlobTooBigException) || (sQLException instanceof SQLiteOutOfMemoryException)) {
                return true;
            }
            return false;
        } else if (!(sQLException instanceof SQLiteBlobTooBigException)) {
            return false;
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("DatabaseMigration/shouldRetryWithSmallerBatch/error; name=");
            A0S.append(this.A0A);
            A0S.append("; BlobTooBigException - skipping row");
            Log.e(A0S.toString());
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: java.lang.String[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03b8, code lost:
        if (r13 != null) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        r27.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0474, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04ba, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0531, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0532, code lost:
        if (r5 != null) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0537, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        r21 = A01(r40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0586, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0587, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x058b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x058f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0592, code lost:
        r18 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0593, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        r24.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x08b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x08bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0901, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0945, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0949, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0ba7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0ba8, code lost:
        if (r2 != null) goto L_0x0baa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0bad, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0bb0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0bb1, code lost:
        if (r2 != null) goto L_0x0bb3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0bb6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0bb9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0bba, code lost:
        if (r2 != null) goto L_0x0bbc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0bbf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0bc2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0bc3, code lost:
        if (r2 != null) goto L_0x0bc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0bc8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0bcb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0bcc, code lost:
        if (r2 != null) goto L_0x0bce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0bd1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0bd4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0bd5, code lost:
        if (r2 != null) goto L_0x0bd7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0bda, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0bdd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0bde, code lost:
        if (r2 != null) goto L_0x0be0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0be3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0be6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0bea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0bed, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0bf1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c6, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("DatabaseMigration/doMigration/conditions check requires to stop migration process; name = ");
        r1.append(r9);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0586 A[ExcHandler: AssertionError (r0v319 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:235:0x0435] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x05e6 A[Catch:{ 2LI -> 0x094a, Exception -> 0x095c }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0902  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x09ba  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0a06  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0a19  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x0a54  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0a5c  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0a71  */
    /* JADX WARNING: Removed duplicated region for block: B:631:0x05ac A[EDGE_INSN: B:631:0x05ac->B:337:0x05ac ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x01be A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c0 A[Catch:{ Exception -> 0x0590 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(X.AnonymousClass0PS r40) {
        /*
        // Method dump skipped, instructions count: 3136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PN.A0O(X.0PS):boolean");
    }
}
