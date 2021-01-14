package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.2LG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2LG implements Comparator {
    public final /* synthetic */ Map A00;

    public /* synthetic */ AnonymousClass2LG(Map map) {
        this.A00 = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = this.A00;
        AnonymousClass0PN r6 = (AnonymousClass0PN) obj;
        AnonymousClass0PN r7 = (AnonymousClass0PN) obj2;
        if (r6 == r7) {
            return 0;
        }
        return -(((Number) map.get(r6.A0A)).longValue() > ((Number) map.get(r7.A0A)).longValue() ? 1 : (((Number) map.get(r6.A0A)).longValue() == ((Number) map.get(r7.A0A)).longValue() ? 0 : -1));
    }
}
