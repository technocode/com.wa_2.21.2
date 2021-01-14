package androidx.work.impl.background.systemalarm;

import X.AbstractC17610rq;
import X.AnonymousClass0t5;
import X.C31221cl;
import X.C31581dS;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String A00 = AbstractC17610rq.A01("ConstrntProxyUpdtRecvr");

    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AbstractC17610rq.A00().A02(A00, String.format("Ignoring unknown action %s", str), new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        AnonymousClass0t5 r0 = C31221cl.A00(context).A06;
        ((C31581dS) r0).A01.execute(new RunnableEBaseShape2S0300000_I1(intent, context, goAsync));
    }
}
