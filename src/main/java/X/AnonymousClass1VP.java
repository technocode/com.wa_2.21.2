package X;

/* renamed from: X.1VP  reason: invalid class name */
public final class AnonymousClass1VP {
    public static final String A00 = AnonymousClass008.A0P(AnonymousClass008.A0a("CREATE TABLE ", "message_ephemeral_setting_remove_column", " (", "message_row_id", " INTEGER PRIMARY KEY, "), "setting_duration", " INTEGER", ")");
    public static final String A01 = AnonymousClass008.A0P(AnonymousClass008.A0a("CREATE TABLE ", "message_ephemeral_setting", " (", "message_row_id", " INTEGER PRIMARY KEY, "), "setting_duration", " INTEGER", ")");
    public static final String A02 = AnonymousClass008.A0O(AnonymousClass008.A0a("INSERT or REPLACE INTO ", "message_ephemeral_setting", " (", "message_row_id", ", "), "setting_duration", ") VALUES (?, ?)");
    public static final String A03 = AnonymousClass008.A0O(AnonymousClass008.A0a("INSERT or REPLACE INTO ", "message_ephemeral_setting_remove_column", " (", "message_row_id", ", "), "setting_duration", ") VALUES (?, ?)");
}
