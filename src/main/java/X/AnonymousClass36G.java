package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.36G  reason: invalid class name */
public class AnonymousClass36G {
    public final Map A00 = new HashMap();
    public final Map A01 = new WeakHashMap();

    public synchronized void A00(AnonymousClass36F r4) {
        Log.d(String.format("UIObserver.fire: %s", r4));
        Map map = (Map) this.A00.get(r4.getClass());
        if (map != null) {
            for (Object obj : map.keySet()) {
                AnonymousClass36E r0 = (AnonymousClass36E) map.get(obj);
                if (r0 != null) {
                    r0.AFk(r4);
                }
            }
        }
    }

    public synchronized void A01(Class cls, Object obj, AnonymousClass36E r5) {
        Map map = this.A00;
        Map map2 = (Map) map.get(cls);
        if (map2 == null) {
            map2 = new WeakHashMap();
            map.put(cls, map2);
        }
        map2.put(obj, r5);
        Map map3 = this.A01;
        Set set = (Set) map3.get(obj);
        if (set == null) {
            set = new HashSet();
            map3.put(obj, set);
        }
        set.add(cls);
    }

    public synchronized void A02(Object obj) {
        Map map = this.A01;
        Set<Class> set = (Set) map.get(obj);
        if (set != null) {
            for (Class cls : set) {
                Map map2 = (Map) this.A00.get(cls);
                if (map2 != null) {
                    map2.remove(obj);
                }
                Set set2 = (Set) map.get(obj);
                if (set2 != null) {
                    set2.remove(cls);
                }
            }
        }
    }
}
