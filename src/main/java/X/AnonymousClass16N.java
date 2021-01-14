package X;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: X.16N  reason: invalid class name */
public final class AnonymousClass16N extends FutureTask {
    public final /* synthetic */ AnonymousClass16J A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass16N(AnonymousClass16J r1, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.A00 = r1;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.A00.A00.A00;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}
