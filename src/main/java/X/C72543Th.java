package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.3Th  reason: invalid class name and case insensitive filesystem */
public class C72543Th implements AnonymousClass01V {
    public final /* synthetic */ AnonymousClass392 A00;

    @Override // X.AnonymousClass01V
    public void AGS(DeviceJid deviceJid, int i) {
    }

    @Override // X.AnonymousClass01V
    public void AGh(DeviceJid deviceJid) {
    }

    public C72543Th(AnonymousClass392 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass01V
    public void AGi(DeviceJid deviceJid) {
        AnonymousClass3U2 r2 = this.A00.A0D;
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("VoiceService/notifyDeviceIdentityChanged ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            AnonymousClass3U7.A02(r2.A00, deviceJid, false);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass01V
    public void AGj(DeviceJid deviceJid) {
        AnonymousClass3U2 r2 = this.A00.A0D;
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("VoiceService/notifyDeviceIdentityDeleted ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            AnonymousClass3U7.A02(r2.A00, deviceJid, true);
            return;
        }
        throw null;
    }
}
