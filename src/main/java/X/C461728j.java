package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.28j  reason: invalid class name and case insensitive filesystem */
public final class C461728j extends AnonymousClass25U {
    public final int A00;
    public final AbstractC229313t A01;
    public final Map A02;
    public final Map A03;

    public C461728j(AbstractC229313t r2, int i) {
        C002001d.A39(i > 0);
        this.A01 = r2;
        this.A00 = i;
        this.A02 = new HashMap();
        this.A03 = new HashMap();
    }

    @Override // X.AbstractC229313t
    public AbstractC34201i4 A3Q(C229113r r11, AnonymousClass15H r12, long j) {
        C229113r r2;
        if (this.A00 == Integer.MAX_VALUE) {
            return this.A01.A3Q(r11, r12, j);
        }
        Object obj = r11.A04;
        Object obj2 = ((Pair) obj).second;
        if (obj.equals(obj2)) {
            r2 = r11;
        } else {
            r2 = new C229113r(obj2, r11.A00, r11.A01, r11.A03, r11.A02);
        }
        this.A02.put(r2, r11);
        AbstractC34201i4 A3Q = this.A01.A3Q(r2, r12, j);
        this.A03.put(A3Q, r2);
        return A3Q;
    }

    @Override // X.AbstractC229313t
    public void AMU(AbstractC34201i4 r3) {
        this.A01.AMU(r3);
        Object remove = this.A03.remove(r3);
        if (remove != null) {
            this.A02.remove(remove);
        }
    }
}
