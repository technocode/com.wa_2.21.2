package X;

import android.os.SystemClock;

/* renamed from: X.2aY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52082aY implements AbstractC27251Ot {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C59362nW A01;

    public /* synthetic */ C52082aY(C59362nW r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    @Override // X.AbstractC27251Ot
    public final void AIE(C27241Os r8, boolean z) {
        C59362nW r6 = this.A01;
        long elapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.A00);
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        AnonymousClass02M r4 = r6.A03;
        r4.A02.postDelayed(new RunnableEBaseShape7S0200000_I1_2(r6, r8, 26), elapsedRealtime);
    }
}
