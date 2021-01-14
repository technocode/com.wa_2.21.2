package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.19T  reason: invalid class name */
public final class AnonymousClass19T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35591kb(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35591kb[i];
    }
}
