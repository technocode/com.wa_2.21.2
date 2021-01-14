package X;

import android.os.Process;

/* renamed from: X.16L  reason: invalid class name */
public final class AnonymousClass16L extends Thread {
    public AnonymousClass16L(Runnable runnable, String str) {
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
