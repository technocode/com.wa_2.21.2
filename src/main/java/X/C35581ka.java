package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1ka  reason: invalid class name and case insensitive filesystem */
public final class C35581ka extends AnonymousClass19S implements AbstractC241519d {
    public C35581ka(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    @Override // X.AbstractC241519d
    public final void ARv(AbstractC241419c r3, C35591kb r4) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r3 == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r3.asBinder());
        }
        C241219a.A01(obtain, r4);
        A01(9, obtain);
    }

    @Override // X.AbstractC241519d
    public final void ARw(AbstractC241419c r3, C35601kc r4) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r3 == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r3.asBinder());
        }
        C241219a.A01(obtain, r4);
        A01(6, obtain);
    }

    @Override // X.AbstractC241519d
    public final void ARx(AbstractC241419c r3, C35611kd r4) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r3 == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r3.asBinder());
        }
        C241219a.A01(obtain, r4);
        A01(5, obtain);
    }
}
