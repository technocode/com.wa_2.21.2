package X;

import android.os.Handler;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.38A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38A implements Handler.Callback {
    public final /* synthetic */ AnonymousClass3U7 A00;

    public /* synthetic */ AnonymousClass38A(AnonymousClass3U7 r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        Voip.CallState callState;
        AnonymousClass3U7 r2 = this.A00;
        if (!AnonymousClass0Fh.A01()) {
            Log.e("voip/callTimeoutHandler we are not in an active call");
            return false;
        }
        int i = message.what;
        if (i == 0) {
            Log.i("voip/call/not-accept-timeout");
            CallInfo callInfo = Voip.getCallInfo();
            if (C002001d.A3M(r2.A1M) && callInfo != null && callInfo.isGroupCall && ((callState = callInfo.callState) == Voip.CallState.CALLING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED)) {
                return true;
            }
            r2.A0Q(7, null);
            return true;
        } else if (i == 1) {
            Log.i("voip/call/accepted-but-not-active-timeout");
            r2.A0Q(8, null);
            return true;
        } else if (i == 2) {
            Log.i("voip/call/send-call-offer-timeout");
            if (r2.A1V.A03(true) != 0) {
                return true;
            }
            r2.A0Q(9, r2.A1a.A06(R.string.voip_call_failed_no_network));
            return true;
        } else if (i == 3) {
            Log.i("voip/call/busy-tone-timeout");
            r2.A0Q(10, null);
            return true;
        } else if (i != 4) {
            return false;
        } else {
            Log.i("voip/call/ringtone-timeout");
            r2.A0F();
            return true;
        }
    }
}
