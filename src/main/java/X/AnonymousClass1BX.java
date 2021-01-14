package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.1BX  reason: invalid class name */
public final class AnonymousClass1BX implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                latLng = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
            } else if (i == 3) {
                latLng2 = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
            } else if (i == 4) {
                latLng3 = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
            } else if (i == 5) {
                latLng4 = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
            } else if (i != 6) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) AnonymousClass05S.A08(parcel, readInt, LatLngBounds.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36021lS(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36021lS[i];
    }
}
