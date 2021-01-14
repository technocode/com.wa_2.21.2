package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3Av  reason: invalid class name and case insensitive filesystem */
public class C67873Av<K, V> extends LinkedHashMap<K, V> {
    public C67873Av() {
        super(100);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }
}
