package X;

import android.app.Application;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0KO  reason: invalid class name */
public class AnonymousClass0KO implements Runnable, Future {
    public final AnonymousClass00G A00;
    public final /* synthetic */ AnonymousClass0JC A01;

    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public AnonymousClass0KO(AnonymousClass0JC r1, AnonymousClass00G r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // java.util.concurrent.Future
    public /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        AnonymousClass0JC r1 = this.A01;
        if (r1.A02.await(j, timeUnit)) {
            return r1.A03.get();
        }
        throw new TimeoutException();
    }

    public boolean isDone() {
        return this.A01.A02.getCount() == 0;
    }

    public void run() {
        Set set;
        Application application = this.A00.A00;
        Set A012 = AnonymousClass0JC.A01(application, AnonymousClass0JC.A04, "primary-task-killer");
        Set A013 = AnonymousClass0JC.A01(application, AnonymousClass0JC.A05, "secondary-task-killer");
        AnonymousClass0JC r4 = this.A01;
        AtomicReference atomicReference = r4.A03;
        Set set2 = null;
        if (A012 != null) {
            set = Collections.unmodifiableSet(A012);
        } else {
            set = null;
        }
        if (A013 != null) {
            set2 = Collections.unmodifiableSet(A013);
        }
        atomicReference.set(new AnonymousClass0JD(set, set2));
        r4.A02.countDown();
    }
}
