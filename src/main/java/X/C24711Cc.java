package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Cc  reason: invalid class name and case insensitive filesystem */
public final class C24711Cc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i2 == 3) {
                str2 = AnonymousClass05S.A09(parcel, readInt);
            } else if (i2 == 4) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 5) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                z = AnonymousClass05S.A0G(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36581mR(str, str2, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36581mR[i];
    }
}
