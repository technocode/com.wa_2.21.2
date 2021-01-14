package X;

import java.util.Comparator;

/* renamed from: X.0oi  reason: invalid class name and case insensitive filesystem */
public final class C15790oi implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C15800oj r6 = (C15800oj) obj;
        C15800oj r7 = (C15800oj) obj2;
        int i = (r7.A03 - r7.A06) + 1;
        int i2 = (r7.A01 - r7.A04) + 1;
        int i3 = (r6.A03 - r6.A06) + 1;
        return (i2 * (((r7.A02 - r7.A05) + 1) * i)) - (((r6.A01 - r6.A04) + 1) * (((r6.A02 - r6.A05) + 1) * i3));
    }
}
