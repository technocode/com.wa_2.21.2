package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.0G4  reason: invalid class name */
public class AnonymousClass0G4 extends BroadcastReceiver {
    public final /* synthetic */ C03160Fa A00;

    public AnonymousClass0G4(C03160Fa r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.whatsapp.MessageHandler.RECONNECT_ACTION".equals(intent.getAction())) {
            Log.i("xmpp/handler/reconnect");
            this.A00.A07(intent.getIntExtra("connect_reason", 0));
            return;
        }
        StringBuilder sb = new StringBuilder("unknown intent received in reconnect receiver ");
        sb.append(intent);
        Log.w(sb.toString());
    }
}
