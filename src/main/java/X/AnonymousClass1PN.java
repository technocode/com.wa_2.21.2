package X;

/* renamed from: X.1PN  reason: invalid class name */
public class AnonymousClass1PN {
    public static volatile AnonymousClass1PN A01;
    public final AnonymousClass00G A00;

    public AnonymousClass1PN(AnonymousClass00G r1) {
        this.A00 = r1;
    }

    public static AnonymousClass1PN A00() {
        if (A01 == null) {
            synchronized (AnonymousClass1PN.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass1PN(AnonymousClass00G.A01);
                }
            }
        }
        return A01;
    }

    public String A01(int i) {
        return this.A00.A00.getResources().getString(i);
    }
}
