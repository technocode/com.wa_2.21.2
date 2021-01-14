package androidx.work.impl.background.systemalarm;

import X.AbstractC17610rq;
import X.C31221cl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = AbstractC17610rq.A01("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        AbstractC17610rq A002 = AbstractC17610rq.A00();
        String str = A00;
        A002.A02(str, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C31221cl A003 = C31221cl.A00(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                if (A003 != null) {
                    synchronized (C31221cl.A0B) {
                        A003.A00 = goAsync;
                        if (A003.A08) {
                            goAsync.finish();
                            A003.A00 = null;
                        }
                    }
                    return;
                }
                throw null;
            } catch (IllegalStateException unused) {
                AbstractC17610rq.A00().A03(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
        }
    }
}
