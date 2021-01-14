package X;

import android.hardware.fingerprint.FingerprintManager;

/* renamed from: X.0mm  reason: invalid class name and case insensitive filesystem */
public final class C14720mm extends FingerprintManager.AuthenticationCallback {
    public final /* synthetic */ AbstractC04060Iw A00;

    public C14720mm(AbstractC04060Iw r1) {
        this.A00 = r1;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.A00.A01(i, charSequence);
    }

    public void onAuthenticationFailed() {
        this.A00.A00();
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
        this.A00.A02(i, charSequence);
    }

    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        AbstractC04060Iw r3 = this.A00;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        C04070Ix r1 = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                r1 = new C04070Ix(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                r1 = new C04070Ix(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                r1 = new C04070Ix(cryptoObject.getMac());
            }
        }
        r3.A03(new C14730mn(r1));
    }
}
