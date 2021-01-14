package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Tf  reason: invalid class name and case insensitive filesystem */
public class C28181Tf {
    public final AbstractC02170Ax A00;
    public final AbstractC02170Ax A01;
    public final AbstractC02170Ax A02;

    public C28181Tf(AbstractC02170Ax r1, AbstractC02170Ax r2, AbstractC02170Ax r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public final void A00(AbstractC28161Td r3, C28131Ta r4) {
        if (r3 != null) {
            try {
                ((AnonymousClass02M) this.A00.get()).A02.post(new RunnableEBaseShape7S0200000_I1_2(r3, r4, 4));
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }
}
