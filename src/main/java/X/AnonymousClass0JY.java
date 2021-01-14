package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0JY  reason: invalid class name */
public class AnonymousClass0JY extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        AnonymousClass0JX r4 = AnonymousClass0JX.A02;
        boolean z = false;
        int intExtra = intent.getIntExtra("state", 0);
        if (r4.A00 && intExtra < 1) {
            C28301Tu.A03();
        }
        if (intExtra >= 1) {
            z = true;
        }
        r4.A00 = z;
        AnonymousClass008.A0v("headserplugbroadcastReceiver/headset ", intExtra);
    }
}
