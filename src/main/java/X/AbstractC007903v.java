package X;

import android.os.StrictMode;
import java.util.Map;

/* renamed from: X.03v  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC007903v {
    public int A00(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        int A02;
        if (!(this instanceof C008103x)) {
            return ((AnonymousClass044) this).A02.A00(str, i, threadPolicy);
        }
        C008103x r3 = (C008103x) this;
        if (!(r3 instanceof AbstractC008203y)) {
            return r3.A02(str, i, r3.A01, threadPolicy);
        }
        AbstractC008203y r32 = (AbstractC008203y) r3;
        Map map = r32.A02;
        synchronized (map) {
            obj = map.get(str);
            if (obj == null) {
                obj = new Object();
                map.put(str, obj);
            }
        }
        synchronized (obj) {
            A02 = r32.A02(str, i, ((C008103x) r32).A01, threadPolicy);
        }
        return A02;
    }

    public void A01(int i) {
        if (this instanceof AnonymousClass044) {
            ((AnonymousClass044) this).A02.A01(i);
        }
    }

    public String toString() {
        return getClass().getName();
    }
}
