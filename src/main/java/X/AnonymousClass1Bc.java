package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Bc  reason: invalid class name */
public final class AnonymousClass1Bc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36091lZ[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        C36031lT[] r6 = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 2) {
                j = AnonymousClass05S.A05(parcel, readInt);
            } else if (i2 == 3) {
                r6 = (C36031lT[]) AnonymousClass05S.A0J(parcel, readInt, C36031lT.CREATOR);
            } else if (i2 == 4) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 != 5) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                z = AnonymousClass05S.A0G(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36091lZ(j, r6, i, z);
    }
}
