package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: X.16l  reason: invalid class name and case insensitive filesystem */
public final class C235716l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 4) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i == 7) {
                googleSignInAccount = (GoogleSignInAccount) AnonymousClass05S.A08(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (i != 8) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str2 = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
