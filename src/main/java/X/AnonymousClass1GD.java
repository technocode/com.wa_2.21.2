package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.1GD  reason: invalid class name */
public final class AnonymousClass1GD implements Serializable, Comparator {
    public final float average;

    public AnonymousClass1GD(float f) {
        this.average = f;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        float f = ((AnonymousClass1o3) obj2).A00;
        float f2 = this.average;
        float abs = Math.abs(f - f2);
        float abs2 = Math.abs(((AnonymousClass1o3) obj).A00 - f2);
        if (abs < abs2) {
            return -1;
        }
        return abs == abs2 ? 0 : 1;
    }
}
