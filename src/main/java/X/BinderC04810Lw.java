package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.0Lw  reason: invalid class name and case insensitive filesystem */
public class BinderC04810Lw extends BinderC04740Lp implements IObjectWrapper {
    public BinderC04810Lw() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static IObjectWrapper A01(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof IObjectWrapper) {
            return (IObjectWrapper) queryLocalInterface;
        }
        return new C35441kM(iBinder);
    }
}
