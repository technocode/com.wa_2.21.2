package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: X.19K  reason: invalid class name */
public class AnonymousClass19K extends Binder implements IInterface {
    public AnonymousClass19K() {
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (!(this instanceof AnonymousClass26H)) {
            throw null;
        }
        AnonymousClass26H r2 = (AnonymousClass26H) this;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Status.CREATOR;
        if (parcel.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator.createFromParcel(parcel);
        }
        Status status = (Status) parcelable;
        C24611Bq r22 = r2.A00.A00;
        if (status.A01 <= 0) {
            r22.A00.A08(null);
            return true;
        }
        r22.A00.A07(new AnonymousClass170(status));
        return true;
    }
}
