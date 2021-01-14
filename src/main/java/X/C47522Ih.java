package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.2Ih  reason: invalid class name and case insensitive filesystem */
public class C47522Ih extends BroadcastReceiver {
    public final /* synthetic */ C28301Tu A00;

    public C47522Ih(C28301Tu r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        C28301Tu r2 = this.A00;
        boolean z = false;
        if (intent.getIntExtra("state", 0) > 0) {
            z = true;
        }
        r2.A0J = z;
        AnonymousClass008.A1a(AnonymousClass008.A0S("messageaudioplayer/broadcastreceiver HeadsetPluggedInState: "), z);
        if (r2.A0J) {
            r2.A0K();
        } else {
            r2.A0I();
        }
    }
}
