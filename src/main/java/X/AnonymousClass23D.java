package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.IResultReceiver;

/* renamed from: X.23D  reason: invalid class name */
public class AnonymousClass23D extends Binder implements IResultReceiver {
    public final /* synthetic */ C12730in A00;

    public IBinder asBinder() {
        return this;
    }

    public AnonymousClass23D(C12730in r2) {
        this.A00 = r2;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    public void A00(int i, Bundle bundle) {
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            parcel.readInt();
            if (parcel.readInt() != 0) {
                Bundle.CREATOR.createFromParcel(parcel);
            }
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }
}
