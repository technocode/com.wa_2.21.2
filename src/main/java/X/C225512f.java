package X;

import android.os.Handler;

/* renamed from: X.12f  reason: invalid class name and case insensitive filesystem */
public final class C225512f {
    public final Handler A00;
    public final AbstractC225612g A01;

    public C225512f(Handler handler, AbstractC225612g r3) {
        if (r3 == null) {
            handler = null;
        } else if (handler == null) {
            throw null;
        }
        this.A00 = handler;
        this.A01 = r3;
    }

    public void A00(C227412z r4) {
        if (this.A01 != null) {
            this.A00.post(new RunnableEBaseShape5S0200000_I1_0(this, r4, 29));
        }
    }
}
