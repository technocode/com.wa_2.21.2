package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.1kf  reason: invalid class name and case insensitive filesystem */
public final class C35621kf extends AnonymousClass19S implements AbstractC241319b {
    public C35621kf(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // X.AbstractC241319b
    public final Bundle ARi(Account account, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        C241219a.A01(obtain, account);
        obtain.writeString(str);
        C241219a.A01(obtain, bundle);
        Parcel A00 = A00(5, obtain);
        Bundle bundle2 = (Bundle) C241219a.A00(A00, Bundle.CREATOR);
        A00.recycle();
        return bundle2;
    }

    @Override // X.AbstractC241319b
    public final Bundle ARj(String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        obtain.writeString(str);
        C241219a.A01(obtain, bundle);
        Parcel A00 = A00(2, obtain);
        Bundle bundle2 = (Bundle) C241219a.A00(A00, Bundle.CREATOR);
        A00.recycle();
        return bundle2;
    }
}
