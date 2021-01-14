package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import java.util.concurrent.Callable;

/* renamed from: X.2Rs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC49712Rs implements Callable {
    public final /* synthetic */ DeviceJid A00;
    public final /* synthetic */ SendPeerMessageJob A01;
    public final /* synthetic */ byte[] A02;

    public /* synthetic */ CallableC49712Rs(SendPeerMessageJob sendPeerMessageJob, DeviceJid deviceJid, byte[] bArr) {
        this.A01 = sendPeerMessageJob;
        this.A00 = deviceJid;
        this.A02 = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SendPeerMessageJob sendPeerMessageJob = this.A01;
        DeviceJid deviceJid = this.A00;
        byte[] bArr = this.A02;
        AnonymousClass1UG A07 = sendPeerMessageJob.A03.A07(C001801b.A0A(deviceJid), bArr);
        return new AnonymousClass02P(2, AnonymousClass0FI.A00(A07.A00), A07.A02);
    }
}
