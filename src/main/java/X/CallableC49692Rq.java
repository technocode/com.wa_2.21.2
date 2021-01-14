package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Rq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49692Rq implements Callable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ SendLiveLocationKeyJob A01;
    public final /* synthetic */ C02840Dr A02;

    public /* synthetic */ CallableC49692Rq(SendLiveLocationKeyJob sendLiveLocationKeyJob, UserJid userJid, C02840Dr r3) {
        this.A01 = sendLiveLocationKeyJob;
        this.A00 = userJid;
        this.A02 = r3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SendLiveLocationKeyJob sendLiveLocationKeyJob = this.A01;
        UserJid userJid = this.A00;
        C02840Dr r3 = this.A02;
        AnonymousClass1UG A07 = sendLiveLocationKeyJob.A02.A07(C001801b.A0A(DeviceJid.of(userJid)), r3.A09());
        return new AnonymousClass02P(2, AnonymousClass0FI.A00(A07.A00), A07.A02);
    }
}
