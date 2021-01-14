package X;

import java.util.Iterator;

/* renamed from: X.0B9  reason: invalid class name */
public class AnonymousClass0B9 extends AnonymousClass01G {
    public static volatile AnonymousClass0B9 A00;

    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass0B9) r1.next()).A02();
                }
            }
        }
    }

    public void A03(long j, long j2) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass0B9) r1.next()).A03(j, j2);
                }
            }
        }
    }
}
