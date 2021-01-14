package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.09l  reason: invalid class name and case insensitive filesystem */
public class C017909l {
    public int A00 = 0;
    public final AnonymousClass08V A01 = new C018009m(this);
    public final Map A02 = new HashMap();

    public synchronized void A00(AbstractC28611Uz r3) {
        for (AbstractC007503q r0 : ((LinkedHashMap) this.A01.A05()).values()) {
            r3.AQo(r0);
        }
        for (Map.Entry entry : this.A02.entrySet()) {
            AbstractC007503q r02 = (AbstractC007503q) ((WeakReference) entry.getValue()).get();
            if (r02 != null) {
                r3.AQo(r02);
            }
        }
    }

    public synchronized void A01(C007303n r2, AbstractC007503q r3) {
        this.A02.remove(r2);
        this.A01.A07(r2, r3);
    }
}
