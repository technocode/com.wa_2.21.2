package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1F2  reason: invalid class name */
public final class AnonymousClass1F2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                bundle = AnonymousClass05S.A06(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C37071nV(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C37071nV[i];
    }
}
