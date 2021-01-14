package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Rp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49682Rp implements Callable {
    public final /* synthetic */ SendFinalLiveLocationRetryJob A00;
    public final /* synthetic */ C02840Dr A01;

    public /* synthetic */ CallableC49682Rp(SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob, C02840Dr r2) {
        this.A00 = sendFinalLiveLocationRetryJob;
        this.A01 = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob = this.A00;
        C02840Dr r3 = this.A01;
        AnonymousClass1UG A07 = sendFinalLiveLocationRetryJob.A02.A07(C001801b.A0A(DeviceJid.getNullable(sendFinalLiveLocationRetryJob.rawDeviceJid)), r3.A09());
        return new AnonymousClass02P(2, AnonymousClass0FI.A00(A07.A00), A07.A02);
    }
}
