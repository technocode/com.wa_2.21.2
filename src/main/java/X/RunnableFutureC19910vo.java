package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0vo  reason: invalid class name and case insensitive filesystem */
public class RunnableFutureC19910vo implements RunnableFuture, ScheduledFuture {
    public final FutureTask A00;

    public RunnableFutureC19910vo(Runnable runnable, Object obj) {
        this.A00 = new FutureTask(runnable, obj);
    }

    public RunnableFutureC19910vo(Callable callable) {
        this.A00 = new FutureTask(callable);
    }

    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public boolean isDone() {
        return this.A00.isDone();
    }

    public void run() {
        this.A00.run();
    }
}
