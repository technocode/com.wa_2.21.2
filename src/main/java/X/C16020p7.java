package X;

import java.util.Comparator;

/* renamed from: X.0p7  reason: invalid class name and case insensitive filesystem */
public final class C16020p7 implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C16070pC r3 = (C16070pC) obj;
        C16070pC r4 = (C16070pC) obj2;
        int i = r3.A01 - r4.A01;
        return i == 0 ? r3.A02 - r4.A02 : i;
    }
}
