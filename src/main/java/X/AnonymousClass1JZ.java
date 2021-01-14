package X;

import android.content.DialogInterface;
import com.whatsapp.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1JZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ StatusConfirmUnmuteDialogFragment A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ AnonymousClass1JZ(StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment, UserJid userJid) {
        this.A00 = statusConfirmUnmuteDialogFragment;
        this.A01 = userJid;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = this.A00;
        UserJid userJid = this.A01;
        AnonymousClass008.A14("statusesfragment/unmute status for ", userJid);
        statusConfirmUnmuteDialogFragment.A04.A02(userJid, true);
        statusConfirmUnmuteDialogFragment.A0w(false, false);
    }
}
