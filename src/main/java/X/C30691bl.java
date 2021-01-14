package X;

import android.os.IBinder;
import android.os.Parcel;
import androidx.room.IMultiInstanceInvalidationCallback;

/* renamed from: X.1bl  reason: invalid class name and case insensitive filesystem */
public class C30691bl implements IMultiInstanceInvalidationCallback {
    public IBinder A00;

    public C30691bl(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void AGp(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.A00.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
