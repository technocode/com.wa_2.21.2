package X;

import android.text.TextUtils;

/* renamed from: X.0rw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17660rw {
    public AbstractC17640rt A00() {
        C31101cY r6 = (C31101cY) this;
        if (!r6.A01) {
            RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = new RunnableEBaseShape5S0200000_I1_0(r6);
            ((C31581dS) r6.A03.A06).A01.execute(runnableEBaseShape5S0200000_I1_0);
            r6.A00 = (C31081cW) runnableEBaseShape5S0200000_I1_0.A00;
        } else {
            AbstractC17610rq.A00().A05(C31101cY.A09, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", r6.A06)), new Throwable[0]);
        }
        return r6.A00;
    }
}
