package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.16b  reason: invalid class name and case insensitive filesystem */
public final class C235016b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 2) {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                bundle = AnonymousClass05S.A06(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C34601iq(i, i2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C34601iq[i];
    }
}
