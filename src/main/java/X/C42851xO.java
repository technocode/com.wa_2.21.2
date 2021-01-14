package X;

import java.util.Set;

/* renamed from: X.1xO  reason: invalid class name and case insensitive filesystem */
public class C42851xO {
    public final /* synthetic */ C27891Sa A00;

    public C42851xO(C27891Sa r1) {
        this.A00 = r1;
    }

    public void A00(boolean z, Set set, String str) {
        boolean z2;
        C27891Sa r3 = this.A00;
        C27911Sc r2 = r3.A07;
        boolean z3 = r2.A04;
        if ((!z3 || !set.contains(r2.A00)) && (z3 || set.contains(r2.A00))) {
            z2 = false;
        } else {
            z2 = true;
        }
        r3.A00 = z2;
        r3.A05.A0E(new RunnableEBaseShape0S1210000_I1(r3, z, set, str, 1));
        AnonymousClass1Xa r0 = r3.A0C;
        if (r0 != null) {
            r3.A0D.A0E(r0.A01, 200);
        }
    }
}
