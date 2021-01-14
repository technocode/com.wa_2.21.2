package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: X.19Z  reason: invalid class name */
public class AnonymousClass19Z extends Binder implements IInterface {
    public AnonymousClass19Z() {
        attachInterface(this, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
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
        if (!(this instanceof AbstractBinderC35631kg)) {
            throw null;
        }
        AbstractBinderC35631kg r1 = (AbstractBinderC35631kg) this;
        switch (i) {
            case 1:
                C241219a.A00(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 2:
                C241219a.A00(parcel, Status.CREATOR);
                C241219a.A00(parcel, AnonymousClass294.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                C241219a.A00(parcel, Status.CREATOR);
                C241219a.A00(parcel, AnonymousClass291.CREATOR);
                throw new UnsupportedOperationException();
            case 4:
                r1.ASE();
                return true;
            case 5:
                r1.AFs((Status) C241219a.A00(parcel, Status.CREATOR));
                return true;
            case 6:
                r1.AS3(parcel.createByteArray());
                return true;
            case 7:
                C241219a.A00(parcel, C34591im.CREATOR);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
