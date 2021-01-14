package androidx.work.impl.utils;

import X.AbstractC17610rq;
import X.C30991cL;
import X.RunnableC18090sm;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String A00 = AbstractC17610rq.A01("ForceStopRunnable$Rcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            AbstractC17610rq A002 = AbstractC17610rq.A00();
            String str = A00;
            if (((C30991cL) A002).A00 <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            RunnableC18090sm.A00(context);
        }
    }
}
