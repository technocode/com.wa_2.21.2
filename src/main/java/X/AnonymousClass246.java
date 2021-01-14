package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.room.IMultiInstanceInvalidationCallback;

/* renamed from: X.246  reason: invalid class name */
public class AnonymousClass246 extends Binder implements IMultiInstanceInvalidationCallback {
    public final /* synthetic */ C16730qK A00;

    public IBinder asBinder() {
        return this;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public void AGp(String[] strArr) {
        this.A00.A06.execute(new RunnableEBaseShape5S0200000_I1_0(this, strArr, 10));
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            AGp(parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }
}
