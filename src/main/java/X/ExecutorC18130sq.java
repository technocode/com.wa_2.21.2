package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0sq  reason: invalid class name and case insensitive filesystem */
public class ExecutorC18130sq implements Executor {
    public final Object A00 = new Object();
    public final ArrayDeque A01 = new ArrayDeque();
    public final Executor A02;
    public volatile Runnable A03;

    public ExecutorC18130sq(Executor executor) {
        this.A02 = executor;
    }

    public void A00() {
        synchronized (this.A00) {
            Runnable runnable = (Runnable) this.A01.poll();
            this.A03 = runnable;
            if (runnable != null) {
                this.A02.execute(this.A03);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.A00) {
            this.A01.add(new RunnableEBaseShape5S0200000_I1_0(runnable, this, 19));
            if (this.A03 == null) {
                A00();
            }
        }
    }
}
