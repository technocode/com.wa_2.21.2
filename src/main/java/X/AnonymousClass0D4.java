package X;

import java.util.Comparator;

/* renamed from: X.0D4  reason: invalid class name */
public final class AnonymousClass0D4 implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i;
        AnonymousClass33G r3 = (AnonymousClass33G) obj;
        AnonymousClass33G r4 = (AnonymousClass33G) obj2;
        int i2 = 0;
        if (r3 == null) {
            i = 0;
        } else {
            i = r3.A01;
        }
        if (r4 != null) {
            i2 = r4.A01;
        }
        return i2 - i;
    }
}
