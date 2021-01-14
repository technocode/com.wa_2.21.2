package X;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1l3  reason: invalid class name and case insensitive filesystem */
public final class C35841l3 extends AnonymousClass1AY implements AnonymousClass06E {
    public C35841l3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // X.AnonymousClass06E
    public final IObjectWrapper ARk(int i) {
        Parcel A00 = A00();
        A00.writeInt(i);
        Parcel A01 = A01(1, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }

    @Override // X.AnonymousClass06E
    public final IObjectWrapper ARl(Bitmap bitmap) {
        Parcel A00 = A00();
        C24321Aa.A02(A00, bitmap);
        Parcel A01 = A01(6, A00);
        IObjectWrapper A012 = BinderC04810Lw.A01(A01.readStrongBinder());
        A01.recycle();
        return A012;
    }
}
