package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0Ke  reason: invalid class name and case insensitive filesystem */
public class C04390Ke extends LinkedHashMap<C007303n, Long> {
    public final /* synthetic */ C04380Kd this$0;

    public C04390Ke(C04380Kd r1) {
        this.this$0 = r1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<C007303n, Long> entry) {
        return ((long) size()) > 240;
    }
}
