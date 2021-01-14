package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0L3  reason: invalid class name */
public class AnonymousClass0L3 extends AbstractC003401r {
    public static final AnonymousClass0L3 A00 = new AnonymousClass0L3();

    public void A02(DeviceJid deviceJid) {
        StringBuilder sb = new StringBuilder("AxolotlSessionObservable/notifyAxolotlSessionEstablished: jid=");
        sb.append(deviceJid);
        Log.d(sb.toString());
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AbstractC02380Bt) r1.next()).ADF(deviceJid);
            } else {
                return;
            }
        }
    }
}
