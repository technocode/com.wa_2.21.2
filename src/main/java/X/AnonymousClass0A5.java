package X;

/* renamed from: X.0A5  reason: invalid class name */
public class AnonymousClass0A5 {
    public static final String A00 = AnonymousClass008.A0O(new StringBuilder(), AnonymousClass020.A02, "_light_debug");
    public static volatile AnonymousClass0A5 A01;

    public static AnonymousClass0A5 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass00D.class) {
                if (A01 == null) {
                    AnonymousClass022.A00();
                    A01 = new AnonymousClass0A5();
                }
            }
        }
        return A01;
    }
}
