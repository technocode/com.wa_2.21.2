package X;

import android.content.DialogInterface;
import com.whatsapp.MultiSelectionDialogFragment;

/* renamed from: X.1Ib  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25721Ib implements DialogInterface.OnClickListener {
    public final /* synthetic */ MultiSelectionDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25721Ib(MultiSelectionDialogFragment multiSelectionDialogFragment) {
        this.A00 = multiSelectionDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MultiSelectionDialogFragment multiSelectionDialogFragment = this.A00;
        multiSelectionDialogFragment.A01.AHq(multiSelectionDialogFragment.A00, multiSelectionDialogFragment.A04);
        dialogInterface.dismiss();
    }
}
