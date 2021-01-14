package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3TG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3TG implements AbstractC674938u {
    public final /* synthetic */ CallInfo A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public /* synthetic */ AnonymousClass3TG(VoipActivityV2 voipActivityV2, CallInfo callInfo) {
        this.A01 = voipActivityV2;
        this.A00 = callInfo;
    }

    @Override // X.AbstractC674938u
    public final void ADg() {
        VoipActivityV2 voipActivityV2 = this.A01;
        UserJid userJid = this.A00.peerJid;
        if (voipActivityV2.A1J) {
            new VoipActivityV2.ReplyWithMessageDialogFragment(userJid).A0u(voipActivityV2.A04(), null);
        }
    }
}
