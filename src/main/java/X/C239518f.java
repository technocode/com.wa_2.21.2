package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18f  reason: invalid class name and case insensitive filesystem */
public final class C239518f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        Parcel parcel2 = null;
        C35401kH r3 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 == 2) {
                int A04 = AnonymousClass05S.A04(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (A04 == 0) {
                    parcel2 = null;
                } else {
                    parcel2 = Parcel.obtain();
                    parcel2.appendFrom(parcel, dataPosition, A04);
                    parcel.setDataPosition(dataPosition + A04);
                }
            } else if (i2 != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                r3 = (C35401kH) AnonymousClass05S.A08(parcel, readInt, C35401kH.CREATOR);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new AnonymousClass26C(i, parcel2, r3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AnonymousClass26C[i];
    }
}
