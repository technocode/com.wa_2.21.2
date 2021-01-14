package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.05U  reason: invalid class name */
public class AnonymousClass05U implements Executor {
    public static final Handler A00 = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        A00.post(runnable);
    }
}
