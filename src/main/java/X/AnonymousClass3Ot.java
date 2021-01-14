package X;

/* renamed from: X.3Ot  reason: invalid class name */
public class AnonymousClass3Ot extends AnonymousClass1KG {
    public static volatile AnonymousClass3Ot A00;

    public static AnonymousClass3Ot A00() {
        if (A00 == null) {
            synchronized (AnonymousClass3Ot.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass3Ot();
                }
            }
        }
        return A00;
    }
}
