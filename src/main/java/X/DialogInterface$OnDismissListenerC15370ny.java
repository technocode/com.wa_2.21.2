package X;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.0ny  reason: invalid class name and case insensitive filesystem */
public class DialogInterface$OnDismissListenerC15370ny implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment A00;

    public DialogInterface$OnDismissListenerC15370ny(DialogFragment dialogFragment) {
        this.A00 = dialogFragment;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.A00;
        Dialog dialog = dialogFragment.A03;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
