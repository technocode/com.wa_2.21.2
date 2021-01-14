package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.1ez  reason: invalid class name and case insensitive filesystem */
public class ExecutorServiceC32461ez extends C19890vm implements ExecutorService {
    public ExecutorServiceC32461ez(Executor executor) {
        super(executor, new LinkedBlockingQueue());
    }

    @Override // X.C19890vm
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
