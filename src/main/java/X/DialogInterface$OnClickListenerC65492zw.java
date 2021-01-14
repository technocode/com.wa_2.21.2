package X;

import android.content.DialogInterface;
import com.whatsapp.registration.VerifyTwoFactorAuth;

/* renamed from: X.2zw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65492zw implements DialogInterface.OnClickListener {
    public final /* synthetic */ VerifyTwoFactorAuth A00;

    public /* synthetic */ DialogInterface$OnClickListenerC65492zw(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        this.A00 = verifyTwoFactorAuth;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VerifyTwoFactorAuth verifyTwoFactorAuth = this.A00;
        if (verifyTwoFactorAuth != null) {
            AnonymousClass008.A0t("verifytwofactorauth/do-reset mode=", 2);
            verifyTwoFactorAuth.A0Y(null, 2, false);
            return;
        }
        throw null;
    }
}
