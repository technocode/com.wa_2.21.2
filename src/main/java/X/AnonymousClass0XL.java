package X;

/* renamed from: X.0XL  reason: invalid class name */
public class AnonymousClass0XL {
    public static volatile AnonymousClass0XL A01;
    public AnonymousClass00T A00;

    public AnonymousClass0XL(AnonymousClass00T r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0XL A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0XL.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0XL(C002101e.A00());
                }
            }
        }
        return A01;
    }

    public void A01(AnonymousClass0Yj r2, AbstractC02280Bj r3, AnonymousClass0RN r4) {
        r2.A09(r3, new C08700bZ(this, r4, r2));
    }
}
