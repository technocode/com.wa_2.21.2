package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.1Ac  reason: invalid class name and case insensitive filesystem */
public class BinderC24331Ac extends Binder implements IInterface {
    public BinderC24331Ac() {
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (!(this instanceof AbstractBinderC35871l6)) {
            throw null;
        }
        AbstractBinderC35871l6 r1 = (AbstractBinderC35871l6) this;
        if (i == 1) {
            ((AnonymousClass29H) r1).A00.A06(new C457226a((Status) C24341Ad.A00(parcel, Status.CREATOR), (C36081lY) C24341Ad.A00(parcel, C36081lY.CREATOR)));
            return true;
        } else if (i == 2) {
            parcel.readString();
            throw new UnsupportedOperationException();
        } else if (i == 3) {
            C24341Ad.A00(parcel, Status.CREATOR);
            C24341Ad.A00(parcel, C36041lU.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i == 4) {
            C24341Ad.A00(parcel, Status.CREATOR);
            parcel.readInt();
            throw new UnsupportedOperationException();
        } else if (i == 6) {
            C24341Ad.A00(parcel, Status.CREATOR);
            C24341Ad.A00(parcel, C36101la.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i == 8) {
            C24341Ad.A00(parcel, Status.CREATOR);
            C24341Ad.A00(parcel, C36091lZ.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i == 15) {
            C24341Ad.A00(parcel, Status.CREATOR);
            C24341Ad.A00(parcel, C36111lb.CREATOR);
            throw new UnsupportedOperationException();
        } else if (i == 10) {
            C24341Ad.A00(parcel, Status.CREATOR);
            parcel.readInt();
            throw new UnsupportedOperationException();
        } else if (i != 11) {
            return false;
        } else {
            C24341Ad.A00(parcel, Status.CREATOR);
            throw new UnsupportedOperationException();
        }
    }
}
