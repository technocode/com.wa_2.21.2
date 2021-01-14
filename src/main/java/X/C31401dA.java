package X;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.1dA  reason: invalid class name and case insensitive filesystem */
public final class C31401dA implements AnonymousClass0RN {
    @Override // X.AnonymousClass0RN
    public Object A20(Object obj) {
        C17550rj r10;
        List<C18020se> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C18020se r2 : list) {
            List list2 = r2.A04;
            if (list2 == null || list2.isEmpty()) {
                r10 = C17550rj.A01;
            } else {
                r10 = (C17550rj) r2.A04.get(0);
            }
            arrayList.add(new C17670rx(UUID.fromString(r2.A03), r2.A02, r2.A01, r2.A05, r10, r2.A00));
        }
        return arrayList;
    }
}
