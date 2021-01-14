package X;

/* renamed from: X.0Jm  reason: invalid class name and case insensitive filesystem */
public class C04210Jm {
    public static volatile C04210Jm A04;
    public final AnonymousClass00C A00;
    public final AnonymousClass00T A01;
    public volatile AnonymousClass0PI A02;
    public volatile AnonymousClass0PI A03;

    public C04210Jm(AnonymousClass00T r1, AnonymousClass00C r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static C04210Jm A00() {
        if (A04 == null) {
            synchronized (C04210Jm.class) {
                if (A04 == null) {
                    A04 = new C04210Jm(C002101e.A00(), AnonymousClass00C.A00());
                }
            }
        }
        return A04;
    }
}
