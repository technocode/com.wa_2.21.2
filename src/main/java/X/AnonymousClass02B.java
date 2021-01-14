package X;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.02B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass02B implements RejectedExecutionHandler {
    public static final /* synthetic */ AnonymousClass02B A00 = new AnonymousClass02B();

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
