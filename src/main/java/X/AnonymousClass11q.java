package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.11q  reason: invalid class name */
public abstract class AnonymousClass11q implements IInterface {
    public final String mDescriptor;
    public final IBinder mRemote;

    public AnonymousClass11q(IBinder iBinder, String str) {
        this.mRemote = iBinder;
        this.mDescriptor = str;
    }

    public IBinder asBinder() {
        return this.mRemote;
    }

    public Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.mDescriptor);
        return obtain;
    }

    public Parcel transactAndReadException(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.mRemote.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public void transactAndReadExceptionReturnVoid(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.mRemote.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void transactOneway(int i, Parcel parcel) {
        try {
            this.mRemote.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
