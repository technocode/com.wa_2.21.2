package X;

/* renamed from: X.2Pi  reason: invalid class name and case insensitive filesystem */
public class C49182Pi {
    public static volatile C49182Pi A03;
    public final AnonymousClass02M A00;
    public final C49172Ph A01;
    public final AnonymousClass0Gd A02;

    public C49182Pi(AnonymousClass02M r3, C03440Gg r4, AnonymousClass0Gd r5) {
        C49172Ph r1;
        this.A00 = r3;
        this.A02 = r5;
        synchronized (r4) {
            r1 = r4.A01;
            if (r1 == null) {
                r1 = new C49172Ph(r4.A01());
                r4.A01 = r1;
            }
        }
        this.A01 = r1;
    }

    public static C49182Pi A00() {
        if (A03 == null) {
            synchronized (C49182Pi.class) {
                if (A03 == null) {
                    AnonymousClass02M A002 = AnonymousClass02M.A00();
                    C002101e.A00();
                    A03 = new C49182Pi(A002, C03440Gg.A00(), AnonymousClass0Gd.A00);
                }
            }
        }
        return A03;
    }
}
