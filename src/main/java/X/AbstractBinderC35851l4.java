package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.1l4  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractBinderC35851l4 extends AnonymousClass1AZ implements AnonymousClass1Ab {
    public static AnonymousClass1Ab A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof AnonymousClass1Ab) {
            return (AnonymousClass1Ab) queryLocalInterface;
        }
        return new C35861l5(iBinder);
    }
}
