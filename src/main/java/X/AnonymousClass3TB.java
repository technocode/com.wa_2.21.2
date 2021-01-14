package X;

import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3TB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3TB implements AbstractC02380Bt {
    public final /* synthetic */ AnonymousClass392 A00;

    public /* synthetic */ AnonymousClass3TB(AnonymousClass392 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02380Bt
    public final void ADF(DeviceJid deviceJid) {
        AnonymousClass392 r1 = this.A00;
        if (deviceJid != null) {
            r1.A0E.remove(deviceJid);
            r1.A0D.A00(deviceJid);
        }
    }
}
