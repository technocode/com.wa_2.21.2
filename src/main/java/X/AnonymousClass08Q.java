package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.08Q  reason: invalid class name */
public class AnonymousClass08Q extends AnonymousClass01G {
    public void A02(Collection collection) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC28271To) r1.next()).onJidsRemoved(collection);
                }
            }
        }
    }
}
