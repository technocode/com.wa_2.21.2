package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0vn  reason: invalid class name and case insensitive filesystem */
public class ScheduledExecutorServiceC19900vn extends AbstractExecutorService implements ScheduledExecutorService {
    public final Handler A00;

    public void execute(Runnable runnable) {
        throw null;
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledExecutorServiceC19900vn(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC19910vo(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC19910vo(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableFutureC19910vo r2 = new RunnableFutureC19910vo(runnable, null);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableFutureC19910vo r2 = new RunnableFutureC19910vo(callable);
        handler.postDelayed(r2, timeUnit.toMillis(j));
        return r2;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (runnable != null) {
            RunnableFutureC19910vo r0 = new RunnableFutureC19910vo(runnable, null);
            execute(r0);
            return r0;
        }
        throw null;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        if (runnable != null) {
            RunnableFutureC19910vo r0 = new RunnableFutureC19910vo(runnable, obj);
            execute(r0);
            return r0;
        }
        throw null;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        if (callable != null) {
            RunnableFutureC19910vo r0 = new RunnableFutureC19910vo(callable);
            execute(r0);
            return r0;
        }
        throw null;
    }
}
