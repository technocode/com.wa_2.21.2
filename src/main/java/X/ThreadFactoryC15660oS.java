package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0oS  reason: invalid class name and case insensitive filesystem */
public final class ThreadFactoryC15660oS implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        StringBuilder A0S = AnonymousClass008.A0S("ModernAsyncTask #");
        A0S.append(this.A00.getAndIncrement());
        return new Thread(runnable, A0S.toString());
    }
}
