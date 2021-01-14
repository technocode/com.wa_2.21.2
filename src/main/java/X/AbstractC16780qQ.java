package X;

import android.os.Looper;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0qQ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16780qQ {
    public AbstractC17030qr A00;
    public List A01;
    public Executor A02;
    public boolean A03;
    public boolean A04;
    public final C16720qI A05;
    public final ThreadLocal A06 = new ThreadLocal();
    public final ReentrantReadWriteLock A07 = new ReentrantReadWriteLock();
    public volatile AbstractC16990qn A08;

    public AbstractC16780qQ() {
        new ConcurrentHashMap();
        this.A05 = new C16720qI(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public void A00() {
        if (!this.A03 && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void A01() {
        if (!((C30761bu) this.A00.A9w()).A00.inTransaction() && this.A06.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void A02() {
        A00();
        AbstractC16990qn A9w = this.A00.A9w();
        this.A05.A02(A9w);
        ((C30761bu) A9w).A00.beginTransaction();
    }

    public void A03() {
        ((C30761bu) this.A00.A9w()).A00.endTransaction();
        if (!((C30761bu) this.A00.A9w()).A00.inTransaction()) {
            C16720qI r3 = this.A05;
            if (r3.A03.compareAndSet(false, true)) {
                r3.A05.A02.execute(r3.A01);
            }
        }
    }

    public void A04() {
        ((C30761bu) this.A00.A9w()).A00.setTransactionSuccessful();
    }
}
