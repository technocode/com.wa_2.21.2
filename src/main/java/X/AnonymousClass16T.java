package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.16T  reason: invalid class name */
public final class AnonymousClass16T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        int i = 0;
        AnonymousClass292 r9 = null;
        int i2 = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
                hashSet.add(1);
            } else if (i3 == 2) {
                arrayList = AnonymousClass05S.A0B(parcel, readInt, AnonymousClass293.CREATOR);
                hashSet.add(2);
            } else if (i3 == 3) {
                i2 = AnonymousClass05S.A03(parcel, readInt);
                hashSet.add(3);
            } else if (i3 != 4) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                r9 = (AnonymousClass292) AnonymousClass05S.A08(parcel, readInt, AnonymousClass292.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == A02) {
            return new AnonymousClass291(hashSet, i, arrayList, i2, r9);
        }
        throw new AnonymousClass18H(AnonymousClass008.A08(37, "Overread allowed size end=", A02), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass291[i];
    }
}
