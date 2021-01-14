package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.0sC  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17760sC extends BroadcastReceiver {
    public static final String A00 = AbstractC17610rq.A01("ConstraintProxy");

    public void onReceive(Context context, Intent intent) {
        AbstractC17610rq.A00().A02(A00, String.format("onReceive : %s", intent), new Throwable[0]);
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
