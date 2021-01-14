package X;

import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.0w4  reason: invalid class name and case insensitive filesystem */
public class C20070w4 {
    public static final Map A03 = new IdentityHashMap();
    public int A00;
    public Object A01;
    public final AbstractC20050w2 A02;

    public C20070w4(Object obj, AbstractC20050w2 r5) {
        if (obj != null) {
            this.A01 = obj;
            if (r5 != null) {
                this.A02 = r5;
                this.A00 = 1;
                Map map = A03;
                synchronized (map) {
                    Integer num = (Integer) map.get(obj);
                    if (num == null) {
                        map.put(obj, 1);
                    } else {
                        map.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public synchronized Object A00() {
        return this.A01;
    }

    public final void A01() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A00 > 0) {
                z = true;
            }
        }
        if (!z) {
            throw new C20060w3();
        }
    }
}
