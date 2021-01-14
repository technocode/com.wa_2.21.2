package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.01U  reason: invalid class name */
public class AnonymousClass01U implements AnonymousClass01V {
    public final /* synthetic */ AnonymousClass01H A00;

    @Override // X.AnonymousClass01V
    public void AGS(DeviceJid deviceJid, int i) {
    }

    public AnonymousClass01U(AnonymousClass01H r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass01V
    public void AGh(DeviceJid deviceJid) {
        byte[] bArr;
        UserJid userJid = deviceJid.userJid;
        AnonymousClass01H r1 = this.A00;
        AnonymousClass01P r3 = r1.A0B;
        AnonymousClass0J9 A0C = r3.A02.A0C(userJid);
        if (A0C != null && A0C.A02 > 0 && (bArr = A0C.A09) != null) {
            AnonymousClass008.A14("confirming unconfirmed vname cert; jid=", userJid);
            if (r3.A05(userJid, bArr, A0C.A03, 5, A0C.A00())) {
                r1.A08.A0E(userJid, AnonymousClass37W.A00(A0C).A01());
            }
        }
    }

    @Override // X.AnonymousClass01V
    public void AGi(DeviceJid deviceJid) {
        AnonymousClass01H.A00(this.A00, deviceJid, false);
    }

    @Override // X.AnonymousClass01V
    public void AGj(DeviceJid deviceJid) {
        AnonymousClass01H.A00(this.A00, deviceJid, true);
    }
}
