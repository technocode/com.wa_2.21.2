package X;

/* renamed from: X.0AV  reason: invalid class name */
public class AnonymousClass0AV extends AbstractC003401r {
    public static volatile AnonymousClass0AV A01;
    public AnonymousClass0AW A00 = new AnonymousClass0AW();

    public static AnonymousClass0AV A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0AV.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0AV();
                }
            }
        }
        return A01;
    }
}
