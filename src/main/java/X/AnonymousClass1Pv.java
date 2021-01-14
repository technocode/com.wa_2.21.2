package X;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.1Pv  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1Pv implements DialogInterface.OnClickListener {
    public final /* synthetic */ VerifyTwoFactorAuthCodeDialogFragment A00;

    public /* synthetic */ AnonymousClass1Pv(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        this.A00 = verifyTwoFactorAuthCodeDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = this.A00;
        verifyTwoFactorAuthCodeDialogFragment.A00 = 4;
        C04530Ks r7 = verifyTwoFactorAuthCodeDialogFragment.A07;
        SharedPreferences sharedPreferences = r7.A00;
        sharedPreferences.edit().putLong("two_factor_auth_nag_time", r7.A03.A05()).putInt("two_factor_auth_nag_interval", Math.max(sharedPreferences.getInt("two_factor_auth_nag_interval", 0), 2)).putBoolean("two_factor_auth_last_code_correctness", true).apply();
        verifyTwoFactorAuthCodeDialogFragment.A0y();
    }
}
