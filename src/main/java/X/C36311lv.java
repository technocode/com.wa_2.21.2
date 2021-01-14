package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1lv  reason: invalid class name and case insensitive filesystem */
public final class C36311lv extends C24371Ag implements AnonymousClass1C4 {
    public C36311lv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override // X.AnonymousClass1C4
    public final AnonymousClass1C3 ARq(IObjectWrapper iObjectWrapper, C36291lt r6) {
        IBinder asBinder;
        AnonymousClass1C3 r1;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (iObjectWrapper == null) {
            asBinder = null;
        } else {
            asBinder = iObjectWrapper.asBinder();
        }
        obtain.writeStrongBinder(asBinder);
        if (r6 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            r6.writeToParcel(obtain, 0);
        }
        Parcel A00 = A00(obtain);
        IBinder readStrongBinder = A00.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            r1 = queryLocalInterface instanceof AnonymousClass1C3 ? (AnonymousClass1C3) queryLocalInterface : new C36301lu(readStrongBinder);
        }
        A00.recycle();
        return r1;
    }
}
