package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1kY  reason: invalid class name and case insensitive filesystem */
public final class C35561kY implements IInterface, AnonymousClass19M {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public C35561kY(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // X.AnonymousClass19M
    public final void ARu(AnonymousClass19N r6) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        obtain.writeStrongBinder(r6 == null ? null : r6.asBinder());
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public IBinder asBinder() {
        return this.A00;
    }
}
