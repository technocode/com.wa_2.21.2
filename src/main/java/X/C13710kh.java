package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt$2;
import androidx.biometric.DeviceCredentialHandlerActivity;
import androidx.biometric.FingerprintDialogFragment;
import androidx.biometric.FingerprintHelperFragment;
import java.util.concurrent.Executor;

/* renamed from: X.0kh  reason: invalid class name and case insensitive filesystem */
public class C13710kh {
    public BiometricFragment A00;
    public FingerprintDialogFragment A01;
    public FingerprintHelperFragment A02;
    public ActivityC004902h A03;
    public boolean A04;
    public boolean A05;
    public final DialogInterface.OnClickListener A06 = new DialogInterface$OnClickListenerC13650kb(this);
    public final AbstractC13660kc A07;
    public final AnonymousClass0SL A08;
    public final Executor A09;

    public C13710kh(ActivityC004902h r3, Executor executor, AbstractC13660kc r5) {
        BiometricPrompt$2 biometricPrompt$2 = new BiometricPrompt$2(this);
        this.A08 = biometricPrompt$2;
        if (r3 == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null");
        } else if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null");
        } else if (r5 != null) {
            this.A03 = r3;
            this.A07 = r5;
            this.A09 = executor;
            ((AnonymousClass02i) r3).A03.A00(biometricPrompt$2);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null");
        }
    }

    public static boolean A00() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public void A01() {
        AnonymousClass0WP r0;
        FingerprintDialogFragment fingerprintDialogFragment;
        FingerprintHelperFragment fingerprintHelperFragment;
        FingerprintDialogFragment fingerprintDialogFragment2;
        BiometricFragment biometricFragment;
        AnonymousClass0WP r02;
        BiometricFragment biometricFragment2;
        if (!A00() || (biometricFragment = this.A00) == null) {
            FingerprintHelperFragment fingerprintHelperFragment2 = this.A02;
            if (!(fingerprintHelperFragment2 == null || (fingerprintDialogFragment2 = this.A01) == null)) {
                fingerprintDialogFragment2.A0y();
                fingerprintHelperFragment2.A0o(0);
            }
            if (!this.A04 && (r0 = AnonymousClass0WP.A09) != null && (fingerprintDialogFragment = r0.A05) != null && (fingerprintHelperFragment = r0.A06) != null) {
                fingerprintDialogFragment.A0y();
                fingerprintHelperFragment.A0o(0);
                return;
            }
            return;
        }
        biometricFragment.A0n();
        if (!this.A04 && (r02 = AnonymousClass0WP.A09) != null && (biometricFragment2 = r02.A03) != null) {
            biometricFragment2.A0n();
        }
    }

    public void A02(C13700kg r10) {
        FingerprintDialogFragment fingerprintDialogFragment;
        FingerprintHelperFragment fingerprintHelperFragment;
        BiometricFragment biometricFragment;
        int i;
        C04050Iv r1;
        BiometricManager biometricManager;
        if (r10 != null) {
            this.A04 = r10.A00.getBoolean("handling_device_credential_result");
            ActivityC004902h r6 = this.A03;
            if (r6 != null) {
                if (r10.A00.getBoolean("allow_device_credential") && (i = Build.VERSION.SDK_INT) <= 28) {
                    if (!this.A04) {
                        ActivityC004902h r3 = this.A03;
                        if (r3 == null) {
                            throw null;
                        } else if (r3.isFinishing()) {
                            Log.w("BiometricPromptCompat", "Failed to start handler activity. Parent activity was null or finishing.");
                            return;
                        } else {
                            A03(true);
                            Bundle bundle = r10.A00;
                            bundle.putBoolean("handling_device_credential_result", true);
                            Intent intent = new Intent(r3, DeviceCredentialHandlerActivity.class);
                            intent.putExtra("prompt_info_bundle", bundle);
                            r3.startActivity(intent);
                            return;
                        }
                    } else if (i >= 21) {
                        AnonymousClass0WP r0 = AnonymousClass0WP.A09;
                        if (r0 == null) {
                            Log.e("BiometricPromptCompat", "Failed to authenticate with device credential. Bridge was null.");
                            return;
                        } else if (!r0.A08) {
                            if (i >= 29) {
                                biometricManager = (BiometricManager) r6.getSystemService(BiometricManager.class);
                                r1 = null;
                            } else {
                                r1 = new C04050Iv(r6);
                                biometricManager = null;
                            }
                            if (i < 29 ? !r1.A05() || !r1.A04() : biometricManager.canAuthenticate() != 0) {
                                AnonymousClass0N2.A1U("BiometricPromptCompat", r6, r10.A00, null);
                                return;
                            }
                        }
                    }
                }
                ActivityC004902h r02 = this.A03;
                if (r02 != null) {
                    AnonymousClass0LW A042 = r02.A04();
                    if (A042.A0s()) {
                        Log.w("BiometricPromptCompat", "Not launching prompt. authenticate() called after onSaveInstanceState()");
                        return;
                    }
                    Bundle bundle2 = r10.A00;
                    this.A05 = false;
                    if (A00()) {
                        BiometricFragment biometricFragment2 = (BiometricFragment) A042.A0Q.A01("BiometricFragment");
                        if (biometricFragment2 != null) {
                            this.A00 = biometricFragment2;
                            biometricFragment = biometricFragment2;
                        } else {
                            biometricFragment = new BiometricFragment();
                            this.A00 = biometricFragment;
                        }
                        biometricFragment.A0p(this.A09, this.A06, this.A07);
                        biometricFragment.A03 = bundle2;
                        if (biometricFragment2 == null) {
                            AnonymousClass0QB r32 = new AnonymousClass0QB(A042);
                            r32.A0A(0, this.A00, "BiometricFragment", 1);
                            r32.A01();
                        } else if (biometricFragment.A0W) {
                            AnonymousClass0QB r33 = new AnonymousClass0QB(A042);
                            r33.A07(new C09130cL(7, this.A00));
                            r33.A01();
                        }
                    } else {
                        FingerprintDialogFragment fingerprintDialogFragment2 = (FingerprintDialogFragment) A042.A0Q.A01("FingerprintDialogFragment");
                        if (fingerprintDialogFragment2 != null) {
                            this.A01 = fingerprintDialogFragment2;
                            fingerprintDialogFragment = fingerprintDialogFragment2;
                        } else {
                            fingerprintDialogFragment = new FingerprintDialogFragment();
                            this.A01 = fingerprintDialogFragment;
                        }
                        fingerprintDialogFragment.A04 = this.A06;
                        fingerprintDialogFragment.A05 = bundle2;
                        if (!AnonymousClass0N2.A1f(r6, Build.MODEL)) {
                            FingerprintDialogFragment fingerprintDialogFragment3 = this.A01;
                            if (fingerprintDialogFragment2 == null) {
                                fingerprintDialogFragment3.A0u(A042, "FingerprintDialogFragment");
                            } else if (fingerprintDialogFragment3.A0W) {
                                AnonymousClass0QB r34 = new AnonymousClass0QB(A042);
                                r34.A07(new C09130cL(7, this.A01));
                                r34.A01();
                            }
                        }
                        FingerprintHelperFragment fingerprintHelperFragment2 = (FingerprintHelperFragment) A042.A0Q.A01("FingerprintHelperFragment");
                        if (fingerprintHelperFragment2 != null) {
                            this.A02 = fingerprintHelperFragment2;
                            fingerprintHelperFragment = fingerprintHelperFragment2;
                        } else {
                            fingerprintHelperFragment = new FingerprintHelperFragment();
                            this.A02 = fingerprintHelperFragment;
                        }
                        Executor executor = this.A09;
                        AbstractC13660kc r12 = this.A07;
                        fingerprintHelperFragment.A06 = executor;
                        fingerprintHelperFragment.A03 = r12;
                        HandlerC13740kk r35 = this.A01.A08;
                        fingerprintHelperFragment.A02 = r35;
                        fingerprintHelperFragment.A04 = new C13750kl(r35);
                        r35.sendMessageDelayed(r35.obtainMessage(6), 500);
                        if (fingerprintHelperFragment2 == null) {
                            AnonymousClass0QB r2 = new AnonymousClass0QB(A042);
                            r2.A0A(0, this.A02, "FingerprintHelperFragment", 1);
                            r2.A01();
                        } else if (this.A02.A0W) {
                            AnonymousClass0QB r36 = new AnonymousClass0QB(A042);
                            r36.A07(new C09130cL(7, this.A02));
                            r36.A01();
                        }
                    }
                    A042.A0A();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw new IllegalArgumentException("PromptInfo can not be null");
    }

    public final void A03(boolean z) {
        FingerprintHelperFragment fingerprintHelperFragment;
        FingerprintHelperFragment fingerprintHelperFragment2;
        BiometricFragment biometricFragment;
        if (Build.VERSION.SDK_INT < 29) {
            AnonymousClass0WP r3 = AnonymousClass0WP.A09;
            if (r3 == null) {
                r3 = new AnonymousClass0WP();
                AnonymousClass0WP.A09 = r3;
            }
            if (!this.A04) {
                ActivityC004902h r0 = this.A03;
                if (r0 != null) {
                    try {
                        r3.A00 = r0.getPackageManager().getActivityInfo(r0.getComponentName(), 0).getThemeResource();
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("BiometricPromptCompat", "Failed to register client theme to bridge", e);
                    }
                } else {
                    throw null;
                }
            } else if (!A00() || (biometricFragment = this.A00) == null) {
                FingerprintDialogFragment fingerprintDialogFragment = this.A01;
                if (!(fingerprintDialogFragment == null || (fingerprintHelperFragment2 = this.A02) == null)) {
                    r3.A05 = fingerprintDialogFragment;
                    r3.A06 = fingerprintHelperFragment2;
                }
            } else {
                r3.A03 = biometricFragment;
            }
            Executor executor = this.A09;
            DialogInterface.OnClickListener onClickListener = this.A06;
            AbstractC13660kc r4 = this.A07;
            r3.A07 = executor;
            r3.A04 = r4;
            BiometricFragment biometricFragment2 = r3.A03;
            if (biometricFragment2 == null || Build.VERSION.SDK_INT < 28) {
                FingerprintDialogFragment fingerprintDialogFragment2 = r3.A05;
                if (!(fingerprintDialogFragment2 == null || (fingerprintHelperFragment = r3.A06) == null)) {
                    fingerprintDialogFragment2.A04 = onClickListener;
                    fingerprintHelperFragment.A06 = executor;
                    fingerprintHelperFragment.A03 = r4;
                    HandlerC13740kk r1 = fingerprintDialogFragment2.A08;
                    fingerprintHelperFragment.A02 = r1;
                    fingerprintHelperFragment.A04 = new C13750kl(r1);
                }
            } else {
                biometricFragment2.A07 = executor;
                biometricFragment2.A01 = onClickListener;
                biometricFragment2.A05 = r4;
            }
            if (z) {
                r3.A02 = 2;
            }
        }
    }
}
