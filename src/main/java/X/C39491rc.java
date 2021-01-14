package X;

import java.util.List;

/* renamed from: X.1rc  reason: invalid class name and case insensitive filesystem */
public class C39491rc implements AbstractC28321Tw {
    public AnonymousClass0AQ A00;
    public final C014308b A01;
    public final List A02;

    public C39491rc(AnonymousClass0AQ r1, C014308b r2, List list) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = list;
    }

    @Override // X.AbstractC28321Tw
    public boolean A4E(AnonymousClass02N r5) {
        C007003k r3 = (C007003k) this.A00.A05().get(r5);
        if (r3 == null || AnonymousClass1VY.A0d(r3.A09) || !this.A01.A0G(r3, this.A02, true)) {
            return false;
        }
        return true;
    }
}
