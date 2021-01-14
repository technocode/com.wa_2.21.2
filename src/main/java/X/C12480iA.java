package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0iA  reason: invalid class name and case insensitive filesystem */
public class C12480iA extends LinkedHashMap<K, V> {
    public final /* synthetic */ C12470i9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12480iA(C12470i9 r3, int i) {
        super(i, 0.75f, true);
        this.this$0 = r3;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.this$0.A00;
    }
}
