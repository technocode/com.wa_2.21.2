package X;

/* renamed from: X.31r  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC658231r {
    public static volatile AbstractC658231r A00;

    public static AbstractC658231r A00() {
        if (A00 == null) {
            synchronized (AbstractC658231r.class) {
                if (A00 == null) {
                    if (C71413Ow.A00 == null) {
                        synchronized (C71413Ow.class) {
                            if (C71413Ow.A00 == null) {
                                C71413Ow.A00 = new C71413Ow();
                            }
                        }
                    }
                    A00 = C71413Ow.A00;
                }
            }
        }
        return A00;
    }
}
