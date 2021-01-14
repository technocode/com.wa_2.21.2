package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.1lK  reason: invalid class name and case insensitive filesystem */
public final class C35941lK extends AnonymousClass1AY implements ICameraUpdateFactoryDelegate {
    public C35941lK(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper ACI(CameraPosition cameraPosition) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, cameraPosition);
        Parcel A01 = A01(7, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper ACK(LatLng latLng) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, latLng);
        Parcel A01 = A01(8, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper ACL(LatLngBounds latLngBounds, int i) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, latLngBounds);
        A00.writeInt(i);
        Parcel A01 = A01(10, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper ACM(LatLng latLng, float f) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, latLng);
        A00.writeFloat(f);
        Parcel A01 = A01(9, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final IObjectWrapper ARe(float f) {
        Parcel A00 = A00();
        A00.writeFloat(f);
        Parcel A01 = A01(4, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }
}
