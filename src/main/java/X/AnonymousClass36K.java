package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.36K  reason: invalid class name */
public class AnonymousClass36K {
    public Object A00;
    public final Condition A01;
    public final ReentrantLock A02;

    public AnonymousClass36K() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.A02 = reentrantLock;
        this.A01 = reentrantLock.newCondition();
    }

    public boolean A00(Object obj) {
        boolean z;
        if (obj != null) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (this.A00 != null) {
                    z = false;
                } else {
                    this.A00 = obj;
                    this.A01.signal();
                    z = true;
                }
                return z;
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw null;
        }
    }
}
