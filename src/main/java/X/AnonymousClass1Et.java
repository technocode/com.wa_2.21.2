package X;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Et  reason: invalid class name */
public class AnonymousClass1Et implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass1Er();
    public Messenger A00;
    public AnonymousClass1Ev A01;

    public AnonymousClass1Et(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = new Messenger(iBinder);
        } else {
            this.A01 = new AnonymousClass1Ev(iBinder);
        }
    }

    public int describeContents() {
        return 0;
    }

    public final void A00(Message message) {
        Messenger messenger = this.A00;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        AnonymousClass1Ev r4 = this.A01;
        if (r4 != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                r4.A00.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } else {
            throw null;
        }
    }

    public boolean equals(Object obj) {
        IBinder asBinder;
        IBinder asBinder2;
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            if (messenger != null) {
                asBinder = messenger.getBinder();
            } else {
                asBinder = this.A01.asBinder();
            }
            AnonymousClass1Et r4 = (AnonymousClass1Et) obj;
            Messenger messenger2 = r4.A00;
            if (messenger2 != null) {
                asBinder2 = messenger2.getBinder();
            } else {
                asBinder2 = r4.A01.asBinder();
            }
            return asBinder.equals(asBinder2);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        IBinder asBinder;
        Messenger messenger = this.A00;
        if (messenger != null) {
            asBinder = messenger.getBinder();
        } else {
            asBinder = this.A01.asBinder();
        }
        return asBinder.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.A00;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.A01.asBinder());
        }
    }
}
