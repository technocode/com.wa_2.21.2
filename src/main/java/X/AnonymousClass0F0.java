package X;

/* renamed from: X.0F0  reason: invalid class name */
public class AnonymousClass0F0 extends AnonymousClass01G {
    public static volatile AnonymousClass0F0 A00;

    public static AnonymousClass0F0 A00() {
        if (A00 == null) {
            synchronized (AnonymousClass0F0.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass0F0();
                }
            }
        }
        return A00;
    }
}
