package X;

import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.2Rj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C49622Rj implements Comparator {
    public final /* synthetic */ HashMap A00;

    public /* synthetic */ C49622Rj(HashMap hashMap) {
        this.A00 = hashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap hashMap = this.A00;
        Object obj3 = hashMap.get(obj);
        if (obj3 != null) {
            int intValue = ((Number) obj3).intValue();
            Object obj4 = hashMap.get(obj2);
            if (obj4 != null) {
                return intValue - ((Number) obj4).intValue();
            }
            throw null;
        }
        throw null;
    }
}
