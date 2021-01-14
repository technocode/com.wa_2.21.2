package X;

import android.content.DialogInterface;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38N implements DialogInterface.OnClickListener {
    public final /* synthetic */ VoipActivityV2.SwitchConfirmationFragment A00;

    public /* synthetic */ AnonymousClass38N(VoipActivityV2.SwitchConfirmationFragment switchConfirmationFragment) {
        this.A00 = switchConfirmationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallInfo A0W;
        VoipActivityV2.SwitchConfirmationFragment switchConfirmationFragment = this.A00;
        AnonymousClass00D r3 = switchConfirmationFragment.A00;
        AnonymousClass008.A0k(r3, "switch_to_video_call_confirmation_dialog_count", r3.A00.getInt("switch_to_video_call_confirmation_dialog_count", 0) + 1);
        VoipActivityV2 voipActivityV2 = (VoipActivityV2) switchConfirmationFragment.A0A();
        if (voipActivityV2 != null && (A0W = voipActivityV2.A0W()) != null && !A0W.isGroupCall && A0W.self.A04 == 0 && voipActivityV2.A1Z(A0W.peerJid, true, 1)) {
            AnonymousClass3U7 r0 = voipActivityV2.A0v;
            if (r0 != null) {
                r0.A0E();
                return;
            }
            throw null;
        }
    }
}
