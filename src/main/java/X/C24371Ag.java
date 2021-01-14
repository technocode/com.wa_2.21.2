package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1Ag  reason: invalid class name and case insensitive filesystem */
public class C24371Ag implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C24371Ag(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final Parcel A00(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.A00.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
