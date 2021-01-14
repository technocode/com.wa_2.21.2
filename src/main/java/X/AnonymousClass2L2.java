package X;

/* renamed from: X.2L2  reason: invalid class name */
public class AnonymousClass2L2 {
    public static final String A00;
    public static final String A01;

    static {
        StringBuilder A0S = AnonymousClass008.A0S("SELECT ");
        String str = AbstractC05370Og.A00;
        AnonymousClass008.A1Y(A0S, str, ", ", "key_remote_jid", " FROM ");
        AnonymousClass008.A1Y(A0S, "legacy_available_messages_view", " WHERE media_hash=? AND ", " +media_wa_type=? ", " ORDER BY _id DESC");
        A0S.append(" LIMIT 1000");
        A00 = A0S.toString();
        StringBuilder A0S2 = AnonymousClass008.A0S("SELECT ");
        AnonymousClass008.A1Y(A0S2, str, ", ", "key_remote_jid", " FROM ");
        AnonymousClass008.A1Y(A0S2, "legacy_available_messages_view", " WHERE media_hash=? AND ", "media_wa_type in ('2' , '1' , '25' , '3' , '28' , '13' , '29' , '20' , '9' , '26' , '23' , '37' ) ", " ORDER BY _id DESC");
        A0S2.append(" LIMIT 1000");
        A01 = A0S2.toString();
    }
}
