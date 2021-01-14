package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;

/* renamed from: X.16o  reason: invalid class name and case insensitive filesystem */
public final class C236016o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
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
                    int A04 = AnonymousClass05S.A04(parcel, readInt);
                    if (A04 != 0) {
                        AnonymousClass05S.A0F(parcel, A04, 8);
                        l = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l = null;
                        break;
                    }
                case 4:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 5:
                    z2 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 6:
                    arrayList = AnonymousClass05S.A0A(parcel, readInt);
                    break;
                case 7:
                    str2 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
