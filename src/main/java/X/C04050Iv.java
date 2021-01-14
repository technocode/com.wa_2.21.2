package X;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Iv  reason: invalid class name and case insensitive filesystem */
public final class C04050Iv {
    public final Context A00;

    public C04050Iv(Context context) {
        this.A00 = context;
    }

    public static FingerprintManager.AuthenticationCallback A00(AbstractC04060Iw r1) {
        return new C14720mm(r1);
    }

    public static FingerprintManager.CryptoObject A01(C04070Ix r3) {
        if (r3 == null) {
            return null;
        }
        Cipher cipher = r3.A01;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        Signature signature = r3.A00;
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        Mac mac = r3.A02;
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }

    public static FingerprintManager A02(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    public void A03(C04070Ix r7, C04080Iy r8, AbstractC04060Iw r9) {
        FingerprintManager A02;
        CancellationSignal cancellationSignal;
        if (Build.VERSION.SDK_INT >= 23 && (A02 = A02(this.A00)) != null) {
            if (r8 != null) {
                cancellationSignal = (CancellationSignal) r8.A00();
            } else {
                cancellationSignal = null;
            }
            A02.authenticate(A01(r7), cancellationSignal, 0, A00(r9), null);
        }
    }

    public boolean A04() {
        FingerprintManager A02;
        if (Build.VERSION.SDK_INT < 23 || (A02 = A02(this.A00)) == null || !A02.hasEnrolledFingerprints()) {
            return false;
        }
        return true;
    }

    public boolean A05() {
        FingerprintManager A02;
        if (Build.VERSION.SDK_INT < 23 || (A02 = A02(this.A00)) == null || !A02.isHardwareDetected()) {
            return false;
        }
        return true;
    }
}
