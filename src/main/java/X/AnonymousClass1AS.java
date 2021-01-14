package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: X.1AS  reason: invalid class name */
public final class AnonymousClass1AS implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35811ky[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        List list = C35811ky.A07;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i != 1) {
                switch (i) {
                    case 5:
                        list = AnonymousClass05S.A0B(parcel, readInt, C35161jt.CREATOR);
                        continue;
                    case 6:
                        str = AnonymousClass05S.A09(parcel, readInt);
                        continue;
                    case 7:
                        z = AnonymousClass05S.A0G(parcel, readInt);
                        continue;
                    case 8:
                        z2 = AnonymousClass05S.A0G(parcel, readInt);
                        continue;
                    case 9:
                        z3 = AnonymousClass05S.A0G(parcel, readInt);
                        continue;
                    case 10:
                        str2 = AnonymousClass05S.A09(parcel, readInt);
                        continue;
                    default:
                        AnonymousClass05S.A0D(parcel, readInt);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) AnonymousClass05S.A08(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35811ky(locationRequest, list, str, z, z2, z3, str2);
    }
}
