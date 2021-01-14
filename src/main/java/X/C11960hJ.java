package X;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0hJ  reason: invalid class name and case insensitive filesystem */
public class C11960hJ {
    public final Map A00 = new HashMap();
    public final Map A01;

    public C11960hJ(Map map) {
        this.A01 = map;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            List list = (List) this.A00.get(value);
            if (list == null) {
                list = new ArrayList();
                this.A00.put(value, list);
            }
            list.add(entry.getKey());
        }
    }

    public static void A00(List list, AbstractC005102k r7, AnonymousClass082 r8, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C11970hK r3 = (C11970hK) list.get(size);
                if (r3 != null) {
                    try {
                        int i = r3.A00;
                        if (i == 0) {
                            r3.A01.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            r3.A01.invoke(obj, r7);
                        } else if (i == 2) {
                            r3.A01.invoke(obj, r7, r8);
                        }
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                } else {
                    throw null;
                }
            }
        }
    }
}
