package X;

import android.content.DialogInterface;
import androidx.biometric.BiometricFragment;

/* renamed from: X.0ka  reason: invalid class name and case insensitive filesystem */
public class DialogInterface$OnClickListenerC13640ka implements DialogInterface.OnClickListener {
    public final /* synthetic */ BiometricFragment A00;

    public DialogInterface$OnClickListenerC13640ka(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            BiometricFragment biometricFragment = this.A00;
            AnonymousClass0N2.A1U("BiometricFragment", biometricFragment.A0A(), biometricFragment.A03, null);
        }
    }
}
