package X;

/* renamed from: X.1Ss  reason: invalid class name and case insensitive filesystem */
public class C28061Ss {
    public static volatile C28061Ss A02;
    public final AnonymousClass00G A00;
    public final AnonymousClass00T A01;

    public C28061Ss(AnonymousClass00G r1, AnonymousClass00T r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C28061Ss A00() {
        if (A02 == null) {
            synchronized (C28061Ss.class) {
                if (A02 == null) {
                    A02 = new C28061Ss(AnonymousClass00G.A01, C002101e.A00());
                }
            }
        }
        return A02;
    }
}
