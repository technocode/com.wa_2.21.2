package X;

/* renamed from: X.322  reason: invalid class name */
public abstract class AnonymousClass322 {
    public static volatile AnonymousClass322 A00;

    public static AnonymousClass322 A00() {
        if (A00 == null) {
            synchronized (AnonymousClass322.class) {
                if (A00 == null) {
                    if (AnonymousClass3PC.A00 == null) {
                        synchronized (AnonymousClass3PC.class) {
                            if (AnonymousClass3PC.A00 == null) {
                                AnonymousClass3PC.A00 = new AnonymousClass3PC();
                            }
                        }
                    }
                    A00 = AnonymousClass3PC.A00;
                }
            }
        }
        return A00;
    }
}
