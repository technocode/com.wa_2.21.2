package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;

/* renamed from: X.0in  reason: invalid class name and case insensitive filesystem */
public class C12730in implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C12720im();
    public IResultReceiver A00;

    public int describeContents() {
        return 0;
    }

    public C12730in(Parcel parcel) {
        IResultReceiver r1;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) {
                r1 = new AnonymousClass1ZC(readStrongBinder);
            } else {
                r1 = (IResultReceiver) queryLocalInterface;
            }
        }
        this.A00 = r1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            IResultReceiver iResultReceiver = this.A00;
            if (iResultReceiver == null) {
                iResultReceiver = new AnonymousClass23D(this);
                this.A00 = iResultReceiver;
            }
            parcel.writeStrongBinder(iResultReceiver.asBinder());
        }
    }
}
