package X;

import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1Ql  reason: invalid class name and case insensitive filesystem */
public final class RejectedExecutionHandlerC27551Ql implements RejectedExecutionHandler {
    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            Log.e(e);
        }
    }
}
