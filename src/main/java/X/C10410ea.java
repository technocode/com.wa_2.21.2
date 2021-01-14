package X;

import java.util.List;

/* renamed from: X.0ea  reason: invalid class name and case insensitive filesystem */
public class C10410ea extends AnonymousClass0JW {
    public final C03400Ga A00;
    public final C59902oT A01;
    public final AnonymousClass0Gb A02;

    public C10410ea(C03400Ga r1, AnonymousClass0Gb r2, C59902oT r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        if (!super.A00.isCancelled()) {
            C59902oT r1 = this.A01;
            r1.A02 = list;
            ((AbstractC16300pa) r1).A01.A00();
            AbstractC49192Pj r12 = r1.A00;
            if (r12 != null) {
                r12.ALV(true);
            }
        }
    }
}
