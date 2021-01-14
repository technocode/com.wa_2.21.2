package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.1dS  reason: invalid class name and case insensitive filesystem */
public class C31581dS implements AnonymousClass0t5 {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final ExecutorC18130sq A01;
    public final Executor A02 = new ExecutorC18280t6(this);

    public C31581dS(Executor executor) {
        this.A01 = new ExecutorC18130sq(executor);
    }
}
