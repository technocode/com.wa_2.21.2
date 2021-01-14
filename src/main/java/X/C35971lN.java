package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;

/* renamed from: X.1lN  reason: invalid class name and case insensitive filesystem */
public final class C35971lN extends AnonymousClass1AY implements AnonymousClass1BM {
    public C35971lN(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // X.AnonymousClass1BM
    public final IMapViewDelegate ARp(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) {
        IMapViewDelegate r1;
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        C24321Aa.A02(A00, googleMapOptions);
        Parcel A01 = A01(3, A00);
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof IMapViewDelegate) {
                r1 = (IMapViewDelegate) queryLocalInterface;
            } else {
                r1 = new C35991lP(readStrongBinder);
            }
        }
        A01.recycle();
        return r1;
    }

    @Override // X.AnonymousClass1BM
    public final void ARt(IObjectWrapper iObjectWrapper, int i) {
        Parcel A00 = A00();
        C24321Aa.A01(A00, iObjectWrapper);
        A00.writeInt(i);
        A02(6, A00);
    }

    @Override // X.AnonymousClass1BM
    public final ICameraUpdateFactoryDelegate ASF() {
        ICameraUpdateFactoryDelegate r1;
        Parcel A01 = A01(4, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof ICameraUpdateFactoryDelegate) {
                r1 = (ICameraUpdateFactoryDelegate) queryLocalInterface;
            } else {
                r1 = new C35941lK(readStrongBinder);
            }
        }
        A01.recycle();
        return r1;
    }

    @Override // X.AnonymousClass1BM
    public final AnonymousClass06E ASI() {
        AnonymousClass06E r1;
        Parcel A01 = A01(5, A00());
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            if (queryLocalInterface instanceof AnonymousClass06E) {
                r1 = (AnonymousClass06E) queryLocalInterface;
            } else {
                r1 = new C35841l3(readStrongBinder);
            }
        }
        A01.recycle();
        return r1;
    }
}
