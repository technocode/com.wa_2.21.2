package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesLogoutAllConfirmationDialogFragment;

/* renamed from: X.2F4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2F4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ LinkedDevicesLogoutAllConfirmationDialogFragment A00;

    public /* synthetic */ AnonymousClass2F4(LinkedDevicesLogoutAllConfirmationDialogFragment linkedDevicesLogoutAllConfirmationDialogFragment) {
        this.A00 = linkedDevicesLogoutAllConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C51052Xd r3 = this.A00.A00;
        AbstractActivityC60812rK r1 = r3.A00;
        if (!r1.A0Q(R.string.connectivity_check_connection)) {
            r1.A08.ANF(new RunnableEBaseShape8S0100000_I1_3(r3, 35));
        }
    }
}
