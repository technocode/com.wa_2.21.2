package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.33k  reason: invalid class name and case insensitive filesystem */
public class C662333k extends ArrayList<AnonymousClass33N> {
    public C662333k(List list, List list2) {
        super(list2.size() + list.size());
        AnonymousClass33P r0 = new AnonymousClass33P(false);
        addAll(list);
        addAll(list2);
        Collections.sort(this, r0);
    }
}
