package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.1CA  reason: invalid class name */
public final class AnonymousClass1CA implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                arrayList = AnonymousClass05S.A0B(parcel, readInt, C36581mR.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36331lz(str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36331lz[i];
    }
}
