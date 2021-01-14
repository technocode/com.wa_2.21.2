package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1kV  reason: invalid class name and case insensitive filesystem */
public final class C35531kV extends C241919h implements AnonymousClass19A {
    public C35531kV(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // X.AnonymousClass19A
    public final IObjectWrapper ARn(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass19i.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        AnonymousClass19i.A00(obtain, iObjectWrapper2);
        Parcel A00 = A00(2, obtain);
        IObjectWrapper A01 = BinderC04810Lw.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }

    @Override // X.AnonymousClass19A
    public final IObjectWrapper AS8(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass19i.A00(obtain, iObjectWrapper);
        obtain.writeString(str);
        obtain.writeInt(i);
        AnonymousClass19i.A00(obtain, iObjectWrapper2);
        Parcel A00 = A00(3, obtain);
        IObjectWrapper A01 = BinderC04810Lw.A01(A00.readStrongBinder());
        A00.recycle();
        return A01;
    }
}
