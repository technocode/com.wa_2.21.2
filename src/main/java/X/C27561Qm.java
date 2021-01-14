package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Qm  reason: invalid class name and case insensitive filesystem */
public final class C27561Qm {
    public static final BlockingQueue A00 = new LinkedBlockingQueue(4);
    public static final ThreadFactory A01;
    public static final ThreadPoolExecutor A02;

    static {
        ThreadFactoryC27541Qk r8 = new ThreadFactoryC27541Qk();
        A01 = r8;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 1, TimeUnit.SECONDS, A00, r8);
        A02 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC27551Ql());
    }
}
