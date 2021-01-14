package X;

/* renamed from: X.1Od  reason: invalid class name and case insensitive filesystem */
public class RunnableC27121Od extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C27131Oe A00;

    public RunnableC27121Od(C27131Oe r1) {
        this.A00 = r1;
    }

    public void run() {
        C27131Oe r1 = this.A00;
        if (r1.A0g) {
            r1.A0m.postDelayed(this, 1000);
        } else if (r1.A0P()) {
            r1.A0T.A04(300, new RunnableEBaseShape6S0100000_I1_1(this, 41));
        }
    }
}
