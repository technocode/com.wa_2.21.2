package X;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.0Sy  reason: invalid class name and case insensitive filesystem */
public class C06360Sy {
    public static Method A00;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                A00 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    A00.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static void A00(View view, Rect rect, Rect rect2) {
        Method method = A00;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static boolean A01(View view) {
        return AnonymousClass0Q7.A05(view) == 1;
    }
}
