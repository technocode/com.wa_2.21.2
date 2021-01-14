package X;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1kw  reason: invalid class name and case insensitive filesystem */
public final class C35791kw extends AnonymousClass1AM implements AnonymousClass1AP {
    public C35791kw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // X.AnonymousClass1AP
    public final Location ARh(String str) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeString(str);
        obtain = Parcel.obtain();
        try {
            this.A00.transact(21, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return (Location) (obtain.readInt() == 0 ? null : (Parcelable) Location.CREATOR.createFromParcel(obtain));
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }

    @Override // X.AnonymousClass1AP
    public final void ARy(C35821kz r6) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r6 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            r6.writeToParcel(obtain, 0);
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
