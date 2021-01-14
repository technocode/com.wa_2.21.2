package X;

/* renamed from: X.0FY  reason: invalid class name */
public class AnonymousClass0FY extends AbstractC003401r {
    public static volatile AnonymousClass0FY A04;
    public int A00;
    public int A01;
    public Runnable A02 = new RunnableEBaseShape4S0100000_I0_4(this, 8);
    public final AnonymousClass02M A03;

    public AnonymousClass0FY(AnonymousClass02M r3) {
        this.A03 = r3;
    }

    public static AnonymousClass0FY A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0C2.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0FY(AnonymousClass02M.A00());
                }
            }
        }
        return A04;
    }
}
