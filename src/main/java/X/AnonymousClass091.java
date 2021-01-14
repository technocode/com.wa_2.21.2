package X;

/* renamed from: X.091  reason: invalid class name */
public class AnonymousClass091 {
    public static volatile AnonymousClass091 A02;
    public final C000300f A00;
    public final AnonymousClass092 A01;

    public AnonymousClass091(C000300f r1, AnonymousClass092 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass091 A00() {
        if (A02 == null) {
            synchronized (C015908r.class) {
                if (A02 == null) {
                    C000300f A002 = C000300f.A00();
                    if (AnonymousClass092.A04 == null) {
                        synchronized (AnonymousClass092.class) {
                            if (AnonymousClass092.A04 == null) {
                                AnonymousClass092.A04 = new AnonymousClass092(C015308l.A00(), C015708p.A00(), C014508d.A00());
                            }
                        }
                    }
                    A02 = new AnonymousClass091(A002, AnonymousClass092.A04);
                }
            }
        }
        return A02;
    }

    public boolean A01() {
        return this.A00.A0D(AbstractC000400g.A1P);
    }
}
