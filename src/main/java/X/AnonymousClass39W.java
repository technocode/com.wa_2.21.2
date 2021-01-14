package X;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.39W  reason: invalid class name */
public class AnonymousClass39W extends ScheduledThreadPoolExecutor {
    public AnonymousClass39W(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (runnable instanceof Future) {
            Future future = (Future) runnable;
            if (future.isDone()) {
                try {
                    future.get();
                } catch (InterruptedException unused) {
                } catch (ExecutionException e) {
                    th = e.getCause();
                }
            }
        }
        if (th != null) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
    }
}
