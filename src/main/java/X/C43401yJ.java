package X;

/* renamed from: X.1yJ  reason: invalid class name and case insensitive filesystem */
public class C43401yJ extends AbstractC003401r {
    public static volatile C43401yJ A00;

    public static C43401yJ A00() {
        if (A00 == null) {
            synchronized (C43401yJ.class) {
                if (A00 == null) {
                    A00 = new C43401yJ();
                }
            }
        }
        return A00;
    }
}
