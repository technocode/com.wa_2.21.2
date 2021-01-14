package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.1Ba  reason: invalid class name and case insensitive filesystem */
public final class C24491Ba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C36081lY[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int A02 = AnonymousClass05S.A02(parcel);
        String str = null;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                AnonymousClass05S.A0D(parcel, readInt);
            } else {
                str = AnonymousClass05S.A09(parcel, readInt);
            }
        }
        AnonymousClass05S.A0C(parcel, A02);
        return new C36081lY(str);
    }
}
