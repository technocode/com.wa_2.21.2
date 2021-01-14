package X;

import java.util.ArrayList;

/* renamed from: X.3Tu  reason: invalid class name and case insensitive filesystem */
public class C72673Tu extends AnonymousClass39F {
    public final C014308b A00;
    public final ArrayList A01;

    public C72673Tu(C000300f r1, AnonymousClass01A r2, C014308b r3, ArrayList arrayList) {
        super(r2, r3, r1);
        this.A00 = r3;
        this.A01 = arrayList;
    }

    @Override // X.AnonymousClass39F
    public int A00(AnonymousClass0QP r6, AnonymousClass0QP r7) {
        AnonymousClass01A r2 = super.A01;
        C007003k A0A = r2.A0A(r6.A02);
        C007003k A0A2 = r2.A0A(r7.A02);
        C014308b r3 = this.A00;
        ArrayList arrayList = this.A01;
        boolean A0G = r3.A0G(A0A, arrayList, true);
        if (A0G == r3.A0G(A0A2, arrayList, true)) {
            return super.compare(r6, r7);
        }
        if (A0G) {
            return -1;
        }
        return 1;
    }
}
