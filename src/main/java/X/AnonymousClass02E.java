package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;

/* renamed from: X.02E  reason: invalid class name */
public class AnonymousClass02E {
    public final Handler A00;
    public final SparseArray A01 = new SparseArray();
    public final AnonymousClass00T A02;

    public AnonymousClass02E(AnonymousClass00T r4) {
        this.A02 = r4;
        HandlerThread handlerThread = new HandlerThread("light-prefs-save-scheduler", -2);
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }

    public void A00(int i, Runnable runnable, boolean z) {
        AnonymousClass02H r4;
        synchronized (this) {
            SparseArray sparseArray = this.A01;
            r4 = (AnonymousClass02H) sparseArray.get(i);
            if (r4 == null) {
                r4 = new AnonymousClass02H(this.A02, true);
                sparseArray.put(i, r4);
            }
        }
        if (z) {
            this.A00.postDelayed(new RunnableEBaseShape3S0200000_I0_2(r4, runnable, 37), 100);
        } else {
            r4.execute(runnable);
        }
    }
}
