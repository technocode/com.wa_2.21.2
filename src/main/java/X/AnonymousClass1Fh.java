package X;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: X.1Fh  reason: invalid class name */
public final class AnonymousClass1Fh {
    public Map A00 = null;
    public final String A01;

    public AnonymousClass1Fh(String str) {
        System.currentTimeMillis();
        this.A01 = str;
    }

    public void A00(EnumC25161Fi r3, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = new EnumMap(EnumC25161Fi.class);
            this.A00 = map;
        }
        map.put(r3, obj);
    }

    public String toString() {
        return this.A01;
    }
}
