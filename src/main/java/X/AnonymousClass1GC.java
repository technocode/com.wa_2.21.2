package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.1GC  reason: invalid class name */
public final class AnonymousClass1GC implements Serializable, Comparator {
    public final float average;

    public AnonymousClass1GC(float f) {
        this.average = f;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        AnonymousClass1o3 r4 = (AnonymousClass1o3) obj;
        AnonymousClass1o3 r5 = (AnonymousClass1o3) obj2;
        int i = r5.A01;
        int i2 = r4.A01;
        if (i != i2) {
            return i - i2;
        }
        float f = r5.A00;
        float f2 = this.average;
        float abs = Math.abs(f - f2);
        float abs2 = Math.abs(r4.A00 - f2);
        if (abs < abs2) {
            return 1;
        }
        return abs == abs2 ? 0 : -1;
    }
}
