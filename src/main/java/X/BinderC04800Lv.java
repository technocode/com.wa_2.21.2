package X;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* renamed from: X.0Lv  reason: invalid class name and case insensitive filesystem */
public final class BinderC04800Lv extends BinderC04810Lw {
    public final Object A00;

    public BinderC04800Lv(Object obj) {
        this.A00 = obj;
    }

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof BinderC04800Lv) {
            return ((BinderC04800Lv) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(AnonymousClass008.A08(64, "Unexpected number of IObjectWrapper declared fields: ", length));
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
