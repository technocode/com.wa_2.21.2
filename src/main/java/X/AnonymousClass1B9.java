package X;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1B9  reason: invalid class name */
public final class AnonymousClass1B9 {
    public final IProjectionDelegate A00;

    public AnonymousClass1B9(IProjectionDelegate iProjectionDelegate) {
        this.A00 = iProjectionDelegate;
    }

    public final Point A00(LatLng latLng) {
        try {
            return (Point) BinderC04800Lv.A00(this.A00.AQd(latLng));
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }

    public final C36021lS A01() {
        try {
            return this.A00.A9p();
        } catch (RemoteException e) {
            throw new AnonymousClass06B(e);
        }
    }
}
