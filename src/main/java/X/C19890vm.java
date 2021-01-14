package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vm  reason: invalid class name and case insensitive filesystem */
public class C19890vm extends AbstractExecutorService {
    public final RunnableEBaseShape5S0100000_I1_0 A00;
    public final String A01 = "SerialExecutor";
    public final BlockingQueue A02;
    public final Executor A03;
    public final AtomicInteger A04;
    public final AtomicInteger A05;
    public volatile int A06;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public C19890vm(Executor executor, BlockingQueue blockingQueue) {
        this.A03 = executor;
        this.A06 = 1;
        this.A02 = blockingQueue;
        this.A00 = new RunnableEBaseShape5S0100000_I1_0(this);
        this.A05 = new AtomicInteger(0);
        this.A04 = new AtomicInteger(0);
    }

    public final void A00() {
        AtomicInteger atomicInteger = this.A05;
        for (int i = atomicInteger.get(); i < this.A06; i = atomicInteger.get()) {
            if (atomicInteger.compareAndSet(i, i + 1)) {
                this.A03.execute(this.A00);
                return;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.A02;
            if (blockingQueue.offer(runnable)) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.A04;
                int i = atomicInteger.get();
                if (size > i) {
                    atomicInteger.compareAndSet(i, size);
                }
                A00();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.A01);
            sb.append(" queue is full, size=");
            sb.append(blockingQueue.size());
            throw new RejectedExecutionException(sb.toString());
        }
        throw new NullPointerException("runnable parameter is null");
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
