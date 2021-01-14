package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.16X  reason: invalid class name */
public final class AnonymousClass16X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 == 2) {
                z = AnonymousClass05S.A0G(parcel, readInt);
            } else if (i2 == 3) {
                j = AnonymousClass05S.A05(parcel, readInt);
            } else if (i2 != 4) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                z2 = AnonymousClass05S.A0G(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C34591im(i, z, j, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C34591im[i];
    }
}
