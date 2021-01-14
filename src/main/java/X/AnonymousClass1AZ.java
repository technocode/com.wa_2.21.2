package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1AZ  reason: invalid class name */
public class AnonymousClass1AZ extends Binder implements IInterface {
    public AnonymousClass1AZ(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        IGoogleMapDelegate r1;
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof BinderC457926j) {
            BinderC457926j r4 = (BinderC457926j) this;
            if (i != 1) {
                return false;
            }
            r4.A00.AHQ((LatLng) C24321Aa.A00(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            return true;
        } else if (this instanceof BinderC457826i) {
            BinderC457826i r42 = (BinderC457826i) this;
            if (i != 1) {
                return false;
            }
            r42.A00.ADk();
            parcel2.writeNoException();
            return true;
        } else if (this instanceof BinderC457726h) {
            BinderC457726h r43 = (BinderC457726h) this;
            if (i != 1) {
                return false;
            }
            r43.A00.ADo(parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (this instanceof BinderC457626g) {
            BinderC457626g r44 = (BinderC457626g) this;
            if (i == 1) {
                BinderC04800Lv r0 = new BinderC04800Lv(r44.A00.A6q(new AnonymousClass1BR(AbstractBinderC35851l4.A00(parcel.readStrongBinder()))));
                parcel2.writeNoException();
                C24321Aa.A01(parcel2, r0);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                BinderC04800Lv r02 = new BinderC04800Lv(r44.A00.A6o(new AnonymousClass1BR(AbstractBinderC35851l4.A00(parcel.readStrongBinder()))));
                parcel2.writeNoException();
                C24321Aa.A01(parcel2, r02);
                return true;
            }
        } else if (this instanceof BinderC457526f) {
            BinderC457526f r45 = (BinderC457526f) this;
            if (i != 1) {
                return false;
            }
            r45.A00.AGl(new AnonymousClass1BR(AbstractBinderC35851l4.A00(parcel.readStrongBinder())));
            parcel2.writeNoException();
            return true;
        } else if (this instanceof AnonymousClass26e) {
            AnonymousClass26e r46 = (AnonymousClass26e) this;
            if (i != 1) {
                return false;
            }
            boolean AHU = r46.A00.AHU(new AnonymousClass1BR(AbstractBinderC35851l4.A00(parcel.readStrongBinder())));
            parcel2.writeNoException();
            parcel2.writeInt(AHU ? 1 : 0);
            return true;
        } else if (this instanceof AnonymousClass26d) {
            AnonymousClass26d r47 = (AnonymousClass26d) this;
            if (i != 1) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                r1 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof IGoogleMapDelegate) {
                    r1 = (IGoogleMapDelegate) queryLocalInterface;
                } else {
                    r1 = new C35981lO(readStrongBinder);
                }
            }
            r47.A00.AHS(new AnonymousClass1B5(r1));
            parcel2.writeNoException();
            return true;
        } else if (!(this instanceof BinderC457426c)) {
            throw null;
        } else {
            BinderC457426c r48 = (BinderC457426c) this;
            if (i == 1) {
                r48.A00.AGA();
            } else if (i != 2) {
                return false;
            } else {
                r48.A00.ADq();
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
