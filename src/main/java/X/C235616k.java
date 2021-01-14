package X;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: X.16k  reason: invalid class name and case insensitive filesystem */
public final class C235616k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = AnonymousClass05S.A0B(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) AnonymousClass05S.A08(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 5:
                    z2 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 6:
                    z3 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 7:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 8:
                    str2 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 9:
                    arrayList = AnonymousClass05S.A0B(parcel, readInt, C34601iq.CREATOR);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new GoogleSignInOptions(i, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.A00(arrayList));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
