package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.12U  reason: invalid class name */
public final class AnonymousClass12U {
    public AnonymousClass12R A00 = AnonymousClass12R.A00;
    public AnonymousClass12T A01;
    public AnonymousClass12T A02;
    public boolean A03;
    public final AnonymousClass12P A04 = new AnonymousClass12P();
    public final ArrayList A05 = new ArrayList();
    public final HashMap A06 = new HashMap();

    public final AnonymousClass12T A00(AnonymousClass12T r5, AnonymousClass12R r6) {
        C229113r r3 = r5.A02;
        int A042 = r6.A04(r3.A04);
        if (A042 == -1) {
            return r5;
        }
        return new AnonymousClass12T(r3, r6, r6.A08(A042, this.A04, false).A00);
    }

    public final void A01() {
        ArrayList arrayList = this.A05;
        if (!arrayList.isEmpty()) {
            this.A01 = (AnonymousClass12T) arrayList.get(0);
        }
    }
}
