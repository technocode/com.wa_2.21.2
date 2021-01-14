package X;

import java.util.Comparator;

/* renamed from: X.33P  reason: invalid class name */
public class AnonymousClass33P implements Comparator {
    public final boolean A00;

    public AnonymousClass33P(boolean z) {
        this.A00 = z;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        AnonymousClass33N r4 = (AnonymousClass33N) obj;
        AnonymousClass33N r5 = (AnonymousClass33N) obj2;
        if (this.A00) {
            boolean z = r5.A06;
            if (z == r4.A06) {
                boolean A01 = r5.A01();
                if (A01 != r4.A01()) {
                    if (A01) {
                        return 1;
                    }
                    return -1;
                }
            } else if (z) {
                return 1;
            } else {
                return -1;
            }
        }
        return r5.A00 - r4.A00;
    }
}
