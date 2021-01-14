package X;

/* renamed from: X.0C2  reason: invalid class name */
public class AnonymousClass0C2 extends AbstractC003401r {
    public static volatile AnonymousClass0C2 A01;
    public volatile boolean A00;

    public static AnonymousClass0C2 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0C2.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0C2();
                }
            }
        }
        return A01;
    }
}
