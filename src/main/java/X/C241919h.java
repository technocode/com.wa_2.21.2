package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.19h  reason: invalid class name and case insensitive filesystem */
public class C241919h implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C241919h(IBinder iBinder, String str) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public final Parcel A00(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, parcel, 0);
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
