package X;

import java.util.Comparator;

/* renamed from: X.39F  reason: invalid class name */
public class AnonymousClass39F implements Comparator {
    public final C000300f A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;

    public AnonymousClass39F(AnonymousClass01A r1, C014308b r2, C000300f r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    /* renamed from: A00 */
    public int compare(AnonymousClass0QP r9, AnonymousClass0QP r10) {
        int i = r9.A00;
        int i2 = r10.A00;
        AnonymousClass01A r1 = this.A01;
        C007003k A0A = r1.A0A(r9.A02);
        C007003k A0A2 = r1.A0A(r10.A02);
        if (this.A00.A06(AbstractC000400g.A3J) >= 2) {
            AnonymousClass0QW r3 = A0A.A08;
            boolean z = false;
            if (r3 != null) {
                z = true;
            }
            boolean z2 = false;
            if (A0A2.A08 != null) {
                z2 = true;
            }
            if (z == z2) {
                C014308b r0 = this.A02;
                return r0.A08(A0A, false).compareTo(r0.A08(A0A2, false));
            } else if (r3 == null) {
                return 1;
            } else {
                return -1;
            }
        } else if (i == i2) {
            AnonymousClass0QW r32 = A0A.A08;
            boolean z3 = false;
            if (r32 != null) {
                z3 = true;
            }
            boolean z4 = false;
            if (A0A2.A08 != null) {
                z4 = true;
            }
            if (z3 == z4) {
                return 0;
            }
            if (r32 == null) {
                return 1;
            }
            return -1;
        } else if (i != 5) {
            return 1;
        } else {
            return -1;
        }
    }
}
