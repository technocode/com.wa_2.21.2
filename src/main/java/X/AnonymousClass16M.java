package X;

import android.content.Context;
import java.lang.Thread;

/* renamed from: X.16M  reason: invalid class name */
public final class AnonymousClass16M {
    public static volatile AnonymousClass16M A04;
    public Thread.UncaughtExceptionHandler A00;
    public final Context A01;
    public final AnonymousClass16J A02 = new AnonymousClass16J(this);
    public volatile C35761kt A03;

    public AnonymousClass16M(Context context) {
        Context applicationContext = context.getApplicationContext();
        C001801b.A1Q(applicationContext);
        this.A01 = applicationContext;
        new AnonymousClass16I();
    }

    public static void A00() {
        if (!(Thread.currentThread() instanceof AnonymousClass16L)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
