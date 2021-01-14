package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.19U  reason: invalid class name */
public final class AnonymousClass19U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                AnonymousClass05S.A03(parcel, readInt);
            } else if (i != 2) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C35601kc(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C35601kc[i];
    }
}
