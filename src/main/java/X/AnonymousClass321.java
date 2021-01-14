package X;

/* renamed from: X.321  reason: invalid class name */
public abstract class AnonymousClass321 {
    public static volatile AnonymousClass321 A00;

    public static AnonymousClass321 A00() {
        if (A00 == null) {
            synchronized (AnonymousClass321.class) {
                if (A00 == null) {
                    if (AnonymousClass3PA.A00 == null) {
                        synchronized (AnonymousClass3PA.class) {
                            if (AnonymousClass3PA.A00 == null) {
                                AnonymousClass3PA.A00 = new AnonymousClass3PA();
                            }
                        }
                    }
                    A00 = AnonymousClass3PA.A00;
                }
            }
        }
        return A00;
    }
}
