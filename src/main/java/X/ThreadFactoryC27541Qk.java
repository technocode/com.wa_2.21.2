package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Qk  reason: invalid class name and case insensitive filesystem */
public final class ThreadFactoryC27541Qk implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        RunnableEBaseShape7S0100000_I1_2 runnableEBaseShape7S0100000_I1_2 = new RunnableEBaseShape7S0100000_I1_2(runnable);
        StringBuilder A0S = AnonymousClass008.A0S("Google Drive Checksum Calculation Worker #");
        A0S.append(this.A00.getAndIncrement());
        return new Thread(runnableEBaseShape7S0100000_I1_2, A0S.toString());
    }
}
