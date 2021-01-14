package X;

/* renamed from: X.2L1  reason: invalid class name */
public abstract class AnonymousClass2L1 {
    public static final String A00;
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;

    static {
        StringBuilder A0S = AnonymousClass008.A0S("   SELECT ");
        String str = AbstractC05370Og.A11;
        AnonymousClass008.A1Y(A0S, str, " FROM ", "available_message_view", " WHERE ");
        A00 = AnonymousClass008.A0Q(A0S, "_id > ? ", " ORDER BY ", "_id ASC", " LIMIT ?");
        StringBuilder A0S2 = AnonymousClass008.A0S("   SELECT ");
        AnonymousClass008.A1Y(A0S2, str, " FROM ", "message_view", " WHERE ");
        A01 = AnonymousClass008.A0Q(A0S2, "_id > ? ", " ORDER BY ", "_id ASC", " LIMIT ?");
        StringBuilder A0S3 = AnonymousClass008.A0S("SELECT ");
        AnonymousClass008.A1Y(A0S3, AbstractC05370Og.A12, ",", " messages.key_remote_jid AS parent_key_remote_jid,", " messages._id AS parent_row_id");
        AnonymousClass008.A1Y(A0S3, " FROM ", "messages", " AS messages,", "messages_quotes");
        AnonymousClass008.A1Y(A0S3, " JOIN ", "jid AS chat_jid ON messages_quotes.key_remote_jid = chat_jid.raw_string", " JOIN ", "chat AS chat ON chat.jid_row_id = chat_jid._id");
        AnonymousClass008.A1Y(A0S3, " WHERE messages._id > ? ", " AND messages.quoted_row_id = ", "messages_quotes", "._id ");
        A0S3.append(" ORDER BY messages._id ASC LIMIT ?");
        A03 = A0S3.toString();
        StringBuilder A0S4 = AnonymousClass008.A0S("SELECT ");
        String str2 = AbstractC05370Og.A00;
        A0S4.append(AbstractC05370Og.A00("messages", str2));
        A0S4.append(", ");
        A0S4.append("messages.");
        A0S4.append("key_remote_jid");
        A0S4.append(" FROM ");
        AnonymousClass008.A1Y(A0S4, "messages", " AS messages", " LEFT JOIN ", "missed_call_logs AS missed_call_logs");
        AnonymousClass008.A1Y(A0S4, " ON messages.", "_id", " = missed_call_logs.message_row_id", " WHERE ");
        AnonymousClass008.A1Y(A0S4, "messages._id > ? ", " AND ", "media_wa_type = 10", " AND ");
        A02 = AnonymousClass008.A0P(A0S4, "missed_call_logs._id IS NULL", " ORDER BY _id ASC", " LIMIT ?");
        StringBuilder A0S5 = AnonymousClass008.A0S("SELECT ");
        AnonymousClass008.A1Y(A0S5, str2, ", ", "key_remote_jid", " FROM ");
        AnonymousClass008.A1Y(A0S5, "messages", " WHERE ", "_id > ?", " AND ");
        AnonymousClass008.A1Y(A0S5, "status = 6", " AND ", "media_wa_type = 0", " ORDER BY ");
        A04 = AnonymousClass008.A0O(A0S5, "_id", " ASC LIMIT ?");
    }
}
