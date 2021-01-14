package X;

/* renamed from: X.1VO  reason: invalid class name */
public final class AnonymousClass1VO {
    public static final String A00;

    static {
        StringBuilder A0Y = AnonymousClass008.A0Y("SELECT _id FROM jid WHERE ", "raw_string = '");
        A0Y.append(AnonymousClass02Z.A00.getRawString());
        A0Y.append("' AND ");
        A0Y.append("type = 11");
        A00 = A0Y.toString();
    }
}
