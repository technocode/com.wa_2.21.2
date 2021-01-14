package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1aB  reason: invalid class name and case insensitive filesystem */
public final class C29781aB implements AnonymousClass1EY {
    public final AbstractC29771aA A00 = new AnonymousClass23Y(this);
    public final WeakReference A01;

    public C29781aB(C13910lD r2) {
        this.A01 = new WeakReference(r2);
    }

    @Override // X.AnonymousClass1EY
    public void A1o(Runnable runnable, Executor executor) {
        this.A00.A1o(runnable, executor);
    }

    public boolean cancel(boolean z) {
        C13910lD r3 = (C13910lD) this.A01.get();
        boolean cancel = this.A00.cancel(z);
        if (cancel && r3 != null) {
            r3.A02 = null;
            r3.A00 = null;
            r3.A01.A06(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.A00.value instanceof C13860l8;
    }

    public boolean isDone() {
        return this.A00.isDone();
    }

    public String toString() {
        return this.A00.toString();
    }
}
