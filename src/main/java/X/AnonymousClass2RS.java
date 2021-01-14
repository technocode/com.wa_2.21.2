package X;

import android.content.DialogInterface;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2RS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2RS implements DialogInterface.OnClickListener {
    public final /* synthetic */ RevokeInviteDialogFragment A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ AnonymousClass2RS(RevokeInviteDialogFragment revokeInviteDialogFragment, UserJid userJid) {
        this.A00 = revokeInviteDialogFragment;
        this.A01 = userJid;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass2Ra r0;
        RevokeInviteDialogFragment revokeInviteDialogFragment = this.A00;
        UserJid userJid = this.A01;
        if (i == -1 && (r0 = revokeInviteDialogFragment.A00) != null) {
            r0.AJk(userJid);
        }
    }
}
