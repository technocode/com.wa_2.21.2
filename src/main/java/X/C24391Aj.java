package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Aj  reason: invalid class name and case insensitive filesystem */
public final class C24391Aj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35891l8[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i5 = 65535 & readInt;
            if (i5 == 2) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i5 == 3) {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            } else if (i5 == 4) {
                i3 = AnonymousClass05S.A03(parcel, readInt);
            } else if (i5 == 5) {
                j = AnonymousClass05S.A05(parcel, readInt);
            } else if (i5 != 6) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i4 = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35891l8(i, i2, i3, j, i4);
    }
}
