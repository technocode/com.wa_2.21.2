package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.39V  reason: invalid class name */
public class AnonymousClass39V extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass3U7 A00;

    public AnonymousClass39V(AnonymousClass3U7 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        CallInfo callInfo;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && (callInfo = Voip.getCallInfo()) != null && callInfo.callState == Voip.CallState.RECEIVED_CALL && Build.VERSION.SDK_INT >= 21) {
            AnonymousClass3U7 r2 = this.A00;
            AbstractC07250Wp r0 = r2.A0W;
            if (r0 == null || !((VoipActivityV2) r0).A1K) {
                Log.i("voip/unlockReceiver generate headsup notification when user unlock the screen in RECEIVED_CALL state");
                r2.A0W(callInfo, 1, false);
            }
        }
    }
}
