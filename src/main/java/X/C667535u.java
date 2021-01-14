package X;

import android.graphics.Paint;
import android.os.Build;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.35u  reason: invalid class name and case insensitive filesystem */
public class C667535u {
    public static final Method A00;
    public static final Method A01;

    static {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getMethod", String.class, Class[].class);
            if (declaredMethod != null) {
                A00 = (Method) A01(declaredMethod, Paint.class, Method.class, "getUnderlinePosition", null);
                A01 = (Method) A01(declaredMethod, Paint.class, Method.class, "getUnderlineThickness", null);
            }
        } catch (NoSuchMethodException | SecurityException e) {
            Log.e("paintcompat/no method getMethod", e);
        }
    }

    public static float A00(Paint paint) {
        Number number;
        if (Build.VERSION.SDK_INT >= 29) {
            return paint.getUnderlinePosition();
        }
        Method method = A00;
        if (method == null || (number = (Number) A01(method, paint, Float.class, new Object[0])) == null) {
            return paint.getTextSize() / 12.0f;
        }
        return number.floatValue();
    }

    public static Object A01(Method method, Object obj, Class cls, Object... objArr) {
        try {
            return cls.cast(method.invoke(obj, objArr));
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            Log.e("paintcompat/invoke exception", e);
            return null;
        }
    }
}
