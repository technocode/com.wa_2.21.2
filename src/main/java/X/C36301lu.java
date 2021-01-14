package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1lu  reason: invalid class name and case insensitive filesystem */
public final class C36301lu extends C24371Ag implements AnonymousClass1C3 {
    public C36301lu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override // X.AnonymousClass1C3
    public final C36261lq[] ASD(IObjectWrapper iObjectWrapper, C35891l8 r5) {
        IBinder asBinder;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (iObjectWrapper == null) {
            asBinder = null;
        } else {
            asBinder = iObjectWrapper.asBinder();
        }
        obtain.writeStrongBinder(asBinder);
        if (r5 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            r5.writeToParcel(obtain, 0);
        }
        Parcel A00 = A00(obtain);
        C36261lq[] r0 = (C36261lq[]) A00.createTypedArray(C36261lq.CREATOR);
        A00.recycle();
        return r0;
    }

    @Override // X.AnonymousClass1C3
    public final void ASN() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
