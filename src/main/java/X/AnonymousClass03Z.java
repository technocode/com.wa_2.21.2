package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.03Z  reason: invalid class name */
public class AnonymousClass03Z extends LinkedHashMap<String, String> {
    public final /* synthetic */ AnonymousClass03Y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass03Z(AnonymousClass03Y r4) {
        super(64, 0.75f, true);
        this.this$0 = r4;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, String> entry) {
        return size() > 64;
    }
}
