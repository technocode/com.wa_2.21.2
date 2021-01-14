package X;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.33T  reason: invalid class name */
public class AnonymousClass33T implements Comparator {
    public final /* synthetic */ HashMap A00;

    public AnonymousClass33T(HashMap hashMap) {
        this.A00 = hashMap;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        String A01 = AnonymousClass0H7.A01((String) pair.first, (String) pair.second);
        String A012 = AnonymousClass0H7.A01((String) pair2.first, (String) pair2.second);
        HashMap hashMap = this.A00;
        Object obj3 = hashMap.get(A01);
        if (obj3 != null) {
            int intValue = ((Number) obj3).intValue();
            Object obj4 = hashMap.get(A012);
            if (obj4 != null) {
                return ((Number) obj4).intValue() - intValue;
            }
            throw null;
        }
        throw null;
    }
}
