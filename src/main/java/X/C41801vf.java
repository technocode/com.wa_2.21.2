package X;

import android.util.Pair;

/* renamed from: X.1vf  reason: invalid class name and case insensitive filesystem */
public class C41801vf implements AbstractC64262xt {
    public final /* synthetic */ C27701Rb A00;

    public C41801vf(C27701Rb r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC64262xt
    public void AFZ(Pair pair) {
        if (405 == ((Number) pair.first).intValue()) {
            C02270Bi r1 = this.A00.A03;
            if (r1 != null) {
                r1.A08(Boolean.TRUE);
                return;
            }
            return;
        }
        C02270Bi r12 = this.A00.A06;
        if (r12 != null) {
            r12.A08(Boolean.TRUE);
        }
    }

    @Override // X.AbstractC64262xt
    public void AKi(Object obj) {
        this.A00.A0H.ANF(new RunnableEBaseShape6S0200000_I1_1(this, obj, 32));
    }
}
