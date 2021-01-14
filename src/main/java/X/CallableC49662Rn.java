package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Rn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49662Rn implements Callable {
    public final /* synthetic */ DeviceJid A00;
    public final /* synthetic */ SendE2EMessageJob A01;
    public final /* synthetic */ C02840Dr A02;
    public final /* synthetic */ AbstractC007503q A03;

    public /* synthetic */ CallableC49662Rn(SendE2EMessageJob sendE2EMessageJob, DeviceJid deviceJid, C02840Dr r3, AbstractC007503q r4) {
        this.A01 = sendE2EMessageJob;
        this.A00 = deviceJid;
        this.A02 = r3;
        this.A03 = r4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return SendE2EMessageJob.A01(this.A01.A07(this.A00, this.A02, this.A03));
    }
}
