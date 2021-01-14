package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Ci  reason: invalid class name and case insensitive filesystem */
public final class C24771Ci implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 2) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i3 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                i2 = AnonymousClass05S.A03(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36631mW(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36631mW[i];
    }
}
