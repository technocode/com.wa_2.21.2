package X;

/* renamed from: X.0Bi  reason: invalid class name and case insensitive filesystem */
public class C02270Bi extends AbstractC02280Bj {
    public C02270Bi() {
    }

    public C02270Bi(Object obj) {
        super(obj);
    }

    public void A08(Object obj) {
        boolean z;
        synchronized (this.A05) {
            z = false;
            if (this.A08 == AbstractC02280Bj.A09) {
                z = true;
            }
            this.A08 = obj;
        }
        if (z) {
            C06840Ux A00 = C06840Ux.A00();
            A00.A01.A01(this.A06);
        }
    }
}
