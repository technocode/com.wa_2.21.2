package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.1Al  reason: invalid class name and case insensitive filesystem */
public class BinderC24411Al extends Binder implements IInterface {
    public BinderC24411Al() {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
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
        if (!(this instanceof AbstractBinderC36531mL)) {
            throw null;
        }
        AbstractBinderC36531mL r1 = (AbstractBinderC36531mL) this;
        switch (i) {
            case 2:
                C24421Am.A00(parcel, C36471mF.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                C24421Am.A00(parcel, C36611mU.CREATOR);
                throw new UnsupportedOperationException();
            case 4:
                C24421Am.A00(parcel, C36501mI.CREATOR);
                throw new UnsupportedOperationException();
            case 5:
                C24421Am.A00(parcel, DataHolder.CREATOR);
                throw new UnsupportedOperationException();
            case 6:
                C24421Am.A00(parcel, C36401m7.CREATOR);
                throw new UnsupportedOperationException();
            case 7:
                C24421Am.A00(parcel, C36631mW.CREATOR);
                throw new UnsupportedOperationException();
            case 8:
                C24421Am.A00(parcel, C36511mJ.CREATOR);
                throw new UnsupportedOperationException();
            case 9:
                C24421Am.A00(parcel, C36521mK.CREATOR);
                throw new UnsupportedOperationException();
            case 10:
                r1.AS0((C36491mH) C24421Am.A00(parcel, C36491mH.CREATOR));
                break;
            case 11:
                r1.ARs((Status) C24421Am.A00(parcel, Status.CREATOR));
                break;
            case 12:
                C24421Am.A00(parcel, C36641mX.CREATOR);
                throw new UnsupportedOperationException();
            case 13:
                C24421Am.A00(parcel, C36481mG.CREATOR);
                throw new UnsupportedOperationException();
            case 14:
                C24421Am.A00(parcel, C36591mS.CREATOR);
                throw new UnsupportedOperationException();
            case 15:
                C24421Am.A00(parcel, C36371m4.CREATOR);
                throw new UnsupportedOperationException();
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                C24421Am.A00(parcel, C36371m4.CREATOR);
                throw new UnsupportedOperationException();
            case 17:
                C24421Am.A00(parcel, C36421mA.CREATOR);
                throw new UnsupportedOperationException();
            case 18:
                C24421Am.A00(parcel, C36431mB.CREATOR);
                throw new UnsupportedOperationException();
            case 19:
                C24421Am.A00(parcel, C36351m2.CREATOR);
                throw new UnsupportedOperationException();
            case AnonymousClass0PW.A01:
                C24421Am.A00(parcel, C36361m3.CREATOR);
                throw new UnsupportedOperationException();
            case 21:
            case 24:
            case 25:
            default:
                return false;
            case 22:
                C24421Am.A00(parcel, C36411m9.CREATOR);
                throw new UnsupportedOperationException();
            case 23:
                C24421Am.A00(parcel, AnonymousClass1m8.CREATOR);
                throw new UnsupportedOperationException();
            case 26:
                C24421Am.A00(parcel, C36561mO.CREATOR);
                throw new UnsupportedOperationException();
            case 27:
                C24421Am.A00(parcel, C36621mV.CREATOR);
                throw new UnsupportedOperationException();
            case 28:
                C24421Am.A00(parcel, C36441mC.CREATOR);
                throw new UnsupportedOperationException();
            case 29:
                C24421Am.A00(parcel, C36461mE.CREATOR);
                throw new UnsupportedOperationException();
            case 30:
                C24421Am.A00(parcel, C36451mD.CREATOR);
                throw new UnsupportedOperationException();
        }
        parcel2.writeNoException();
        return true;
    }
}
