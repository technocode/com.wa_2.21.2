package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0zU  reason: invalid class name and case insensitive filesystem */
public class C21880zU {
    public long A00 = 5000;
    public AbstractC21870zT A01;
    public Condition A02;
    public final ReentrantLock A03 = new ReentrantLock();

    public void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.await(this.A00, TimeUnit.MILLISECONDS);
            }
            if (this.A02 != null) {
                this.A02 = null;
                AbstractC21870zT r0 = this.A01;
                if (r0 != null) {
                    r0.AL0();
                }
            }
            reentrantLock.unlock();
        } catch (InterruptedException e) {
            throw new C21620z2("Operation blocker interrupted. ", e);
        } catch (Throwable th) {
            if (this.A02 != null) {
                this.A02 = null;
                AbstractC21870zT r02 = this.A01;
                if (r02 != null) {
                    r02.AL0();
                }
            }
            reentrantLock.unlock();
            throw th;
        }
    }

    public void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j <= 0) {
                j = 5000;
            }
            this.A00 = j;
            reentrantLock.unlock();
            return;
        }
        throw new IllegalStateException("There is already a block condition being used.");
    }
}
