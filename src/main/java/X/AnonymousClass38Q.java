package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38Q implements DialogInterface.OnDismissListener {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ VoipActivityV2 A01;

    public /* synthetic */ AnonymousClass38Q(VoipActivityV2 voipActivityV2, UserJid userJid) {
        this.A01 = voipActivityV2;
        this.A00 = userJid;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        VoipActivityV2 voipActivityV2 = this.A01;
        UserJid userJid = this.A00;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = voipActivityV2.A0r;
        if (maximizedParticipantVideoDialogFragment != null && ((DialogFragment) maximizedParticipantVideoDialogFragment).A03 == dialogInterface) {
            voipActivityV2.A0r = null;
        }
        if (voipActivityV2.A18.containsKey(userJid)) {
            ((AnonymousClass39R) voipActivityV2.A18.get(userJid)).A04();
        }
    }
}
