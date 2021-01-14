package X;

/* renamed from: X.08f  reason: invalid class name and case insensitive filesystem */
public class C014708f {
    public static volatile C014708f A01;
    public final AnonymousClass00D A00;

    public C014708f(AnonymousClass00D r1) {
        this.A00 = r1;
    }

    public static C014708f A00() {
        if (A01 == null) {
            synchronized (C014708f.class) {
                if (A01 == null) {
                    A01 = new C014708f(AnonymousClass00D.A00());
                }
            }
        }
        return A01;
    }

    public int A01() {
        int i = this.A00.A00.getInt("registration_state", 0);
        AnonymousClass008.A0t("registrationmanager/getregstate ", i);
        return i;
    }

    public boolean A02() {
        return A01() == 3;
    }
}
