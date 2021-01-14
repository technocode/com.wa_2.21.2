package X;

import androidx.biometric.BiometricFragment;
import androidx.biometric.FingerprintDialogFragment;
import androidx.biometric.FingerprintHelperFragment;
import java.util.concurrent.Executor;

/* renamed from: X.0WP  reason: invalid class name */
public class AnonymousClass0WP {
    public static AnonymousClass0WP A09;
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public BiometricFragment A03;
    public AbstractC13660kc A04;
    public FingerprintDialogFragment A05;
    public FingerprintHelperFragment A06;
    public Executor A07;
    public boolean A08;

    public void A00() {
        int i = this.A02;
        if (i != 2) {
            if (i == 1) {
                this.A02 = 0;
                return;
            }
            this.A00 = 0;
            this.A03 = null;
            this.A05 = null;
            this.A06 = null;
            this.A07 = null;
            this.A04 = null;
            this.A01 = 0;
            this.A08 = false;
            A09 = null;
        }
    }
}
