package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.util.Log;

/* renamed from: X.34i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC664434i implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsTwoFactorAuthActivity.ConfirmDisableDialog A00;

    public /* synthetic */ DialogInterface$OnClickListenerC664434i(SettingsTwoFactorAuthActivity.ConfirmDisableDialog confirmDisableDialog) {
        this.A00 = confirmDisableDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity = (SettingsTwoFactorAuthActivity) this.A00.A0A();
        settingsTwoFactorAuthActivity.A0G(R.string.two_factor_auth_disabling);
        settingsTwoFactorAuthActivity.A0A.postDelayed(settingsTwoFactorAuthActivity.A0C, C04530Ks.A07);
        C04530Ks r2 = settingsTwoFactorAuthActivity.A0B;
        if (r2 != null) {
            Log.i("twofactorauthmanager/disable-two-factor-auth");
            r2.A01("", null);
            return;
        }
        throw null;
    }
}
