package X;

import java.util.Iterator;

/* renamed from: X.055  reason: invalid class name */
public class AnonymousClass055 extends AnonymousClass01G {
    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass1UP) r1.next()).onSignalStoreCreated();
                }
            }
        }
    }
}
