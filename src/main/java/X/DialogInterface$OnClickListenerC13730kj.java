package X;

import android.content.DialogInterface;
import android.util.Log;
import androidx.biometric.FingerprintDialogFragment;

/* renamed from: X.0kj  reason: invalid class name and case insensitive filesystem */
public class DialogInterface$OnClickListenerC13730kj implements DialogInterface.OnClickListener {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public DialogInterface$OnClickListenerC13730kj(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        if (fingerprintDialogFragment.A05.getBoolean("allow_device_credential")) {
            fingerprintDialogFragment.A0A.onClick(dialogInterface, i);
            return;
        }
        DialogInterface.OnClickListener onClickListener = fingerprintDialogFragment.A04;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        } else {
            Log.w("FingerprintDialogFrag", "No suitable negative button listener.");
        }
    }
}
