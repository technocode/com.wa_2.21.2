package X;

/* renamed from: X.323  reason: invalid class name */
public abstract class AnonymousClass323 {
    public static AnonymousClass323 A00() {
        if (AnonymousClass3PD.A00 == null) {
            synchronized (AnonymousClass3PD.class) {
                if (AnonymousClass3PD.A00 == null) {
                    AnonymousClass3PD.A00 = new AnonymousClass3PD();
                }
            }
        }
        return AnonymousClass3PD.A00;
    }
}
