package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0hG  reason: invalid class name and case insensitive filesystem */
public class C11940hG {
    public static Map A00 = new HashMap();
    public static Map A01 = new HashMap();

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r0.booleanValue() != false) goto L_0x0120;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.Class r10) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11940hG.A00(java.lang.Class):int");
    }

    public static AbstractC15600oL A01(Constructor constructor, Object obj) {
        try {
            constructor.newInstance(obj);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
