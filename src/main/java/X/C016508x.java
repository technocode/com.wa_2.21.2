package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.08x  reason: invalid class name and case insensitive filesystem */
public class C016508x extends AnonymousClass01G {
    public static final C016508x A00 = new C016508x();

    public void A02(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            synchronized (this.A00) {
                Iterator it = this.A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (r1.hasNext()) {
                        ((AnonymousClass1VF) r1.next()).ALa(userJid, set, set2);
                    }
                }
            }
        }
    }
}
