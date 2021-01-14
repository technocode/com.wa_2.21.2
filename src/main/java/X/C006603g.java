package X;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;

/* renamed from: X.03g  reason: invalid class name and case insensitive filesystem */
public class C006603g extends LinkedHashMap<AnonymousClass1YY, SSLSession> {
    public final /* synthetic */ C006403e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C006603g(C006403e r4) {
        super(64, 0.75f, true);
        this.this$0 = r4;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<AnonymousClass1YY, SSLSession> entry) {
        return size() > this.this$0.A02;
    }
}
