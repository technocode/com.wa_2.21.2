package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.100  reason: invalid class name */
public class AnonymousClass100 {
    public static final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        if (A01()) {
            runnable.run();
        } else {
            A00.post(runnable);
        }
    }

    public static boolean A01() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
