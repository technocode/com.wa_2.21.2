package X;

import android.content.DialogInterface;
import com.whatsapp.StatusConfirmMuteDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1JY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JY implements DialogInterface.OnClickListener {
    public final /* synthetic */ StatusConfirmMuteDialogFragment A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ AnonymousClass1JY(StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment, UserJid userJid) {
        this.A00 = statusConfirmMuteDialogFragment;
        this.A01 = userJid;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = this.A00;
        UserJid userJid = this.A01;
        AnonymousClass008.A14("statusesfragment/mute status for ", userJid);
        statusConfirmMuteDialogFragment.A04.A01(userJid, true);
        statusConfirmMuteDialogFragment.A0w(false, false);
    }
}
