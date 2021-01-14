package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.1CJ  reason: invalid class name */
public final class AnonymousClass1CJ implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                arrayList = AnonymousClass05S.A0B(parcel, readInt, C36331lz.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new AnonymousClass1m8(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass1m8[i];
    }
}
