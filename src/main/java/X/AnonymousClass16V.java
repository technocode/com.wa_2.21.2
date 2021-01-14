package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.16V  reason: invalid class name */
public final class AnonymousClass16V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        HashSet hashSet = new HashSet();
        AnonymousClass294 r7 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
                hashSet.add(1);
            } else if (i2 == 2) {
                r7 = (AnonymousClass294) AnonymousClass05S.A08(parcel, readInt, AnonymousClass294.CREATOR);
                hashSet.add(2);
            } else if (i2 == 3) {
                str = AnonymousClass05S.A09(parcel, readInt);
                hashSet.add(3);
            } else if (i2 == 4) {
                str2 = AnonymousClass05S.A09(parcel, readInt);
                hashSet.add(4);
            } else if (i2 != 5) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str3 = AnonymousClass05S.A09(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == A02) {
            return new AnonymousClass293(hashSet, i, r7, str, str2, str3);
        }
        throw new AnonymousClass18H(AnonymousClass008.A08(37, "Overread allowed size end=", A02), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass293[i];
    }
}
