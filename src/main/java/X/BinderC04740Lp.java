package X;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.0Lp  reason: invalid class name and case insensitive filesystem */
public class BinderC04740Lp extends Binder implements IInterface {
    public BinderC04740Lp(String str) {
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
        if (this instanceof AnonymousClass0Lo) {
            AnonymousClass0Lo r5 = (AnonymousClass0Lo) this;
            if (i == 1) {
                IObjectWrapper AS6 = r5.AS6();
                parcel2.writeNoException();
                AnonymousClass19i.A00(parcel2, AS6);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int ASB = r5.ASB();
                parcel2.writeNoException();
                parcel2.writeInt(ASB);
                return true;
            }
        } else if (!(this instanceof AnonymousClass266)) {
            return false;
        } else {
            AnonymousClass266 r52 = (AnonymousClass266) this;
            if (i == 1) {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(parcel);
                }
                C001801b.A1R(r52.A00, "onPostInitComplete can be called only once per call to getRemoteService");
                r52.A00.A04(readInt, readStrongBinder, (Bundle) parcelable, r52.A01);
                r52.A00 = null;
            } else if (i == 2) {
                parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    creator2.createFromParcel(parcel);
                }
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            } else if (i != 3) {
                return false;
            } else {
                int readInt2 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                Parcelable.Creator creator3 = C35321k9.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable2 = null;
                } else {
                    parcelable2 = (Parcelable) creator3.createFromParcel(parcel);
                }
                C35321k9 r0 = (C35321k9) parcelable2;
                C001801b.A1R(r52.A00, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                C001801b.A1Q(r0);
                r52.A00.A0O = r0;
                Bundle bundle = r0.A00;
                C001801b.A1R(r52.A00, "onPostInitComplete can be called only once per call to getRemoteService");
                r52.A00.A04(readInt2, readStrongBinder2, bundle, r52.A01);
                r52.A00 = null;
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
