package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment;
import com.whatsapp.identity.IdentityVerificationActivity;

/* renamed from: X.2Hv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47432Hv implements DialogInterface.OnClickListener {
    public final /* synthetic */ IdentityChangeDialogFragment A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ DialogInterface$OnClickListenerC47432Hv(IdentityChangeDialogFragment identityChangeDialogFragment, String str) {
        this.A00 = identityChangeDialogFragment;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IdentityChangeDialogFragment identityChangeDialogFragment = this.A00;
        String str = this.A01;
        Intent intent = new Intent(identityChangeDialogFragment.A00(), IdentityVerificationActivity.class);
        intent.putExtra("jid", str);
        identityChangeDialogFragment.A0h(intent);
    }
}
