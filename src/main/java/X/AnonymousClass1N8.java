package X;

import java.util.TimerTask;

/* renamed from: X.1N8  reason: invalid class name */
public class AnonymousClass1N8 extends TimerTask {
    public final /* synthetic */ C40411tE A00;

    public AnonymousClass1N8(C40411tE r1) {
        this.A00 = r1;
    }

    public void run() {
        C40411tE r3 = this.A00;
        if (!r3.A04) {
            r3.A03 = true;
            C40411tE.A0O.remove(r3.A02.toString());
            if (!r3.A05) {
                AnonymousClass02M r2 = r3.A08;
                r2.A02.post(new RunnableEBaseShape6S0100000_I1_1(this, 20));
            }
            r3.A01(2);
            AnonymousClass1Xa r0 = r3.A0L;
            if (r0 != null) {
                r3.A0N.A0E(r0.A01, 500);
            }
        }
    }
}
