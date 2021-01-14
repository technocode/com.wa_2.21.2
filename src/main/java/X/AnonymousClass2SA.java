package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.2SA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2SA implements Callable {
    public final /* synthetic */ AnonymousClass01S A00;
    public final /* synthetic */ C02840Dr A01;

    public /* synthetic */ AnonymousClass2SA(AnonymousClass01S r1, C02840Dr r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AnonymousClass01S r4 = this.A00;
        C02840Dr r3 = this.A01;
        AnonymousClass01I r0 = r4.A0A;
        r0.A04();
        DeviceJid deviceJid = r0.A02;
        if (deviceJid != null) {
            return new AnonymousClass02P(2, 3, r4.A0I.A08(new AnonymousClass0OE(AnonymousClass2A2.A00.getRawString(), C001801b.A0A(deviceJid)), r3.A09()).A02);
        }
        throw null;
    }
}
