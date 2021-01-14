package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1mN  reason: invalid class name and case insensitive filesystem */
public final class C36551mN extends C24401Ak implements AnonymousClass1CZ {
    public C36551mN(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService");
    }

    @Override // X.AnonymousClass1CZ
    public final void ASC(AnonymousClass1CX r6) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r6 == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r6.asBinder());
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
