package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38O implements Handler.Callback {
    public final /* synthetic */ C675539b A00;

    public /* synthetic */ AnonymousClass38O(C675539b r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        C675539b r3 = this.A00;
        if (message.what == 1) {
            Voip.videoOrientationChanged(r3.A00 * 90);
            int i = r3.A00;
            if (i == 1) {
                i = 3;
            } else if (i == 3) {
                i = 1;
            }
            int i2 = i * 90;
            VoipActivityV2 voipActivityV2 = r3.A02;
            voipActivityV2.A10(i2);
            CallInfo A0W = voipActivityV2.A0W();
            if (A0W != null) {
                voipActivityV2.A1D(A0W);
            }
        }
        return true;
    }
}
