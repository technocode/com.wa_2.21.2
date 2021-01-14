package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.04h  reason: invalid class name */
public class AnonymousClass04h<K, V> extends LinkedHashMap<K, V> {
    public int cacheLimit;

    public AnonymousClass04h(int i) {
        super(((int) Math.ceil((double) (((float) i) / 0.75f))) + 1, 0.75f, true);
        this.cacheLimit = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.cacheLimit;
    }
}
