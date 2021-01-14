package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.1UB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1UB implements ThreadFactory {
    public final /* synthetic */ C001400w A00;

    public /* synthetic */ AnonymousClass1UB(C001400w r1) {
        this.A00 = r1;
    }

    public final Thread newThread(Runnable runnable) {
        C001400w r3 = this.A00;
        Thread thread = new Thread(new RunnableEBaseShape2S0100000_I0_2(runnable, 40), "SignalExecutor");
        r3.A01 = new WeakReference(thread);
        return thread;
    }
}
