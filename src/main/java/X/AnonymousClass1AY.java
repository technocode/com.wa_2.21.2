package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1AY  reason: invalid class name */
public class AnonymousClass1AY implements IInterface {
    public final IBinder A00;
    public final String A01;

    public AnonymousClass1AY(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final Parcel A00() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        return obtain;
    }

    public final Parcel A01(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final void A02(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
