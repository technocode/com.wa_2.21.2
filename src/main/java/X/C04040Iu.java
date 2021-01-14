package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;

/* renamed from: X.0Iu  reason: invalid class name and case insensitive filesystem */
public class C04040Iu {
    public final BiometricManager A00;
    public final C04050Iv A01;

    public C04040Iu(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A00 = (BiometricManager) context.getSystemService(BiometricManager.class);
        } else {
            this.A01 = new C04050Iv(context);
        }
    }

    public int A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.A00.canAuthenticate();
        }
        C04050Iv r1 = this.A01;
        if (!r1.A05()) {
            return 12;
        }
        return !r1.A04() ? 11 : 0;
    }
}
