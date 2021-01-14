package X;

/* renamed from: X.1fp  reason: invalid class name and case insensitive filesystem */
public class C32921fp implements AbstractC20800xJ {
    public static C32921fp A00;

    public static synchronized C32921fp A00() {
        C32921fp r0;
        synchronized (C32921fp.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = new C32921fp();
                A00 = r0;
            }
        }
        return r0;
    }
}
