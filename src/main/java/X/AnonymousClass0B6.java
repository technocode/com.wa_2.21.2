package X;

/* renamed from: X.0B6  reason: invalid class name */
public class AnonymousClass0B6 {
    public static volatile AnonymousClass0B6 A02;
    public final AnonymousClass0B7 A00;
    public final AnonymousClass0B9 A01;

    public AnonymousClass0B6(AnonymousClass0B7 r1, AnonymousClass0B9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass0B6 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0B6.class) {
                if (A02 == null) {
                    AnonymousClass0B7 A002 = AnonymousClass0B7.A00();
                    if (AnonymousClass0B9.A00 == null) {
                        synchronized (AnonymousClass0B9.class) {
                            if (AnonymousClass0B9.A00 == null) {
                                AnonymousClass0B9.A00 = new AnonymousClass0B9();
                            }
                        }
                    }
                    A02 = new AnonymousClass0B6(A002, AnonymousClass0B9.A00);
                }
            }
        }
        return A02;
    }
}
