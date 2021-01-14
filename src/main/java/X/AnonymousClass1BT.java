package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: X.1BT  reason: invalid class name */
public final class AnonymousClass1BT implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                latLng = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
            } else if (i != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                latLng2 = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
