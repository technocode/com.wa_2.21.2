package X;

import android.os.Looper;

/* renamed from: X.0Uy  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06850Uy {
    public void A00(Runnable runnable) {
        if (!(this instanceof AnonymousClass0V0)) {
            ((C06840Ux) this).A01.A00(runnable);
        } else {
            ((AnonymousClass0V0) this).A01.execute(runnable);
        }
    }

    public void A01(Runnable runnable) {
        ((C06840Ux) this).A01.A01(runnable);
    }

    public boolean A02() {
        if (!(this instanceof AnonymousClass0V0)) {
            return ((C06840Ux) this).A01.A02();
        }
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
