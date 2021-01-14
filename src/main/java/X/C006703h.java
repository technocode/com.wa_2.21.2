package X;

/* renamed from: X.03h  reason: invalid class name and case insensitive filesystem */
public class C006703h {
    public static C006703h A00;

    public static synchronized C006703h A00() {
        C006703h r0;
        synchronized (C006703h.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new C006703h();
                A00 = r0;
            }
        }
        return r0;
    }
}
