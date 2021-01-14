package X;

/* renamed from: X.04v  reason: invalid class name */
public class AnonymousClass04v {
    public static volatile AnonymousClass04v A03;
    public final AnonymousClass04w A00 = new AnonymousClass04w();
    public final AnonymousClass04w A01 = new AnonymousClass04w();
    public final AnonymousClass04w A02 = new AnonymousClass04w();

    public static AnonymousClass04v A00() {
        if (A03 == null) {
            synchronized (AnonymousClass04v.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass04v();
                }
            }
        }
        return A03;
    }
}
