package X;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.2Qd  reason: invalid class name and case insensitive filesystem */
public class C49352Qd implements Comparator {
    public final AnonymousClass01I A00;
    public final C014308b A01;
    public final Collator A02;

    public C49352Qd(AnonymousClass01I r2, C014308b r3) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r3.A0E();
    }

    /* renamed from: A00 */
    public int compare(C007003k r5, C007003k r6) {
        AnonymousClass01I r1 = this.A00;
        if (r1.A09(r5.A09)) {
            return -1;
        }
        if (r1.A09(r6.A09)) {
            return 1;
        }
        boolean A07 = r5.A07();
        boolean A072 = r6.A07();
        if (A07 == A072) {
            Collator collator = this.A02;
            C014308b r2 = this.A01;
            return collator.compare(r2.A08(r5, false), r2.A08(r6, false));
        } else if (A072) {
            return -1;
        } else {
            return 1;
        }
    }
}
