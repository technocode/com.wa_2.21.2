package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* renamed from: X.1Ar  reason: invalid class name and case insensitive filesystem */
public final class C24461Ar implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 2:
                    j = AnonymousClass05S.A05(parcel, readInt);
                    break;
                case 3:
                    j2 = AnonymousClass05S.A05(parcel, readInt);
                    break;
                case 4:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 5:
                    j3 = AnonymousClass05S.A05(parcel, readInt);
                    break;
                case 6:
                    i2 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 7:
                    f = AnonymousClass05S.A01(parcel, readInt);
                    break;
                case 8:
                    j4 = AnonymousClass05S.A05(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }
}
