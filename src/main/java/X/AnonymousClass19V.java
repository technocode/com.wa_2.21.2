package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.19V  reason: invalid class name */
public final class AnonymousClass19V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                AnonymousClass05S.A03(parcel, readInt);
            } else if (i == 2) {
                str = AnonymousClass05S.A09(parcel, readInt);
            } else if (i != 3) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                bArr = AnonymousClass05S.A0I(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35611kd(str, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35611kd[i];
    }
}
