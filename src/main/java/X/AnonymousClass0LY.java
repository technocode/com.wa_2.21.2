package X;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.0LY  reason: invalid class name */
public class AnonymousClass0LY extends DialogFragment {
    public Dialog A00 = null;
    public DialogInterface.OnCancelListener A01 = null;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.A00 == null) {
            setShowsDialog(false);
        }
        return this.A00;
    }
}
