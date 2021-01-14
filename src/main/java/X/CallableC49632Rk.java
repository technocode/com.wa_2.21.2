package X;

import com.whatsapp.jobqueue.job.RotateSignedPreKeyJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Rk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49632Rk implements Callable {
    public final /* synthetic */ RotateSignedPreKeyJob A00;

    public /* synthetic */ CallableC49632Rk(RotateSignedPreKeyJob rotateSignedPreKeyJob) {
        this.A00 = rotateSignedPreKeyJob;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.A00.A01.A0G();
    }
}
