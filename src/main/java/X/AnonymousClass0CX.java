package X;

/* renamed from: X.0CX  reason: invalid class name */
public class AnonymousClass0CX {
    public static volatile AnonymousClass0CX A02;
    public long A00;
    public final AnonymousClass00S A01;

    public AnonymousClass0CX(AnonymousClass00S r1) {
        this.A01 = r1;
    }

    public static AnonymousClass0CX A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0CX.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0CX(AnonymousClass00S.A00());
                }
            }
        }
        return A02;
    }
}
