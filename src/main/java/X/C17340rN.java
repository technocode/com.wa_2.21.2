package X;

import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.0rN  reason: invalid class name and case insensitive filesystem */
public class C17340rN {
    public static Field A00;
    public static boolean A01;
    public static final Property A02 = new C17330rM();
    public static final Property A03 = new C17320rL();
    public static final C17350rO A04;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            A04 = new AnonymousClass28Q();
        } else if (i >= 21) {
            A04 = new AnonymousClass24P();
        } else if (i >= 19) {
            A04 = new C30891c8();
        } else {
            A04 = new C17350rO();
        }
    }

    public static AbstractC17380rR A00(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C30921cC(view);
        }
        return new AnonymousClass1cB(view.getWindowToken());
    }

    public static void A01(View view, int i) {
        if (!A01) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            A01 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                A00.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void A02(View view, int i, int i2, int i3, int i4) {
        A04.A04(view, i, i2, i3, i4);
    }
}
