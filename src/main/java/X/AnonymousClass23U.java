package X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.23U  reason: invalid class name */
public class AnonymousClass23U extends C29631Zu implements AbstractC13340k5 {
    public static Method A01;
    public AbstractC13340k5 A00;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public AnonymousClass23U(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // X.AbstractC13340k5
    public void AGr(AnonymousClass0T8 r2, MenuItem menuItem) {
        AbstractC13340k5 r0 = this.A00;
        if (r0 != null) {
            r0.AGr(r2, menuItem);
        }
    }

    @Override // X.AbstractC13340k5
    public void AGs(AnonymousClass0T8 r2, MenuItem menuItem) {
        AbstractC13340k5 r0 = this.A00;
        if (r0 != null) {
            r0.AGs(r2, menuItem);
        }
    }
}
