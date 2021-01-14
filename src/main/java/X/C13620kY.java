package X;

import android.hardware.biometrics.BiometricPrompt;
import androidx.biometric.BiometricFragment;

/* renamed from: X.0kY  reason: invalid class name and case insensitive filesystem */
public class C13620kY extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ BiometricFragment A00;

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    public C13620kY(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        AnonymousClass0WP r0 = AnonymousClass0WP.A09;
        if (r0 == null || !r0.A08) {
            BiometricFragment biometricFragment = this.A00;
            biometricFragment.A07.execute(new RunnableC13590kV(this, charSequence, i));
            biometricFragment.A0o();
        }
    }

    public void onAuthenticationFailed() {
        this.A00.A07.execute(new RunnableC13610kX(this));
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C13670kd r3;
        if (authenticationResult != null) {
            BiometricPrompt.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            if (cryptoObject != null) {
                if (cryptoObject.getCipher() != null) {
                    new C13680ke(cryptoObject.getCipher());
                } else if (cryptoObject.getSignature() != null) {
                    new C13680ke(cryptoObject.getSignature());
                } else if (cryptoObject.getMac() != null) {
                    new C13680ke(cryptoObject.getMac());
                }
            }
            r3 = new C13670kd();
        } else {
            r3 = new C13670kd();
        }
        BiometricFragment biometricFragment = this.A00;
        biometricFragment.A07.execute(new RunnableC13600kW(this, r3));
        biometricFragment.A0o();
    }
}
