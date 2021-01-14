package X;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.1AR  reason: invalid class name */
public class AnonymousClass1AR extends Binder implements IInterface {
    public AnonymousClass1AR(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        Parcelable parcelable2;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof AnonymousClass26Z) {
            AnonymousClass26Z r4 = (AnonymousClass26Z) this;
            if (i != 1) {
                return false;
            }
            Parcelable.Creator creator = Location.CREATOR;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Location location = (Location) parcelable;
            synchronized (r4) {
                AnonymousClass17O r1 = r4.A00;
                C35801kx r2 = new C35801kx(location);
                C001801b.A1R(r2, "Notifier must not be null");
                HandlerC34751jA r12 = r1.A01;
                r12.sendMessage(r12.obtainMessage(1, r2));
            }
            return true;
        } else if (!(this instanceof AnonymousClass26Y)) {
            throw null;
        } else {
            AnonymousClass26Y r42 = (AnonymousClass26Y) this;
            if (i != 1) {
                return false;
            }
            Parcelable.Creator creator2 = C35771ku.CREATOR;
            if (parcel.readInt() == 0) {
                parcelable2 = null;
            } else {
                parcelable2 = (Parcelable) creator2.createFromParcel(parcel);
            }
            ((BasePendingResult) r42.A00).A06(((C35771ku) parcelable2).A00);
            return true;
        }
    }
}
