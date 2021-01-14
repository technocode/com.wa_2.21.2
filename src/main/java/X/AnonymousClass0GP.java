package X;

/* renamed from: X.0GP  reason: invalid class name */
public class AnonymousClass0GP {
    public static volatile AnonymousClass0GP A01;
    public AnonymousClass0GQ A00;

    public static AnonymousClass0GP A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0GP.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0GP();
                }
            }
        }
        return A01;
    }
}
