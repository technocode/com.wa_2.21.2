package X;

import java.util.concurrent.Executor;

/* renamed from: X.1Xz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ExecutorC29321Xz implements Executor {
    public static final /* synthetic */ ExecutorC29321Xz A00 = new ExecutorC29321Xz();

    public final void execute(Runnable runnable) {
        new Thread(runnable, "AnomalyExecutorThread").start();
    }
}
