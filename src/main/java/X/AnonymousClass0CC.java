package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0CC  reason: invalid class name */
public class AnonymousClass0CC {
    public static volatile AnonymousClass0CC A03;
    public final C001000o A00;
    public final AnonymousClass01L A01;
    public final AnonymousClass0AR A02;

    public AnonymousClass0CC(AnonymousClass0AR r1, C001000o r2, AnonymousClass01L r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static AnonymousClass0CC A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0CC.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0CC(AnonymousClass0AR.A00(), C001000o.A00(), AnonymousClass01L.A00());
                }
            }
        }
        return A03;
    }

    public Map A01(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            AnonymousClass0QZ A0A = this.A00.A0A(C001801b.A0A(deviceJid));
            if (A0A != null) {
                hashMap.put(deviceJid, A0A);
            }
        }
        return hashMap;
    }

    public void A02(UserJid userJid) {
        Set A07 = this.A01.A07(userJid);
        Map A012 = A01(A07);
        ArrayList arrayList = new ArrayList(A07);
        arrayList.removeAll(((AbstractMap) A012).keySet());
        if (!arrayList.isEmpty()) {
            this.A02.A0R(arrayList);
        }
    }
}
