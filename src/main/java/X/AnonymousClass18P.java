package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18P  reason: invalid class name */
public final class AnonymousClass18P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        Bundle bundle = null;
        C34671iy[] r1 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                bundle = AnonymousClass05S.A06(parcel, readInt);
            } else if (i != 2) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                r1 = (C34671iy[]) AnonymousClass05S.A0J(parcel, readInt, C34671iy.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35321k9(bundle, r1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35321k9[i];
    }
}
