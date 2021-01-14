package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18c  reason: invalid class name and case insensitive filesystem */
public final class C239218c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        C35381kF r1 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                r1 = (C35381kF) AnonymousClass05S.A08(parcel, readInt, C35381kF.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35421kJ(i, str, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35421kJ[i];
    }
}
