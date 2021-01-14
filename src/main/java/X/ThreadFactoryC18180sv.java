package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.0sv  reason: invalid class name and case insensitive filesystem */
public class ThreadFactoryC18180sv implements ThreadFactory {
    public int A00 = 0;

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        StringBuilder A0S = AnonymousClass008.A0S("WorkManager-WorkTimer-thread-");
        A0S.append(this.A00);
        newThread.setName(A0S.toString());
        this.A00++;
        return newThread;
    }
}
