package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0ub  reason: invalid class name and case insensitive filesystem */
public class C19180ub extends BroadcastReceiver {
    public final /* synthetic */ C32061eH A00;

    public C19180ub(C32061eH r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.getBooleanExtra("noConnectivity", false)) {
            this.A00.invalidate();
        }
    }
}
