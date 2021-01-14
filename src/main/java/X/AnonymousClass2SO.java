package X;

import java.util.Comparator;

/* renamed from: X.2SO  reason: invalid class name */
public class AnonymousClass2SO implements Comparator {
    public AnonymousClass01A A00;
    public C49352Qd A01;

    public AnonymousClass2SO(AnonymousClass01I r2, AnonymousClass01A r3, C014308b r4) {
        this.A00 = r3;
        this.A01 = new C49352Qd(r2, r4);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C02900Dx r5 = (C02900Dx) obj2;
        C007003k A09 = this.A00.A09(((C02900Dx) obj).A06);
        if (A09 == null) {
            return 1;
        }
        C007003k A092 = this.A00.A09(r5.A06);
        if (A092 == null) {
            return -1;
        }
        return this.A01.compare(A09, A092);
    }
}
