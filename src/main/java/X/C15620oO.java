package X;

import android.os.Handler;

/* renamed from: X.0oO  reason: invalid class name and case insensitive filesystem */
public class C15620oO {
    public RunnableEBaseShape1S0210000_I1 A00;
    public final Handler A01 = new Handler();
    public final C013807v A02;

    public C15620oO(AbstractC005102k r2) {
        this.A02 = new C013807v(r2);
    }

    public final void A00(AnonymousClass082 r3) {
        RunnableEBaseShape1S0210000_I1 runnableEBaseShape1S0210000_I1 = this.A00;
        if (runnableEBaseShape1S0210000_I1 != null) {
            runnableEBaseShape1S0210000_I1.run();
        }
        RunnableEBaseShape1S0210000_I1 runnableEBaseShape1S0210000_I12 = new RunnableEBaseShape1S0210000_I1(this.A02, r3);
        this.A00 = runnableEBaseShape1S0210000_I12;
        this.A01.postAtFrontOfQueue(runnableEBaseShape1S0210000_I12);
    }
}
