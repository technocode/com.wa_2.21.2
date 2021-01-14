package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Ti  reason: invalid class name and case insensitive filesystem */
public class C72553Ti implements AnonymousClass1VF {
    public final /* synthetic */ AnonymousClass392 A00;

    public C72553Ti(AnonymousClass392 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1VF
    public void ALa(UserJid userJid, Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            AnonymousClass3U2 r2 = this.A00.A0D;
            if (r2 != null) {
                StringBuilder sb = new StringBuilder("VoiceService/notifyDeviceRemoved ");
                sb.append(deviceJid);
                Log.i(sb.toString());
                AnonymousClass00E.A08(!deviceJid.isPrimary(), "primary device should never be removed");
                AnonymousClass3U7.A02(r2.A00, deviceJid, true);
            } else {
                throw null;
            }
        }
    }
}
