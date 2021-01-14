package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0ym  reason: invalid class name and case insensitive filesystem */
public class C21460ym {
    public int A00 = 0;
    public final ReentrantLock A01 = new ReentrantLock();

    public boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                boolean z = true;
                boolean z2 = false;
                if ((this.A00 & 2) == 2) {
                    z2 = true;
                }
                if (!z2) {
                    reentrantLock.lock();
                    try {
                        boolean z3 = false;
                        if ((this.A00 & 4) == 4) {
                            z3 = true;
                        }
                        if (!z3) {
                            z = false;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                reentrantLock.unlock();
                return z;
            } finally {
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean A01() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            boolean z = false;
            if (this.A00 == 0) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }
}
