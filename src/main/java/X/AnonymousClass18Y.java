package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18Y  reason: invalid class name */
public final class AnonymousClass18Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i3 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35351kC(i, str, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35351kC[i];
    }
}
