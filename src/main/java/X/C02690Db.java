package X;

import java.util.Collections;

/* renamed from: X.0Db  reason: invalid class name and case insensitive filesystem */
public class C02690Db extends AnonymousClass0DZ {
    public final AnonymousClass09F A00;
    public final AnonymousClass00S A01;
    public final C014408c A02;
    public final C006903j A03;
    public final AnonymousClass01Q A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass0BB A06;

    public C02690Db(AnonymousClass00S r1, C014408c r2, C006903j r3, AnonymousClass09F r4, AnonymousClass01K r5, AnonymousClass0BB r6, AnonymousClass0DU r7, AnonymousClass01Q r8) {
        super(r7);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r8;
    }

    public final void A06(AnonymousClass2bZ r11, C08560bL r12) {
        boolean z = r12.A0R;
        boolean z2 = r11.A02;
        if (z != z2) {
            r12.A0R = z2;
            this.A02.A0C(r12);
            this.A00.A01();
            if (z2) {
                AnonymousClass0BB r2 = this.A06;
                AnonymousClass02N r4 = r11.A00;
                if (r2.A08(r4).A0E) {
                    r2.A0C(r4, false, 0);
                    AnonymousClass0DU r1 = super.A00;
                    r1.A0G(r1.A0B(Collections.singleton(new C52752bh(null, r4, false, r11.A04, null, false))));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r1.A04 >= r11.A04) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r1.A04 >= r11.A04) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass2bZ r11, java.util.List r12) {
        /*
        // Method dump skipped, instructions count: 216
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02690Db.A07(X.2bZ, java.util.List):void");
    }
}
