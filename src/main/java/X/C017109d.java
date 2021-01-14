package X;

/* renamed from: X.09d  reason: invalid class name and case insensitive filesystem */
public class C017109d {
    public static volatile C017109d A01;
    public final C000300f A00;

    public C017109d(C000300f r1) {
        this.A00 = r1;
    }

    public static C017109d A00() {
        if (A01 == null) {
            synchronized (C017109d.class) {
                if (A01 == null) {
                    C002701k.A00();
                    A01 = new C017109d(C000300f.A00());
                }
            }
        }
        return A01;
    }

    public int A01() {
        return this.A00.A06(AbstractC000400g.A2v) & 124;
    }
}
