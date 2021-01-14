package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.07b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ThreadFactoryC012107b implements ThreadFactory {
    public static final ThreadFactory A00 = new ThreadFactoryC012107b();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
