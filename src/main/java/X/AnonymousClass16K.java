package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.16K  reason: invalid class name */
public final class AnonymousClass16K implements ThreadFactory {
    public static final AtomicInteger A00 = new AtomicInteger();

    public final Thread newThread(Runnable runnable) {
        return new AnonymousClass16L(runnable, AnonymousClass008.A08(23, "measurement-", A00.incrementAndGet()));
    }
}
