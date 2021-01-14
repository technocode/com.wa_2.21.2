package X;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0PI  reason: invalid class name */
public class AnonymousClass0PI {
    public boolean A00;
    public final AnonymousClass03T A01;
    public final AnonymousClass00T A02;
    public final Lock A03 = new ReentrantLock();

    public AnonymousClass0PI(AnonymousClass03T r2, AnonymousClass00T r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00() {
        Lock lock = this.A03;
        lock.lock();
        if (!this.A00) {
            lock.unlock();
            this.A02.ANF(new RunnableEBaseShape4S0100000_I0_4(this, 33));
            return;
        }
        lock.unlock();
    }
}
