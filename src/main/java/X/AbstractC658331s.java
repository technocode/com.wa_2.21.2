package X;

/* renamed from: X.31s  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC658331s {
    public static volatile AbstractC658331s A00;

    public static AbstractC658331s A00() {
        if (A00 == null) {
            synchronized (AbstractC658331s.class) {
                if (A00 == null) {
                    A00 = new C71443Oz();
                }
            }
        }
        return A00;
    }
}
