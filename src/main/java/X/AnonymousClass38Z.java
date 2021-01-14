package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* renamed from: X.38Z  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38Z implements Handler.Callback {
    public final /* synthetic */ VoipCallNewParticipantBanner A00;

    public /* synthetic */ AnonymousClass38Z(VoipCallNewParticipantBanner voipCallNewParticipantBanner) {
        this.A00 = voipCallNewParticipantBanner;
    }

    public final boolean handleMessage(Message message) {
        VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A00;
        if (message.what != 0) {
            return true;
        }
        voipCallNewParticipantBanner.A00();
        return true;
    }
}
