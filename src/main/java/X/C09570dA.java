package X;

import com.whatsapp.Conversation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0dA  reason: invalid class name and case insensitive filesystem */
public class C09570dA {
    public final Set A00 = new HashSet();

    public void A00() {
        Set<C39601rn> set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                for (C39601rn r0 : set) {
                    Conversation conversation = r0.A00;
                    conversation.A1C.A0B(true);
                    conversation.A1C.A09();
                }
            }
        }
    }

    public void A01() {
        Set set = this.A00;
        synchronized (set) {
            if (!set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
