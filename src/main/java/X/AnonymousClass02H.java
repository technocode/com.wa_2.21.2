package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.02H  reason: invalid class name */
public class AnonymousClass02H implements Executor {
    public Runnable A00;
    public final AnonymousClass00T A01;
    public final Object A02 = new Object();
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;
    public volatile long A05;

    public AnonymousClass02H(AnonymousClass00T r2, boolean z) {
        this.A01 = r2;
        this.A04 = z;
    }

    public void A00() {
        boolean z = false;
        if (this.A05 == Thread.currentThread().getId()) {
            z = true;
        }
        AnonymousClass00E.A08(z, "Not running on this SerialExecutor");
    }

    public final synchronized void A01() {
        Runnable runnable = (Runnable) this.A03.poll();
        this.A00 = runnable;
        if (runnable != null) {
            if (this.A04) {
                this.A01.ANJ(runnable);
            } else {
                this.A01.ANF(runnable);
            }
        }
    }

    public synchronized void A02(Runnable runnable, long j) {
        this.A01.ANO(new RunnableEBaseShape4S0200000_I0_3(this, runnable, 13), j);
    }

    public synchronized void execute(Runnable runnable) {
        this.A03.offer(new RunnableEBaseShape4S0200000_I0_3(this, runnable, 14));
        if (this.A00 == null) {
            A01();
        }
    }
}
