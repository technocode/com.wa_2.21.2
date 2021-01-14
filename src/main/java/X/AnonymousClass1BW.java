package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.1BW  reason: invalid class name */
public final class AnonymousClass1BW implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    latLng = (LatLng) AnonymousClass05S.A08(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 4:
                    str2 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 5:
                    iBinder = AnonymousClass05S.A07(parcel, readInt);
                    break;
                case 6:
                    f = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 7:
                    f2 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 8:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 9:
                    z2 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 10:
                    z3 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 11:
                    f3 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 12:
                    f4 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 13:
                    f5 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 14:
                    f6 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 15:
                    f7 = AnonymousClass05S.A01(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36011lR(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36011lR[i];
    }
}
