package X;

import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;
import androidx.biometric.FingerprintDialogFragment;

/* renamed from: X.0ki  reason: invalid class name and case insensitive filesystem */
public class DialogInterface$OnClickListenerC13720ki implements DialogInterface.OnClickListener {
    public final /* synthetic */ FingerprintDialogFragment A00;

    public DialogInterface$OnClickListenerC13720ki(FingerprintDialogFragment fingerprintDialogFragment) {
        this.A00 = fingerprintDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i != -2) {
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            Log.e("FingerprintDialogFrag", "Failed to check device credential. Not supported prior to L.");
            return;
        }
        FingerprintDialogFragment fingerprintDialogFragment = this.A00;
        AnonymousClass0N2.A1U("FingerprintDialogFrag", fingerprintDialogFragment.A0A(), fingerprintDialogFragment.A05, new RunnableEBaseShape5S0200000_I1_0(this, dialogInterface, 1));
    }
}
