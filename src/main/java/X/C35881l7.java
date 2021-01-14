package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1l7  reason: invalid class name and case insensitive filesystem */
public final class C35881l7 implements IInterface, AbstractC24361Af {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.safetynet.internal.ISafetyNetService";

    public C35881l7(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // X.AbstractC24361Af
    public final void ARz(AbstractC24351Ae r6, byte[] bArr, String str) {
        IBinder asBinder;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (r6 == null) {
            asBinder = null;
        } else {
            asBinder = r6.asBinder();
        }
        obtain.writeStrongBinder(asBinder);
        obtain.writeByteArray(bArr);
        obtain.writeString(str);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(7, obtain, obtain2, 0);
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
