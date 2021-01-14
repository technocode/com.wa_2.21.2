package X;

/* renamed from: X.0Ae  reason: invalid class name and case insensitive filesystem */
public class C01980Ae extends AbstractC01990Af {
    public static volatile C01980Ae A00;

    public C01980Ae(C02010Ah r2, C02020Ai r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = true;
    }

    public static C01980Ae A00() {
        if (A00 == null) {
            synchronized (C01980Ae.class) {
                if (A00 == null) {
                    A00 = new C01980Ae(C02010Ah.A00(), C02020Ai.A00());
                }
            }
        }
        return A00;
    }
}
