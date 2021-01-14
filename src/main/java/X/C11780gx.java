package X;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: X.0gx  reason: invalid class name and case insensitive filesystem */
public final class C11780gx implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public Object run() {
        Field[] declaredFields = Unsafe.class.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
