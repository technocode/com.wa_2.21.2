package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1BU  reason: invalid class name */
public final class AnonymousClass1BU implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                AnonymousClass05S.A0E(parcel, readInt, 8);
                d = parcel.readDouble();
            } else if (i != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                AnonymousClass05S.A0E(parcel, readInt, 8);
                d2 = parcel.readDouble();
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
