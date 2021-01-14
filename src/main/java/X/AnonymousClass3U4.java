package X;

import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.3U4  reason: invalid class name */
public class AnonymousClass3U4 implements AbstractC03900If {
    public final /* synthetic */ AnonymousClass3U7 A00;

    public AnonymousClass3U4(AnonymousClass3U7 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03900If
    public void AJm(boolean z) {
        AnonymousClass008.A1H("voip/onScreenLockChanged:", z);
        AnonymousClass3U7 r1 = this.A00;
        r1.A11 = z;
        if (Voip.A09(Voip.getCallInfo()) && !r1.A11 && r1.A0u && r1.A0N != null) {
            Log.i("onScreenLockChanged screen is turned on, but ear-near is still true, release and reacquire the proximity wake lock.");
            r1.A0L();
            r1.A0J.sendEmptyMessageDelayed(14, 6000);
        }
    }
}
