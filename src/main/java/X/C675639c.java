package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.39c  reason: invalid class name and case insensitive filesystem */
public class C675639c extends BroadcastReceiver {
    public final /* synthetic */ C675939f A00;

    public C675639c(C675939f r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
            StringBuilder A0S = AnonymousClass008.A0S("voip/audio_route/bluetoothConnectionReceiver [");
            if (intExtra2 != 0) {
                str = intExtra2 != 1 ? intExtra2 != 2 ? intExtra2 != 3 ? "UNKOWN BLUETOOTH CONNECTION STATE" : "DISCONNECTING" : "CONNECTED" : "CONNECTING";
            } else {
                str = "DISCONNECTED";
            }
            A0S.append(str);
            A0S.append(" -> ");
            A0S.append(intExtra != 0 ? intExtra != 1 ? intExtra != 2 ? intExtra != 3 ? "UNKOWN BLUETOOTH CONNECTION STATE" : "DISCONNECTING" : "CONNECTED" : "CONNECTING" : "DISCONNECTED");
            AnonymousClass008.A1U(A0S, "]");
            if (intExtra != intExtra2) {
                if (intExtra != 0) {
                    if (intExtra == 2) {
                        this.A00.A00(Voip.getCallInfo());
                        return;
                    } else if (intExtra != 3) {
                        return;
                    }
                }
                this.A00.A04(false, Voip.getCallInfo());
            }
        }
    }
}
