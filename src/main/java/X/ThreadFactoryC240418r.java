package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.18r  reason: invalid class name and case insensitive filesystem */
public class ThreadFactoryC240418r implements ThreadFactory {
    public final String A00;
    public final ThreadFactory A01 = Executors.defaultThreadFactory();

    public ThreadFactoryC240418r(String str) {
        C001801b.A1R(str, "Name must not be null");
        this.A00 = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.A01.newThread(new RunnableEBaseShape1S0101000_I1(runnable, 0, 3));
        newThread.setName(this.A00);
        return newThread;
    }
}
