package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0nx  reason: invalid class name and case insensitive filesystem */
public class DialogInterface$OnCancelListenerC15360nx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment A00;

    public DialogInterface$OnCancelListenerC15360nx(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.A03;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
