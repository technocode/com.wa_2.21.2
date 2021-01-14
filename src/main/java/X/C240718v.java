package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18v  reason: invalid class name and case insensitive filesystem */
public final class C240718v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i2 == 2) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                j = AnonymousClass05S.A05(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C34671iy(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C34671iy[i];
    }
}
