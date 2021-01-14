package X;

import java.util.concurrent.Callable;

/* renamed from: X.039  reason: invalid class name */
public class AnonymousClass039 {
    public int A00 = 1;

    public void A00() {
        if (A03()) {
            synchronized (this) {
                while (this.A00 <= 3) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public synchronized void A01() {
        this.A00 = 5;
        notifyAll();
    }

    public void A02(Callable callable) {
        synchronized (this) {
            if (this.A00 == 1) {
                try {
                    callable.call();
                } catch (Exception e) {
                    if (e instanceof RuntimeException) {
                        throw ((RuntimeException) e);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception occurred with while executing operation with message: ");
                    sb.append(e.getMessage());
                    throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    public synchronized boolean A03() {
        boolean z;
        z = false;
        if (this.A00 > 3) {
            z = true;
        }
        return !z;
    }
}
