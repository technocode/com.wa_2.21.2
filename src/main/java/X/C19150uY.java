package X;

import java.util.Comparator;

/* renamed from: X.0uY  reason: invalid class name and case insensitive filesystem */
public final class C19150uY implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        AbstractC19160uZ r6 = (AbstractC19160uZ) obj;
        AbstractC19160uZ r7 = (AbstractC19160uZ) obj2;
        int i = r6.A03;
        int i2 = r7.A03;
        float f = r6.A02;
        float f2 = r7.A02;
        int i3 = i - i2;
        if (i != i2) {
            return i3;
        }
        if (f != f2) {
            return (int) Math.signum(f - f2);
        }
        return r6.A07 - r7.A07;
    }
}
