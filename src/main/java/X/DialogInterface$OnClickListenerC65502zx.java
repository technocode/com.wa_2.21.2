package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.VerifyTwoFactorAuth;

/* renamed from: X.2zx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65502zx implements DialogInterface.OnClickListener {
    public final /* synthetic */ VerifyTwoFactorAuth.ConfirmWipe A00;
    public final /* synthetic */ VerifyTwoFactorAuth A01;

    public /* synthetic */ DialogInterface$OnClickListenerC65502zx(VerifyTwoFactorAuth.ConfirmWipe confirmWipe, VerifyTwoFactorAuth verifyTwoFactorAuth) {
        this.A00 = confirmWipe;
        this.A01 = verifyTwoFactorAuth;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VerifyTwoFactorAuth.ConfirmWipe confirmWipe = this.A00;
        VerifyTwoFactorAuth verifyTwoFactorAuth = this.A01;
        AnonymousClass0MB r3 = new AnonymousClass0MB(verifyTwoFactorAuth);
        AnonymousClass01X r2 = confirmWipe.A00;
        r3.A01.A0E = r2.A06(R.string.two_factor_auth_reset_wipe_secondary_confirmation);
        r3.A07(r2.A06(R.string.two_factor_auth_reset_account_label), new DialogInterface$OnClickListenerC65492zw(verifyTwoFactorAuth));
        r3.A05(r2.A06(R.string.cancel), null);
        r3.A00().show();
    }
}
