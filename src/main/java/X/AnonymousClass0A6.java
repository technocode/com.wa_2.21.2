package X;

/* renamed from: X.0A6  reason: invalid class name */
public class AnonymousClass0A6 {
    public static volatile AnonymousClass0A6 A02;
    public final AnonymousClass01I A00;
    public final AnonymousClass00S A01;

    public AnonymousClass0A6(AnonymousClass00S r1, AnonymousClass01I r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static AnonymousClass0A6 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0A6.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0A6(AnonymousClass00S.A00(), AnonymousClass01I.A00());
                }
            }
        }
        return A02;
    }
}
