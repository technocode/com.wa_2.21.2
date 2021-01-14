package X;

/* renamed from: X.01J  reason: invalid class name */
public class AnonymousClass01J {
    public static volatile AnonymousClass01J A03;
    public AnonymousClass0EB A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass00G A02;

    public AnonymousClass01J(AnonymousClass00G r1, AnonymousClass009 r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass01J A00() {
        if (A03 == null) {
            synchronized (AnonymousClass01J.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass01J(AnonymousClass00G.A01, AnonymousClass009.A00());
                }
            }
        }
        return A03;
    }
}
