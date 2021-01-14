package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.16J  reason: invalid class name */
public final class AnonymousClass16J extends ThreadPoolExecutor {
    public final /* synthetic */ AnonymousClass16M A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass16J(AnonymousClass16M r9) {
        super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.A00 = r9;
        setThreadFactory(new AnonymousClass16K());
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new AnonymousClass16N(this, runnable, obj);
    }
}
