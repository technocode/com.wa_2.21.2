package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.1BY  reason: invalid class name */
public final class AnonymousClass1BY implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    b = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 3:
                    b2 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 4:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) AnonymousClass05S.A08(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 7:
                    b4 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 8:
                    b5 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 9:
                    b6 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 10:
                    b7 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 11:
                    b8 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 12:
                    b9 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 13:
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
                case 14:
                    b10 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case 15:
                    b11 = AnonymousClass05S.A00(parcel, readInt);
                    break;
                case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                    int A04 = AnonymousClass05S.A04(parcel, readInt);
                    if (A04 != 0) {
                        AnonymousClass05S.A0F(parcel, A04, 4);
                        f = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f = null;
                        break;
                    }
                case 17:
                    int A042 = AnonymousClass05S.A04(parcel, readInt);
                    if (A042 != 0) {
                        AnonymousClass05S.A0F(parcel, A042, 4);
                        f2 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f2 = null;
                        break;
                    }
                case 18:
                    latLngBounds = (LatLngBounds) AnonymousClass05S.A08(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = AnonymousClass05S.A00(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
