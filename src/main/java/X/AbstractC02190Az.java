package X;

import android.os.SystemClock;

/* renamed from: X.0Az  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC02190Az implements AbstractC02170Ax {
    /* JADX INFO: finally extract failed */
    @Override // X.AbstractC02170Ax
    public Object get() {
        C02180Ay r5 = (C02180Ay) this;
        if (r5.A02 == null) {
            synchronized (r5) {
                if (r5.A02 == null) {
                    AbstractC02170Ax r1 = r5.A01;
                    boolean z = false;
                    if (r1 != null) {
                        z = true;
                    }
                    AnonymousClass00E.A07(z);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        Object obj = r1.get();
                        if (obj != null) {
                            r5.A02 = obj;
                            r5.A00 = Math.max(0L, SystemClock.uptimeMillis() - uptimeMillis);
                            r5.A01 = null;
                        } else {
                            throw null;
                        }
                    } catch (Throwable th) {
                        r5.A00 = Math.max(0L, SystemClock.uptimeMillis() - uptimeMillis);
                        throw th;
                    }
                }
            }
        }
        return r5.A02;
    }
}
