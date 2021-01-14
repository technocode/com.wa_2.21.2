package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Uy  reason: invalid class name and case insensitive filesystem */
public class C50502Uy {
    public final HashSet A00 = new HashSet();
    public final LinkedHashMap A01 = new LinkedHashMap();
    public final /* synthetic */ C04340Jz A02;

    public C50502Uy(C04340Jz r2) {
        this.A02 = r2;
    }

    public synchronized void A00() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HashSet hashSet = this.A00;
            if (!hashSet.contains(entry.getKey())) {
                break;
            }
            AbstractC007503q r4 = (AbstractC007503q) entry.getValue();
            it.remove();
            hashSet.remove(entry.getKey());
            C04340Jz r3 = this.A02;
            r3.A00.A03(r4, false, null);
            r3.A02.ANF(new RunnableEBaseShape8S0200000_I1_3(this, r4, 32));
            StringBuilder sb = new StringBuilder();
            sb.append("media-message-send-queue/send ");
            sb.append(r4.A0n);
            Log.d(sb.toString());
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("[pending:");
        sb.append(this.A01.size());
        sb.append(" ready:");
        sb.append(this.A00.size());
        sb.append("]");
        return sb.toString();
    }
}
