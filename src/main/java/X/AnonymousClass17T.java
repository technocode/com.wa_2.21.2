package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.17T  reason: invalid class name */
public abstract class AnonymousClass17T extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C34811jG A00;

    public abstract void A00();

    public AnonymousClass17T(C34811jG r1) {
        this.A00 = r1;
    }

    public void run() {
        C34811jG r1 = this.A00;
        Lock lock = r1.A0K;
        lock.lock();
        try {
            if (!Thread.interrupted()) {
                A00();
                lock.unlock();
            }
        } catch (RuntimeException e) {
            HandlerC34951jU r12 = r1.A0G.A06;
            r12.sendMessage(r12.obtainMessage(2, e));
        } finally {
            lock.unlock();
        }
    }
}
