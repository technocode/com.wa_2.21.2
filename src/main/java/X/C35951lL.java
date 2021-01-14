package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1lL  reason: invalid class name and case insensitive filesystem */
public final class C35951lL extends AnonymousClass1AY implements IProjectionDelegate {
    public C35951lL(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final LatLng A4U(IObjectWrapper iObjectWrapper) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        Parcel A01 = A01(1, A00);
        LatLng latLng = (LatLng) C24321Aa.A00(A01, LatLng.CREATOR);
        A01.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final C36021lS A9p() {
        Parcel A01 = A01(3, A00());
        C36021lS r0 = (C36021lS) C24321Aa.A00(A01, C36021lS.CREATOR);
        A01.recycle();
        return r0;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper AQd(LatLng latLng) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, latLng);
        Parcel A01 = A01(2, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }
}
