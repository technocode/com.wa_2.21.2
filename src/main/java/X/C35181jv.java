package X;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.1jv  reason: invalid class name and case insensitive filesystem */
public final class C35181jv extends C241919h implements IAccountAccessor {
    public C35181jv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account A4d() {
        Parcelable parcelable;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        Parcel A00 = A00(2, obtain);
        Parcelable.Creator creator = Account.CREATOR;
        if (A00.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator.createFromParcel(A00);
        }
        Account account = (Account) parcelable;
        A00.recycle();
        return account;
    }
}
