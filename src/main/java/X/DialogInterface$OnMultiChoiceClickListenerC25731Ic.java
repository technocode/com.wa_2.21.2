package X;

import android.content.DialogInterface;
import com.whatsapp.MultiSelectionDialogFragment;

/* renamed from: X.1Ic  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnMultiChoiceClickListenerC25731Ic implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ MultiSelectionDialogFragment A00;

    public /* synthetic */ DialogInterface$OnMultiChoiceClickListenerC25731Ic(MultiSelectionDialogFragment multiSelectionDialogFragment) {
        this.A00 = multiSelectionDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.A00.A04[i] = z;
    }
}
