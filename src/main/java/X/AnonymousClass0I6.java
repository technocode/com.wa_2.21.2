package X;

/* renamed from: X.0I6  reason: invalid class name */
public class AnonymousClass0I6 {
    public static volatile AnonymousClass0I6 A01;
    public C014508d A00;

    public AnonymousClass0I6(C014508d r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0I6 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0I6.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0I6(C014508d.A00());
                }
            }
        }
        return A01;
    }

    public Long A01() {
        C014508d r0 = this.A00;
        r0.A05();
        if (r0.A08.exists()) {
            return Long.valueOf(this.A00.A02());
        }
        return null;
    }
}
