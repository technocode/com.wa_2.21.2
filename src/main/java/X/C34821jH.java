package X;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jH  reason: invalid class name and case insensitive filesystem */
public final class C34821jH implements AbstractC237817o {
    public final AnonymousClass16z A00;
    public final WeakReference A01;
    public final boolean A02;

    public C34821jH(C34811jG r2, AnonymousClass16z r3, boolean z) {
        this.A01 = new WeakReference(r2);
        this.A00 = r3;
        this.A02 = z;
    }

    @Override // X.AbstractC237817o
    public final void AJN(C34661ix r6) {
        C34811jG r4 = (C34811jG) this.A01.get();
        if (r4 != null) {
            boolean z = false;
            if (Looper.myLooper() == r4.A0G.A05.A08) {
                z = true;
            }
            C001801b.A1b(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            Lock lock = r4.A0K;
            lock.lock();
            try {
                if (r4.A07(0)) {
                    if (!r6.A02()) {
                        r4.A04(r6, this.A00, this.A02);
                    }
                    if (r4.A06()) {
                        r4.A00();
                    }
                    lock.unlock();
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
