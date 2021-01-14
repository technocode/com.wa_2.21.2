package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.1kX  reason: invalid class name and case insensitive filesystem */
public final class C35551kX implements IInterface, AnonymousClass19J {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C35551kX(IBinder iBinder) {
        this.A00 = iBinder;
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

    @Override // X.AnonymousClass19J
    public final boolean ASA(boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        obtain.writeInt(1);
        Parcel A002 = A00(2, obtain);
        boolean z2 = false;
        if (A002.readInt() != 0) {
            z2 = true;
        }
        A002.recycle();
        return z2;
    }

    public IBinder asBinder() {
        return this.A00;
    }

    @Override // X.AnonymousClass19J
    public final String getId() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel A002 = A00(1, obtain);
        String readString = A002.readString();
        A002.recycle();
        return readString;
    }
}
