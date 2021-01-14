package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.1lP  reason: invalid class name and case insensitive filesystem */
public final class C35991lP extends AnonymousClass1AY implements IMapViewDelegate {
    public C35991lP(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void A7D(AnonymousClass1BH r3) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, r3);
        A02(9, A00);
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final IObjectWrapper A9l() {
        Parcel A01 = A01(8, A00());
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AEh(Bundle bundle) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, bundle);
        A02(2, A00);
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AIJ() {
        A02(4, A00());
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AJj() {
        A02(3, A00());
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void AJl(Bundle bundle) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, bundle);
        Parcel A01 = A01(7, A00);
        if (A01.readInt() != 0) {
            bundle.readFromParcel(A01);
        }
        A01.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void onDestroy() {
        A02(5, A00());
    }

    @Override // com.google.android.gms.maps.internal.IMapViewDelegate
    public final void onLowMemory() {
        A02(6, A00());
    }
}
