package X;

/* renamed from: X.00r  reason: invalid class name and case insensitive filesystem */
public class C001200r {
    public static volatile C001200r A00;

    public static C001200r A00() {
        if (A00 == null) {
            synchronized (C001200r.class) {
                if (A00 == null) {
                    A00 = new C001200r();
                }
            }
        }
        return A00;
    }
}
