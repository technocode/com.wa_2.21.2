package X;

import java.lang.Thread;

/* renamed from: X.19v  reason: invalid class name and case insensitive filesystem */
public final class C242919v implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ C242819u A00;

    public C242919v(C242819u r1) {
        this.A00 = r1;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        AnonymousClass26U r1 = this.A00.A07;
        if (r1 != null) {
            r1.A09("Job execution failed", th);
        }
    }
}
