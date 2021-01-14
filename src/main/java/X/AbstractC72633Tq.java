package X;

import android.content.IntentFilter;
import android.media.AudioManager;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3Tq  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC72633Tq {
    public AnonymousClass3TK A00;
    public boolean A01;

    public void A00() {
        C74353ah r0 = (C74353ah) this;
        r0.A01.registerReceiver(r0.A00, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    public void A01() {
        C74353ah r0 = (C74353ah) this;
        r0.A01.unregisterReceiver(r0.A00);
    }

    public final void A02() {
        boolean A03 = A03();
        if (this.A01 != A03) {
            this.A01 = A03;
            C675939f r3 = this.A00.A00;
            StringBuilder sb = new StringBuilder("voip/audio_route/HeadsetMonitor ");
            sb.append(r3);
            Log.i(sb.toString());
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null || callInfo.callState == Voip.CallState.NONE) {
                Log.e("voip/audio_route/headsetPlugReceiver ignored, not in any call");
                return;
            }
            r3.A03(callInfo);
            if (A03) {
                r3.A06 = true;
                Log.i("voip/audio_route/headset Plugged");
                if (r3.A00 == 1) {
                    r3.A02(callInfo);
                    r3.A05(false, callInfo);
                    return;
                }
                return;
            }
            Log.i("voip/audio_route/headset Unplugged");
            r3.A01(callInfo);
        }
    }

    public boolean A03() {
        AudioManager A09 = ((C74353ah) this).A02.A09();
        if (A09 == null) {
            return false;
        }
        return A09.isWiredHeadsetOn();
    }
}
