package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.IGmsServiceBroker;

/* renamed from: X.1jw  reason: invalid class name and case insensitive filesystem */
public final class C35191jw implements IGmsServiceBroker {
    public final IBinder A00;

    public C35191jw(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void A91(IGmsCallbacks iGmsCallbacks, C35171ju r7) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(iGmsCallbacks.asBinder());
            obtain.writeInt(1);
            r7.writeToParcel(obtain, 0);
            this.A00.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.A00;
    }
}
