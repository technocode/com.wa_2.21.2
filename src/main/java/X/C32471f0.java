package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1f0  reason: invalid class name and case insensitive filesystem */
public class C32471f0 extends ScheduledExecutorServiceC19900vn {
    public static C32471f0 A00;

    public C32471f0() {
        super(new Handler(Looper.getMainLooper()));
    }

    @Override // X.ScheduledExecutorServiceC19900vn
    public void execute(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
