package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.09L  reason: invalid class name */
public class AnonymousClass09L {
    public static volatile AnonymousClass09L A04;
    public AnonymousClass0KY A00;
    public final AnonymousClass009 A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public AnonymousClass09L(AnonymousClass009 r2) {
        this.A01 = r2;
    }

    public static AnonymousClass09L A00() {
        if (A04 == null) {
            synchronized (AnonymousClass09L.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass09L(AnonymousClass009.A00());
                }
            }
        }
        return A04;
    }

    public void A01(Exception exc) {
        Map map = this.A03;
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                ((AnonymousClass0I1) entry.getValue()).A00(exc);
            }
            map.clear();
        }
    }
}
