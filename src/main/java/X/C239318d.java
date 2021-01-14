package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.18d  reason: invalid class name and case insensitive filesystem */
public final class C239318d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 == 2) {
                arrayList = AnonymousClass05S.A0B(parcel, readInt, C35411kI.CREATOR);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35401kH(i, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35401kH[i];
    }
}
