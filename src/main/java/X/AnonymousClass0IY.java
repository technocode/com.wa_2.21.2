package X;

import java.util.Iterator;

/* renamed from: X.0IY  reason: invalid class name */
public class AnonymousClass0IY extends AbstractC003401r {
    public static volatile AnonymousClass0IY A01;
    public volatile boolean A00;

    public static AnonymousClass0IY A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0IY.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0IY();
                }
            }
        }
        return A01;
    }

    public void A02(boolean z) {
        AnonymousClass00E.A01();
        if (z != this.A00) {
            this.A00 = z;
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AbstractC03900If) r1.next()).AJm(this.A00);
                } else {
                    return;
                }
            }
        }
    }
}
