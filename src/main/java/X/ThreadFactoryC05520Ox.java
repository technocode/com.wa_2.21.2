package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Ox  reason: invalid class name and case insensitive filesystem */
public final class ThreadFactoryC05520Ox implements ThreadFactory {
    public final String A00;
    public final AtomicInteger A01 = new AtomicInteger(0);

    public ThreadFactoryC05520Ox(String str) {
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        RunnableEBaseShape4S0100000_I0_4 runnableEBaseShape4S0100000_I0_4 = new RunnableEBaseShape4S0100000_I0_4(runnable, 31);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(this.A01.getAndIncrement());
        return new Thread(runnableEBaseShape4S0100000_I0_4, sb.toString());
    }
}
