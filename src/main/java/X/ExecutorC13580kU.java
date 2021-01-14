package X;

import androidx.biometric.BiometricFragment;
import java.util.concurrent.Executor;

/* renamed from: X.0kU  reason: invalid class name and case insensitive filesystem */
public class ExecutorC13580kU implements Executor {
    public final /* synthetic */ BiometricFragment A00;

    public ExecutorC13580kU(BiometricFragment biometricFragment) {
        this.A00 = biometricFragment;
    }

    public void execute(Runnable runnable) {
        this.A00.A0D.post(runnable);
    }
}
