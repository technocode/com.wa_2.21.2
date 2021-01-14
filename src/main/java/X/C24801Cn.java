package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: X.1Cn  reason: invalid class name and case insensitive filesystem */
public final class C24801Cn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 3:
                    str2 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 4:
                    i = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 5:
                    i2 = AnonymousClass05S.A03(parcel, readInt);
                    break;
                case 6:
                    z = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 7:
                    z2 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 8:
                    str3 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                case 9:
                    z3 = AnonymousClass05S.A0G(parcel, readInt);
                    break;
                case 10:
                    str4 = AnonymousClass05S.A09(parcel, readInt);
                    break;
                default:
                    AnonymousClass05S.A0D(parcel, readInt);
                    break;
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
