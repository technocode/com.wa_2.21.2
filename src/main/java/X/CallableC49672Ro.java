package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Ro  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49672Ro implements Callable {
    public final /* synthetic */ SendFinalLiveLocationNotificationJob A00;
    public final /* synthetic */ C02840Dr A01;

    public /* synthetic */ CallableC49672Ro(SendFinalLiveLocationNotificationJob sendFinalLiveLocationNotificationJob, C02840Dr r2) {
        this.A00 = sendFinalLiveLocationNotificationJob;
        this.A01 = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SendFinalLiveLocationNotificationJob sendFinalLiveLocationNotificationJob = this.A00;
        C02840Dr r3 = this.A01;
        AnonymousClass01I r0 = sendFinalLiveLocationNotificationJob.A00;
        r0.A04();
        DeviceJid deviceJid = r0.A02;
        if (deviceJid != null) {
            return new AnonymousClass02P(2, 3, sendFinalLiveLocationNotificationJob.A01.A08(new AnonymousClass0OE(AnonymousClass2A2.A00.getRawString(), C001801b.A0A(deviceJid)), r3.A09()).A02);
        }
        throw null;
    }
}
