package X;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.18O  reason: invalid class name */
public final class AnonymousClass18O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        IBinder iBinder = null;
        C34661ix r6 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = AnonymousClass05S.A03(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = AnonymousClass05S.A07(parcel, readInt);
            } else if (i2 == 3) {
                r6 = (C34661ix) AnonymousClass05S.A08(parcel, readInt, C34661ix.CREATOR);
            } else if (i2 == 4) {
                z = AnonymousClass05S.A0G(parcel, readInt);
            } else if (i2 != 5) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                z2 = AnonymousClass05S.A0G(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35211jy(i, iBinder, r6, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35211jy[i];
    }
}
