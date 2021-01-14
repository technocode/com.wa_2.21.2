package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.0PU  reason: invalid class name */
public final class AnonymousClass0PU {
    public static final AnonymousClass0PU A01 = new AnonymousClass0PU(Collections.emptyMap());
    public final Map A00;

    public AnonymousClass0PU(Map map) {
        this.A00 = map;
    }

    public AnonymousClass0PU(Map map, C28331Tx r2) {
        this.A00 = map;
    }

    public static AnonymousClass0PU A00(Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        return new AnonymousClass0PU(hashMap, null);
    }

    public C05350Oe A01() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.A00.entrySet());
        return new C05350Oe(hashSet, null);
    }

    public C05350Oe A02() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.A00.keySet());
        return new C05350Oe(hashSet, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0PU.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass0PU) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
