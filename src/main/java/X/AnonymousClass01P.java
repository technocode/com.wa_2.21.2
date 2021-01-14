package X;

/* renamed from: X.01P  reason: invalid class name */
public class AnonymousClass01P extends AbstractC28441Ui {
    public static volatile AnonymousClass01P A00;

    public AnonymousClass01P(AnonymousClass00Y r1, C000300f r2, AnonymousClass01A r3, C001400w r4, C001000o r5, AnonymousClass01B r6) {
        super(r1, r2, r3, r4, r5, r6);
    }

    public static AnonymousClass01P A00() {
        if (A00 == null) {
            synchronized (AnonymousClass01P.class) {
                if (A00 == null) {
                    AnonymousClass01I.A00();
                    AnonymousClass00Y A002 = AnonymousClass00Y.A00();
                    C000300f A003 = C000300f.A00();
                    AnonymousClass01A A004 = AnonymousClass01A.A00();
                    C001400w r6 = C001400w.A02;
                    AnonymousClass01X.A00();
                    C001000o A005 = C001000o.A00();
                    AnonymousClass00D.A00();
                    A00 = new AnonymousClass01P(A002, A003, A004, r6, A005, AnonymousClass01B.A00());
                }
            }
        }
        return A00;
    }
}
