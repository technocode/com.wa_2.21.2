package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.15K  reason: invalid class name */
public final class AnonymousClass15K {
    public Map A00;
    public final Map A01 = new HashMap();

    public synchronized Map A00() {
        Map map;
        map = this.A00;
        if (map == null) {
            map = Collections.unmodifiableMap(new HashMap(this.A01));
            this.A00 = map;
        }
        return map;
    }
}
