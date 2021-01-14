package X;

/* renamed from: X.31z  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC658931z {
    public static volatile AbstractC658931z A00;

    public static AbstractC658931z A00() {
        if (A00 == null) {
            synchronized (AbstractC658931z.class) {
                if (A00 == null) {
                    if (AnonymousClass3P7.A00 == null) {
                        synchronized (AnonymousClass3P7.class) {
                            if (AnonymousClass3P7.A00 == null) {
                                AnonymousClass3P7.A00 = new AnonymousClass3P7();
                            }
                        }
                    }
                    A00 = AnonymousClass3P7.A00;
                }
            }
        }
        return A00;
    }
}
