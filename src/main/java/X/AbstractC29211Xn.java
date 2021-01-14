package X;

/* renamed from: X.1Xn  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC29211Xn {
    public static volatile AbstractC29211Xn A00;

    public static AbstractC29211Xn A00() {
        if (A00 == null) {
            synchronized (AbstractC29211Xn.class) {
                if (A00 == null) {
                    if (C450922y.A00 == null) {
                        synchronized (C450922y.class) {
                            if (C450922y.A00 == null) {
                                C450922y.A00 = new C450922y();
                            }
                        }
                    }
                    A00 = C450922y.A00;
                }
            }
        }
        return A00;
    }
}
