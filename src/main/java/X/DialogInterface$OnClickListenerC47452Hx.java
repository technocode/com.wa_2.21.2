package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment;

/* renamed from: X.2Hx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47452Hx implements DialogInterface.OnClickListener {
    public final /* synthetic */ VerifiedBusinessInfoDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC47452Hx(VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment) {
        this.A00 = verifiedBusinessInfoDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment = this.A00;
        verifiedBusinessInfoDialogFragment.A00.A05(verifiedBusinessInfoDialogFragment.A00(), new Intent("android.intent.action.VIEW", verifiedBusinessInfoDialogFragment.A03.A03("general", "26000089", null)));
        verifiedBusinessInfoDialogFragment.A0w(false, false);
    }
}
