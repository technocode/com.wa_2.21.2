package X;

import com.facebook.profilo.logger.Logger;
import java.lang.Thread;

/* renamed from: X.10V  reason: invalid class name */
public final class AnonymousClass10V implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        AnonymousClass10X r0 = Logger.sLoggerCallbacks;
        if (r0 != null) {
            r0.AHM(th);
        }
    }
}
