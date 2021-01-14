package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Jv  reason: invalid class name and case insensitive filesystem */
public class C04300Jv extends ThreadPoolExecutor {
    public C04300Jv(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        C002101e.A06.A01(this, runnable);
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        C002101e.A06.A03(this, thread, runnable);
    }

    public void execute(Runnable runnable) {
        C002101e.A06.A02(this, runnable);
        super.execute(runnable);
    }
}
