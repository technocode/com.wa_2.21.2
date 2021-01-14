package X;

import java.util.Iterator;

/* renamed from: X.0FT  reason: invalid class name */
public class AnonymousClass0FT extends AbstractC003401r {
    public static final AnonymousClass0FT A00 = new AnonymousClass0FT();

    public void A02(AnonymousClass0QM r4) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AbstractC09300ce) r1.next()).ADf(r4);
            } else {
                return;
            }
        }
    }
}
