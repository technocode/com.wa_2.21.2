package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.0f8  reason: invalid class name and case insensitive filesystem */
public class C10750f8 extends AnonymousClass0JW {
    public Handler A00;
    public Runnable A01;
    public final long A02 = SystemClock.uptimeMillis();
    public final C014308b A03;
    public final AnonymousClass02X A04;
    public final WeakReference A05;
    public final boolean A06;

    public C10750f8(C014308b r3, C47262Hc r4, AnonymousClass02X r5, boolean z) {
        this.A03 = r3;
        this.A05 = new WeakReference(r4);
        this.A04 = r5;
        this.A06 = z;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A00 = handler;
        RunnableEBaseShape0S1100000_I0 runnableEBaseShape0S1100000_I0 = new RunnableEBaseShape0S1100000_I0(this, (String) obj, 2);
        this.A01 = runnableEBaseShape0S1100000_I0;
        if (this.A06) {
            handler.postAtTime(runnableEBaseShape0S1100000_I0, this.A02 + 3000);
        } else {
            runnableEBaseShape0S1100000_I0.run();
        }
    }

    public void A04() {
        super.A00.cancel(false);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A01);
        }
        this.A00 = null;
        this.A01 = null;
    }
}
