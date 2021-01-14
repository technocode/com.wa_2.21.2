package X;

import com.whatsapp.CodeInputField;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;

/* renamed from: X.3MZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MZ implements AbstractC000900m {
    public final /* synthetic */ VerifyTwoFactorAuth A00;

    public /* synthetic */ AnonymousClass3MZ(VerifyTwoFactorAuth verifyTwoFactorAuth) {
        this.A00 = verifyTwoFactorAuth;
    }

    @Override // X.AbstractC000900m
    public final void AEa(AnonymousClass0JF r4) {
        CodeInputField codeInputField;
        VerifyTwoFactorAuth verifyTwoFactorAuth = this.A00;
        StringBuilder A0S = AnonymousClass008.A0S("verifytwofactorauth/networkStateChanged isConnected: ");
        boolean z = r4.A02;
        AnonymousClass008.A1Z(A0S, z);
        if (z && (codeInputField = verifyTwoFactorAuth.A07) != null && codeInputField.getCode().length() == 6) {
            Log.d("verifytwofactorauth/submit");
            verifyTwoFactorAuth.A0Y(verifyTwoFactorAuth.A07.getCode(), 0, false);
        }
    }
}
