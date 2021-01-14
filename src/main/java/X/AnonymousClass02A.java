package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.02A  reason: invalid class name */
public final class AnonymousClass02A extends ThreadPoolExecutor {
    public AnonymousClass02A(TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(5, 128, 1, timeUnit, blockingQueue, threadFactory);
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        C002101e.A06.A01(this, runnable);
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        C002101e.A06.A03(this, thread, runnable);
    }
}
