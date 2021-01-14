package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.2W7  reason: invalid class name */
public class AnonymousClass2W7 implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        return (((AbstractC007503q) list.get(list.size() - 1)).A0E > ((AbstractC007503q) list2.get(list2.size() - 1)).A0E ? 1 : (((AbstractC007503q) list.get(list.size() - 1)).A0E == ((AbstractC007503q) list2.get(list2.size() - 1)).A0E ? 0 : -1));
    }
}
