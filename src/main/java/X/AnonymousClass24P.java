package X;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.24P  reason: invalid class name */
public class AnonymousClass24P extends C30891c8 {
    public static Method A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    @Override // X.C17350rO
    public void A05(View view, Matrix matrix) {
        if (!A02) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                A00 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            A02 = true;
        }
        Method method = A00;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // X.C17350rO
    public void A06(View view, Matrix matrix) {
        if (!A03) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                A01 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
