package X;

import android.os.Handler;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.Iterator;

/* renamed from: X.388  reason: invalid class name */
public final /* synthetic */ class AnonymousClass388 implements Handler.Callback {
    public final /* synthetic */ AnonymousClass3U7 A00;

    public /* synthetic */ AnonymousClass388(AnonymousClass3U7 r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass3U7 r7 = this.A00;
        AnonymousClass00E.A01();
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            boolean z = false;
            if (callInfo.callState == Voip.CallState.ACTIVE) {
                z = true;
            }
            long j = callInfo.callDuration;
            if (z) {
                AnonymousClass0JO r0 = r7.A1r;
                AnonymousClass00E.A01();
                Iterator it = r0.A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (!r1.hasNext()) {
                        break;
                    }
                    AnonymousClass0LH r12 = (AnonymousClass0LH) r1.next();
                    if (r12 instanceof C07590Yo) {
                        HomeActivity homeActivity = ((C07590Yo) r12).A00;
                        if (homeActivity.A0G != null) {
                            homeActivity.A08.setVisibility(8);
                        } else {
                            if (homeActivity.A08.getVisibility() != 0) {
                                homeActivity.A08.setVisibility(0);
                            }
                            homeActivity.A0F.setText(C002001d.A1W(((AnonymousClass2C0) homeActivity).A01, j / 1000));
                        }
                    } else if (r12 instanceof C39751s2) {
                        Conversation conversation = ((C39751s2) r12).A00;
                        if (conversation.A0D.getVisibility() != 0) {
                            conversation.A0D.setVisibility(0);
                        }
                        conversation.A0Z.setText(C002001d.A1W(((AnonymousClass2C0) conversation).A01, j / 1000));
                    }
                }
            }
            Voip.CallState callState = callInfo.callState;
            Voip.CallState callState2 = Voip.CallState.RECEIVED_CALL;
            if (callState == callState2) {
                r7.A0H();
            }
            if (callInfo.callState != callState2 && !callInfo.isPeerRequestingUpgrade()) {
                r7.A0F();
            }
            AbstractC07250Wp r3 = r7.A0W;
            if (r3 != null) {
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) r3;
                AnonymousClass00E.A01();
                CallInfo A0X = voipActivityV2.A0X(callInfo);
                voipActivityV2.A1F(A0X);
                voipActivityV2.findViewById(R.id.call_debug_stats);
                voipActivityV2.A0v();
                if (!C002001d.A3M(voipActivityV2.A1U) && voipActivityV2.A0v != null && A0X.callState == Voip.CallState.ACTIVE && voipActivityV2.A09 == 0 && A0X.bytesReceived > 0 && A0X.isCaller && !A0X.videoEnabled && A0X.callDuration < 3000) {
                    voipActivityV2.A1Q(((AnonymousClass2C0) voipActivityV2).A01.A06(R.string.voip_call_connected), 0);
                }
                voipActivityV2.A09 = A0X.bytesReceived;
            }
            C673638g r10 = r7.A1p;
            long currentTimeMillis = System.currentTimeMillis();
            boolean z2 = false;
            if (currentTimeMillis - r10.A02 > 60000) {
                z2 = true;
            }
            if (z2) {
                double A002 = r10.A00();
                r10.A00 = A002;
                if (r10.A02 == 0 || Double.isNaN(r10.A01)) {
                    r10.A01 = A002;
                }
                r10.A02 = currentTimeMillis;
            }
            double d = r10.A01;
            if (!Double.isNaN(d)) {
                double d2 = r10.A00;
                if (!Double.isNaN(d2)) {
                    long j2 = j / 60000;
                    double d3 = d - d2;
                    if (j2 <= 0) {
                        j2 = 1;
                    }
                    double d4 = d3 / ((double) j2);
                    if (z2) {
                        boolean A01 = r10.A03.A00.A01();
                        AnonymousClass008.A1H("voipcalling/BatteryStateDelegate/isDeviceCharging is device charging returned: ", A01);
                        int batteryState = Voip.setBatteryState((float) ((int) d4), (float) ((int) r10.A00), A01);
                        StringBuilder sb = new StringBuilder("voipcalling/BatteryStateDelegate/updateBattery setting battery state for vid_rc_battery: ");
                        sb.append(d4);
                        sb.append(" ");
                        sb.append(r10.A00);
                        sb.append(" ");
                        sb.append(A01);
                        sb.append(" got result: ");
                        sb.append(batteryState);
                        Log.i(sb.toString());
                    }
                }
            }
        } else {
            Log.w("voip/periodicalUpdateHandler we are not in an active call");
        }
        r7.A0K.sendEmptyMessageDelayed(0, 1000);
        return true;
    }
}
