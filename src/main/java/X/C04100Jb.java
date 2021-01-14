package X;

import java.util.Iterator;

/* renamed from: X.0Jb  reason: invalid class name and case insensitive filesystem */
public class C04100Jb extends AbstractC003401r {
    public void A02(C48742Nn r4) {
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AbstractC05090Nd) r1.next()).AHx(r4);
            } else {
                return;
            }
        }
    }
}
