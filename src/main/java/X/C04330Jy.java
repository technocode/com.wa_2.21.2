package X;

/* renamed from: X.0Jy  reason: invalid class name and case insensitive filesystem */
public class C04330Jy {
    public static volatile C04330Jy A02;
    public final C015308l A00;
    public final C014508d A01;

    public C04330Jy(C015308l r1, C014508d r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static C04330Jy A00() {
        if (A02 == null) {
            synchronized (C04330Jy.class) {
                if (A02 == null) {
                    A02 = new C04330Jy(C015308l.A00(), C014508d.A00());
                }
            }
        }
        return A02;
    }
}
