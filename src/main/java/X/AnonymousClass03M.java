package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.03M  reason: invalid class name */
public final class AnonymousClass03M {
    public static final AnonymousClass03N A01 = new AnonymousClass03N(null);
    public final Map A00 = new HashMap();

    public final AnonymousClass03N A00(int i) {
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return A01;
        }
        return (AnonymousClass03N) map.get(valueOf);
    }

    public final void A01(int i, Object obj) {
        if (obj == null) {
            this.A00.remove(Integer.valueOf(i));
            return;
        }
        AnonymousClass03N r3 = new AnonymousClass03N(obj);
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf) || !map.get(valueOf).equals(r3)) {
            map.put(valueOf, r3);
        }
    }
}
