package androidx.biometric;

import X.AbstractC13660kc;
import X.ActivityC004902h;
import X.AnonymousClass082;
import X.AnonymousClass0SL;
import X.AnonymousClass0WP;
import X.C13670kd;
import X.C13710kh;
import X.C13750kl;
import X.HandlerC13740kk;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.search.verification.client.R;
import java.util.concurrent.Executor;

public class BiometricPrompt$2 implements AnonymousClass0SL {
    public final /* synthetic */ C13710kh A00;

    public BiometricPrompt$2(C13710kh r1) {
        this.A00 = r1;
    }

    @OnLifecycleEvent(AnonymousClass082.ON_PAUSE)
    public void onPause() {
        FingerprintHelperFragment fingerprintHelperFragment;
        BiometricFragment biometricFragment;
        C13710kh r4 = this.A00;
        ActivityC004902h r0 = r4.A03;
        if (r0 == null) {
            throw null;
        } else if (r0 == null) {
            throw null;
        } else if (!r0.isChangingConfigurations()) {
            if (!C13710kh.A00() || (biometricFragment = r4.A00) == null) {
                FingerprintDialogFragment fingerprintDialogFragment = r4.A01;
                if (!(fingerprintDialogFragment == null || (fingerprintHelperFragment = r4.A02) == null)) {
                    fingerprintDialogFragment.A0y();
                    fingerprintHelperFragment.A0o(0);
                }
            } else {
                Bundle bundle = biometricFragment.A03;
                if (bundle == null || !bundle.getBoolean("allow_device_credential", false)) {
                    r4.A00.A0n();
                } else if (!r4.A05) {
                    r4.A05 = true;
                } else {
                    r4.A00.A0n();
                }
            }
            AnonymousClass0WP r02 = AnonymousClass0WP.A09;
            if (r02 != null) {
                r02.A00();
            }
        }
    }

    @OnLifecycleEvent(AnonymousClass082.ON_RESUME)
    public void onResume() {
        BiometricFragment biometricFragment;
        AnonymousClass0WP r3;
        C13710kh r4 = this.A00;
        if (C13710kh.A00()) {
            ActivityC004902h r0 = r4.A03;
            if (r0 != null) {
                biometricFragment = (BiometricFragment) r0.A04().A0Q.A01("BiometricFragment");
            } else {
                throw null;
            }
        } else {
            biometricFragment = null;
        }
        r4.A00 = biometricFragment;
        if (!C13710kh.A00() || biometricFragment == null) {
            ActivityC004902h r02 = r4.A03;
            if (r02 != null) {
                r4.A01 = (FingerprintDialogFragment) r02.A04().A0Q.A01("FingerprintDialogFragment");
                ActivityC004902h r03 = r4.A03;
                if (r03 != null) {
                    FingerprintHelperFragment fingerprintHelperFragment = (FingerprintHelperFragment) r03.A04().A0Q.A01("FingerprintHelperFragment");
                    r4.A02 = fingerprintHelperFragment;
                    FingerprintDialogFragment fingerprintDialogFragment = r4.A01;
                    if (fingerprintDialogFragment != null) {
                        fingerprintDialogFragment.A04 = r4.A06;
                    }
                    if (fingerprintHelperFragment != null) {
                        Executor executor = r4.A09;
                        AbstractC13660kc r04 = r4.A07;
                        fingerprintHelperFragment.A06 = executor;
                        fingerprintHelperFragment.A03 = r04;
                        if (fingerprintDialogFragment != null) {
                            HandlerC13740kk r1 = fingerprintDialogFragment.A08;
                            fingerprintHelperFragment.A02 = r1;
                            fingerprintHelperFragment.A04 = new C13750kl(r1);
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            biometricFragment.A0p(r4.A09, r4.A06, r4.A07);
        }
        if (!r4.A04 && (r3 = AnonymousClass0WP.A09) != null) {
            int i = r3.A01;
            if (i == 1) {
                r4.A07.A01(new C13670kd());
                r3.A02 = 0;
                r3.A00();
            } else if (i == 2) {
                ActivityC004902h r12 = r4.A03;
                if (r12 == null) {
                    throw null;
                } else if (r12 != null) {
                    r4.A07.A00(10, r12.getString(R.string.generic_error_user_canceled));
                    r3.A02 = 0;
                    r3.A00();
                } else {
                    throw null;
                }
            }
        }
        r4.A03(false);
    }
}
