package X;

/* renamed from: X.0Am  reason: invalid class name and case insensitive filesystem */
public class C02060Am extends AbstractC01990Af {
    public static volatile C02060Am A00;

    public C02060Am(C02010Ah r2, C02020Ai r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = false;
    }

    public static C02060Am A00() {
        if (A00 == null) {
            synchronized (C02060Am.class) {
                if (A00 == null) {
                    A00 = new C02060Am(C02010Ah.A00(), C02020Ai.A00());
                }
            }
        }
        return A00;
    }
}
