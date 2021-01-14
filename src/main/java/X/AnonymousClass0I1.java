package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.0I1  reason: invalid class name */
public class AnonymousClass0I1 implements Future {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final CountDownLatch A03 = new CountDownLatch(1);

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public void A00(Exception exc) {
        this.A01 = null;
        this.A02 = false;
        this.A00 = exc;
        this.A03.countDown();
    }

    public void A01(Object obj) {
        this.A01 = obj;
        this.A02 = true;
        this.A03.countDown();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        this.A03.await();
        if (this.A02) {
            return this.A01;
        }
        throw new ExecutionException(this.A00);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        if (!this.A03.await(j, timeUnit)) {
            throw new TimeoutException();
        } else if (this.A02) {
            return this.A01;
        } else {
            throw new ExecutionException(this.A00);
        }
    }

    public boolean isDone() {
        return this.A03.getCount() == 0;
    }
}
