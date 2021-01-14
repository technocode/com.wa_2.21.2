package X;

/* renamed from: X.36O  reason: invalid class name */
public class AnonymousClass36O {
    public static volatile AnonymousClass36O A02;
    public final AnonymousClass009 A00;
    public final AnonymousClass00Y A01;

    public AnonymousClass36O(AnonymousClass009 r1, AnonymousClass00Y r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass36O A00() {
        if (A02 == null) {
            synchronized (AnonymousClass36P.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass36O(AnonymousClass009.A00(), AnonymousClass00Y.A00());
                }
            }
        }
        return A02;
    }

    public void A01(int i, int i2, String str) {
        if (i2 >= 1) {
            C44241zj r2 = new C44241zj();
            r2.A00 = Integer.valueOf(i);
            r2.A05 = str;
            r2.A01 = Long.valueOf((long) i2);
            this.A01.A0B(r2, null, true);
        }
    }
}
