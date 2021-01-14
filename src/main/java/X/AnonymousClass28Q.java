package X;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.28Q  reason: invalid class name */
public class AnonymousClass28Q extends AnonymousClass24P {
    public static Method A00;
    public static boolean A01;

    @Override // X.C17350rO
    public void A04(View view, int i, int i2, int i3, int i4) {
        if (!A01) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", cls, cls, cls, cls);
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            A01 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
