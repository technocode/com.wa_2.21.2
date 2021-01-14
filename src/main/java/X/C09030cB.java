package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0cB  reason: invalid class name and case insensitive filesystem */
public class C09030cB {
    public Handler A00 = new Handler(Looper.getMainLooper());
    public Executor A01;

    public C09030cB(Executor executor) {
        this.A01 = executor;
    }
}
