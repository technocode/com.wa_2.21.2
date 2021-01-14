package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.19f  reason: invalid class name and case insensitive filesystem */
public class BinderC241719f extends Binder implements IInterface {
    public BinderC241719f(String str) {
        attachInterface(this, str);
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
        if (this instanceof AbstractBinderC36141le) {
            AbstractBinderC36141le r1 = (AbstractBinderC36141le) this;
            if (i == 3) {
                C241819g.A00(parcel, C34661ix.CREATOR);
                C241819g.A00(parcel, C36131ld.CREATOR);
            } else if (i == 4) {
                C241819g.A00(parcel, Status.CREATOR);
            } else if (i == 6) {
                C241819g.A00(parcel, Status.CREATOR);
            } else if (i == 7) {
                C241819g.A00(parcel, Status.CREATOR);
                C241819g.A00(parcel, GoogleSignInAccount.CREATOR);
            } else if (i != 8) {
                return false;
            } else {
                r1.ARZ((C36171lh) C241819g.A00(parcel, C36171lh.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        } else if (!(this instanceof AnonymousClass26B)) {
            throw null;
        } else {
            AnonymousClass26B r12 = (AnonymousClass26B) this;
            if (i != 1) {
                return false;
            }
            int readInt = parcel.readInt();
            ((BasePendingResult) r12.A00).A06(new Status(1, readInt, null, null));
            parcel2.writeNoException();
            return true;
        }
    }
}
