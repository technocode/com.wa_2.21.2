package X;

import java.util.Iterator;

/* renamed from: X.0AD  reason: invalid class name */
public class AnonymousClass0AD extends AbstractC003401r {
    public static final AnonymousClass0AD A00 = new AnonymousClass0AD();

    public void A02(AnonymousClass0MH r4) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AbstractC29091Wz) r1.next()).AIQ(r4);
            } else {
                return;
            }
        }
    }
}
