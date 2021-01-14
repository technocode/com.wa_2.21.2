package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;

/* renamed from: X.2RR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2RR implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ PromptSendGroupInviteDialogFragment A02;

    public /* synthetic */ AnonymousClass2RR(PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment, Intent intent, int i) {
        this.A02 = promptSendGroupInviteDialogFragment;
        this.A01 = intent;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004902h A0A;
        PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = this.A02;
        Intent intent = this.A01;
        int i2 = this.A00;
        if (i == -1 && (A0A = promptSendGroupInviteDialogFragment.A0A()) != null && !A0A.isFinishing()) {
            promptSendGroupInviteDialogFragment.A0A().startActivityForResult(intent, i2);
        }
    }
}
