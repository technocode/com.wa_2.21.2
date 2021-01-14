package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.39U  reason: invalid class name */
public class AnonymousClass39U extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass3U7 A00;

    public AnonymousClass39U(AnonymousClass3U7 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.A00.A0F();
            Log.i("Screen is being turned off");
        }
    }
}
