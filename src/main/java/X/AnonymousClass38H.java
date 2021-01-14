package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38H implements DialogInterface.OnClickListener {
    public final /* synthetic */ VoipActivityV2.EndCallConfirmationDialogFragment A00;

    public /* synthetic */ AnonymousClass38H(VoipActivityV2.EndCallConfirmationDialogFragment endCallConfirmationDialogFragment) {
        this.A00 = endCallConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VoipActivityV2.EndCallConfirmationDialogFragment endCallConfirmationDialogFragment = this.A00;
        Intent intent = new Intent(endCallConfirmationDialogFragment.A00(), VoipActivityV2.class);
        intent.setAction(VoipActivityV2.A1o);
        intent.setFlags(268435456);
        endCallConfirmationDialogFragment.A0h(intent);
        endCallConfirmationDialogFragment.A0r();
    }
}
