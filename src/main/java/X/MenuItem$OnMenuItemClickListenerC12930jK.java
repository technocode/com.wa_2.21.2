package X;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: X.0jK  reason: invalid class name and case insensitive filesystem */
public class MenuItem$OnMenuItemClickListenerC12930jK implements MenuItem.OnMenuItemClickListener {
    public static final Class[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    public MenuItem$OnMenuItemClickListenerC12930jK(Object obj, String str) {
        this.A00 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.A01 = cls.getMethod(str, A02);
        } catch (Exception e) {
            StringBuilder A0Z = AnonymousClass008.A0Z("Couldn't resolve menu item onClick handler ", str, " in class ");
            A0Z.append(cls.getName());
            InflateException inflateException = new InflateException(A0Z.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.A01.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.A01.invoke(this.A00, menuItem)).booleanValue();
            }
            this.A01.invoke(this.A00, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
