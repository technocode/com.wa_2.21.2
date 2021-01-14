package X;

/* renamed from: X.0XO  reason: invalid class name */
public class AnonymousClass0XO {
    public static volatile AnonymousClass0XO A01;
    public final AnonymousClass00Y A00;

    public AnonymousClass0XO(AnonymousClass00Y r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0XO A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0XO.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0XO(AnonymousClass00Y.A00());
                }
            }
        }
        return A01;
    }
}
