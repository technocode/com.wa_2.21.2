package X;

/* renamed from: X.0Bl  reason: invalid class name and case insensitive filesystem */
public class C02300Bl {
    public static volatile C02300Bl A02;
    public final C02310Bm A00;
    public final AnonymousClass00D A01;

    public C02300Bl(AnonymousClass00D r1, C02310Bm r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static C02300Bl A00() {
        if (A02 == null) {
            synchronized (C02300Bl.class) {
                if (A02 == null) {
                    AnonymousClass00D A002 = AnonymousClass00D.A00();
                    if (C02310Bm.A02 == null) {
                        synchronized (C02310Bm.class) {
                            if (C02310Bm.A02 == null) {
                                C02310Bm.A02 = new C02310Bm(AnonymousClass00G.A01, AnonymousClass03R.A00());
                            }
                        }
                    }
                    A02 = new C02300Bl(A002, C02310Bm.A02);
                }
            }
        }
        return A02;
    }
}
