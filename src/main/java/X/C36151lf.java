package X;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.1lf  reason: invalid class name and case insensitive filesystem */
public final class C36151lf extends C241619e implements AbstractC24531Bi {
    public C36151lf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // X.AbstractC24531Bi
    public final void ARR(IAccountAccessor iAccountAccessor, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (iAccountAccessor == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(iAccountAccessor.asBinder());
        }
        obtain.writeInt(i);
        obtain.writeInt(z ? 1 : 0);
        A00(9, obtain);
    }

    @Override // X.AbstractC24531Bi
    public final void ARW(C36161lg r4, AbstractC24521Bh r5) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        if (r4 == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            r4.writeToParcel(obtain, 0);
        }
        if (r5 == null) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r5.asBinder());
        }
        A00(12, obtain);
    }

    @Override // X.AbstractC24531Bi
    public final void ARd(int i) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeInt(i);
        A00(7, obtain);
    }
}
