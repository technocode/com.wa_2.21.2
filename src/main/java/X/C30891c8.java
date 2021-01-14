package X;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1c8  reason: invalid class name and case insensitive filesystem */
public class C30891c8 extends C17350rO {
    public static Method A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    @Override // X.C17350rO
    public void A01(View view) {
    }

    @Override // X.C17350rO
    public void A02(View view) {
    }

    @Override // X.C17350rO
    public float A00(View view) {
        if (!A02) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            A02 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                return ((Number) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.A00(view);
    }

    @Override // X.C17350rO
    public void A03(View view, float f) {
        if (!A03) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                A01 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(f));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }
}
