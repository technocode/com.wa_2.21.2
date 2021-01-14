package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.37l  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC671637l implements Callable {
    public final /* synthetic */ DeviceJid A00;
    public final /* synthetic */ C02840Dr A01;
    public final /* synthetic */ AnonymousClass392 A02;

    public /* synthetic */ CallableC671637l(AnonymousClass392 r1, DeviceJid deviceJid, C02840Dr r3) {
        this.A02 = r1;
        this.A00 = deviceJid;
        this.A01 = r3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AnonymousClass392 r0 = this.A02;
        DeviceJid deviceJid = this.A00;
        C02840Dr r3 = this.A01;
        C001000o r2 = r0.A07;
        AnonymousClass00E.A08(r2.A0W(C001801b.A0A(deviceJid)), "no session with deviceJid");
        AnonymousClass1UG A07 = r2.A07(C001801b.A0A(deviceJid), r3.A09());
        return new AnonymousClass02P(2, AnonymousClass0FI.A00(A07.A00), A07.A02);
    }
}
