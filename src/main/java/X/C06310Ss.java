package X;

/* renamed from: X.0Ss  reason: invalid class name and case insensitive filesystem */
public class C06310Ss {
    public static volatile C06310Ss A01;
    public final C014508d A00;

    public C06310Ss(C014508d r1) {
        this.A00 = r1;
    }

    public static C06310Ss A00() {
        if (A01 == null) {
            synchronized (C06310Ss.class) {
                if (A01 == null) {
                    A01 = new C06310Ss(C014508d.A00());
                }
            }
        }
        return A01;
    }
}
