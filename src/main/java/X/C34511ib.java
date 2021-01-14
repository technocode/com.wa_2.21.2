package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: X.1ib  reason: invalid class name and case insensitive filesystem */
public final class C34511ib implements AnonymousClass15Y {
    @Override // X.AnonymousClass15Y
    public C234315u A3K(Looper looper, Handler.Callback callback) {
        return new C234315u(new Handler(looper, callback));
    }

    @Override // X.AnonymousClass15Y
    public long A3z() {
        return SystemClock.elapsedRealtime();
    }

    @Override // X.AnonymousClass15Y
    public long AQz() {
        return SystemClock.uptimeMillis();
    }
}
