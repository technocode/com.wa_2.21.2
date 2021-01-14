package X;

import java.util.Collection;

/* renamed from: X.0PJ  reason: invalid class name */
public class AnonymousClass0PJ extends AnonymousClass0JW {
    public final /* synthetic */ AnonymousClass0GG A00;

    public AnonymousClass0PJ(AnonymousClass0GG r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass0GG r1 = this.A00;
        synchronized (r1) {
            r1.A02 = false;
            if (!r1.A01) {
                r1.A0O.addAll(collection);
                r1.A01 = true;
                r1.A0E(r1.A02());
            }
        }
    }
}
