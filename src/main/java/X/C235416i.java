package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: X.16i  reason: invalid class name and case insensitive filesystem */
public final class C235416i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 2:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 4:
                    str3 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 5:
                    str4 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) AnonymousClass05S.A08(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 8:
                    j = AnonymousClass05S.A05(parcel, readInt);
                    break;
                case 9:
                    str6 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 10:
                    arrayList = AnonymousClass05S.A0B(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 12:
                    str8 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
