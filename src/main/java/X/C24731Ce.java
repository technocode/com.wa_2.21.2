package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Ce  reason: invalid class name and case insensitive filesystem */
public final class C24731Ce implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i == 3) {
                str2 = AnonymousClass05S.A09(parcel, readInt);
            } else if (i != 4) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                j = AnonymousClass05S.A05(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36601mT(str, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36601mT[i];
    }
}
