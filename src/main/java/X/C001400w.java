package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.00w  reason: invalid class name and case insensitive filesystem */
public class C001400w {
    public static final C001400w A02 = new C001400w();
    public final ThreadPoolExecutor A00 = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass1UB(this));
    public volatile WeakReference A01;

    public void A00() {
        AnonymousClass00E.A08(A01(), "Not running on SignalExecutor thread");
    }

    public boolean A01() {
        WeakReference weakReference = this.A01;
        return weakReference != null && Thread.currentThread() == weakReference.get();
    }
}
