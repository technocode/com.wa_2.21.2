package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Bk  reason: invalid class name and case insensitive filesystem */
public final class C24551Bk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        C34661ix r1 = null;
        C35211jy r2 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 == 2) {
                r1 = (C34661ix) AnonymousClass05S.A08(parcel, readInt, C34661ix.CREATOR);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                r2 = (C35211jy) AnonymousClass05S.A08(parcel, readInt, C35211jy.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36171lh(i, r1, r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36171lh[i];
    }
}
