package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1BS  reason: invalid class name */
public final class AnonymousClass1BS implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                latLng = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
            } else if (i == 3) {
                f = AnonymousClass05S.A01(parcel, readInt);
            } else if (i == 4) {
                f2 = AnonymousClass05S.A01(parcel, readInt);
            } else if (i != 5) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                f3 = AnonymousClass05S.A01(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new CameraPosition(latLng, f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
