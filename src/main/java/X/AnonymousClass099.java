package X;

/* renamed from: X.099  reason: invalid class name */
public class AnonymousClass099 {
    public static volatile AnonymousClass099 A04;
    public final AnonymousClass09A A00;
    public final C014408c A01;
    public final C006903j A02;
    public final AnonymousClass094 A03;

    public AnonymousClass099(C014408c r1, C006903j r2, AnonymousClass09A r3, AnonymousClass094 r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }

    public boolean A00(AnonymousClass02N r5, int i) {
        C08560bL A05 = this.A02.A05(r5);
        if (A05 == null || A05.A02 == i) {
            return false;
        }
        A05.A02 = i;
        this.A00.A01(new RunnableEBaseShape2S0200000_I0_1(this, A05, 40), 34);
        return true;
    }
}
