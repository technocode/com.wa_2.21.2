package X;

import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.385  reason: invalid class name */
public final /* synthetic */ class AnonymousClass385 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass385(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final void run() {
        String str = this.A00;
        String str2 = this.A01;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            AnonymousClass1YO r1 = callInfo.callWaitingInfo;
            if (r1.A01 != 0 && r1.A04.equals(str)) {
                Voip.rejectPendingCall(str);
                return;
            }
        }
        Voip.rejectCall(str, str2);
    }
}
