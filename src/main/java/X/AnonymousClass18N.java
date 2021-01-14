package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: X.18N  reason: invalid class name */
public final class AnonymousClass18N implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 2) {
                account = (Account) AnonymousClass05S.A08(parcel, readInt, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 != 4) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) AnonymousClass05S.A08(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35201jx(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35201jx[i];
    }
}
