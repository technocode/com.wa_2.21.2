package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;

/* renamed from: X.2Hg  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Hg implements DialogInterface.OnClickListener {
    public final /* synthetic */ BusinessTransitionInfoDialogFragment A00;

    public /* synthetic */ AnonymousClass2Hg(BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment) {
        this.A00 = businessTransitionInfoDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment = this.A00;
        businessTransitionInfoDialogFragment.A00.A05(businessTransitionInfoDialogFragment.A00(), new Intent("android.intent.action.VIEW", businessTransitionInfoDialogFragment.A03.A02("security-and-privacy", "end-to-end-encryption-for-business-messages")));
        businessTransitionInfoDialogFragment.A0w(false, false);
    }
}
