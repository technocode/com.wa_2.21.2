package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3TJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3TJ implements AbstractC674838t {
    public final /* synthetic */ VoipActivityV2 A00;

    public /* synthetic */ AnonymousClass3TJ(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    @Override // X.AbstractC674838t
    public final void ADr(UserJid userJid) {
        AnonymousClass3U7 r0 = this.A00.A0v;
        if (r0 != null) {
            r0.A0o.execute(new RunnableEBaseShape4S0100000_I0_4(userJid, 43));
        }
    }
}
