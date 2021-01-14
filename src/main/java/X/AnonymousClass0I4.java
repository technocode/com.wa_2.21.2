package X;

/* renamed from: X.0I4  reason: invalid class name */
public class AnonymousClass0I4 {
    public static volatile AnonymousClass0I4 A04;
    public final AnonymousClass02M A00;
    public final AnonymousClass0I5 A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass09H A03;

    public AnonymousClass0I4(AnonymousClass02M r1, AnonymousClass09H r2, AnonymousClass0I5 r3, AnonymousClass00D r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass0I4 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0I4.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0I4(AnonymousClass02M.A00(), AnonymousClass09H.A01(), AnonymousClass0I5.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A04;
    }
}
