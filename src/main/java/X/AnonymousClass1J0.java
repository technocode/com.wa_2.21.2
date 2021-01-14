package X;

import android.content.DialogInterface;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1J0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ RevokeLinkConfirmationDialogFragment A00;

    public /* synthetic */ AnonymousClass1J0(RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment) {
        this.A00 = revokeLinkConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = this.A00;
        Log.i("invitelink/revoke/confirmation/ok");
        AnonymousClass1NO r0 = (AnonymousClass1NO) revokeLinkConfirmationDialogFragment.A0A();
        if (r0 != null) {
            r0.AN7();
        }
    }
}
