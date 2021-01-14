package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2Uw  reason: invalid class name and case insensitive filesystem */
public class C50482Uw extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass0G3 A00;

    public C50482Uw(AnonymousClass0G3 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (!"com.whatsapp.alarm.CLIENT_PING_TIMEOUT".equals(intent.getAction())) {
            StringBuilder sb = new StringBuilder("xmpp/client-ping/timeout/receiver; unexpected intent: ");
            sb.append(intent);
            Log.w(sb.toString());
            return;
        }
        Log.i("xmpp/client-ping/timeout/receiver");
        this.A00.A04();
    }
}
