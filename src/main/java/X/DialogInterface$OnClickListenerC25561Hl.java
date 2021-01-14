package X;

import android.content.DialogInterface;
import com.whatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;

/* renamed from: X.1Hl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25561Hl implements DialogInterface.OnClickListener {
    public final /* synthetic */ ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25561Hl(ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment contentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment) {
        this.A00 = contentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004902h A0A = this.A00.A0A();
        if (A0A != null) {
            A0A.finish();
        }
    }
}
