package X;

import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;

/* renamed from: X.3Ml  reason: invalid class name and case insensitive filesystem */
public class C70803Ml implements AbstractC26321Kk {
    public final /* synthetic */ VerifyTwoFactorAuth A00;

    @Override // X.AbstractC26321Kk
    public void AI2(String str) {
    }

    public C70803Ml(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        this.A00 = verifyTwoFactorAuth;
    }

    @Override // X.AbstractC26321Kk
    public void AEJ(String str) {
        VerifyTwoFactorAuth verifyTwoFactorAuth = this.A00;
        if (verifyTwoFactorAuth != null) {
            Log.d("verifytwofactorauth/submit");
            verifyTwoFactorAuth.A0Y(verifyTwoFactorAuth.A07.getCode(), 0, false);
            return;
        }
        throw null;
    }
}
