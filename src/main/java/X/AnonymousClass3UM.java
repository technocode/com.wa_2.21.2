package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3UM  reason: invalid class name */
public class AnonymousClass3UM extends AnonymousClass39R {
    public final /* synthetic */ VoipActivityV2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3UM(VoipActivityV2 voipActivityV2, AnonymousClass39Q r4, UserJid userJid) {
        super("display", r4, userJid, voipActivityV2.A1f);
        this.A00 = voipActivityV2;
    }

    public final boolean A09() {
        UserJid userJid;
        VideoCallParticipantView videoCallParticipantView;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = this.A00.A0r;
        if (maximizedParticipantVideoDialogFragment == null) {
            return false;
        }
        UserJid userJid2 = this.A03;
        AnonymousClass39R r0 = maximizedParticipantVideoDialogFragment.A09;
        if (r0 != null) {
            userJid = r0.A03;
        } else {
            userJid = null;
        }
        if (!userJid2.equals(userJid) || (videoCallParticipantView = super.A00) == null || videoCallParticipantView.A03 == 7) {
            return false;
        }
        return true;
    }
}
