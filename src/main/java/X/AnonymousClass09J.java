package X;

import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.09J  reason: invalid class name */
public class AnonymousClass09J {
    public static final AnonymousClass09J A02 = new AnonymousClass09J();
    public final List A00 = new ArrayList();
    public final Map A01 = new HashMap();

    public static final DeviceJid A00(C007303n r0, DeviceJid deviceJid) {
        if (deviceJid != null) {
            return deviceJid;
        }
        AnonymousClass02N r1 = r0.A00;
        if (!(r1 instanceof UserJid)) {
            return null;
        }
        DeviceJid of = DeviceJid.of(r1);
        if (of != null) {
            return of;
        }
        throw null;
    }

    public void A01(C007303n r5, DeviceJid deviceJid) {
        Map map = this.A01;
        synchronized (map) {
            Set set = (Set) map.get(r5);
            if (set == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("in-flight-messages/no message to remove: ");
                sb.append(r5);
                sb.append(" : ");
                sb.append(deviceJid);
                Log.w(sb.toString());
                return;
            }
            if (!set.remove(A00(r5, deviceJid))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("in-flight-messages/no message to remove for target: ");
                sb2.append(r5);
                sb2.append(" : ");
                sb2.append(deviceJid);
                Log.w(sb2.toString());
            }
            if (set.isEmpty()) {
                map.remove(r5);
            }
        }
    }

    public void A02(String str, Message message, boolean z) {
        List list = this.A00;
        synchronized (list) {
            list.add(new AnonymousClass1WH(str, message, z));
        }
    }
}
