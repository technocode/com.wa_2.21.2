package X;

import java.util.Iterator;

/* renamed from: X.0C3  reason: invalid class name */
public class AnonymousClass0C3 extends AnonymousClass01G {
    public static volatile AnonymousClass0C3 A00;

    public static AnonymousClass0C3 A00() {
        if (A00 == null) {
            synchronized (AnonymousClass0C3.class) {
                if (A00 == null) {
                    A00 = new AnonymousClass0C3();
                }
            }
        }
        return A00;
    }

    public void A02() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass0DI) r1.next()).AKr();
                }
            }
        }
    }

    public void A03() {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass0DI) r1.next()).AKs();
                }
            }
        }
    }
}
