package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1CW  reason: invalid class name */
public final class AnonymousClass1CW implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        C36581mR r1 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                r1 = (C36581mR) AnonymousClass05S.A08(parcel, readInt, C36581mR.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36521mK(i, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36521mK[i];
    }
}
