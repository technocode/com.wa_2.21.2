package X;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.28P  reason: invalid class name */
public class AnonymousClass28P extends C452123l {
    @Override // X.C452123l
    public Typeface A07(Object obj) {
        try {
            Object newInstance = Array.newInstance(((C452123l) this).A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A05.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // X.C452123l
    public Method A08(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
