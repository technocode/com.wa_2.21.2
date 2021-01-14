package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0V1  reason: invalid class name */
public class AnonymousClass0V1 implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.A00.getAndIncrement())));
        return thread;
    }
}
