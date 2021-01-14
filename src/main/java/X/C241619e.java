package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.19e  reason: invalid class name and case insensitive filesystem */
public class C241619e implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C241619e(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final void A00(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
