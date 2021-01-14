package X;

/* renamed from: X.1Vd  reason: invalid class name and case insensitive filesystem */
public class C28631Vd {
    public static volatile C28631Vd A02;
    public final C000300f A00;
    public volatile boolean A01 = true;

    public C28631Vd(C000300f r2) {
        this.A00 = r2;
    }

    public static C28631Vd A00() {
        if (A02 == null) {
            synchronized (C28631Vd.class) {
                if (A02 == null) {
                    A02 = new C28631Vd(C000300f.A00());
                }
            }
        }
        return A02;
    }

    public boolean A01() {
        return this.A00.A0D(AbstractC000400g.A2R);
    }
}
