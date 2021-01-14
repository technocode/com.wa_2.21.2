package X;

/* renamed from: X.0Kn  reason: invalid class name and case insensitive filesystem */
public class C04480Kn {
    public static volatile C04480Kn A02;
    public final AnonymousClass09A A00;
    public final C014508d A01;

    public C04480Kn(AnonymousClass09A r1, C014508d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C04480Kn A00() {
        if (A02 == null) {
            synchronized (C04480Kn.class) {
                if (A02 == null) {
                    A02 = new C04480Kn(AnonymousClass09A.A02, C014508d.A00());
                }
            }
        }
        return A02;
    }
}
