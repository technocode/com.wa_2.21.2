package X;

/* renamed from: X.03J  reason: invalid class name */
public class AnonymousClass03J {
    public static volatile AnonymousClass03J A03;
    public final AnonymousClass02H A00;
    public final AnonymousClass02H A01;
    public final AnonymousClass02H A02;

    public AnonymousClass03J(AnonymousClass00T r3) {
        this.A00 = new AnonymousClass02H(r3, false);
        this.A01 = new AnonymousClass02H(r3, false);
        this.A02 = new AnonymousClass02H(r3, false);
    }

    public static AnonymousClass03J A00() {
        if (A03 == null) {
            synchronized (AnonymousClass03J.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass03J(C002101e.A00());
                }
            }
        }
        return A03;
    }
}
