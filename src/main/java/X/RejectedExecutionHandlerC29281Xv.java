package X;

import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.1Xv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RejectedExecutionHandlerC29281Xv implements RejectedExecutionHandler {
    public static final /* synthetic */ RejectedExecutionHandlerC29281Xv A00 = new RejectedExecutionHandlerC29281Xv();

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            Log.e(e);
        }
    }
}
