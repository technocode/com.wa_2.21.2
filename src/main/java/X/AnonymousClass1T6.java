package X;

import com.whatsapp.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/* renamed from: X.1T6  reason: invalid class name */
public class AnonymousClass1T6 {
    public final C28031So A00 = new C28031So();
    public final HashMap A01 = new HashMap();
    public final Stack A02 = new Stack();

    public static final void A00(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            ((C28021Sn) entry.getValue()).A00 = false;
        }
        hashMap.clear();
    }

    public void A01(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((AbstractMap) this.A02.peek()).put(entry.getKey(), entry.getValue());
        }
    }

    public void A02(boolean z) {
        C28031So r3 = this.A00;
        if (r3 != null) {
            StringBuilder sb = new StringBuilder("BloksCallbackQueue/setActive(");
            sb.append(z);
            sb.append(")/queue size=");
            Queue queue = r3.A01;
            sb.append(queue.size());
            Log.d(sb.toString());
            r3.A00 = z;
            if (z) {
                while (!queue.isEmpty()) {
                    Object poll = queue.poll();
                    if (poll != null) {
                        ((Runnable) poll).run();
                    } else {
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        throw null;
    }
}
