package X;

/* renamed from: X.0Yj  reason: invalid class name */
public class AnonymousClass0Yj extends C02270Bi {
    public C014107y A00 = new C014107y();

    public void A09(AbstractC02280Bj r3, AnonymousClass0SG r4) {
        C08710ba r1 = new C08710ba(r3, r4);
        C08710ba r0 = (C08710ba) this.A00.A02(r3, r1);
        if (r0 != null) {
            if (r0.A02 != r4) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
        } else if (super.A00 > 0) {
            r1.A00();
        }
    }
}
