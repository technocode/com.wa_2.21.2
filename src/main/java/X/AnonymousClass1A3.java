package X;

import android.os.Handler;

/* renamed from: X.1A3  reason: invalid class name */
public abstract class AnonymousClass1A3 {
    public static volatile Handler A03;
    public final C242819u A00;
    public final Runnable A01 = new RunnableEBaseShape5S0100000_I1_0(this, 49);
    public volatile long A02;

    public AnonymousClass1A3(C242819u r3) {
        C001801b.A1Q(r3);
        this.A00 = r3;
    }

    public final Handler A00() {
        Handler handler;
        if (A03 != null) {
            return A03;
        }
        synchronized (AnonymousClass1A3.class) {
            if (A03 == null) {
                A03 = new AnonymousClass1AL(this.A00.A00.getMainLooper());
            }
            handler = A03;
        }
        return handler;
    }

    public final void A01(long j) {
        this.A02 = 0;
        Handler A002 = A00();
        Runnable runnable = this.A01;
        A002.removeCallbacks(runnable);
        if (j >= 0) {
            C242819u r2 = this.A00;
            if (r2.A03 != null) {
                this.A02 = System.currentTimeMillis();
                if (!A00().postDelayed(runnable, j)) {
                    AnonymousClass26U r22 = r2.A07;
                    C242819u.A01(r22);
                    r22.A09("Failed to schedule delayed post. time", Long.valueOf(j));
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
