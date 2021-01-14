package X;

import android.util.Pair;
import com.whatsapp.jobqueue.job.SendRetryReceiptJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Rt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49722Rt implements Callable {
    public final /* synthetic */ SendRetryReceiptJob A00;

    public /* synthetic */ CallableC49722Rt(SendRetryReceiptJob sendRetryReceiptJob) {
        this.A00 = sendRetryReceiptJob;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SendRetryReceiptJob sendRetryReceiptJob = this.A00;
        byte[] A0Y = sendRetryReceiptJob.A00.A0Y();
        C001000o r1 = sendRetryReceiptJob.A00;
        r1.A0H.A00();
        return new Pair(A0Y, new AnonymousClass1XQ[]{sendRetryReceiptJob.A00.A0G(), r1.A00.A05()});
    }
}
