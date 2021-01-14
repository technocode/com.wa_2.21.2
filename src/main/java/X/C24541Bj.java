package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Bj  reason: invalid class name and case insensitive filesystem */
public final class C24541Bj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        C35201jx r1 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 2) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                r1 = (C35201jx) AnonymousClass05S.A08(parcel, readInt, C35201jx.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36161lg(i, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36161lg[i];
    }
}
