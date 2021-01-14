package X;

/* renamed from: X.0FL  reason: invalid class name */
public class AnonymousClass0FL {
    public static volatile AnonymousClass0FL A04;
    public final AnonymousClass00S A00;
    public final C014408c A01;
    public final C015308l A02;
    public final C014508d A03;

    public AnonymousClass0FL(AnonymousClass00S r1, C015308l r2, C014408c r3, C014508d r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }

    public static AnonymousClass0FL A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0FL.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0FL(AnonymousClass00S.A00(), C015308l.A00(), C014408c.A00(), C014508d.A00());
                }
            }
        }
        return A04;
    }
}
