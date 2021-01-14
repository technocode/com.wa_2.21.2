package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0G0  reason: invalid class name */
public class AnonymousClass0G0 extends BroadcastReceiver {
    public final /* synthetic */ C03160Fa A00;

    public AnonymousClass0G0(C03160Fa r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION".equals(intent.getAction())) {
            this.A00.A12.AMr();
        }
    }
}
