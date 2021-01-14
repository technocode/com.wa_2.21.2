package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.0lv  reason: invalid class name and case insensitive filesystem */
public final class C14310lv {
    public final AnonymousClass05W A00 = new AnonymousClass05W();
    public final C14840my A01 = new C14840my(10);
    public final ArrayList A02 = new ArrayList();
    public final HashSet A03 = new HashSet();

    public final void A00(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                AbstractList abstractList = (AbstractList) this.A00.getOrDefault(obj, null);
                if (abstractList != null) {
                    int size = abstractList.size();
                    for (int i = 0; i < size; i++) {
                        A00(abstractList.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
