package X;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1Ec  reason: invalid class name and case insensitive filesystem */
public final class C25011Ec {
    public static C25011Ec A04;
    public int A00 = 1;
    public ServiceConnectionC25021Ed A01 = new ServiceConnectionC25021Ed(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public C25011Ec(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }

    public static synchronized C25011Ec A00(Context context) {
        C25011Ec r1;
        synchronized (C25011Ec.class) {
            r1 = A04;
            if (r1 == null) {
                r1 = new C25011Ec(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC240418r("MessengerIpcClient"))));
                A04 = r1;
            }
        }
        return r1;
    }

    public final synchronized AbstractC011406u A01(AnonymousClass1Ei r5) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(r5);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.A01.A02(r5)) {
            ServiceConnectionC25021Ed r0 = new ServiceConnectionC25021Ed(this);
            this.A01 = r0;
            r0.A02(r5);
        }
        return r5.A03.A00;
    }
}
