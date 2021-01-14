package X;

/* renamed from: X.1VQ  reason: invalid class name */
public final class AnonymousClass1VQ {
    public static final String A00 = A00("message_ephemeral_remove_column");
    public static final String A01 = A00("message_ephemeral");
    public static final String A02 = AnonymousClass008.A0Q(AnonymousClass008.A0a("CREATE TABLE ", "message_ephemeral_remove_column", "(", "message_row_id INTEGER PRIMARY KEY", ", "), "duration INTEGER NOT NULL", ", ", "expire_timestamp INTEGER NOT NULL", ")");
    public static final String A03 = AnonymousClass008.A0Q(AnonymousClass008.A0a("CREATE TABLE ", "message_ephemeral", "(", "message_row_id INTEGER PRIMARY KEY", ", "), "duration INTEGER NOT NULL", ", ", "expire_timestamp INTEGER NOT NULL", ")");
    public static final String A04;
    public static final String A05;
    public static final String A06;

    static {
        StringBuilder A0S = AnonymousClass008.A0S("DROP INDEX ");
        StringBuilder sb = new StringBuilder();
        sb.append("message_ephemeral_remove_column");
        sb.append("_expire_timestamp_index");
        A0S.append(sb.toString());
        A04 = A0S.toString();
        StringBuilder A0S2 = AnonymousClass008.A0S("INSERT");
        AnonymousClass008.A1Y(A0S2, " ", "INTO ", "message_ephemeral", "(message_row_id, duration, expire_timestamp)");
        A0S2.append(" VALUES (?, ?, ?)");
        A05 = A0S2.toString();
        StringBuilder A0S3 = AnonymousClass008.A0S("INSERT");
        AnonymousClass008.A1Y(A0S3, " OR REPLACE ", "INTO ", "message_ephemeral_remove_column", "(message_row_id, duration, expire_timestamp)");
        A0S3.append(" VALUES (?, ?, ?)");
        A06 = A0S3.toString();
    }

    public static String A00(String str) {
        StringBuilder A0S = AnonymousClass008.A0S("CREATE INDEX IF NOT EXISTS ");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_expire_timestamp_index");
        A0S.append(sb.toString());
        A0S.append(" on ");
        A0S.append(str);
        A0S.append("(expire_timestamp)");
        return A0S.toString();
    }
}
