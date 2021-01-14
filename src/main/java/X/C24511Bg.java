package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Bg  reason: invalid class name and case insensitive filesystem */
public final class C24511Bg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        Intent intent = null;
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
                intent = (Intent) AnonymousClass05S.A08(parcel, readInt, Intent.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36131ld(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36131ld[i];
    }
}
