package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.0wH  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC20180wH extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C20190wI r4 = C20190wI.A02;
            if (r4 == null) {
                r4 = new C20190wI(context);
                C20190wI.A02 = r4;
            }
            RunnableC20170wG r3 = new RunnableC20170wG(this, context, intent);
            PowerManager.WakeLock newWakeLock = r4.A00.newWakeLock(1, "FBNSPreloadWakefulExecutor");
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            try {
                r4.A01.execute(new RunnableEBaseShape5S0200000_I1_0(r3, newWakeLock));
            } catch (RejectedExecutionException e) {
                Log.e("FBNSPreloadWakefulExecutor/Notification skipped", e);
                newWakeLock.release();
            }
        }
    }
}
